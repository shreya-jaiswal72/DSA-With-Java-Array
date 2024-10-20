import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args )
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the matrix row size:");
        int rsize=obj.nextInt();

        System.out.println("Enter matrix coloumn size:");
        int csize=obj.nextInt();

        System.out.println("Enter the elements in the matrix");
        int i,j,a[][]=new int[rsize][csize];
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }

        System.out.println("the entered matrix elements are:");
        for(i=0;i<rsize;i++)
        {
            for(j=0;j<csize;j++)
            {
                System.out.print(a[i][j]+"[ "+i+" "+j+" ] ");
            }
            System.out.println();
        }

    }

}
