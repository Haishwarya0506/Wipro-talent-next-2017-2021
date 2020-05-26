1)Write a program to accept a number N and print whether it is positive, negative or zero:



import java.util.Scanner;
public class PosNeg 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The gn num "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The gn num "+n+" is Negative");
        }
        else
        {
            System.out.println("The gn num "+n+" is zero ");
        }
    }
}

2)Write a program to accept two numbers and print the greater value of the two:


import java.util.Scanner;

public class Largest
{
	public static void main(String[] args) 
	{
		int n1, n2;
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Please Enter the Num1 : ");
		num1 = s.nextInt();	
		
		System.out.print(" Please Enter the Num2 : ");
		num2 = s.nextInt();	
		
		if(num1 > num2) 
	    {
			System.out.println("The Largest Number = " + num1);          
	    } 
	    else 
	    { 
	    	System.out.println("The Largest Number = " + num2);        
	    } 
	}	
}

3)Write a program to accept a number N and print whether the number is EVEN or ODD:




import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) 
{

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = s.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

4)Write a program to accept two numbers and print whether their sum is EVEN or ODD:

import java.util.*;

public class prog4 {

    public static void main(String[] args) 
   {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Num1 : ");
        num1 = s.nextInt();	
        System.out.println("Enter the Num2 : ");
        num2 = s.nextInt();
        int sum = num1 + num2;
        if(sum % 2 == 0)
            System.out.println(sum + " is even");
        else
            System.out.println(sum + " is odd");
    }
}

5)Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100:



import java.util.Scanner;
public class print {
	public static void main(String[] args) 
	{
		int number = 1;
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}

6)Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99:



import java.util.Scanner;
public class Alternate1 {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Alternate Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
   }
}

7)Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100:





import java.util.Scanner;
public class Alternate2 {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Alternate Numbers from 0 to "+n+" are: ");
	for (int i = 0; i <= n; i++) {
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}

8) Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0:




import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args) 
	{
		int number, i;
		Scanner s= new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		number = s.nextInt();	
		for(i = number; i >= 1; i--)
		{
			System.out.print(i +"\t"); 
		}	
	}
}

9)Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 8582 79. . . 22 19 16 13 10 7 4 1

import java.util.*;
public class prog9
{
	public static void main(String[] args) 
	{
		int i;
		for(i=100;i>=1;i=i-3)
		{
			System.out.println(i);
		}
	}
}