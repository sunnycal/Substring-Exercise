package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word, any word:  ");
        text = input.nextLine();

        int index = input.nextInt();
        input.nextLIne();

        System.out.println("Enter a word, any word: ");
        String text = "";
         text = input.nextLine();

        System.out.println("The length of my word is " + text.length());



        System.out.println("Until with part of the sentence woudl you like to print?");
        int indexNum = input.nextInt();
        input.nextLine();

        if (indexNum > text.length()) {


//            input validation loop
            boolean loopValidate = true;
            while (loopValidate){

            }
            System.out.println("index is beyond my limit! Enter a valid index number");
            input.nextInt();
            if (indexNum < text.length()){
                loopValidate = false;


            }
            System.out.println("good input");
            System.out.println("word from index 0 to spexified index of " + index + " is " + text.substring(0, index));


        }

// test print statements
        System.out.println();
        System.out.println(text.substring (0));
        System.out.println(text.substring (0, indexNum));
        System.out.println(text.substring(indexNum));





//        System.out.println("Using .substring() : ");
//        System.out.println();
//

    }
}
