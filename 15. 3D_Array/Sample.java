
public class Sample {
    public static void main(String[] args) {
        
        int[][][] arr = new int[3][3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        for (int[][] n : arr) {
            for (int[] m : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}
