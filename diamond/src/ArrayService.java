import java.util.*;

class ArrayService{
    public static void oneDInput(int[] arr1,int num){
         Scanner sc = new Scanner(System.in);
         for(int i=0; i<num; i++){
            System.out.println("Enter the element "+i);
            arr1[i] = sc.nextInt();  //Array Input
        }
    }

    public static void oneDOutput(int[] a){
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

     public static int Sum(int[] a){
        int sum=0;
         for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
