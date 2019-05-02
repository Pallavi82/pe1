package com.stackroute;

public class VowCons {

    public String vowelcons1(String str) {

        for (int i = 0; i < str.length(); i++) {

            char r = str.charAt(i);
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' || r == 'A' || r == 'E' || r == 'I' || r == 'O' || r == 'U') {
                return "Vowel";
            } else if ((r >= 'a' && r <= 'z') || (r >= 'A' && r <= 'Z')){

            return "Consonant";

            }
        }
        return "Not String";
    }

}
