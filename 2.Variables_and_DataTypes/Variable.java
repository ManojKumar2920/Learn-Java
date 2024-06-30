public class Variable {
    public static void main(String[] args) {
        int num1 = 10;
        byte by = 127;
        short sh = 32767;
        long l = 9223372036854775807L;

        float f = 5.8f;
        double d = 3.141592653589793;

        char c = 'j';
        String s = "Hello World!";
        boolean b = true;

        System.out.println(((Object) num1).getClass().getName());
        System.out.println(((Object) by).getClass().getName());
        System.out.println(((Object) sh).getClass().getName());
        System.out.println(((Object) l).getClass().getName());
        System.out.println(((Object) f).getClass().getName());
        System.out.println(((Object) d).getClass().getName());
        System.out.println(((Object) c).getClass().getName());
        System.out.println(((Object) s).getClass().getName());
        System.out.println(((Object) b).getClass().getName());


    }    
}
