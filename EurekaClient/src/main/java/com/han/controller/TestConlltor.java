package com.han.controller;

public class TestConlltor {
    public static void main(String[] args) {
        System.out.println(sum(1,1));
    }

    public static int sum(int ...b){
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }
}
