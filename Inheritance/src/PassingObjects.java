import java.util.Date;
import java.util.Scanner;

class Message {
	private String userId;
	private String msg;
	private Date date;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}

class User {
	private String userId;
	private String name;
	private String password;
	private int phone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}

class View {
	
	void doRegister() {
		
	}
	
	void doLogin() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter User Id : ");
		String userId = scanner.nextLine();
		
		System.out.println("Enter User Password : ");
		String password = scanner.nextLine();
		
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		
		DB db = new DB();
		//String loginMsg = db.checkLogin(userId, password);
		//Message msg = db.checkLogin(userId, password);
		
		Message msg = db.checkLogin(user);
		System.out.println(msg.getDate());
		System.out.println(msg.getMsg());
		System.out.println(msg.getUserId());
		
		scanner.close();
	}
}

class DB {
	//Message checkLogin(String userId, String password) {
	Message checkLogin(User user) {
		//String msg;
		//Date date = new Date();
		Message msg = new Message();
		if(user.getUserId().equals("admin@gmail.com") && user.getPassword().equals("1234")) {
			//msg = "Login Success...";
			msg.setMsg("Login Success...");
		}
		else {
			//msg = "Login Failed...";
			msg.setMsg("Login Failed...");
		}
		msg.setDate(new Date());
		msg.setUserId(user.getUserId());
		return msg;
	}
}

public class PassingObjects {

	public static void main(String[] args) {
		
		View obj = new View();
		obj.doLogin();

	}

}
