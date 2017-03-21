/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author Meeth
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decodecipher;
/**
 *
 * @author Meeth
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * class to read files
 *
 * @author Meeth
 */
public class ReadFiles {

 char[] ch = null;
    /**
     * method to read file
     *
     * @param filePath
     * @return a char array ch
     * @throws IOException
     */
    public char [] readFile(String filePath) throws IOException, NumberFormatException {
        try{
        FileReader filereader = new FileReader(filePath);
        StringTokenizer str;
        //BufferedReader for the file
        BufferedReader reader = new BufferedReader(filereader);
        String line;
        String contents = "";
        char c;
        int i;
        
        //Read data from a file
        
        while ((line = reader.readLine()) != null) {
            
            contents= contents + line;
  
        }
       
       
        
        contents=contents.toLowerCase();
        contents=contents.replaceAll("([^a-z])", "");
         ch= contents.toCharArray();


    }
        catch(IOException e){
            System.out.println("File does not exist");
            System.exit(0);
        }
        return ch;
}
}

