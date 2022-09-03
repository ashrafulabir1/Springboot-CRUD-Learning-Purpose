package Default;

public class LinearSearch {
	   public static void main(String args[]){
	      int array[] = {77, 23, 55, 90, 7, 67, 3, 89};
	      int size = array.length;
	      int value1 = 90;
	      int value2= 89;
	    
	    	 for (int i=0 ;i< size; i++){
		         if(array[i]==value1 || (array[i]==value2 && array[i]==value1)){
		            System.out.println("Search element is: "+value1+" found at the index of "+ i);
		         }
		            else if(array[i]==value2 || (array[i]==value2 && array[i]==value1)) {
		            	System.out.println("Search element is: "+value2+" found at the index of "+ i);
		            }
		         else{
		            System.out.println("Element not found");
		         
		      }
	     }
	   }
	}