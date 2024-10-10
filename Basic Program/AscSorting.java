import java.util.*;
public class AscSorting {

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = obj.nextInt();
		int a[]=new int[n];
		int i,j,t;
		System.out.println("Enter the " +n+" element in an array");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.println("Before Sorting");
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		
		
		//logic
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

