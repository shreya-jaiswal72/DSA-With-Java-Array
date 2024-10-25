import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("Enter the matrix-A row size:");
        int rsize1=obj.nextInt();
        System.out.println("Enter matrix-A coloumn size:");
        int csize1=obj.nextInt();
        System.out.println("Enter the matrix-B row size:");
        int rsize2=obj.nextInt();
        System.out.println("Enter matrix-B coloumn size:");
        int csize2=obj.nextInt();
        
        int i,j,k;
        int a[][]=new int[rsize1][csize1];
        int b[][]=new int[rsize2][rsize2];
        int c[][]=new int[rsize1][csize1];
        
        
        if(rsize1==csize2)
        {
            System.out.println("Enter matrix-A elements");
            for(i=0;i<rsize1;i++)
            {   
                for(j=0;j<csize1;j++)
                {
                    a[i][j]=obj.nextInt();
                }
            }
            System.out.println("Enter matrix-B elements");
            for(i=0;i<rsize2;i++)
            {   
                for(j=0;j<csize2;j++)
                {
                    b[i][j]=obj.nextInt();
                }
            }

            for(i=0;i<rsize1;i++)
            {
                for(j=0;j<csize1;j++)
                {
                    c[i][j]=0;
                    for( k=0;k<csize1;k++)
                    {
                            c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                    }
                   
                   
                }   
            }
            System.out.println("the matrix-A are:");
            for(i=0;i<rsize1;i++)
            {
                for(j=0;j<csize1;j++)
                {
                    System.out.print(a[i][j]+" ");
                }   
                System.out.println();
            }
            System.out.println("the matrix-B are:");
            for(i=0;i<rsize2;i++)
            {
                for(j=0;j<csize2;j++)
                {
                    System.out.print(b[i][j]+" ");
                }   
                System.out.println();
            }

            System.out.println("the matrix-C are:");
            for(i=0;i<rsize1;i++)
            {
                for(j=0;j<csize2;j++)
                {
                    System.out.print(c[i][j]+" ");
                }   
                System.out.println();
            }
        }
        else
        {
            System.out.println("Multiplication is not possible.");
        }
    
        
        
    }
}
