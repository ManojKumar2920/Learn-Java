public class Operators {
    public static void main(String[] args) {
        int num = 10;

        int result = ++num; //(pre increment)
        //int result = num++;    //(post increment)

        System.out.println(result);

        int x = 10;
        int y = 12;

        boolean result2 = x!=y;

        System.out.println(result2);

        //relational
        int a = 10;
        int b = 20;

        boolean result3 = x<y && a<b;
        
        System.out.println(result3);
    }
}
