import java.util.Arrays;

public class PredefinedComparisionMethod {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={3,2,1};
        System.out.println(Arrays.equals(a,b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}
