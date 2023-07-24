package com.exercise;

public class Main {
    public static void main(String[] args) {
        String names[] = {"James", "John", "Adam", "Daniel", "Claire", "Mary", "Susan"};
        String allNames = "";
        
        for (String name : names) {
            allNames += name + " ";
        }

        System.out.println(allNames);
    }
}