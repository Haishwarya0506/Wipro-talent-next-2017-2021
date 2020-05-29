1) Language Basics

program 1:

public class CommandLine{  
    public static void main(String[] args){ 
            String s = "Technologies";
        	System.out.println(args[0] + s);
	System.out.print(args[1]);
    }  
}  

program 2:

public class CommandLine{  
    public static void main(String[] args){  
        	System.out.println("Welcome "+args[0]);
    }  
}

program 3:

public class Sum{  
    public static void main(String[] args){ 
	int a,b,sum;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	sum=a+b;
        	System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+ sum);
    }  
}

2)Flow control

program 1:

public class Positivenegative 
{
    public static void main(String[] args) 
    {
        int n;
        n = Integer.parseInt(args[0]);
        if(n > 0)
        {
	System.out.println(n + " is positive ");  
        }
        else if(n == 0)
        {
	 System.out.println(n+" is zero");
        }
        else
        {
	System.out.println(n+" is Negative");
        }
    }
}

program 2:

public class Evenorodd{

    public static void main(String[] args) 
   {
        int n = Integer.parseInt(args[0]);
        if(n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }
}

program 3:

public class Commandline{
public static void main(String[] args)
{
	if(args.length == 0)
	{
		System.out.println("No values");
	}
                else
	{
		for(int i=0;i<args.length;i++)
		{
			if(i==args.length-1)
			{
				System.out.print(args[i]);
				break;
				System.out.print(args[i]+",");
			}
		}
	}
  }  
}

program 4 :

public class Characters
{
    public static void main (String[] args)
    {
        char a='s';
        char b='e';
        if (a>b)
            System.out.println(b+" , "+a);
       
        else
            System.out.println(a+" , "+b);
    }
}

program 5:

public class Alphaornot{
public static void main(String args[])
    {
        char ch='a';
         if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.print("Digit");
         }
        else
        {
            System.out.print("Special character");

        }
    }
}

program 6:

public class Gender { 
public static void main(String[] args) { 
	String gender=args[0]; 
	int age=Integer.parseInt(args[1]); 
	if(gender.equals("Female")) 
	{ 
		if(age>=1 && age<=58) 
			System.out.println("Interest= 8.2%"); 
		else if(age>58 && age<=120) 
			System.out.println("Interest= 7.6%"); 
	} 
	else { 
		if(age>=1 && age<=60) 
			System.out.println("Interest= 9.2%"); 
		else if(age>60 && age<=120) 
			System.out.println("Interest= 8.3%"); 
	} 
       }
}

program 7 :

public class Caseconversion { 
public static void main(String[] args) { 
	Scanner s=new Scanner(System.in); 
	char ch=s.next().charAt(0);
	if (Character.isLowerCase(ch)) {
		System.out.println(ch+"->"+Character.toUpperCase(ch)); }
	else {
		System.out.println(ch+"->"+Character.toLowerCase(ch)); }
       }
}

program 8:

  
public class Colour{ 
public static void main(String[] args) { 
	char ch=args[0].charAt(0); 
	switch(ch) 
	{ 
		case 'R': System.out.println("R->Red"); break; 
		case 'B': System.out.println("B->Blue"); break; 
		case 'G': System.out.println("G->Green"); break; 
		case 'O': System.out.println("O->Orange"); break; 
		case 'Y': System.out.println("Y->Yellow"); break; 
		case 'W': System.out.println("W->White"); break; 
		default: System.out.println("Invalid Code"); 
	} 
    } 
}

program 9:

public class Months{ 
public static void main(String[] args) { 
	i = Integer.parseInt(args[0]);
	if(i > 12 || i < 0)
	{
		System.out.println("Invalid month");
	}
	else
	{
		switch(i) 
		{ 
			case 1: System.out.println("January");
			break; 
			case 2: System.out.println("February");
			break; 
			case 3: System.out.println("March");
			break; 
			case 4: System.out.println("April");
			break; 
			case 5: System.out.println("May");
			break; 
			case 6: System.out.println("June");
			break; 
			case 7: System.out.println("July");
			break; 
			case 8: System.out.println("August");
			break; 
			case 9: System.out.println("September");
			break; 
			case 10: System.out.println("October");
			break; 
			case 11: System.out.println("November");
			break; 
			case 12: System.out.println("December");
			break; 
			default: System.out.println("Please enter the month in numbers"); 
		} 
	}
       }
}

program 10:

public class OnetoTen{ 
public static void main(String[] args) { 
	int i;
	for(i=1;i<=10;i++)
	{
		System.out.print(i+"	");
      	 }
    }
}

program 11:

public class EvenorOdd{ 
public static void main(String[] args) { 
	int i;
	for(i=23;i<=57;i==)
	{
		if(i % 2 == 0)
		{	
			System.out.println(i);
       		
	}
   }
}

program 12:

public class Primeornot{ 
public static void main(String[] args) { 
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt(); 
	int f=0; 
	for(int i=1;i<=n/2;i++) 	
	{ 
		if(n%i==0) 
		{
			f=1;
			break;
		}		
	}
	if(f==0) 
	{
		System.out.println(n+" is prime"); 
	}
	else 
	{
		System.out.println(n + is not prime"); 
	}
       }
}

program 13:

public class Prime{ 
public static void main(String[] args) { 
	int n=10;
	int m=99;
	while(n<m)
	{
		int f=0; 
		for(int i=1;i<=n/2;i++)
		{ 
			if(n%i==0) 
			{
				f=1;
				break;
			 }		
	                 }
		if(f==0)
		{
			System.out.println(n+" ");
		}
		n++;
	} 
	
       }
}

program 14:

public class Primeornot{ 
public static void main(String[] args) { 
	int n = Integer.parseInt(args[0]);
	if(args.length==0)
	{
		System.out.println("Please enter an integer number");
	}
	else if( n == 0 || n == 1) 
	{
		System.out.println(n+" is neither prime nor composite");
	}
	else
	{
		int f=0; 
		for(int i=1;i<=n/2;i++) 
		{ 
			if(n%i==0)	
			{
				f=1;
				break;
		       	  }		
	                	}
		if(f==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		
	} 
	
       }
}

program 15:

public class Sumofdigits{ 
public static void main(String[] args) { 
	int n = Integer.parseInt(args[0]);
	int r,sum=0; 
	while(n!=0) 
	{ 
		r=n%10; 
		sum += r; 
		n=n/10;
	}
	System.out.print(n+"->"+sum);
	
       }
}

program 16:

public class Floyds{ 
public static void main(String[] args) { 
	int n = Integer.parseInt(args[0]);
	if(args.length==0)
	{
		System.out.println("Please enter an integer number");
	}
	else
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
       }
}

program 17:

public class Reverseofanumber{
public static void main{
	int reverse;
	int n = Integer.parseInt(args[0]);
	while(n!=0)
	{
		reverse=n%10; 
		System.out.print(reverse); 
		n=n/10; 
	}
    }
}

program 18:

public class Palindrome{
public static void main{
	int r;
	int n = Integer.parseInt(args[0]);
	int m=n; 
	int sum=0; 
	while(m!=0) 
	{ 
		r=m%10; 
		sum=sum*10+r; 
		m=m/10; 
	} 
	if(n==sum)
	{
		System.out.println(n+" is a Palindrome");
	}
	else 
	{
		System.out.println(n+" is not a Palindrome");
	}
    }
}

progra 19:

public class Divisible{ 
public static void main(String[]args) { 
	int count=0,i=1; 
	while(count >= 5)
	{ 
		if(i%2==0 && i%3==0 && i%5==0) 
		{ 
			System.out.println(i); 
			count++; 
		} 
		i++; 
	} 
   }
}

program 20:

public class AddSub{ 
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	do{
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("Please enter an option:");
		int op = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		switch(op)
		{
			case 1:System.out.println(a+b);break;	
			case 2:System.out.println(a-b);break;
		}
		System.out.println("To continue enter y or Y");
		char yes = s.next.chatAt(0);
	}while(yes=='y' || yes=='Y');
   }
}

3)Arrays

program 1:

public class Array{
 public static void main(String [ ] args) { 
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        float avg;
        for(int  i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        avg = (float)sum/arr.length;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }
}

program 2:

public class Minmax{
 public static void main(String [ ] args) { 
       int arr[]={2,5,8,22,53,9};
       int max=min=arr[0];
       for(int  i=0;i<arr.length;i++) 
       {
            if (arr[i] < min)
           {
                min = arr[i];
            }
            else if(arr[i]>max)
           {
                max=arr[i];
            }
        }
        System.out.println("Min="+min);
        System.out.println("Maximum="+max);
    }
}

program 3:

import java.util.Scanner;
public class prog3{

    public static void main(String[] args) {
        int arr[]={1,4,34,56,7};
        Scanner s = new Scanner(System.in);
        int search = s.nextInt();
        int f=0;
        for(int  i=0;i<arr.length;i++)
       {
            if (arr[i]==search)
            {
                System.out.println(i);
                f = 1;
                break;
            }
        }
        if(f==0)
       {
            System.out.println(-1);
        }
    }
}

program 4:

public class ASCII{
    public static void main(String[] args) {
        int arr[]={65,67,70,97,99};
        for(int  i=0;i<arr.length;i++) {
                System.out.println((char)arr[i]);
        }
    }
}

program 5:

public class Minmax2{

    public static void main(String[] args) {
        int arr[]={5,8,18,33,95,16,28};
        int max=min=arr[0];
        for(int  i=0;i<arr.length;i++) 
       {
            if (arr[i] < min)
            {
                min = arr[i];
            }
            else if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int max2=min2=arr[0];
        for(int  i=0;i<arr.length;i++)
       {
            if (arr[i] < min2 && arr[i]!=min)
            {
                min2 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max)
            {
                max2=arr[i];
            }
        }
        System.out.println("Two smallest numbers are : "+min +min2);
        System.out.println("Two largest numbers are : "+max +max2);
   }
}

program 6:

public class Sorting{
    public static void main(String[] args) {
        int arr[]={12,9,15,88,19,6};
        int n =arr.length;
        for(int i=0;i<n-1;i++)
       {
            for (int j = 0; j < n - i - 1; j++)
           {
                if (arr[j] > arr[j + 1])
	{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
       {
            System.out.println(arr[i]);
        }
    }
}


program 7:

public class Duplicate{

    public static void main(String[] args) {
        int arr[]={12,9,15,88,19,6,12,88};
        int n =arr.length;
        for(int i=0;i<n-1;i++)
       {
            for (int j = 0; j < n - i - 1; j++)
           {
                if (arr[j] > arr[j + 1])
	{
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
       {
            if (arr[i] != arr[i+1])
            {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i=0; i<j; i++)
       {
            arr[i] = temp[i];
            System.out.println(arr[i]);
        }
    }
}

program 8:

public class Frequentelement{
public static void main(String[] args) {
        int arr[]= new int[]{10, 20, 10, 30, 40, 100,99};
        int n = arr.length;
        Arrays.sort(arr);
        int max=1,count=1;
        int num=arr[0];
        for(int i=1;i<n;i++) 
       {
            if (arr[i] == arr[i - 1])
            {
                count++;
            }
            else if (count > max)
            {
                max = count;
                num = arr[i - 1];
            }
            count = 1;
            if (count > max)
            {
                num = arr[n - 1];
            }
            System.out.println(num);
      }
   }
}

program 9:

public class Sum{
    public static void main(String[] args) {
        int f=0,m=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
       {
            ar[i]=scan.nextInt();
       }
        for(int i=0;i<n;i++)
       {
            if(ar[i]==6)
            {
                for(int j=i+1;j<n;j++)
	{
                    	if(ar[j]==7)	
		{
                     	   f=1;
                                      m=j;
		}
	}
            }
        }
        int sum=0;
        if(f==1)
       {
            for (int i = 0; i < n; i++)
           {
                if (ar[i] == 6)
                {
                    i=m;
                    continue;
                }
                sum += ar[i];
            }
        }
        else
        {
            for(int i=0;i<n;i++)
                sum +=ar[i];
        }
        System.out.println(sum);
    }
}

program 10:

public class Reverse{
    public static void main(String[] args) {
        if(args.length!=4)
       {
	System.out.println("Please enter 4 numbers");
       }
        else
        {
       	 int k=0;
      	  int a[][]=new int[2][2];
      	  for (int i = 0; i < 2; i++)
    	 {
           	 	for (int j = 0; j < 2; j++)
        		{
             	 		a[i][j] = Integer.parseInt(args[k]);
			k++;
           		}
    	  }
    	 for (int i = 1; i >=0; i--)
      	 {
    		for (int j = 1; j >=0; j--)
          		{
           		     System.out.print(a[i][j]);
           		 }
          		System.out.println();
      	  }
         }
     }
}

program 11:

public class Greatestnumber{
    public static void main(String[] args) {
        if(args.length!=9)
       {
	System.out.println("Please enter 9 numbers");
       }
        else
       {
       	 int k=0;
       	 int a[][]=new int[3][3];
    	 for (int i = 0; i < 3; i++)
	{
       	     for (int j = 0; j < 3; j++)
	    {
             		   a[i][j] = Integer.parseInt(args[k]);
		   k++;
	    }
	}
       	int max=0;
        	for (int i = 0; i <3; i++)
	{
            		for (int j = 0; j <3; j++)
		{
      		          if(a[i][j]>max)
		          {
			max=a[i][j];
		          }
            		}
                   }
                  System.out.println(max);
       }
    }
}

4) Classes & Objects

program 1:

  
public class Box{
    double w,h,d;
    Box(double width,double height,double depth)
    {
        w=width;
        h=height;
        d=depth;
    }
    double volume()
    {
        double v;
        v=w*h*d;
        return v;
    }
    public static void main(String[] args) {
        Box b = new Box(2.5,3.5,4.5);
        System.out.println(b.volume());
    }
}

program 2:

import java.lang.Math;
public class Calculator{
    static double powerInt(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
    static double powerDouble(double n1, double n2)
    {
        return Math.pow(n1, n2);
    }
    public static void main(String[] args)
   {
        System.out.println(Calculator.powerInt(2, 3));
        System.out.println(Calculator.powerDouble(3.0, 4.0));
    }
}

program 3:

class Patient
{
    String name;
    double w,h;
    Patient(double weight,double height)
    {
     w=weight;
     h=height;
    }
    double bmi()
    {
        double b = (w/(h*h))*703;
        return b;
    }
}
public class Patients{
    public static void main(String[] args)
    {
        Patient p=new Patient(60,20);
        System.out.println("The BMI of the patient is " + p.bmi());
    }
}

