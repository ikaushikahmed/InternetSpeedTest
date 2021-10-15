package javaStringConcat;

public class LastDigits {

    public static void main(String[] args) {
        //Get last 11 characters

        String input = "https://www.speedtest.net/result/12170554004";     //input string
        String lastElevenDigits = "";     //substring containing last 11characters

        if (input.length() > 11)
        {
            lastElevenDigits = input.substring(input.length() - 11);
        }
        else
        {
            lastElevenDigits = input;
        }

        System.out.println(lastElevenDigits);
    }

}
