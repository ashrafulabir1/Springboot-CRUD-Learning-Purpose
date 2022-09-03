package Default;

public class SwapingElement {
    public static void main(String[] args) {
        String[] arr = {"First", "Second", "Third", "Fourth"};
        System.out.println("Array before Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
        //Simple Swapping logic
        String temp = arr[1]; //store value of index 1 in temp
      //  System.out.println("temp="+temp);
        arr[1] = arr[2]; //value of index 2, put it in index 1 now
        //  System.out.println("1 no index of array="+arr[1]);
        arr[2] = temp;  //bring the value from temp and place it to index 2
        //  System.out.println("2 no index of array="+arr[2]);
        System.out.println("\n" + "Array after Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
    }
}