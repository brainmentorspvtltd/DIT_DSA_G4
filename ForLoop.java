public class ForLoop {
    public static void main(String[] args) {
        
        // i = 0,1,2,3,4
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int arr[] = {2,5,6,7,1,12};
        // i = 0,1,2,3,4,5
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        
        // i = 2,5,6,7,1,12
        for(int i : arr) {
            System.out.println(i);
        }

    }
}
