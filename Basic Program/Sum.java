import java.util.Scanner;

public class Sum {
    public static void main(String[] args)    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=input.nextInt();
        
        int a[]=new int[size];
        System.out.println("Enter "+size+ " Elements: ");
        for(int i=0; i<a.length; i++){
            a[i]=input.nextInt();        
        }
        System.out.println("Array Elements are: ");
        int index=0;
        int sum=0;
        while (index<a.length) {
            System.out.println(a[index]);
             sum = sum+ a[index];
            index++;
        }
        System.out.println("Sum of element in an array= "+ sum);
    }
}
