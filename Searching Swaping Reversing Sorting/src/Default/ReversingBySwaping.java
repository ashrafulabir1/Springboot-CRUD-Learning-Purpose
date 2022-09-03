package Default;

public class ReversingBySwaping {

	public static void main(String[] args) {
		int[] Array1 = {1,2,3,4,5};
		int[] Array2 ={9, 10, 11, 12, 13};
		int temp;
		  for (int element1=0;element1<Array1.length;element1++) {
	            System.out.println("Array 1 index of " +element1+" is: "+Array1[element1]);
	        }
		  for (int element2=0;element2<Array2.length;element2++) {
	            System.out.println("Array 2 index of " +element2+" is: "+Array2[element2]);
	        }
		  for(int i=Array1.length-1;i>=0;i--) {
			  temp = Array1[i];   
			  for(int j=0;j<Array2.length;j++) {
		      
		        	Array1[i]=Array2[i];
		        
			  }
		        Array2[i]=temp; 
		  
		  
	}
		    	System.out.println("Array1" + " Array after Swap" + "\n");
		        for (int k=0;k<Array1.length;k++) {
		            System.out.println(Array1[k]);
		        }
		        System.out.println("The reversed array is : ");
		    	for(int i=Array1.length-1;i>=0;i--) {
		    		System.out.println(Array1[i] +" "); //reverse array
		    	  }
		        System.out.println("Array2" + " Array after Swap" + "\n");
		        for (int k=0;k<Array1.length;k++) {
		            System.out.println(Array2[k]);
		        }
		        System.out.println("The reversed array is : ");
		    	for(int i=Array2.length-1;i>=0;i--) {
		    		System.out.println(Array2[i] +" "); //reverse array
		    	  }
	      
       }

}
