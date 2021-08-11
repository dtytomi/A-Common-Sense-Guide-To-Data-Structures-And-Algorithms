public class MinMax{
    
    public static void main(String[] args) {

        int temp_min, temp_max, max = 0, min = 0;

        int [] arr = {2,2,5,3,8,7,6,1,4};
        
        for (int i = 0; i < arr.length; i++ ) {
        	 
        	temp_min = i; temp_max = i;
        	
        	for (int j = i + 1; j < arr.length; j++ ) {
        		
            	if (arr[j] < arr[temp_min]) {
                	
                	temp_min = j;

                    if (arr[temp_min] < arr[min]) {
                        min = temp_min;
                    }
            	}
            	
            	if (arr[j] > arr[temp_max]) {
                	
                	temp_max = j;

                    if (arr[temp_max] > arr[max]) {
                        max = temp_max;
                    }
            	}
            	
            }
        }

        System.out.printf("Max: %d \nMin: %d \n",arr[max], arr[min]);
    }
}
