
import java.util.Scanner;

class matrices{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int arr3[][]=new int[3][3];

        System.out.println("For Array 1 ----> ");

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print("Enter Number for "+i+""+j+" : ");
                arr1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Now For Array 2 ----> ");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print("Enter Number for "+i+""+j+" : ");
                arr2[i][j] = obj.nextInt();
            }
        }

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                
                arr3[i][j] = arr2[i][j] + arr1[i][j];
                if(i==j){
                    arr3[i][j]=0;
                }
            }
        }

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(arr3[i][j]+" ");
                
            }
            System.out.println();
        }

        











    }
}