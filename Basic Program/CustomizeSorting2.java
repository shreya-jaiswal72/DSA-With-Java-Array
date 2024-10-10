import java.util.Arrays;
import java.util.Scanner;

public class CustomizeSorting2 {
    
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
		
		System.out.println("Before Sorting");
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		
		
		//logic of 2nd half sorting
		Arrays.sort(a,n/2,n);
		
		System.out.println("After Sorting");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
    
}