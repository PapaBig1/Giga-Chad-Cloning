package com.example.gigachad;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            HelloApplication.main(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
