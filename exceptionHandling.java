public class exceptionHandling {
    public static void main(String[] args) {
        
        try{
            int a,b;
            a=5;
            b=a/0;

        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero exception caught");
        }

        System.out.println("Code is Executed Safely");


    }
}
