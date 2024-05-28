import java.util.Scanner;

class nthInteger{

    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter How many Number to insert : ");
        int size = obj.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Number : ");
            arr[i] = obj.nextInt();
            System.out.println();
        }

        int ecount = 0, ocount = 0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
            ecount++;
            else
            ocount++;
        }
        System.out.println("Even Numbers Are : "+ecount+"\n"+"Odd Numbers are : "+ocount);
        
    }
}