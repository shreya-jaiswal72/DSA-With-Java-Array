import java.util.Arrays;
import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = obj.nextInt();
		int a[]=new int[n];
		int i,t;
		System.out.println("Enter the " +n+" element in an array");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.println();
		
		
		//logic
		
		Arrays.sort(a);
		
		
	System.out.print(a[0]+" ");
		for(i=1;i<n-1;i=i+2)
		{
			t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
			System.out.print(a[i]+" "+a[i+1]+" ");
		}
		if(n%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
