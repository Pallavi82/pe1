package com.stackroute;

import java.util.Scanner;


public class EvenOdd {

        public String evenodd1(int num){

            if(num>=20 && num<=30) {
                if (num % 2 == 1)
                    return "Tom";
                else
                    return "Jerry";
            } else
                return "Number not between 20 and 30";
        }

    }

