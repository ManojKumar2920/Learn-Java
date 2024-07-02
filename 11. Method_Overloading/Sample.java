class Calculator{

    public int add(int n1, int n2){
        return n1 + n2;
    }                        //we can have multiple methods with a same name with different parameters and types

    public int add(int n1, int n2, int n3){
        return n1 + n2;
    } 

    public double add(double n1, int n2){
        return n1 + n2;
    } 

}

public class Sample {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        double r1 = calc.add(10.5, 20);
        System.out.println(r1);
    }
}
