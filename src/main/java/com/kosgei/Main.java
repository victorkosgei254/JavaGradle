package com.kosgei;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Gradle");
        for(int i = 1; i < 14; i ++){
            for(int j = 1; j<14;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
