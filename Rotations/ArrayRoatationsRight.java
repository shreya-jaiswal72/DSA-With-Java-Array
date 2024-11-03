import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] rotateRight(int a[] ,int r)
    {
        int temp,prev,i;
        for(i=0;i<r;i++)
        {
            prev=a[a.length-1];
            for(int j=0;j<a.length;j++)
            {
                temp=a[j];
                a[j]=prev;
                prev=temp;
            }
            
        }
        return a;
    }
}

public class ArrayRoatationsRight {


        public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        System.out.println("Enter number of rotations:");
        int r=obj.nextInt();
        System.out.println("Before Rotations => "+ Arrays.toString(a));
        a = Demo.rotateRight(a,r);
        System.out.println("After Rotations => "+ Arrays.toString(a));
    }
}
