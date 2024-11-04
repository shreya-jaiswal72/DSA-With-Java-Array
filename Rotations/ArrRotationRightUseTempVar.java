import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] rotateRight_Temp(int a[], int r)
    {
        r=r%a.length;
        int temp,i,j;
        for(i=0;i<r;i++)
        {
            temp=a[a.length-1];
            for(j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        return a;
    }
}

public class ArrRotationRightUseTempVar {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("Enter number of rotations:");
        int r=obj.nextInt();
        System.out.println("Before Rotations => "+ Arrays.toString(a));
        a = Demo.rotateRight_Temp(a,r);
        System.out.println("After Rotations => "+ Arrays.toString(a));
     }
}
