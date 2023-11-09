package dateOperations;
import java.util.*;

public class WrapperClassOperationsList {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		List<Integer> ls=new ArrayList<>();
		System.out.println("Enter the number of elements you want to store");
		int size=sc.nextInt();
		for(int i=0; i < size; i++) {
			System.out.println("Enter the element: ");
			int element= sc.nextInt();
			ls.add(element);
		}
		int ch=0;
		
		do {
			System.out.println("1.insert\n2.delete\n3.search\n4.iterate\n5.sort\n6.Exit");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element to add");
				int addElement=sc.nextInt();
				ls.add(addElement);
				break;
			case 2:
				System.out.println("Enter element to remove");
				int removeElement=sc.nextInt();
				int index=ls.indexOf(removeElement);
				ls.remove(index);
				break;
			case 3:
				System.out.println("Enter element to search");
				int searchElement=sc.nextInt();
				System.out.println("Element found at index: "+ls.indexOf(searchElement) );
				break;
			case 4:
				System.out.print("Elements in arraylist");
				System.out.print(ls+" ");
				break;
			case 5:
				Collections.sort(ls);
				System.out.println("Sorted Arraylist: "+ls);
				break;
			case 6:
				System.out.println("Thank you...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			
		}while(ch!=6);
		
		
	}
}
