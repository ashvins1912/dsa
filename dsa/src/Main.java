import Searching_Algo.BinarySearch.BinaryIterative;

public class Main {
    public static void main(String[] args) {

        BinaryIterative binaryIterative = new BinaryIterative();
        int [] arr = {2,3,4,10,40};
        System.out.println(binaryIterative.binarySearch(arr,2));
    }
}