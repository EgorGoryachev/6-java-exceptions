package com.example.task03;
import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception");
    }
}