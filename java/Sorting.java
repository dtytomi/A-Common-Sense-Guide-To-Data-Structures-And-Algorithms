public class Sorting {
    
    public static void main(String[] args) {
        
        int temp;
        int[] arr = {1,1,2,3,2,1,4};
        
        for (int pass = arr.length - 1; pass >= 0; pass-- ) {
            for (int i = 0; i <= pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                     temp = arr[i + 1];
                     arr[i + 1] = arr[i];
                     arr[i] = temp;
                }
     
            }
        
        }

        for (int c: arr){
            System.out.printf("%d, ", c);
        }
        System.out.println("");
    
    }
}
