class Calculator {
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }

    public int mul(int n1, int n2){
        return n1 * n2;
    }

    public double div(int n1, int n2){
        return n1 / n2;
    }
}


public class Demo {
    public static void main(String[] args) {
        int num1, num2;

        num1 = 10;
        num2 = 2;

        Calculator calc = new Calculator(); //Object

        int add_result = calc.add(num1,num2);
        System.out.println("Addition: " + add_result);

        int sub_result = calc.sub(num1, num2);
        System.out.println("Sub: "+sub_result);

        int mul_result = calc.mul(num1, num2);
        System.out.println("Mul: "+mul_result);

        double div_result = calc.div(num1, num2);
        System.out.println("Div: "+div_result);
    }
}