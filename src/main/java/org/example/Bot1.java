package org.example;

import java.util.Scanner;

public class Bot1 implements Interface {
    public void hello () {
        System.out.println("Hi! This is Bot.");
        System.out.println("What do you want to do?");
        System.out.println("Now, i can repeat your text. Please, input text:");//в итоге здесь сделать help
    }
    public void itext(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input text:");
        String text = in.nextLine();
        TextProcess(text);
    }
    public void TextProcess(String text){
        System.out.println("Return your text");
        System.out.println(text);
    };
}