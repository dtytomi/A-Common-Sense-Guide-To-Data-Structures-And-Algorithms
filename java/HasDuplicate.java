public class HasDuplicate {
    
    public static void main(String [] args) {
        
    }
    
    bool hasDuplicate(int [] arr) {
        
        int steps = 0;

        int existingNumbers[] = new int[10];

        for(int i = 0; i < arr.length; i++) {
            steps++;
            if (existingNumbers[arr[i]] != null) {
                existingNumbers[arr[i]] = 1;
            } else {
                return true;
            }
        }

        System.out.printf("Steps are: %d", steps);
        return false;
    }

}
