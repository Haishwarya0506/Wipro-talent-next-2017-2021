1)Pth factor of a number

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {
    public static long pthFactor(long n, long p) 
    {
        int i;
        for(i = 1;i < n;i++)
        {
            if(n%i == 0)
            {
                if(i == p)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        return i;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());


        long p = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.pthFactor(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


2)FizzBuzz

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
    public static void fizzBuzz(int n) 
    {
        for(int i= 1;i <= n;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
            
        }
   
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
