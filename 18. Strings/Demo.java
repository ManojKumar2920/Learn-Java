
public class Demo {
    public static void main(String[] args) {
         
        String name = "mano"; //String in java is a class and it will create a object in heap memory

        // String name = new String("mano");

        System.out.println(name);

        name = name + " swe";

        System.out.println(name);

        //strings in java are immutable. once the object is created in string constant pool, it will never get change but the name here is concatinated but it's create new obj with new add in scp.
        

        String name2 = "subu";
        String name3 = "subu";
        String name4 = "Subu";

        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());

        //the above line are the proven sample for strings are immutable
    }
}
