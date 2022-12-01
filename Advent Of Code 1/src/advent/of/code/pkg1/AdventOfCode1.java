
package advent.of.code.pkg1;

import java.io.*;
import java.net.*;
import java.util.*;

public class AdventOfCode1 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); 
        
        String line;
        int num = 0;
        int total = 0;
        int i = 0;
        ArrayList<Integer> elves = new ArrayList<>();
        
        while((line = br.readLine()) != null){
            if(line.equals("")){
                elves.add(num);
                num = 0;
                System.out.println("Total Elf #"+ (i+1) +": " + elves.get(i));
                i++;
            } else {
                num += Integer.parseInt(line.trim());
            }
        }
        
        br.close();
        fr.close();
        
        Collections.sort(elves, Collections.reverseOrder());
        
        for(int n=0; n<3; n++){
            total+=elves.get(n);
            System.out.println("Elf #" + (n+1) + ": " + elves.get(n));
        }
        
        System.out.println("Total: " + total);
    }
    
}
