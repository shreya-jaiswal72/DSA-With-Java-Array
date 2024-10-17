import java.util.Arrays;
import java.util.Scanner;

class Comparison{
   static boolean equalArray(int a[],int b[],int size)
    {
        int i;
        Arrays.sort(a);
        Arrays.sort(b);
        for(i=0;i<size;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
    
            }
        }
        return true;
    }
}

public class EqualityOfTwoArrays {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=obj.nextInt();
        int i;
        int a[]=new int[size];
        int b[]=new int[size];
        System.out.println("Enter "+ size+"element of the 1st array:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }

        System.out.println("Enter "+ size+"element of the 2nd array:");
        for(i=0;i<size;i++)
        {
            b[i]=obj.nextInt();
        }

        
        
        Comparison c=new Comparison();
        
       System.out.println(c.equalArray(a,b,size)) ;
        
    }
}
