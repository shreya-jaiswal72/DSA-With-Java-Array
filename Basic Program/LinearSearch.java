import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = obj.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter the " +n+" element in an array");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.println();
		
		
		//logic
		
		System.out.println("Enter the search element: ");
		int search=obj.nextInt();
		int index=-1;
		for(i=0;i<n;i++)
		{
			if(search==a[i])
			{
				index=i;
				break;
			}
			
		}
		System.out.println(index);
		
		
	}
}
