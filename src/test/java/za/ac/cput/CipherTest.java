package za.ac.cput;

import com.grayen.encryption.caesar.algorithm.Caesar;
import com.grayen.encryption.caesar.algorithm.implementation.CaesarFabric;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTest {
private Cipher cipher;
private String textToEncrypt = "Always";
private String textToDecrypt = "Vaqvsh";
private Caesar encryption = CaesarFabric.getEncryptionSystem();

    @BeforeEach
    void setUp() {

        this.cipher = new Cipher();
    }

    @Test
    public void testCaesarEncrypt(){
        String result = cipher.caesarEncrypt(textToEncrypt, 5);
        assertEquals("Vaqvsh",result);
    }
    @Test
    public void testCaesarDecrypt(){
        String result = cipher.caesarDecrypt(textToDecrypt, 5);
        assertEquals(textToEncrypt,result);
    }
    @Test
    public void testEncryptionValidity(){ //can you see that the one is cipher text and the other is plain text?
        // or do they both look the same?
        assertNotSame(textToEncrypt,textToDecrypt);
    }

    @Test @Ignore //this test does the same as testEncryptionValidity() but in reverse.
    // This Ignore helps to let all tests pass when the whole test file runs
    public void testEncryptionOutput(){
        assertSame(textToDecrypt,textToEncrypt);
    }

    @Test @Timeout(1000)
    public void testFindKey(){ //guess the key until you get the right output(broke the encryption)
        // There are only 26 possible keys
       // fail();
        int key = cipher.findKey(textToDecrypt, textToEncrypt);
        String resultEncrypt = encryption.encrypt(textToEncrypt,key);
        String resultDecrypt = encryption.decrypt(textToDecrypt,key);
        assertNotSame(resultEncrypt,resultDecrypt);
        }

}
