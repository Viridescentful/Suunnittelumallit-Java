package Customisable_Printer.Classes;

import Customisable_Printer.Abstract.Printer;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class EncrypterPrinter extends DecoratorPrinter {
    private Printer printer;

    public EncrypterPrinter(Printer printer) {
        super(printer);
    }

    public String encrypt(String message) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey secretKey = keyGen.generateKey();

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(message.getBytes());

            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error during encryption";
        }
    }

//    public String encrypt(String message) {
//        StringBuilder encrypted = new StringBuilder();
//        for (char c : message.toCharArray()) {
//            encrypted.append((char) (c + 1));
//        }
//        return encrypted.toString();
//    }

    @Override
    public void print(String message) {
        super.print(encrypt(message));
    }
}
