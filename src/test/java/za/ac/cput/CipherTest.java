package za.ac.cput;

import com.grayen.encryption.caesar.algorithm.Caesar;
import com.grayen.encryption.caesar.algorithm.implementation.CaesarFabric;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
private Cipher cipher;
private String textToEncrypt = "Always";
private String textToDecrypt = "Vaqvsh";
    @BeforeEach
    void setUp() {

        this.cipher = new Cipher();
    }

    @Test
    public void testCeasarEncrypt(){
        String result = cipher.ceasarEncrypt(textToEncrypt, 5);
        assertEquals("Vaqvsh",result);
    }
    @Test
    public void testCeasarDecrypt(){
        String result = cipher.ceasarDecrypt(textToDecrypt, 5);
        assertEquals(textToEncrypt,result);
    }

    //@Test @Timeout(1000)
    //public void testBruteForce(){

   // }
}