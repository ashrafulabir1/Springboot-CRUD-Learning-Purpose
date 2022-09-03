package Default;
import java.lang.*;
import java.util.*;
public class ArrayElementAdd {

	 public static int[] addX(int myArray[], int x) {
	       int i;

	       // create a new array of a bigger size (+ one element)
	       int newArray[] = new int[myArray.length + 1];
	       System.out.println("Size of the new Array= "+newArray.length);

	       System.out.println("New Array elements are:");
	        for (int k=0;k<newArray.length;k++) {
	       
	            System.out.println(+newArray[k]);
	 }
	       // insert the elements from the old array into the new one
	       for (i = 0; i < myArray.length; i++)
	           newArray[i] = myArray[i];
	       newArray[myArray.length] = x;
//	       for (int k=0;k<newArray.length;k++) {
//	       System.out.println("After adding elements from array into new array"+newArray[k]);
//	       }
	       return newArray;
	   }

	   public static void main(String[] args) {
	       int i;

	       // initial array of size 7
	       int arr[]  = {0, 1, 2, 45, 7, 5, 17};
	      
	       System.out.println("Size of the initial array= " + arr.length);
	       // print the initial array
	       System.out.println("Initial Array: " + Arrays.toString(arr));

	       // element to be added
	       int x = 28;

	       // call the addX method to add x in arr
	       arr = addX(arr, x);
	      //  print the updated array
	       System.out.println("Array with add of new element " + x + " added:" + Arrays.toString(arr));
	   }
	}