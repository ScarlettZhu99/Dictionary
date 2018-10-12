


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;



/**
 *
 * @author Haiping Zhu
 */
public class Dictionary {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        HashMap<String, Integer> Dict = new HashMap<>();
        int i=1;
        Scanner s= new Scanner(new BufferedReader(new FileReader("dict.txt")));
        while (s.hasNext()) {
            Dict.put(s.next(),i);
            i++;
        }
       
        //@author Tueming Mneg
        
            
        
        
    }
    
}
