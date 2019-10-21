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
        RSAEngine rsa = new RSAEngine(11, 23);
        
        BigInteger encryptedInt = rsa.encryptNumber(4711);
        int decryptedInt = rsa.decryptNumber(encryptedInt).intValue();
        
        System.out.println("4711 || " + decryptedInt);
        
        
        BigInteger encryptedChar = rsa.encryptChar((char)65);
        char decryptedChar = rsa.decryptChar(encryptedChar);
        
        System.out.println("A" + " || " + decryptedChar);
        
        
        BigInteger[] encryptedString = rsa.encryptString("HTL-Grieskirchen");
        String decryptedString = rsa.decryptString(encryptedString);
        
        System.out.println("HTL-Grieskirchen || " + decryptedString);
    }
    
}
