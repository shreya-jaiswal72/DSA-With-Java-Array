import java.util.Scanner;

public class MaxMinElement {
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
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
			
		}
		System.out.println();
		System.out.println("The Maximum element is "+a[n-1]);
		System.out.println("The Minimum element is "+a[1-1]);
		
		System.out.println("The 2nd Maximum element is "+a[n-2]);
		System.out.println("The 2nd Minimum element is "+a[2-1]);
		
		System.out.println("The 3rd Maximum element is "+a[n-3]);
		System.out.println("The 3rd Minimum element is "+a[3-1]);
		
	}
}
