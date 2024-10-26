import java.util.Scanner;

public class SwappingTwoRows {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the row value:");
        int row=obj.nextInt();
        System.out.println("Enter the column value:");
        int col=obj.nextInt();
        int i,j,n,m,t;
        int a[][]=new int[row][col];
        System.out.println("Enter the elements in the matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        
        System.out.println("Enter the n and m value:");
         n=obj.nextInt();
         m=obj.nextInt();
         System.out.println("Before Swapping: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                    System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        for(i=0;i<col;i++)
        {
            t=a[m-1][i];
            a[m-1][i]= a[n-1][i];
            a[n-1][i]=t;    
        }
        System.out.println("After Swapping:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
