import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = obj.nextInt();
		int a[]=new int[n];
		int i,j;
		System.out.println("Enter the " +n+" element in an array");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.println();
		
		
		//logic
		
		Arrays.sort(a);
		int high ,low;
		low=0;
		high=n-1;
		while(low<=high)
		{
		System.out.print(a[low]+" "+a[high]+" ");
		low++;
		high--;
		}
	}
}
