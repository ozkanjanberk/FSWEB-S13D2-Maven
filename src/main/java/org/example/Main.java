package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

   public static boolean isPalindrome(int number){
       String original = Integer.toString(Math.abs(number));
       String reverse = new StringBuilder(original).reverse().toString();
       return reverse.equals(original);
   }
    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        char[] digits = String.valueOf(number).toCharArray();
        String NumberToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    NumberToText += "Zero ";
                    break;
                case '1':
                    NumberToText += "One ";
                    break;
                case '2':
                    NumberToText += "Two ";
                    break;
                case '3':
                    NumberToText += "Three ";
                    break;
                case '4':
                    NumberToText += "Four ";
                    break;
                case '5':
                    NumberToText += "Five ";
                    break;
                case '6':
                    NumberToText += "Six ";
                    break;
                case '7':
                    NumberToText += "Seven ";
                    break;
                case '8':
                    NumberToText += "Eight ";
                    break;
                case '9':
                    NumberToText += "Nine ";
                    break;
            }
        }
        return NumberToText.trim();
    }
}
