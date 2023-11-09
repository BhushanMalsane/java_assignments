import java.util.Scanner;

class DiamondPattern {
    public static void main (String[] args){
        Scanner rowcnt = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = rowcnt.nextInt();
        DisplayPattern.diamond(num);
    }
}