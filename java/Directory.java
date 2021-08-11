import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

class Directory {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Input the Directory you want to Look up");
        
        String directory = userInput.nextLine(); // Read user input
        find_directories(directory);
    }

    static void find_directories (String directory) {           
        
        File dir = new File(directory);
        String[] files = dir.list();

        if (files.length == 0) {
            System.out.println("Folder's empty");
        } else {
            for (String aFile: files) {
                 System.out.println(aFile);
            }
        }

    }

}
