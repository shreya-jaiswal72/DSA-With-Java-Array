import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] rotateRight_TempM1(int a[],int r)
    {
        r=r%a.length;
        int i,n=a.length;
        int temp[]=new int[r];
        for(i=0;i<r;i++)
        {
            temp[i]=a[n-r+i];
        }
        for(i=n-r-1;i>0;i--)
        {
            a[i+r]=a[i];
        }
        for(i=0;i<r;i++)
        {
            a[i]=temp[i];
        }
        return a;
    }
}

public class RotationsRightUseTempArrM1 {
    public static void main(String[] args)
    {   
        Scanner obj=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("Enter number of rotations:");
        int r=obj.nextInt();
        System.out.println("Before Rotations => "+ Arrays.toString(a));
        a = Demo.rotateRight_TempM1(a,r);
        System.out.println("After Rotations => "+ Arrays.toString(a));
    }
}
