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

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Cipher {
    Caesar encryption = CaesarFabric.getEncryptionSystem();

    public String caesarEncrypt(String toEncrypt,int offset){
        return encryption.encrypt(toEncrypt,offset);
    }

    public String caesarDecrypt(String toDecrypt, int offset){
        return encryption.decrypt(toDecrypt,offset);
    }

    public int findKeyRandom(String toBreak, String message) throws InterruptedException { //guess the key with Random values
        Random r = new Random();
        int low = 1;
        int high = 16;
        int randomKey=r.nextInt(high-low) + low;
        TimeUnit.MILLISECONDS.sleep(600); //to help illustrate the timeout test

        while(true){
            if(encryption.decrypt(toBreak,randomKey).equals(message)){
                System.out.println("Encryption key "+ randomKey+" solves "+ toBreak + " to mean: " + message);
                return randomKey;

            } else{
                randomKey = r.nextInt(high-low) + low;
            }
        }
    }

    public int findKeyBruteForce(String toBreak, String message)  {
        int key = 1;

        while(true){
            if(encryption.decrypt(toBreak,key).equals(message)){
                System.out.println("Encryption key "+ key+" solves "+ toBreak + " to mean: " + message);
                return key;
            } else{
                key++;
            }

        }

    }

}