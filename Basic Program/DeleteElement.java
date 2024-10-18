import java.util.Arrays;
import java.util.Scanner;

class Demo{
    static int[] deleteElements(int a[],int element)
    {
        int index=-1,i,k=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==element)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            int b[]=new int[a.length-1];
            for(i=0;i<a.length;i++)
            {
                if(i==index)
                {
                    continue;   
                }
                b[k++]=a[i];  
            }
            return b;
        }
        return a;
    }
}

public class DeleteElement {
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
    
        System.out.println("Enter  Element to delete ");
        int element=obj.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Demo.deleteElements(a,element)));
    
    }
}
