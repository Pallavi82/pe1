package com.stackroute;

import java.util.Scanner;

public class palindrome {
    public String palin1(int num)
    {
        int temp=num;
        int sum=0;
        int sum1=0;
        while(num>0)
        {
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
            if(r%2==0)
                sum1=sum1+r;
        }
        if (temp==sum)
        {
            {
                if (sum1 >= 25) {
                    return "Number is Palindrome and the sum is greater than 25.";
                }
                 else
                    return "Number is Palindrome and the sum is lower than 25.";
            }
        }
        else
        {
            return "Number not a Palindrome";
        }
    }
}
