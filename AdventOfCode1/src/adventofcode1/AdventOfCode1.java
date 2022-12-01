
package adventofcode1;

/**
 * @author neilrcassidy
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class AdventOfCode1 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        // Open file and reader to read input.txt
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); 
        
        // Variables
        String line;
        int num = 0;
        int total = 0;
        int i = 0;
        // ArrayList that contains the total calories that each elf is carrying
        ArrayList<Integer> elves = new ArrayList<>();
        
        /* While loop that reads input.txt and adds together the calories for
        each elf */ 
        while((line = br.readLine()) != null){
            if(line.equals("")){
                elves.add(num);
                num = 0;
                System.out.println("Total Calories for Elf #"+ (i+1) +": " + elves.get(i));
                i++;
            } else {
                num += Integer.parseInt(line.trim());
            }
        }
        
        // Closing the reader
        br.close();
        fr.close();
        
        // Sorting of the arraylist to get the top 3 elves
        Collections.sort(elves, Collections.reverseOrder());
        
        /* For loop that gets the total of calories on the top 3 elves
        and prints how many calories each of those elves have*/
        for(int n=0; n<3; n++){
            total+=elves.get(n);
            System.out.println("Elf #" + (n+1) + ": " + elves.get(n));
        }
        
        System.out.println("Total calories of top 3 elves: " + total);
    }
    
}
