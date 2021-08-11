public class InterSection {

    public static void main(String[] args) {
        
        int[] firstArray = {3, 1, 4, 2};
        int[] secondArray = {4, 5, 3, 6};
       
        InterSection interSection = new InterSection(); 

        interSection.intersection(firstArray, secondArray);
    }


    public void intersection(int[] first_array, int[]  second_array) {
        
        int [] result = new int [5];
        int count = 0;

        for (int i = 0; i < first_array.length; i++) {
            for (int j = 0; j < second_array.length; j++) {
                if (first_array[i] == second_array[j]) {
                    result[count] = first_array[i];
                    count += 1; 
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Intersections are: %d \n", result[i]);
        }

    }

}
