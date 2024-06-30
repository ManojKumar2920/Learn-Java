public class Whileloop {
    public static void main(String[] args) {

        int i = 1;


        // while (i < 5) {
        //     System.out.println("Hi from While Loop");
        //     i++;
        // }

        
        //nested while

        while (i < 5) {
            System.out.println("Hi from Nested While Loop");
            int j = 1;
            while (j < 3) {
                System.out.println("Inside While Loop");
                j++;
            }
            i++;
        }
    }
}
