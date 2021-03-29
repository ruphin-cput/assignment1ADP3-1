package za.ac.cput;

/**
 * @author Adriaan(Annemie) Burger 219014868
 * Cipher.java
 * ADP3 Assignment1 March/April 2021
 * 
 */

/*
READ ME:
In my elective of blockchain technology I see how cryptography plays a big role.
One of the simpler types of encryption used as an example was the Caesar cipher – where the alphabet
is offset by a certain number (that would be your key). To demonstrate this, I wanted to build the code.
When researching this online, however, I found that someone else has already done that in Java.
This code imports that maven dependency and runs the main functions to show how the cipher would be
used but also how easily it could be solved.
 */
import com.grayen.encryption.caesar.algorithm.Caesar;
import com.grayen.encryption.caesar.algorithm.implementation.CaesarFabric;


public class Cipher {
    Caesar encryption = CaesarFabric.getEncryptionSystem();

    public String caesarEncrypt(String toEncrypt,int offset){
        return encryption.encrypt(toEncrypt,offset);
    }

    public String caesarDecrypt(String toDecrypt, int offset){
        return encryption.decrypt(toDecrypt,offset);
    }
    public String bruteForce(String toBreak){
        return "";
    }

}
