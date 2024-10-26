import java.util.Scanner;

public class InterchangingOfDiagonal {
        public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int rsize=obj.nextInt();
        System.out.println("Enter the column size:");
        int csize=obj.nextInt();
        int i,j,t;
        int a[][]=new int[rsize][csize];
        System.out.println("Enter the elements in the matrix:");
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {       
                a[i][j]=obj.nextInt();
            }
        }   
        System.out.println("Before Swapping: ");
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<rsize;i++)
        {
            t=a[i][i];
            a[i][i]=a[i][rsize-i-1];
            a[i][rsize-i-1]=t;
        }

        System.out.println("After Swapping: ");
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
