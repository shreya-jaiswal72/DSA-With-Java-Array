import java.util.Arrays;
import java.util.Scanner;


class Demo
{
	static int binarySearch(int a[],int search)
	{
		int l=0,h=a.length-1,mid;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(a[mid]==search)
				return mid;
			else if(a[mid]<search)
				l=mid+1;
			else
				h=mid-1; 
		}
		return -1;
	}	
}

public class BinarySearch {
    public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = obj.nextInt();
		int i, a[]=new int[n];
		
		System.out.println("Enter the " +n+" element in an array");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
	
		//logic
		
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(); 
		
		System.out.println("Enter the search element: ");
		int search=obj.nextInt();
		
		
		
		System.out.println(Demo.binarySearch(a,search));	
		
	}
}
