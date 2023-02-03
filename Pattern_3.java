public class Pattern_3 {
    public static void main(String[] args) {

        // *****
        // *   *
        // *   *
        // *   *
        // *****

        int row = 5;
        int col = 5;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                // i == 0 -> for first row
                // i == row - 1 -> for last row
                // j == 0 -> for first col
                // j == col - 1 -> for last col
                if(i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // *****
        // *   *
        // * * *
        // *   *
        // *****

        System.out.println("==================");
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                // i == 0 -> for first row
                // i == row - 1 -> for last row
                // j == 0 -> for first col
                // j == col - 1 -> for last col
                if(i == 0 || i == row - 1 || j == 0 || j == col - 1 || (i == row/2 && j == col/2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}