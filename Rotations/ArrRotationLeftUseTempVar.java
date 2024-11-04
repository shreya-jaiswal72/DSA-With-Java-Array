import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] rotateLeft_Temp(int a[], int r)
    {
        r=r%a.length;
        int temp,i,j;
        for(i=0;i<r;i++)
        {
            temp=a[0];
            for(j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        return a;
    }
}


public class ArrRotationLeftUseTempVar {
        public static void main(String[] args)
{
    Scanner obj=new Scanner(System.in);
    int a[]={1,2,3,4,5};
    System.out.println("Enter number of rotations:");
    int r=obj.nextInt();
    System.out.println("Before Rotations => "+ Arrays.toString(a));
    a = Demo.rotateLeft_Temp(a,r);
    System.out.println("After Rotations => "+ Arrays.toString(a));
}
}
