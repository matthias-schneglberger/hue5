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
public class RSAEngine {
    private final BigInteger p;
    private final BigInteger q;
    //private BigInteger n;
    private BigInteger e = new BigInteger("23");
    //private BigInteger omega;
    
    public RSAEngine(int p, int q) {
        this.p = new BigInteger(String.valueOf(p));
        this.q = new BigInteger(String.valueOf(q));
    }
    
    public BigInteger getN(){
        return p.multiply(p);
    }
    
    public BigInteger getOmega(){
        BigInteger num1 = p.subtract(BigInteger.ONE);
        BigInteger num2 = q.subtract(BigInteger.ONE);
        return num1.multiply(num2);
    }
    
    public BigInteger getD(){
        return e.modInverse(getOmega());
    }
    
    public BigInteger encryptNumber(int plain){
        BigInteger plainInt = new BigInteger(String.valueOf(plain));
        return plainInt.modPow(e, getN());
    }
    
    public BigInteger decryptNumber(BigInteger encrypted){
        return encrypted.modPow(getD(), getN());
    }
    
    public BigInteger encryptChar(char plain){
        BigInteger plainInt = new BigInteger(String.valueOf(plain));
        return plainInt.modPow(e, getN());
    }
    
    public char decryptChar(BigInteger encryptedChar){
        BigInteger charInt =  encryptedChar.modPow(getD(), getN());
        return (char)charInt.intValue();   
    }
    
    public BigInteger[] encryptString(String plain){
        BigInteger[] charArr = new BigInteger[plain.length()];
        String[] parts = plain.split("");
        
        for(int i = 0; i < plain.length(); i++){
            charArr[i] = encryptChar(parts[i].charAt(0));
        }
        
        return charArr;
    }
    
    public String decryptString(BigInteger[] encrypted){
        String finalStr = "";
        
        for(int i = 0; i < encrypted.length; i++){
            finalStr += decryptChar(encrypted[i]);
            
        }
        
        return finalStr;
    }
    
    
    
}
