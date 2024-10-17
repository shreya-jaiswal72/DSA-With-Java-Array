import java.util.Arrays;
import java.util.Scanner;

class Demo
{
    static int[] insertAtFirst(int a[],int element)
    {
        int i,b[]=new int[a.length+1];
        b[0]=element;
        for(i=0;i<a.length;i++)
        {
            b[i+1]=a[i];
        }
        return b;
    }
}

public class InsertElementAtFirst {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=obj.nextInt();

        int i, a[]=new int[size];
        System.out.println("Enter "+size+" element in an array:");
        for(i=0;i<a.length;i++)   
        {
            a[i]=obj.nextInt();
        }

        System.out.println("Enter an element to insert at first location: ");
        int element=obj.nextInt();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Demo.insertAtFirst(a,element)));
    }
}
