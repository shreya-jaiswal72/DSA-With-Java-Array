import java.util.Scanner;

public class ReplaceAllOccurrence{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=obj.nextInt();

        int a[]=new int[size];
        int i;
        System.out.println("Enter "+size+"elements in an array: ");
        for(i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Before Updation");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
//logic
        
        int olde,newe;
        System.out.println("Enter old element: ");
        olde=obj.nextInt();
        System.out.println("Enter new element:");
        newe=obj.nextInt();

        for(i=0;i<a.length;i++)
        {
            if(olde==a[i])
            {
                a[i]=newe;
            }
        }
        System.out.println("After Updation");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }


}