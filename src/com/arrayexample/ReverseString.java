package com.arrayexample;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Automation";
        // By Using CharArray
      /*  char[] charArray = str.toCharArray();
        String reversed = " ";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];*/
//By using StringBuilder
        StringBuilder reversed = new StringBuilder(str).reverse();

        System.out.println(reversed);
    }
}

