import java.util.Arrays;
import java.util.Scanner;
class Demo
{
    static int[] rotateLeft(int a[] ,int r)
    {
        int temp,prev,i;
        for(i=0;i<r;i++)
        {
            prev=a[0];
            for(int j=a.length-1;j>=0;j--)
            {
                temp=a[j];
                a[j]=prev;
                prev=temp;
            }
            
        }
        return a;
    }
}
public class ArrayRotations {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("Enter number of rotations:");
        int r=obj.nextInt();
        System.out.println("Before Rotations => "+ Arrays.toString(a));
        a = Demo.rotateLeft(a,r);
        System.out.println("After Rotations => "+ Arrays.toString(a));
    }
}

