public class Pattern_1 {
    public static void main(String[] args) {
        
        // *****
        // *****
        // *****
        // *****
        // *****

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // *****
        // ****
        // ***
        // **
        // *
        for(int i = 0; i < 5; i++){
            // for(int j = 5; j > i; j--) {
            //     System.out.print("*");
            // }
            
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        int k = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i+1; j++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
