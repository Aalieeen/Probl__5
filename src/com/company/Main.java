package com.company;

public class Main {

    public static void main(String[] args) {
        int numberMin =11;
        int numberMax =19;
        long num = 2520;
        boolean bool = false;
        do {
            int i;
            for (i = 11; i <= 19; i++) {
                if ((num % i) != 0) {
                    num = num + 20;
                    break;
                }
            }
            if (i > numberMax ) bool = true;
        } while (!bool);
        System.out.println(num);
    }}
    

