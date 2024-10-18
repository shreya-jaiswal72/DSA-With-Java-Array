import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] DeleteAtLocation(int a[],int location)
    {
        int i,k=0,b[]=new int[a.length-1];
        for(i=0;i<a.length;i++)
        {
            if(i==location)
            {
                continue;
            }
            
            b[k++]=a[i];
        }
        return b;
    }
}

public class DeletingElementAtLocation {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=obj.nextInt();
        int i, a[]=new int[size];
        System.out.println("Enter "+size+" element in an array:");
        for(i=0;i<a.length;i++)   
        {
            a[i]=obj.nextInt();
        }
    
        System.out.println("Enter  location: ");
        int location=obj.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Demo.DeleteAtLocation(a,location)));
    }
}
