package com.redolf.taskThree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileEncryptDecrypt {

    public static void main(String[] args) {
        FileEncryptDecryptServiceImpl service = new FileEncryptDecryptServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================Welcome to the File Encrypt/Decrypt Program!=====================");

        System.out.print("Do you want to encrypt or decrypt the file? (e/d): ");
        String choice = scanner.nextLine();

        System.out.print("Enter the file name or path: ");
        String filePath = scanner.nextLine();

        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.print("Enter the shift value for the cipher (integer): ");
        int shift = scanner.nextInt();

        String result = "";
        if (choice.equalsIgnoreCase("e")) {
            result = service.encrypt(content, shift);
            System.out.println("Encryption complete.");
        } else if (choice.equalsIgnoreCase("d")) {
            result = service.decrypt(content, shift);
            System.out.println("Decryption complete.");
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        try {
            String outputFilePath = filePath + (choice.equalsIgnoreCase("e") ? ".encrypted" : ".decrypted");
            Files.write(Paths.get(outputFilePath), result.getBytes());
            System.out.println("Result saved to: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
