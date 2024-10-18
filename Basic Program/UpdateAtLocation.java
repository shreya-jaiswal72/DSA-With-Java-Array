import java.util.Arrays;

class Demo
{
    static int[] updateElementAtLocation(int a[], int location,int element)
    {
        int i, b[]=new int[a.length];
        for(i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        if(location>=0 && location<a.length)
        {
            b[location]=element;
        }
        return b;
    }
}

public class UpdateAtLocation {
    public static void  main(String[] args)
    {
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(Demo.updateElementAtLocation(a,0,999)));
        System.out.println(Arrays.toString(Demo.updateElementAtLocation(a,1,999)));
        System.out.println(Arrays.toString(Demo.updateElementAtLocation(a,2,999)));
        System.out.println(Arrays.toString(Demo.updateElementAtLocation(a,3,999)));
        System.out.println(Arrays.toString(Demo.updateElementAtLocation(a,4,999)));
    }
}

