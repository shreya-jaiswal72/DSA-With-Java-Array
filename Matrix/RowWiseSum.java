import java.util.Scanner;

public class RowWiseSum {
      public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int rsize=obj.nextInt();
        System.out.println("Enter the column size:");
        int csize=obj.nextInt();
        int i,j,sum=0;
        int a[][]=new int[rsize][csize];
        System.out.println("Enter the elements in the matrix:");
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                sum=sum + a[i][j];
            }
            System.out.println("Sum = "+sum);
            sum=0;
        }
        
    }
}
