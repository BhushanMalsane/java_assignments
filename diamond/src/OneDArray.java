import java.util.Scanner;
class OneDArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num1 = sc.nextInt();    
        int[] arr1 = new int[num1];
        ArrayService.oneDInput(arr1,num1);
        ArrayService.oneDOutput(arr1);
        System.out.println("Sum is : "+ArrayService.Sum(arr1));
    }
}