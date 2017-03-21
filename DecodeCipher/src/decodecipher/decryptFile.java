/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodecipher;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Meeth
 */
public class decryptFile {
    
    Map<Character, Float> hashFile= new HashMap<Character, Float>();
    
    /**
     * decrypts the file giving frequency of each alphabetical letter
     * @throws IOException
     */
    public void decrypt() throws IOException{
        ReadFiles r= new ReadFiles();// creating an object reference of readFiles to read the encrypted file
        float freq=0;
        int total=0;
        System.out.println("Enter the file name from the list below:");
        System.out.println("abc.txt");
        System.out.println("test.txt");
        System.out.println("mango.txt");
        Scanner sc= new Scanner(System.in);
        char [] c= r.readFile(sc.nextLine());
        
        
        int j=1;
        for(int i=0;i< c.length;i++)
        {
            if(hashFile.containsKey(c[i]))
            {
                hashFile.put(c[i], hashFile.get(c[i])+1);
                 //freq= hashFile.get(c[i])/ c.length;
                total+= 1;
                
            } 
            else
            {
                hashFile.put(c[i], 1f);
            }
       }
        
       
        System.out.println("KEY"+"   "+ "FREQUENCY");
       for(Character key:hashFile.keySet())
       {
            Float value= hashFile.get(key);
            
           System.out.println(key+"     "+ (float)hashFile.get(key)/total);
       }
       
       
       
       
       
       
    }
}
