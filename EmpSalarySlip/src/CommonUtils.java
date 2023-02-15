import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {
	public String getProperName(String name) {
		//name = "ramESH KUMaR SharMA";
		String nameArr[] = name.split(" ");
		//{"ramESH", "KUMaR", "SharMA"}
		
		String properName = "";
		
		for(String n : nameArr) {
			// n = ramESH
			char firstChar = n.charAt(0);	// r
			String firstLetter = String.valueOf(firstChar).toUpperCase(); // R
			// convert char to string and use toUpperCase
			String remainingName = n.substring(1).toLowerCase(); // amesh
			properName += firstLetter + remainingName + " ";	// Ramesh
		}
		
		return properName;
	}
	
	public String formatDate() {
//		Internationalization - I18N
		Locale locale = new Locale("hi","IN");
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String formattedDate = df.format(date);
		return formattedDate;
		
	}
}
