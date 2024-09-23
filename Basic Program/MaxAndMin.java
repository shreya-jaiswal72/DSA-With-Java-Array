import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=input.nextInt();
        int a[]=new int[size];
        int i,max,min;
        for(i=0 ; i<a.length ; i++){
            a[i]=input.nextInt();
        }
        max=a[0];
       for(i=0;i<a.length;i++) {
            if(max<a[i])    {
                max=a[i];
                
            }
        }
        System.out.println("Maximum = "+max);

        min=a[0];
        for(i=0;i<a.length;i++) {
             if(min>a[i])    {
                 min=a[i];
                 
             }
         }
         System.out.println("Minimum = "+min);
    }
}
