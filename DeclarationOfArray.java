public class DeclarationOfArray
{
    public static void main(String[] args)
    {
        //Declaration of 1d Array
        
        int[] arr1;    //recommended
        int []arr2;
        int arr3[];


        //Creating a 1D Array
        arr1=new int[5];

        // initializing the 1D Array
        System.out.println(arr1[0]);        //0
        

    
        int a[];
        a=new int[2];
        System.out.println(a[0]); 
        System.out.println(a[1]); 
        

        boolean b[];
        b=new boolean[2];
        System.out.println(b[0]);
        System.out.println(b[1]);
        
        float f[];
        f=new float[2];
        System.out.println(f[0]);
        System.out.println(f[1]);

        String s[];
        s=new String[2];
        System.out.println(s[0]);
        System.out.println(s[1]);

        char c[];
        c=new char[2];
        System.out.println(c[0]);
        System.out.println(c[1]);
        // System.out.println(c[2]); //RunTimeException 


        // declare, create and intialization in a single line:

        // If we know the array elements in advance, then we can declare, create and we can
        // perform intializations in a single line.

        int arr[] = {1,2,3,4,5}; 
        System.out.println(arr[0]);//1
        System.out.println(arr[1]);//2
        System.out.println(arr[2]);//3
        System.out.println(arr[3]);//4
        System.out.println(arr[4]);//5


        
        

         //Declaration of 2D Array

         int a1[][];
         int [][]a2;
         int[][] a3;
         int[] []a4;
         int[] a5[];
         int []a6[];

         int ar1[][];
         ar1=new int[1][2];
         System.out.println(ar1[0][0]); 
         System.out.println(ar1[0][1]); 


        //  declare, create and intialization in a single line:

         int ar[][] = {{1,2,3},{4,5,6},{7,8,9}};
         System.out.println(ar[0][0]);//1
         System.out.println(ar[0][1]);//2
         System.out.println(ar[0][2]);//3
         System.out.println(ar[1][0]);//4
         System.out.println(ar[1][1]);//5
         System.out.println(ar[1][2]);//6
         System.out.println(ar[2][0]);//7
         System.out.println(ar[2][1]);//8
         System.out.println(ar[2][2]);//9
         
        

    }
}