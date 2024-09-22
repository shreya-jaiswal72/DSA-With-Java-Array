class ArrayIndexOutOfBoundsException
{
public static void main(String[] args)
{
int a[] = new int[3];
System.out.println(a.length);//3
System.out.println(a[0]);//0
System.out.println(a[1]);//0
System.out.println(a[2]);//0
System.out.println(a[3]);//RunTimeException
}
}