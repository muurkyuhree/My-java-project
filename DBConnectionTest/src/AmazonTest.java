import java.util.*;

public class AmazonTest {

	// Returns minimum number of platforms reqquired 
	static int findPlartform(int arr[], int dept[], int n){
	
		Arrays.sort(arr);
		Arrays.sort(dept);
		
		int plart_needed = 1, results = 1;
		int i=1, j=0;
		
		while(i<n && j <n){
			if(arr[i] <= dept[j]){
				plart_needed++;
				i++;
				if(plart_needed > results)
					results = plart_needed;
			}else{
				plart_needed++;
				j++;
			}
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = "
	                        + findPlartform(arr, dep, n)); 

	}

}
