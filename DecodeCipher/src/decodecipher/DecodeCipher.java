/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodecipher;

import java.io.IOException;

/**
 *
 * @author Meeth
 */
public class DecodeCipher {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        decryptFile df= new decryptFile();// creating an object reference of class decryptfile
        df.decrypt();// calls the decrypt method
        
        
    }
    
}
