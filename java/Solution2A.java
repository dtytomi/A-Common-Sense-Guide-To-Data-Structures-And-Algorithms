public class Solution2A {

    
    public static void main(String[] args) {
                
        String string1 = "sin";
        String string2 = "kin";

        boolean result = permutation(string1, string2);
        
        System.out.printf("\nResult %s \n", result);
    }

    public static String sort (String str) {
        char [] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    
    public static boolean permutation (String str, String fStr) {
        
        if (str.length() != fStr.length()) {
            return false; 
        }

        return sort(str).equals(sort(fStr));
    }

}
