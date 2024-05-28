
import java.util.Scanner;

public class pyq {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number A : ");
        int A = obj.nextInt();

        System.out.print("Enter Number B : ");
        int B = obj.nextInt();

        System.out.println("Operations\n1.Addition\n2.Sub\n3.Multiplication\n4.Division\nEnter Operation Number : ");
        int choice = obj.nextInt();

        switch(choice){
            case 1:
            System.out.println("The Addition is : "+(A+B));
            break;

            case 2:
            System.out.println("The Sub is : "+(A-B));
            break;

            case 3:
            System.out.println("The Multiplication is : "+(A*B));
            break;

            case 4:
            System.out.println("The Division is : "+(A/B));
            break;

            default:
            System.out.println("Invalid Input");
        }
        
    }
}
