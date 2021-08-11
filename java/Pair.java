public class Pair {
    
    public static void main(String [] args) {
        
        //int [] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20 };
        // int [] arr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
        int [] arr = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        
        int count = 0, posFV = 0, posSV = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                
                if(arr[j] == arr[i] && count == 0) {
                	
                    System.out.printf("\nvalue of j: %d   value of i: %d, index i: %d, index j: %d", arr[j], arr[i], i, j);
                    
                    posFV = i;
                    posSV = j;
                    count = 1;
                } 
                
                if(arr[j] == arr[i] && (arr[posFV] != arr[i] && arr[posSV]  != arr[j])) {
                	
                    System.out.printf("\nvalue of j: %d   value of i: %d, index i: %d, index j: %d", arr[j], arr[i], i, j);
                    
                    posFV = i;
                    posSV = j;
                    count += 1;
                } 
                                                  
            }
        }

        System.out.printf("\n\nNo of Pairs: %d \n", count);
    
    }
}
