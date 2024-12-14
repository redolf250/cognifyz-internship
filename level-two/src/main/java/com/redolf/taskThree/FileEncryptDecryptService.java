package com.redolf.taskThree;

public interface FileEncryptDecryptService {
    String encrypt(String input, int shift);
    String decrypt(String input, int shift);
}
