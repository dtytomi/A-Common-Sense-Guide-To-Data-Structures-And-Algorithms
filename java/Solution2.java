public class Solution2 {

    
    public static void main(String[] args) {
                
        String string1 = "kin";
        String string2 = "kin";

        boolean result = permutation(string1, string2);
        
        System.out.printf("\nResult %s \n", result);
    }
    
    public static boolean permutation (String str, String fStr) {
        
        if (str.length() != fStr.length()) {
            System.out.println("I jumped out of here");
            return false; 
        }

        int[] letters = new int[128];
        
        char[] s_array = str.toCharArray();
        for (char c: s_array) {
            System.out.printf("\n %c", c);
            letters[c]++;
            System.out.printf("\n %d ", letters[c]++);
        }

        for (int i = 0; i < fStr.length(); i++) {
            int c = (int) fStr.charAt(i);

            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
