public class NegativeArraySizeException {

    //When we are creating an array, if we are using -ve integer value for array size, then
    // java raises automatically runtime error saying "NegativeArraySizeException"
    public static void main(String[] args)
    {
        int a[] = new int[-3];
    }
}
