package Default;

public class Reversing {

	public static void main(String[] args) {
	int[] array1 =new int[] {1,2,5,7,9,3}; //input array array.length=6 and no array length can be 0 but here index can be count till 5 because index start from 0.
	System.out.println("The original array is: ");
	for(int i=0;i<array1.length;i++) {
		System.out.println(array1[i]); //Show user input array
	}
	
	System.out.println("The reversed array is : ");
	for(int i=array1.length-1;i>=0;i--) {
		System.out.println(array1[i] +" "); //reverse array
	  }
   }
}
