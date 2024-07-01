class Computer{

    public void codeJava(){
        System.out.println("Coding Java...!"); 
    }               //mention the type of data the method returns if anything put it as void

    public String buyPremium(int cost){

        if (cost >= 199) {
            return "Buying a premium account...!"; 
        } else {
            return "You can't buy premium with this amount!";
        }
         //returning a string
    }
}

public class Demo {
    public static void main(String[] args) {
       
        Computer computerObj = new Computer();

        computerObj.codeJava();

        String str = computerObj.buyPremium(10);
        System.out.println(str);
    }

}
