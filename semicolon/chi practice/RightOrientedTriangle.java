public class RightOrientedTriangle {
    public static void main(String[] args) {
        int numRows = 10; 

        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}