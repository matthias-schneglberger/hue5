/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung2;

import java.math.BigInteger;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("RSAEngine");
        System.out.println("unverschluesselt || nach der versclüsselung");
       
        
        RSAEngine rsa = new RSAEngine(11, 23);
        
        BigInteger encryptedInt = rsa.encryptNumber(47);
        int decryptedInt = rsa.decryptNumber(encryptedInt).intValue();
        
        System.out.println("47 || " + decryptedInt);
        
        
        BigInteger encryptedChar = rsa.encryptChar((char)65);
        char decryptedChar = rsa.decryptChar(encryptedChar);
        
        System.out.println("A" + " || " + decryptedChar);
        
        
        BigInteger[] encryptedString = rsa.encryptString("HTL-GRIESKIRCHEN");
        String decryptedString = rsa.decryptString(encryptedString);
        
        System.out.println("HTL-GRIESKIRCHEN || " + decryptedString);
    }
    
}
