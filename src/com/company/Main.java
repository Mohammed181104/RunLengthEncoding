package com.company;
import java.util.Scanner;

public class Main {

    public static String RunLenEncoder(String example){
        int strLength = example.length();
        char previousChar = example.charAt(0);
        int counter = 0;
        for(int i = 0; i < strLength; i++){
            if(example.charAt(i) == previousChar){
                counter++;

            }else{
                System.out.print(previousChar);
                System.out.print(counter);
                counter = 1;
                previousChar = example.charAt(i);

            }
        }

        return " has been encoded.";

    }

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Type what you want to encode");
        String text = input.nextLine();
        System.out.println(RunLenEncoder(text));
        
    }
}
