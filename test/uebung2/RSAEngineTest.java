/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class RSAEngineTest {
    
    public RSAEngineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testEncryptDecryptNumber() {
        RSAEngine rsa = new RSAEngine(11, 23);
        System.out.println("encrypt and decrypt Number");
        int expected = 47;
        int real = rsa.decryptNumber(rsa.encryptNumber(expected)).intValue();
        
        assertEquals(expected, real);
    }
    
    @Test
    public void testEncryptDecryptChar(){
        RSAEngine rsa = new RSAEngine(11, 23);
        System.out.println("encrypt and decrypt Char");
        char expected = (char)65;
        char real = rsa.decryptChar(rsa.encryptChar(expected));
        
        assertEquals(expected, real);
    }
    
    @Test
    public void testEncryptDecryptString(){
        RSAEngine rsa = new RSAEngine(11, 23);
        System.out.println("encrypt and decrypt String");
        String expected = "TAISKIRCHEN";
        String real = rsa.decryptString(rsa.encryptString(expected));
        
        assertTrue(expected.equals(real));
        
    }

    
}
