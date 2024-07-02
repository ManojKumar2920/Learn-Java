

public class Demo {
    public static void main(String[] args) {

        int[][] arr  = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] n: arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }    
}