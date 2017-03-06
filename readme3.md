1.	Unique Even Sum
Write a program to read an array, eliminate duplicate elements and calculate the sum of even numbers (values) present in the array.
Include a class UserMainCode with a static method addUniqueEven which accepts a single integer array. The return type (integer) should be the sum of the even numbers. In case there is no even number it should return -1.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
In case there is no even integer in the input array, print no even numbers as output. Else print the sum.
Refer sample output for formatting specifications. 
Assume that the maximum number of elements in the array is 20.
Sample Input 1:
4
2
5
1
4
Sample Output 1:
6
Sample Input 2:
3
1
1
1
Sample Output 2:
no even numbers
importjava.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
importjava.util.List;
publicclass Main
{
publicstaticvoid main(String[] args)
{
int a[]={3,1,1,2};
System.out.println(sumOfEvenNos(a));
}



publicstaticint sumOfEvenNos(int[] a)
{
int sum = 0;
LinkedHashSet<Integer> hm=new LinkedHashSet();
for(int i=0;i<a.length;i++)
{
      hm.add(a[i]);
}
      
Iterator<Integer> lm= hm.iterator(); 
      while(lm.hasNext())
      {
            int b=lm.next();
            if(b%2==0)
                  sum=sum+b;
      }
      return sum;
}
      }




2.	Palindrome & Vowels
Write a program to check if a given string is palindrome and contains at least two different vowels.
Include a class UserMainCode with a static method checkPalindrome which accepts a string. The return type (integer) should be 1 if the above condition is satisfied, otherwise return -1.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Note – Case Insensitive while considering vowel, i.e a & A are same vowel, But Case sensitive while considering palindrome i.e abc CbA are not palindromes.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single Integer.
Refer sample output for formatting specifications.
Sample Input 1:
abceecba
Sample Output 1:
valid
Sample Input 2:
abcd
Sample Output 2:
invalid

import java.util.Scanner; 
public class useer {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(useerm.display(s));
       }}
 
import java.util.Iterator;
import java.util.LinkedHashSet;
public class useerm {  
    public static int display(String s) {
      StringBuffer sb=new StringBuffer(s);
     
      int k=0;
     LinkedHashSet<Character>l1=new LinkedHashSet<Character>();
    
       String s2=sb.reverse().toString();
       if(s2.equals(s))
       {
        String s3=s2.toLowerCase();
       
        for(int i=0;i<s3.length();i++)
        {
         l1.add(s3.charAt(i));
        
        }
        Iterator<Character> it=l1.iterator();
        while(it.hasNext())
        {
         char a=it.next();
       
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        k++;
        }
       }
       if(k>=2)
      return 1;
       else
       return -1;
 
}}
3.	Strings – Unique & Existing Characters
Obtain two strings from user as input. Your program should modify the first string such that all the characters are replaced by plus sign (+) except the characters which are present in the second string.
That is, if one or more characters of first string appear in second string, they will not be replaced by +.
Return the modified string as output. Note - ignore case.
Include a class UserMainCode with a static method replacePlus which accepts two string variables. The return type is the modified string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of two strings with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
abcxyz
axdef
Sample Output 1:
a++ x++
Sample Input 2:
ABCDEF
feCBAd
Sample Output 2:
ABCDEF

 import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String n1=sc.nextLine();
System.out.println(UserMainCode.display(n,n1));
}
}
 
public class UserMainCode
{
public static String display(String s,String s1)
{
String s2=s.toLowerCase();
String s3=s1.toLowerCase();
StringBuffer sb=new StringBuffer();
for(int i=0;i<s.length();i++)
{
char c=s2.charAt(i);
if(s3.indexOf(c)==-1)
sb.append("+");
else
sb.append(s.charAt(i));
} return sb.toString();
 
}
}
4.	Longest Word
Write a Program which finds the longest word from a sentence. Your program should read a sentence as input from user and return the longest word. In case there are two words of maximum length return the word which comes first in the sentence.
Include a class UserMainCode with a static method getLargestWord which accepts a string The return type is the longest word of type string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
Welcome to the world of Programming
Sample Output 1:
Programming
Sample Input 2:
ABC DEF
Sample Output 2:
ABC

import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="ABC DEF";
System.out.println(lengthiestString(s1));
}
public static String lengthiestString(String s1) {
int max=0;
String s2=new String();
StringTokenizer t=new StringTokenizer(s1," ");
loop:
while(t.hasMoreTokens()){
String s3=t.nextToken();
int n=s3.length();
if(n>max){
max=n;
s2=s3;}
}
return s2;
}}
5.	String Occurences
Obtain two strings from user as input. Your program should count the number of occurences of second word of second sentence in the first sentence.
Return the count as output. Note - Consider case.
Include a class UserMainCode with a static method countNoOfWords which accepts two string variables. The return type is the modified string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of two strings with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
abc bcd abc bcd abc abc
av abc
Sample Output 1:
4
Sample Input 2:
ABC xyz AAA
w abc
Sample Output 2:
0 

 import java.util.StringTokenizer;
public class Main {
/**
* @param args
*/
public static void main(String[] args) {
String s1="ABC xyz AAA";
String s2="w abc";
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
int count=0;
StringTokenizer st=new StringTokenizer(s2," ");
String s3=st.nextToken();
String s4=st.nextToken();
//System.out.println(s4);
StringTokenizer st1=new StringTokenizer(s1," ");
while(st1.hasMoreTokens())
{
String s5=st1.nextToken();
if(s4.equals(s5))
{
count++;
}
}
System.out.println(count);
}
}
6.	ArrayList Manipulation
Write a program that performs the following actions:
1.	Read 2n integers as input.
2.	Create two arraylists to store n elements in each arraylist.
3.	Write a function generateOddEvenList which accepts these two arraylist as input.
4.	The function fetch the odd index elements from first array list and even index elements from second array list and add them to a new array list according to their index.
5.	Return the arraylist.
Include a class UserMainCode with the static method generateOddEvenList which accepts two arraylist and returns an arraylist.
Create a Class Main which would be used to read 2n integers and call the static method present in UserMainCode.
Note:
- The index of first element is 0.
- Consider 0 as an even number.
- Maintain order in the output array list
Input and Output Format:
Input consists of 2n+1 integers. The first integer denotes the size of the arraylist, the next n integers are values to the first arraylist, and the last n integers are values to the second arraylist.
Output consists of a modified arraylist as per step 4.
Refer sample output for formatting specifications.
Sample Input 1:
5
12
13
14
15
16
2
3
4
5
6
Sample Output 1:
2
13
4
15
6

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
ArrayList<Integer>al1=new ArrayList<Integer>();
ArrayList<Integer>al2=new ArrayList<Integer>();
for(int i=0;i<s;i++)
al1.add(sc.nextInt());
for(int i=0;i<s;i++)
al2.add(sc.nextInt());
ArrayList<Integer>al3=new ArrayList<Integer>();
al3=Usermaincode.display(al1,al2);
Iterator<Integer> it=al3.iterator();
while(it.hasNext())
{
int n=it.next();
System.out.println(n);
}
}
}
 
 
import java.util.ArrayList;
import java.util.Iterator;
 
public class Usermaincode
{
public static ArrayList<Integer> display (ArrayList<Integer>al1,ArrayList<Integer>al2)
{
ArrayList<Integer>al3=new ArrayList<Integer>();
for(int i=0;i<al1.size();i++)
{
if(i%2==0)
al3.add(al2.get(i));
else
al3.add(al1.get(i));
}
return al3;
}}
7.	Duplicate Characters
Write a Program which removes duplicate characters from the string. Your program should read a sentence (string) as input from user and return a string removing duplicate characters. Retain the first occurance of the duplicate character. Assume the characters are case – sensitive.
Include a class UserMainCode with a static method removeDuplicates which accepts a string. The return type is the modified sentence of type string.
Create a Class Main which would be used to accept the input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
hi this is sample test
Sample Output 1:
hi tsample
Sample Input 2:
ABC DEF
Sample Output 2:
ABC DEF

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1="hi this is sample test";
getvalues(s1);
}
public static void getvalues(String s1) {
char a[]=s1.toCharArray();
StringBuffer sb=new StringBuffer();
LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
for(int i=0;i<a.length;i++)
{
hs.add(a[i]);
}
Iterator<Character>itr=hs.iterator();
while(itr.hasNext())
{
char o=itr.next();
if(o!=' ');
{
sb.append(o);
}
}
System.out.println(sb);
}}
8.	Mastering Hashmap
You have recently learnt about hashmaps and in order to master it, you try and use it in all of your programs.
Your trainer / teacher has given you the following exercise:
1.	Read 2n numbers as input where the first number represents a key and second one as value. Both the numbers are of type integers.
2.	Write a function getAverageOfOdd to find out average of all values whose keys are represented by odd numbers. Assume the average is an int and never a decimal number. Return the average as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read 2n numbers and build the hashmap. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of a 2n+ 1 integers. The first integer specifies the value of n (essentially the hashmap size). The next pair of n numbers denote the key and value.
Output consists of an integer representing the average.
Refer sample output for formatting specifications.
Sample Input 1:
4
2
34
1
4
5
12
4
22
Sample Output 1:
8

import java.util.HashMap;
import java.util.Scanner;
public class kapes3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
                h1.put(sc.nextInt(),sc.nextInt());
}
System.out.println(UserMainCode.display(h1));
}}
 
 
 
import java.util.HashMap;
import java.util.Iterator;
 
public class UserMainCode {
                public static int display(HashMap<Integer,Integer>h1)
                {
                                int av=0,c=0,s=0;
                                Iterator<Integer> it=h1.keySet().iterator();
                                while(it.hasNext())
                                {
                                                int a=it.next();
                                                if(a%2!=0)
                                                {
                                                                int b=h1.get(a);
                                                                s=s+b;
                                                                c++;
                                                }
                                }
                                av=s/c;
                                return av;
                                }}
9.	Managers & Hashmaps
A Company wants to automate its payroll process. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1.    Read Employee details from the User. The details would include id, designation and salary in the given order. The datatype for id is integer, designation is string and salary is integer.
2.    You decide to build two hashmaps. The first hashmap contains employee id as key and designation as value, and the second hashmap contains same employee ids as key and salary as value.
3.    The company decides to hike the salary of managers by 5000. You decide to write a function increaseSalarieswhich takes the above hashmaps as input and returns a hashmap with only managers id and their increased salary as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps.
Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next three values indicate the employee id, employee designation and employee salary.
Output consists of a single string. Refer sample output for formatting specifications.
SampleInput1:
2
2
programmer
3000
8
manager
50000
SampleOutput1:
8
55000

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<Integer,String>hm=new HashMap<Integer,String>();
HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
int id=Integer.parseInt(sc.nextLine());
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
hm2=Usermaincode.display(hm,hm1);
Iterator<Integer> it=hm2.keySet().iterator();
while(it.hasNext())
{
int n=it.next();
int fac=hm2.get(n);
System.out.println(n);
System.out.println(fac);
}}}
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
public class Usermaincode
{public static HashMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
{
HashMap<Integer,Integer>hm3=new HashMap<Integer,Integer>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
String name=hm.get(id);
if(name.equals("manager"))
{int salary=hm1.get(id)+5000;
hm3.put(id,salary);
}}
return hm3;
}
}
10.	Check first and last word
Write a program to check if the first word and the last word in the input string match. 
Include a class UserMainCode with a static method “check” that accepts a string argument and returns an int. If the first word and the last word in the string match, the method returns the number of characters in the word. Else the method returns the sum of the number of characters in the first word and last word.
Create a class Main which would get the input as a String and call the static method check present in the UserMainCode.
Input and Output Format:
Input consists of a string.
Output is an integer.
Sample Input 1:
how are you you are how
Sample Output 1:
3
Sample Input 2:
how is your child
Sample Output 2:
8

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String age=sc.nextLine();
 
System.out.println(Usermaincode.display(age));
}
}
 
 
import java.util.StringTokenizer;
public class Usermaincode
{public static int display(String s)
{
int count=0;
String fin="";
StringTokenizer st=new StringTokenizer(s);
String ini=st.nextToken();
while(st.hasMoreTokens())
{ fin=st.nextToken();
}
if(ini.equals(fin))
count=ini.length();
else
count=ini.length()+fin.length();
return count;
}
}
11.	Concatenate Characters 
Given an array of Strings, write a program to take the last character of each string and make a new String by concatenating it.
Include a class UserMainCode with a static method “concatCharacter” that accepts a String array as input and returns the new String.
Create a class Main which would get the String array as input and call the static method concatCharacterpresent in the UserMainCode.
Input and Output Format:
The first line of the input consists of an integer n that corresponds to the number of strings in the input string array.
The next n lines of the input consist of the strings in the input string array.
Output consists of a string.
Sample Input:
3
ab
a
abcd
Sample Output:
Bad

import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
String []a=new String[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextLine();
}
System.out.println(kapes4.display(a));
}
}
 
 
public class kapes4
{public static String display(String[] a)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<a.length;i++)
sb.append(a[i].charAt(a[i].length()-1));
return sb.toString();
}
}
 
 
12.Anagram
Write a program to check whether the two given strings are anagrams.
 
Note: Rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once is called Anagram."
 
Include a class UserMainCode with a static method “getAnagram” that accepts 2 strings as arguments and returns an int. The method returns 1 if the 2 strings are anagrams. Else it returns -1.
 
Create a class Main which would get 2 Strings as input and call the static method getAnagram present in the UserMainCode.
 
 
Input and Output Format:
Input consists of 2 strings. Assume that all characters in the string are lower case letters.
Output consists of a string that is either “Anagrams” or “Not Anagrams”.
 
Sample Input 1:
eleven plus two
twelve plus one
 
Sample Output 1:
Anagrams
 
Sample Input 2:
orchestra
carthorse
 
Sample Output 2:
Anagrams
 
Sample Input 3:
cognizant
technologies
 
Sample Output 3:
Not Anagrams
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

publicclass Add{


publicstaticvoid main(String[] args) {
                                String s1="Desperation";
                                String s2="A Rope Ends It";
                                List<Character> l1=new ArrayList<Character>();
                                List<Character> l2=new ArrayList<Character>();
                                String s3=s1.replace(" ","");
                                String s4=s2.replace(" ","");
                                String s5=s3.toUpperCase();
                                String s6=s4.toUpperCase();
for (int i = 0; i < s5.length(); i++)
                                {
                                                l1.add(s5.charAt(i));
                                }
for (int i = 0; i < s6.length(); i++)
                                {
                                                l2.add(s6.charAt(i));
                                }

                                Collections.sort(l1);
                                Collections.sort(l2);
                                System.out.println(l1);
                                System.out.println(l2);
if(l1.equals(l2))
                                                System.out.println("true");
else
                                                System.out.println("false");

                                }
}
 
 
13.Calculate Meter Reading
 
Given 2 strings corresponding to the previous meter reading and the current meter reading, write a program to calculate electricity bill.
The input string is in the format ""AAAAAXXXXX"".
AAAAA is the meter code and XXXXX is the meter reading.
FORMULA: (XXXXX-XXXXX)*4
 
Hint: if AAAAA of input1 and input2 are equal then separate the XXXXX from string and convert to integer. Assume that AAAAA of the 2 input strings will always be equal.
 
Include a class UserMainCode with a static method “calculateMeterReading” that accepts 2 String arguments and returns an integer that corresponds to the electricity bill. The 1st argument corresponds to the previous meter reading and the 2nd arguement corresponds to the current meter reading.
 
Create a class Main which would get 2 Strings as input and call the static method calculateMeterReading present in the UserMainCode.
 
Input and Output Format:
Input consists of 2 strings. The first input corresponds to the previous meter reading and the second input corresponds to the current meter reading.
 
Output consists of an integer that corresponds to the electricity bill.
 
Sample Input:
CSECE12390
CSECE12400
 
Sample Output:
40
 
14.Retirement
 
Given an input as HashMap which contains key as the ID and dob as value of employees, write a program to find out employees eligible for retirement. A person is eligible for retirement if his age is greater than or equal to 60.
 
Assume that the current date is 01/01/2014.
 
Include a class UserMainCode with a static method “retirementEmployeeList” that accepts a HashMap<String,String> as input and returns a ArrayList<String>. In this method, add the Employee IDs of all the retirement eligible persons to list and return the sorted list.
(Assume date is in dd/MM/yyyy format).
 
Create a class Main which would get the HashMap as input and call the static method retirementEmployeeList present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of an integer n, that corresponds to the number of employees.
The next 2 lines of the input consists of strings that correspond to the id and dob of employee 1.
The next 2 lines of the input consists of strings that correspond to the id and dob of employee 2.
and so on...
Output consists of the list of employee ids eligible for retirement in sorted order.
 
Sample Input :
4
C1010
02/11/1987
C2020
15/02/1980
C3030
14/12/1952
T4040
20/02/1950
 
Sample Output :
[C3030, T4040]
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
importjava.util.Scanner;




class UserMainCode {

	
	publicstatic ArrayList<String> display(LinkedHashMap<String,String>a1) throws ParseException
	{
		ArrayList<String>al=new ArrayList<String>();
		Iterator <String>it=a1.keySet().iterator();
		
		while(it.hasNext())
		{String s=it.next();
		String s1=a1.get(s);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try{
			Date d=new Date();
		
		Date d1=new Date();
		
		
		String a=s1;
		String b="01/01/2014";
		
		
		d=sdf.parse(a);
		d1=sdf.parse(b);
	long t=d.getTime();
	long t1=d1.getTime();

	long t3=t1-t;
	long l1=(24 * 60 * 60 * 1000);
	long l=l1*365;
	long res=t3/l;
	 System.out.println("Result="+res);
	if(res>=60)
	 {
		 al.add(s);
	 }
	
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
		Collections.sort(al);
		
	return al;
	
	}

}
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Scanner;

publicclass Add
{
publicstaticvoid main(String args[]) throws ParseException{ Scanner sc=new Scanner(System.in); int n=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String>a1=new LinkedHashMap<String,String>(); for(int i=0;i<n;i++) { a1.put(sc.nextLine(),sc.nextLine());
}
System.out.println(UserMainCode.display(a1));
}
} 
15.Kaprekar Number
 
Write a program to check whether the given input number is a Kaprekar number or not.
Note : A positive whole number ‘n’ that has ‘d’ number of digits is squared and split into two pieces, a right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits. If the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number.
 
If its Kaprekar number assign to output variable 1 else -1.
Example 1:
Input1:9
9^2 = 81, right-hand piece of 81 = 1 and left hand piece of 81 = 8
Sum = 1 + 8 = 9, i.e. equal to the number. Hence, 9 is a Kaprekar number.
 
Example 2:
Input1:45
Hint:
45^2 = 2025, right-hand piece of 2025 = 25 and left hand piece of 2025 = 20
Sum = 25 + 20 = 45, i.e. equal to the number. Hence, 45 is a Kaprekar number."
 
Include a class UserMainCode with a static method “getKaprekarNumber” that accepts an integer argument and returns an integer. The method returns 1 if the input integer is a Kaprekar number. Else the method returns -1.
 
Create a class Main which would get the an Integer as input and call the static method getKaprekarNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of a single string that is either “Kaprekar Number” or “Not A Kaprekar Number”
 
Sample Input 1:
9
 
Sample Output 1:
Kaprekar Number
 
Sample Input 2:
45
 
Sample Output 2:
Kaprekar Number
 
Sample Input 3:
4
 
Sample Output 3:
Not A Kaprekar Number
import java.util.Scanner;
 
 
public class useer{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 
System.out.println(useerm.display(n));
}}
 
 
public class useerm{
public static int display(int a)
{
 int count=0,j=0;
 int a1=a;
 while(a1!=0)
 {
                 count=count+1;
                 a1=a1/10;
 }
 int square=a*a;
 String s=Integer.toString(square);
 String s1=s.substring(0,count);
 String s2=s.substring(count);
 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int result =x+y;
 if(result==a){
                 j=1;
                 
 }
 else
 {
                 j=2;
 }
 return j;
}}
 
 
16.Vowels
 
Given a String input, write a program to find the word which has the the maximum number of vowels. If two or more words have the maximum number of vowels, print the first word.
 
Include a class UserMainCode with a static method “storeMaxVowelWord” that accepts a string argument and returns the word containing the maximum number of vowels.
 
Create a class Main which would get the a String as input and call the static method storeMaxVowelWord present in the UserMainCode.
 
Input and Output Format:
Input consists of a string. The string may contain both lower case and upper case letters.
Output consists of a string.
 
Sample Input :
What is your name?
 
Sample Output :
your
 import java.util.StringTokenizer;
 
public class B {
public static void main(String[] args) {
String s1 = "What is your name?";
getvalues(s1);
}
public static void getvalues(String s1) {
int i = 0;
StringTokenizer st = new StringTokenizer(s1," ");
int len = 0;
int count = 0;
int count2 = 0;
String s6 = null;
while (st.hasMoreTokens()) {
String s5 = st.nextToken();
len = s5.length();
count=0;
for (i = 0; i < len; i++) {
if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U')
count++;
}
if (count > count2)
{
count2 = count;
s6 = s5;
}
}
System.out.println(s6);
}
}
 
17.Unique Characters REPEATED
 
Given a String as input , write a program to count and print the number of unique characters in it.
 
Include a class UserMainCode with a static method “checkUnique” that accepts a String as input and returns the number of unique characters in it. If there are no unique characters in the string, the method returns -1.
 
Create a class Main which would get a String as input and call the static method checkUnique present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of an integer.
 
Sample Input 1:
HOWAREYOU
 
Sample Output 1:
7
 
(Hint :Unique characters are : H,W,A,R,E,Y,U and other characters are repeating)
 
Sample Input 2:
MAMA
 
Sample Output2:
-1
import java.util.ArrayList;
import java.util.List;
public class kape
{
public static void main(String[] args)
{
               
                                                String s1="HOWAREYOU";
                                                kape1.getvalues(s1);
                                                }}
                                               
public class kape1
{
                public static void getvalues(String s1) {
                                String s2=s1.toLowerCase();
                                StringBuffer sb=new StringBuffer(s2);
                                int l=sb.length();
                                int count=0;
                                for(int i=0;i<l;i++)
                                { count=0;
                                for(int j=i+1;j<l;j++)
                                {
                                if(sb.charAt(i)==sb.charAt(j))
                                {
                                sb.deleteCharAt(j);
                                count++;
                                j--;
                                l--;
                                 
                                }
                                }
                                if(count>0)
                                {
                                sb.deleteCharAt(i);
                                i--;
                                l--;
                                }
                                }
                                if(sb.length()==0)
                                {
                                System.out.println(-1);
                                }
                                else
                                System.out.println(sb.length());
                                }
                                }
 
 
 18.average of primes
 
Write a program to read an array and find average of all elements located at index i, where i is a prime number. Type cast the average to an int and return as output. The index starts from 0.
Include a class UserMainCode with a static method addPrimeIndex which accepts a single integer array. The return type (integer) should be the average of all elements located at index i where i is a prime number.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Integer.
Refer sample output for formatting specifications.

 
Assume that the maximum number of elements in the array is 20 and minimum number of elements is 3.

 
Sample Input 1:
4
2
5
2
4
Sample Output 1:
3
 import java.util.Scanner;
 
public class kapes3{
public static void main (String[] args)
                {
                                // your code goes here
                                Scanner sc = new Scanner(System.in);
                                int n = sc.nextInt();
                                int[] arr = new int[n];
                                for(int i=0;i<n;i++){
                                                arr[i] = sc.nextInt();
                                }
                               
                                System.out.println(kapes4.getvalues(arr, n));
                }}
 public class kapes4{
      public static int getvalues(int[] a,int n) {
     
            int sum=0;
            int count=0;
            int sum_count=0;
            for(int i=0;i<a.length;i++)
            {
                            count=0;
                            for(int j=1;j<=i;j++)
                            {
                            if(i%j==0)
                            {
                            count++;
                            
                            }
           
            }
            if(count==2)
            {
                            sum=sum+a[i];
                            sum_count++;
            }
            }
           
            int avg=sum/sum_count;
            return avg;
 
            }}
 

 19. ArrayList and Set Operations 
Write a program that performs the following actions:
1.    Read 2n integers as input & a set operator (of type char).
2.    Create two arraylists to store n elements in each arraylist.
3.    Write a function performSetOperations which accepts these two arraylist and the set operator as input.
4.    The function would perform the following set operations:.

'+' for SET-UNION

'*' for SET-INTERSECTION

'-' for SET-DIFFERENCE

Refer to sample inputs for more details.
5.    Return the resultant arraylist.

Include a class UserMainCode with the static method performSetOperations which accepts two arraylist and returns an arraylist.

Create a Class Main which would be used to read 2n+1 integers and call the static method present in UserMainCode.

Note:

- The index of first element is 0. 

Input and Output Format:

Input consists of 2n+2 integers. The first integer denotes the size of the arraylist, the next n integers are values to the first arraylist, and the next n integers are values to the second arraylist and the last input corresponds to that set operation type.

Output consists of a modified arraylist as per step 4.

Refer sample output for formatting specifications.

Sample Input 1:

3

1

2

3

3

5

7

+

Sample Output 1:

1

2

3

5
7
Sample Input 2:
4
10
9
8
7
2
4
6
8
*
Sample Output 2:
8

 
Sample Input 3:
4
5
10
15
20
0
10
12
20
-
Sample Output 3:
5
15
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
       ArrayList<Integer>a1=new ArrayList<Integer>();
       ArrayList<Integer>a2=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
                 a1.add(Integer.parseInt(sc.nextLine()));
      for(int i=0;i<n;i++)
                a2.add(Integer.parseInt(sc.nextLine())); 
      char c=sc.nextLine().charAt(0);
       System.out.println(UserMainCode.getvalues(a1,a2,c));
    }
}
import java.util.ArrayList;
 
public class UserMainCode {
                public static ArrayList<Integer> getvalues(ArrayList<Integer>a1,ArrayList<Integer>a2,char c)
                {
                                ArrayList<Integer>op1=new ArrayList<Integer>();
int k=0;
                                switch(c)
                                {
                                case '+':
                                                a1.removeAll(a2);
                                                a1.addAll(a2);
          op1=a1;
         break;
                                case '*':
                                                a1.retainAll(a2);
                                                op1=a1;
                                                break;
                                case '-':
                                                for(int i=0;i<a1.size();i++)
                                                {
                                                                k=0;
                                                                for(int j=0;j<a2.size();j++)
                                                                {
                                                                                if(a1.get(i)==a2.get(j))
                                                                                                k=1;
                                                                }
                                                                if(k==0)
                                                                                op1.add(a1.get(i));
                                                }
                                 break;
                                }
                                return op1;
                                }}
 
20.Largest Span
 
Write a program to read an array and find the size of largest span in the given array
""span"" is the number of elements between two repeated numbers including both numbers. An array with single element has a span of 1.
.
Include a class UserMainCode with a static method getMaxSpan which accepts a single integer array. The return type (integer) should be the size of largest span.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Integer.
Refer sample output for formatting specifications.

 
Assume that the maximum number of elements in the array is 20.

 
Sample Input 1:
5
1
2
1
1
3
Sample Output 1:
4
 
Sample Input 2:
7
1
4
2
1
4
1
5
Sample Output 2:
6
class UserMainCode {
publicstaticint display(int[] x,int n)
                                {
int gap=0,max=0;
for(inti=0;i<n;i++)
                                                {
for(int j=i+1;j<n;j++)
  {
if(x[i]==x[j])

    gap=j;

  }
if(gap-i>max)
 max=gap-i;

                            }
return max+1;
                                }

                }

import java.util.Scanner;

publicclass Add {

publicstaticvoid main(String[] args)
{
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int []a=newint[n];
for(int i=0;i<n;i++)
 {
                 a[i]=sc.nextInt();
 }
 System.out.print(UserMainCode.display(a,n));
}}


21.Max Scorer
 
Write a program that performs the following actions:
1.	Read n strings as input and stores them as an arraylist. The string consists of student information like name and obtained marks of three subjects. Eg: name-mark1-mark2-mark3 [suresh-70-47-12] The mark would range between 0 – 100 (inclusive).
2.	Write a function highestScorer which accepts these the arraylist and returns the name of the student who has scored the max marks. Assume the result will have only one student with max mark.
Include a class UserMainCode with the static method highestScorer which accepts the arraylist and returns the name (string) of max scorer.
Create a Class Main which would be used to read n strings into arraylist and call the static method present in UserMainCode.

 
Input and Output Format:
Input consists of 1 integer and n strings. The first integer denotes the size of the arraylist, the next n strings are score pattern described above.
Output consists of a string with the name of the top scorer.
Refer sample output for formatting specifications.
Sample Input 1:
3
sunil-56-88-23
bindul-88-70-10
john-70-49-65
Sample Output 1:
John
import java.util.StringTokenizer;
public class Main {
                public static String retrieveMaxScoredStudent(String[] s1){
                                int max=0;
                                String s4=null;
                                for(int i=0;i<s1.length;i++){
                                                String s2=s1[i]; 
                                                StringTokenizer t=new StringTokenizer(s2,"-");
                                                String s3=t.nextToken();
                                                int n1=Integer.parseInt(t.nextToken());
                                                int n2=Integer.parseInt(t.nextToken());
                                                int n3=Integer.parseInt(t.nextToken());
                                                int n=n1+n2+n3;
                               
                                if(n>max)
                                {
                                                max=n;
                                                s4=s3;
                                }
                                }
                                return s4;
                }
                public static void main(String[] args) {
                                String[] s1={"arun#12#12#12","deepak#13#12#12","puppy#12#11#12"};
                                System.out.println(retrieveMaxScoredStudent(s1));
                }
}
 

22.Max Vowels
 
Write a Program which fetches the word with maximum number of vowels. Your program should read a sentence as input from user and return the word with max number of vowels. In case there are two words of maximum length return the word which comes first in the sentence.
Include a class UserMainCode with a static method getWordWithMaximumVowels which accepts a string The return type is the longest word of type string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
Appreciation is the best way to motivate

 
Sample Output 1:
Appreciation
import java.util.StringTokenizer;
 
public class Main {
public static void main(String[] args) {
String s1 = "Appreciation is the best way to motivate aaaaeeeiii";
getvalues(s1);
}
public static void getvalues(String s1) {
int i = 0;
StringTokenizer st = new StringTokenizer(s1," ");
int len = 0;
int count = 0;
int max = 0;
String s6 = null;
while (st.hasMoreTokens()) {
String s5 = st.nextToken();
len = s5.length();
count=0;
for (i = 0; i < len; i++) {
if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U')
count++;
}
if (count > max) {
max = count;
s6 = s5;
}
}
System.out.println(s6);
}
}
 





23. All Vowels
 
Write a Program to check if given word contains exactly five vowels and the vowels are in alphabetical order. Return 1 if the condition is satisfied else return -1. Assume there is no repetition of any vowel in the given string and all letters are in lower case.
Include a class UserMainCode with a static method testOrderVowels which accepts a string The return type is integer based on the condition stated above.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
acebisouzz

 
Sample Output 1:
valid
 
Sample Input 2:
 
alphabet
 
 
Sample Output 2:
Invalid
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main {
/**
* @param args
*/
public static void main(String[] args) {
String s1="alphabet";
getvalues(s1);
}
public static void getvalues(String s1) {
String s2="aeiou";
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s2.length();j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
sb.append(s1.charAt(i));
}
}
}
if(sb.toString().equals(s2))
{
System.out.println("true");
}
else
System.out.println("false");
}
}
 


24.Adjacent Swaps
 
Write a Program that accepts a string as a parameter and returns the string with each pair of adjacent letters reversed. If the string has an odd number of letters, the last letter is unchanged.
Include a class UserMainCode with a static method swapPairs which accepts a string. The return type is string which is reversed pair of letters.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
forget

 
Sample Output 1:
ofgrte

 
Sample Input 2:
New York

 
Sample Output 2:
eN woYkr
public class Main
{
public static void main(String[] args) {
String s1="forget";
getvalues(s1);
}
public static void getvalues(String s1)
{
StringBuffer sb=new StringBuffer();
int l=s1.length();
if(l%2==0)
{
for(int i=0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
System.out.println(sb);
}
else
{
for(int i = 0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
System.out.println(sb);
}
sb.append(s1.charAt(l-1));
System.out.println(sb);
}
}
}


25.Sum of Digits
 
Write a Program that accepts a word as a parameter, extracts the digits within the string and returns its sum.
Include a class UserMainCode with a static method getdigits which accepts a string. The return type is integer representing the sum.
Create a Class Main which would be used to accept the input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
abc12de4

 
Sample Output 1:
7
public class Main {
/**
* @param args
*/
public static void main(String[] args) {
String s1="abcde";
getvalues(s1);
}
public static void getvalues(String s1) {
int sum=0;
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(Character.isDigit(a))
{
int b=Integer.parseInt(String.valueOf(a));
sum=sum+b;
}
}
if(sum==0)
{
System.out.println(-1);
}
else
System.out.println(sum);
}
}
 

26.Password
 
Given a String , write a program to find whether it is a valid password or not.
 
Validation Rule:
Atleast 8 characters
Atleast 1 number(1,2,3...)
Atleast 1 special character(@,#,%...)
Atleast 1 alphabet(a,B...)
 
Include a class UserMainCode with a static method “validatePassword” that accepts a String argument and returns a boolean value. The method returns true if the password is acceptable. Else the method returns false.
Create a class Main which would get a String as input and call the static method validatePassword present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String that is either “Valid” or “Invalid”.
 
Sample Input 1:
cts@1010
 
Sample Output 1:
Valid
 
Sample Input 2:
punitha3
 
Sample Output 2:
Invalid
 import java.util.*;
public class Main {
public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String s1=s.next();
      boolean b=User.passwordValidation(s1);
      if(b==true)
            System.out.println("valid password");
      else
            System.out.println("not a valid password");
}
 
}
 
public class User{
      public static boolean passwordValidation(String s1) {
      boolean b=false,b1=false,b2=false;
      if(s1.length()>=8)
                              b1=true;
      if(b1==true)
            for(int i=0;i<s1.length();i++)
                  if(Character.isAlphabetic(s1.charAt(i)) || Character.isDigit(s1.charAt(i)) || s1.charAt(i)=='#' || s1.charAt(i)=='@' || s1.charAt(i)=='%')
                        b=true;
            
                  
      return b;
}
 


27.Employee Bonus
 
A Company wants to give away bonus to its employees. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1.	Read Employee details from the User. The details would include id, DOB (date of birth) and salary in the given order. The datatype for id is integer, DOB is string and salary is integer.
2.	You decide to build two hashmaps. The first hashmap contains employee id as key and DOB as value, and the second hashmap contains same employee ids as key and salary as value.
3.	If the age of the employee in the range of 25 to 30 years (inclusive), the employee should get bonus of 20% of his salary and in the range of 31 to 60 years (inclusive) should get 30% of his salary. store the result in TreeMap in which Employee ID as key and revised salary as value. Assume the age is caculated based on the date 01-09-2014. (Typecast the bonus to integer).
4.	Other Rules:
a. If Salary is less than 5000 store -100.
b. If the age is less than 25 or greater than 60 store -200.
c. a takes more priority than b i.e both if a and b are true then store -100.
5.	You decide to write a function calculateRevisedSalary which takes the above hashmaps as input and returns the treemap as output. Include this function in class UserMainCode.

 
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next three values indicate the employee id, employee DOB and employee salary. The Employee DOB format is “dd-mm-yyyy”
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
2
1010
20-12-1987
10000
2020
01-01-1985
14400

 
Sample Output 1:
1010
12000
2020
17280
import java.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.ArrayList;
importjava.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;


publicclass Add
{
publicstaticvoid main(String args[]) throws ParseException{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
LinkedHashMap<Integer,String>a1=new LinkedHashMap<Integer,String>();
LinkedHashMap<Integer,Integer>a2=new LinkedHashMap<Integer,Integer>();
TreeMap<Integer,Integer>ans=new TreeMap<Integer, Integer>();
for(int i=0;i<n;i++)
{int id=sc.nextInt();

a1.put(id,sc.next());
int salary=sc.nextInt();
a2.put(id,salary);
}

ans=UserMainCode.display(a1,a2);
Iterator <Integer>it=ans.keySet().iterator();
while(it.hasNext())
{
	int a=it.next();
	int b=ans.get(a);
	System.out.println(a);
	System.out.println(b);
}
}
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;



class UserMainCode {

	
	publicstatic TreeMap<Integer,Integer> display(LinkedHashMap<Integer,String>a1,LinkedHashMap<Integer,Integer>a2) throws ParseException
	{TreeMap<Integer,Integer>ans=new TreeMap<Integer,Integer>();
		ArrayList<String>al=new ArrayList<String>();
		Iterator <Integer>it=a1.keySet().iterator();
		
		while(it.hasNext())
		{int s=it.next();
		String s1=a1.get(s);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		try{
			Date d=new Date();
		
		Date d1=new Date();
		
		
		String a=s1;
		String b="01-09-2014";
		
		
		d=sdf.parse(a);
		d1=sdf.parse(b);
	long t=d.getTime();
	long t1=d1.getTime();

	long t3=t1-t;
	long l1=(24 * 60 * 60 * 1000);
	long l=l1*365;
	long res=t3/l;
	System.out.println("Result="+res);
	if(res>=25 && res<=30)
	 {
		float bonus=(float)((0.2*a2.get(s))+a2.get(s));
		int r=(int)bonus;
		ans.put(s,r );
		
		
	 }elseif(res>30 && res<=60)
	 {
			float bonus=(float)((0.3*a2.get(s))+a2.get(s));
			int r=(int)bonus;
			ans.put(s,r );
			
		 }
	elseif(a2.get(s)<5000)
	 {
		 ans.put(s, -100);
	 }
	
	elseif(res<25 ||res>60)
	 {
		 ans.put(s, -200);
	 }
		
	
	
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
	
		
	return ans;
	
	}

}


28. Grade Calculator REFER 53 FROM LEVEL2
 A School wants to assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1.	Read student details from the User. The details would include roll no, mark in the given order. The datatype for id is integer, mark is integer.
2.	You decide to build a hashmap. The hashmap contains roll no as key and mark as value.
3.	BUSINESS RULE:
1. If Mark is greater than or equal to 80 store medal as ""GOLD"".
2. If Mark is less then to 80 and greater than or equal to 60 store medal as ""SILVER"".
3 .If Mark is less then to 60 and greater than or equal to 45 store medal as ""BRONZE"" else store ""FAIL"".
Store the result in TreeMap in which Roll No as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmaps as input and returns the treemap as output. Include this function in class UserMainCode.

 
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the students. The next two values indicate the roll id, mark.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
2
1010
80
100
40
Sample Output 1:
100
FAIL
1010
GOLD
import java.util.HashMap;
import java.util.Iterator;
importjava.util.HashMap;
import java.util.TreeMap;

import java.util.Scanner;

publicclass Add {
publicstaticvoid main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
hm.put(sc.nextInt(),sc.nextInt());
}
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
tm=UserMainCode.display(hm);
Iterator<Integer> it=tm.keySet().iterator();
for(int i=0;i<s;i++)
{
int n=it.next();
String fac=tm.get(n);
System.out.println(n);
System.out.println(fac);
}
}
}




import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
publicclass UserMainCode
{
publicstatic TreeMap<Integer,String>display(HashMap<Integer,Integer>hm)
{
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
int mark=hm.get(id);
if(mark>=80)
tm.put(id,"GOLD");
elseif(mark<80 && mark>=60)
tm.put(id,"SILVER");
elseif(mark<60 && mark>=45)
tm.put(id,"BRONZE");
else
tm.put(id,"FAIL");
}
return tm;
}}

29.Digits - II

Write a program to read a non-negative integer n, compute the sum of its digits. If sum is greater than 9 repeat the process and calculate the sum once again until the final sum comes to single digit.Return the single digit.
Include a class UserMainCode with a static method getDigitSum which accepts the integer value. The return type is integer.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a integer.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
9999
Sample Output 1:
9

Sample Input 2:
698
Sample Output 2:
5
public class Main
{
                public static void main(String[] args)
                {
                                int n=698;
                                System.out.println(conversiontoaSingleDigit(n));
                }
                public static int conversiontoaSingleDigit(int n)
                {
                                int sum = 0 ;
                                int n1=n;
                                while(n>10)
                                {
                                                int a = 0 ; sum = 0;
                                                while(n!=0)
                                                {
                                                                a = n%10;
                                                                sum+=a;
                                                                n=n/10;
                                                }
                                                n=sum;
                                }
                                return sum;
                }
}

30.Anagrams

Write a program to read two strings and checks if one is an anagram of the other.
An anagram is a word or a phrase that can be created by rearranging the letters of another given word or phrase. We ignore white spaces and letter case. All letters of 'Desperation' can be rearranged to the phrase 'A Rope Ends It'.
Include a class UserMainCode with a static method checkAnagram which accepts the two strings. The return type is boolean which is TRUE / FALSE.
Create a Class Main which would be used to accept the two strings and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two strings.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.
Sample Input 1:
tea
eat
Sample Output 1:
TRUE

Sample Input 2:
Desperation
A Rope Ends It
Sample Output 2:
TRUE



31.Shift Left

Write a program to read a integer array of scores, and return a version of the given array where all the 5's have been removed. The remaining elements should shift left towards the start of the array as needed,

and the empty spaces at the end of the array should be filled with 0.

So {1, 5, 5, 2} yields {1, 2, 0, 0}.

Include a class UserMainCode with a static method shiftLeft which accepts the integer array. The return type is modified array.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer n which is the number of elements followed by n integer values.

Output consists of modified array.

Refer sample output for formatting specifications.

Sample Input 1:
7
1
5
2
4
5
3
5

Sample Output 1:
1
2
4
3
0
0
0
import java.util.Scanner;
public class usercc
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[]m=new int[size];
int[]n=new int[size];
int j=0;
for(int i=0;i<size;i++)
{
n[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
if(n[i]!=5)
{
m[j]=n[i];
j++;
}}
for(int i=0;i<size;i++)
{
System.out.println(m[i]);
}
}
}
 
32.Word Count

Given a string array (s) with each element in the array containing alphabets or digits. Write a program to add all the digits in every string and return the sum as an integer. If two digits appear simultaneously do not consider it as one number. Ex- For 'Hyderabad 21' consider 2 and 1 as two digits instead of 21 as a number.

Include a class UserMainCode with a static method sumOfDigits which accepts the string array. The return type is the integer formed based on rules.
Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a an integer indicating the number of elements in the string array.
Output consists of a integer .
Refer sample output for formatting specifications.

Sample Input 1:
5
AAA1
B2B
4CCC
A5
ABCDE
Sample Output 1:
12

Sample Input 2:
3
12
C23
5CR2
Sample Output 2:
15
public class B
{
      public static void main(String[] args)
      {
            String[] s1={"2AA","12","A2C","C5a"};
            getSum(s1);
      }
      public static void getSum(String[] s1)
      {
            int sum = 0;
            for(int i=0;i<s1.length;i++)
            {
                  String s = s1[i];
                  for(int j = 0;j<s.length();j++)
                  {
                        Character c = s.charAt(j);
                        if(Character.isDigit(c))
                        {
                              sum+=Integer.parseInt(s.valueOf(c));
                        }
                  }
            }
            System.out.println(sum);
      }
}
33.Prefix Finder

Given a string array (s) with each element in the array containing 0s and 1s. Write a program to get the number of strings in the array where one String is getting as prefixed in other String in that array .
Example 1: Input: {10,101010,10001,1111} Output =2 (Since 10 is a prefix of 101010 and 10001)
Example 2: Input: {010,1010,01,0111,10,10} Output =3(01 is a prefix of 010 and 0111. Also, 10 is a prefix of 1010) Note: 10 is NOT a prefix for 10.

Include a class UserMainCode with a static method findPrefix which accepts the string array. The return type is the integer formed based on rules.
Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a an integer indicating the number of elements in the string array followed by the array.
Output consists of a integer .
Refer sample output for formatting specifications.

Sample Input 1:
4
0
1
11
110
Sample Output 1:
3
import java.util.Scanner;
 
public class mainc {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String s[]=new String[n];
for(int i=0;i<n;i++)
s[i]=sc.nextLine();
maincc.reverseString(s);
}
}
 
 
 
 
 
                                import java.util.ArrayList;
                                 import java.util.Iterator;
                                import java.util.LinkedHashSet;
                                 
                               
                                public class maincc {
                                 
                                public static void reverseString (String s[]) {
                                LinkedHashSet<String>l1=new LinkedHashSet<String>();
                                ArrayList<String>a1=new ArrayList<String>();
                                int c=0;
                                for(int i=0;i<s.length;i++)
                                l1.add(s[i]);
                                Iterator<String> it=l1.iterator();
                                while(it.hasNext())
                                {
                                a1.add(it.next());
                                }
                                for(int i=0;i<a1.size();i++)
                                {
                                String s2=a1.get(i);
                                for(int j=0;j<a1.size();j++)
                                {
                                String s3=a1.get(j);
                                if(i!=j&&s3.length()>s2.length())
                                {
                                String s4=s3.substring(0,s2.length());
                                if(s2.equals(s4))
                                c++;
                                }
                                }
                                }
                                System.out.println(c);
                                }
                                 
                                }



34.Commons

Given two arrays of strings,return the count of strings which is common in both arrays. Duplicate entries are counted only once.
Include a class UserMainCode with a static method countCommonStrings which accepts the string arrays. The return type is the integer formed based on rules.
Create a Class Main which would be used to accept the string arrays and integer and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a an integer indicating the number of elements in the string array followed by the array.
Output consists of a integer .
Refer sample output for formatting specifications.

Sample Input 1:
3
a
c
e
3
b
d
e
Sample Output 1:
1

Sample Input 2:
5
ba
ba
black
sheep
wool
5
ba
ba
have
any
wool
Sample Output 2:
2
public class kape {
 
public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);
int count=0;
int n1 = sc.nextInt();
String[] s1 = new String[n1];
for (int i = 0; i < n1; i++) {
s1[i] = sc.next();
}
int n2 = sc.nextInt();
String[] s2 = new String[n2];
for (int i = 0; i < n2; i++) {
s2[i] = sc.next();
}
ArrayList<String> al = new ArrayList<String>();
for (int i = 0; i < n1; i++) {
for (int j = 0; j < n2; j++) {
if(s1[i].equals(s2[j])){
if(!al.contains(s1[i])){
count++;
al.add(s1[i]);
}
}
}
}
System.out.println(count);
}
}

35.Sequence Sum

Write a program to read a non-negative integer n, and find sum of fibonanci series for n number..

Include a class UserMainCode with a static method getFibonacciSum which accepts the integer value. The return type is integer.

The fibonacci seqence is a famous bit of mathematics, and it happens to have a recursive definition.

The first two values in the sequnce are 0 and 1.

Each subsequent value is the sum of the previous two values, so the whole seqence is 0,1,1,2,3,5 and so on.

You will have to find the sum of the numbers of the Fibonaaci series for a given int n.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a integer.

Output consists of integer.

Refer sample output for formatting specifications.

Sample Input 1:

5

Sample Output 1:

7
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static int sumOfFibonacci(int n){
int a=0,b=1,c=0,d=1;
for(int i=3;i<=n;i++){
c=a+b;
a=b; b=c;
d=d+c;
}
return d;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sumOfFibonacci(n));
}
}

36.E-Mail Validation

Write a program to read a string and validate the given email-id as input.
Validation Rules:
1. Ensure that there are atleast 5 characters between '@' and '.'
2. There should be only one '.' and one '@' symbol.
3. The '.' should be after the '@' symbol.
4. There must be atleast three characters before '@'.
5. The string after '.' should only be 'com'

Include a class UserMainCode with a static method ValidateEmail which accepts the string. The return type is TRUE / FALSE as per problem.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
test@gmail.com
Sample Output 1:
TRUE

Sample Input 2:
academy@xyz.com
Sample Output 2:
FALSE
import java.util.*;
public class Main {
public static void main(String[] args) {
      String ip="academy@xyz.com";
      boolean b=User.emailIdValidation(ip);
      if(b==true)
            System.out.println("valid mail Id");
      else
            System.out.println("not a valid Id");
}}
 
import java.util.StringTokenizer;
 
 
public class User{
      public static boolean emailIdValidation(String ip) {
            int i=0;
            boolean b=false;
            StringTokenizer t=new StringTokenizer(ip,"@");
                  String s1=t.nextToken();
                  String s2=t.nextToken();
            StringTokenizer t1=new StringTokenizer(s2,".");
                  String s3=t1.nextToken();
                  String s4=t1.nextToken();
            if(ip.contains("@") && ip.contains("."))
                  i++;
           
            if(i==1)
                  if(s3.length()==5)
                        if(s1.length()>=3)
                              if(s4.equals("com"))
                                    b=true;
            return b;
      }
      }
 
37.Symmetric Difference

Write a program to read two integer array and calculate the symmetric difference of the two arrays. Finally Sort the array.
Symmetric difference is the difference of A Union B and A Intersection B ie. [ (A U B) - (A ^ B)]
Union operation merges the two arrays and makes sure that common elements appear only once. Intersection operation includes common elements from both the arrays.
Ex - A={12,24,7,36,14} and B={11,26,7,14}.
A U B ={ 7,11,12,14,24,26,36} and
A ^ B = {7,14}
Symmetric difference of A and B after sorting= [A U B] - [ A ^ B] = {11,12,24,26,36}.
Include a class UserMainCode with a static method getSymmetricDifference which accepts the integer array. The return type is an integer array.
Create a Class Main which would be used to accept the two integer arrays and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values. The same sequnce is followed for the next array.
Output consists of sorted symmetric difference array.
Refer sample output for formatting specifications.

Sample Input 1:
5
11
5
14
26
3
3
5
3
1
Sample Output 1:
1
11
14
26
import java.util.*;
 
public class Main
{
                public static void main(String[] args)
                {
                                int n,m;
                                Scanner sin = new Scanner(System.in);
                                n = sin.nextInt();
                                int[] a1 = new int[n];
                                for(int i=0;i<n;i++)
                                {
                                                a1[i] = sin.nextInt();
                                }
                                m = sin.nextInt();
                                int[] a2 = new int[m];
                                for(int i=0;i<m;i++)
                                {
                                                a2[i] = sin.nextInt();
                                }
                                int[] result = UserMainCode.getSymmetricDifference (a1,a2);
                                for(int i=0;i<result.length;i++)
                                                System.out.println(result[i]);
}
}
import java.util.*;
 
public class UserMainCode
{
                public static int[] getSymmetricDifference (int[] a1,int[] a2)
                {
 
                                //int[] a1 = new int[]{11,5,14,26,3};
                                //int[] a2 = new int[]{5,3,1};
                                int[] union,inter,result;
 
                                int count=0;
                                int max = a1.length+a2.length;
                                ArrayList<Integer> temp = new ArrayList<Integer>(max);
 
 
                                /*union*/
 
                                for(int i=0;i<a1.length;i++)
                                {
                                                if(!temp.contains(a1[i]))
                                                {
                                                                ++count;
                                                                temp.add(a1[i]);
                                                }
                                }
                                for(int i=0;i<a2.length;i++)
                                {
                                                if(!temp.contains(a2[i]))
                                                {
                                                                ++count;
                                                                temp.add(a2[i]);
                                                }
                                }
                                union = new int[count];
                                for(int i=0;i<count;i++)
                                {
                                                union[i] = (int)temp.get(i);
                                }
                                Arrays.sort(union);
 
                                /*intersection*/
 
                                temp = new ArrayList<Integer>(max);
                                count =0;
                                Arrays.sort(a2);
                                for(int i=0;i<a1.length;i++)
                                {
                                                if(Arrays.binarySearch(a2,a1[i]) >= 0)
                                                {
                                                                ++count;
                                                                temp.add(a1[i]);
                                                }
                                }
                                inter = new int[count];
                                for(int i=0;i<count;i++)
                                {
                                                inter[i] = (int)temp.get(i);
                                }
                                Arrays.sort(inter);
 
                                /*difference */
               
                                temp = new ArrayList<Integer>(max);
                                count =0;
                                Arrays.sort(inter);
                                for(int i=0;i<union.length;i++)
                                {
                                                if(Arrays.binarySearch(inter,union[i]) < 0)
                                                {
                                                                ++count;
                                                                temp.add(union[i]);
                                                }
                                }
                                result = new int[count];
                                for(int i=0;i<count;i++)
                                {
                                                result[i] = (int)temp.get(i);
                                }
                                Arrays.sort(result);
                                //System.out.println("resultant array : \n "+Arrays.toString(result));
                                return result;
                               
                }
}
 

38.Day of Week

Write a program to read a string  containing date in DD/MM/YYYY format and prints the day of the week that date falls on.
Return the day in lowercase letter (Ex: monday)

Include a class UserMainCode with a static method getDayOfWeek which accepts the string. The return type is the string.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
02/04/1985
Sample Output 1:
Tuesday
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Main {
                public static void main(String[] args) throws ParseException {
                                 
                                Scanner sc=new Scanner(System.in);
                    String s1=sc.nextLine();
                    System.out.println(User.calculateBornDay(s1));
                                }
                                }
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class User {
                public static String calculateBornDay(String s1) throws ParseException
                {
                                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                                SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
                                Date d=sdf.parse(s1);
                                String s=sdf1.format(d);
                                return s.toLowerCase();
                }
}

39.Add Time

Write a program to read  two String variables containing time intervals in hh:mm:ss format. Add the two time intervals and return a string in days:hours:minutes:seconds format where DD is number of days.
Hint: Maximum value for hh:mm:ss is 23:59:59

Include a class UserMainCode with a static method addTime which accepts the string values. The return type is the string.
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
12:45:30
13:50:45
Sample Output 1:
1:2:36:15

Sample Input 2:
23:59:59
23:59:59
Sample Output 2:
1:23:59:58
public class Main {
 
               
                public static void main(String[] args) throws IOException, ParseException  {
                               
                String s1="23:59:59";
                String s2="23:59:59";
                SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                sdf.setTimeZone(TimeZone.getTimeZone("s1"));
                sdf.setTimeZone(TimeZone.getTimeZone("s2"));
                Date d1=sdf.parse(s1);
                Date d2=sdf.parse(s2);
                long add=d1.getTime()+d2.getTime();
                String s=sdf.format(add);
                Calendar cal=Calendar.getInstance();
                cal.setTime(sdf.parse(s));
                int FindDay=cal.get(Calendar.DAY_OF_MONTH);
                if(FindDay>1)
                FindDay=FindDay-1;
                String op=FindDay+":"+s;
                System.out.println(op);
                }
}
 
 

40.ISBN Validation

Write a program to read a string and validate the given ISBN as input.
Validation Rules:
1. An ISBN (International Standard Book Number) is a ten digit code which uniquely identifies a book.
2. To verify an ISBN you calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third ..all the way until you add 1 times the last digit.
If the final number leaves no remainder when divided by 11 the code is a valid ISBN.
Example 1:
Input:0201103311
Calculation: 10*0 + 9*2 + 8*0 + 7*1 + 6*1 + 5*0 + 4*3 + 3*3 + 2*1 + 1*1 = 55.
55 mod 11 = 0
Hence the input is a valid ISBN number
Output: true
Include a class UserMainCode with a static method validateISBN which accepts the string. The return type is TRUE / FALSE as per problem.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
0201103311
Sample Output 1:
TRUE
public class Main {
public static void main(String[] args) {
String ip="020110311";
boolean b=ISBNnumber(ip);
if(b==true)
System.out.println("valid ISBN number");
else
System.out.println("check ur data");
}
public static boolean ISBNnumber(String ip) {
boolean b=false;
int sum=0;
for(int i=0,j=ip.length();i<ip.length();i++,j--){
String s=String.valueOf(ip.charAt(i));
int n=Integer.parseInt(s);
sum+=(n*j); }
//System.out.println(sum);
if(sum%11==0)
b=true;
return b;
}
}

41.Date Format

Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format.

Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string.
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
05-12-1987
8-11-2010
Sample Output 1:
12/05/1987
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
 
public class Main {
 
                /**
                 * @param args
                 * @throws ParseException
                 */
                public static void main(String[] args) throws ParseException {
                                // TODO Auto-generated method stub
                                String s1="12/07/1994";
                                String s2="12/07/1995";
                                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                                SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
                                Date d1=sdf.parse(s1);
                                Date d2=sdf.parse(s2);
                                Calendar cal=Calendar.getInstance();
                                cal.setTime(d1);
                                long y=cal.getTimeInMillis();
                                cal.setTime(d2);
                                long y1=cal.getTimeInMillis();
                                String s3=sdf1.format(d1);
                                String s4=sdf1.format(d2);
                                if(y<y1)
                                                System.out.println(s3);
                                else
                                                System.out.println(s4);
                               
                }
}
 
42.Interest Calculation
 
Write a  program to calculate amount of the acccount holders based on the below mentioned prototype:
1. Read account details from the User. The details would include id, DOB (date of birth) and amount in the given order. The datatype for id is string, DOB is string and amount is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id as key and DOB as value, and the second hashmap contains same employee ids as key and amount as value.
3. Rate of interest as on 01/01/2015:
    a. If the age greater than or equal to 60 then interest rate is 10% of Amount.
    b.If the age less then to 60 and greater than or equal to 30 then interest rate is 7% of Amount.
    v. If the age less then to 30 interest rate is 4% of Amount.
4. Revised Amount= principle Amount + interest rate.
5.  You decide to write a function calculateInterestRate which takes the above hashmaps as input and returns the treemap  as output. Include this function in class UserMainCode.

Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.

Input and Output Format:
Input consists of account details. The first number indicates the size of the acoount. The next three values indicate the user id, DOB and amount. The Employee DOB format is “dd-mm-yyyy”
Output consists of the user id and the amount for each user one in a line.
Refer sample output for formatting specifications.

Sample Input 1:
4
SBI-1010
20-01-1987
10000
SBI-1011
03-08-1980
15000
SBI-1012
05-11-1975
20000
SBI-1013
02-12-1950
30000
Sample Output 1:
SBI-1010:10400
SBI-1011:16050
SBI-1012:21400
SBI-1013:33000
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
 
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=Usermaincode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
 
 
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
public class Usermaincode
{
public static TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
Date d=sdf.parse(dor);
Date d1=sdf1.parse(now);
sdf.setLenient(false);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
if(year>=60)
dis=0.1*amount+amount;
else if(year<60 && year>=30 )
dis=0.07*amount+amount;
else
dis=0.04*amount+amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}
 
43.Discount Rate Calculation

Write a  program to calculate discount of the acccount holders based on the transaction amount and registration date using below mentioned prototype:
1. Read account details from the User. The details would include id, DOR (date of registration) and transaction amount in the given order. The datatype for id is string, DOR is string and transaction amount is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id as key and DOR as value, and the second hashmap contains same employee ids as key and amount as value.
3. Discount Amount as on 01/01/2015:
    a. If the transaction amount greater than or equal to 20000 and registration greater than or equal to 5     year then discount rate is 20% of transaction amount.
    b. If the transaction amount greater than or equal to 20000 and registration less then to 5 year then     discount rate is 10% of transaction amount.
    c. If the transaction amount less than to 20000 and registration greater than or equal to 5 year then     discount rate is 15% of transaction amount.
    d. If the transaction amount less than to 20000 and registration less then to 5 year then discount rate     is 5% of transaction amount.
4. You decide to write a function calculateDiscount which takes the above hashmaps as input and returns the treemap  as output. Include this function in class UserMainCode.

Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of transaction details. The first number indicates the size of the employees. The next three values indicate the user id, user DOR and transaction amount. The DOR (Date of Registration) format is “dd-mm-yyyy”
Output consists of a string which has the user id and discount amount one in a line for each user.
Refer sample output for formatting specifications.
Sample Input 1:
4
A-1010
20-11-2007
25000
B-1011
04-12-2010
30000
C-1012
11-11-2005
15000
D-1013
02-12-2012
10000
Sample Output 1:
A-1010:5000
B-1011:3000
C-1012:2250
D-1013:500


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
importjava.util.HashMap;
import java.util.TreeMap;
publicclass UserMainCode
{
publicstatic TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
try{
	Date d=new Date();

Date d1=new Date();


String a=dor;
String b="01-01-2014";


d=sdf.parse(a);
d1=sdf.parse(b);
long t=d.getTime();
long t1=d1.getTime();

long t3=t1-t;
long l1=(24 * 60 * 60 * 1000);
long l=l1*365;
long year1=t3/l;
System.out.println("Result="+year1);

if(year1>=5 && amount>=20000)
dis=0.2*amount;
elseif(year1<5 && amount>=20000)
dis=0.1*amount;
elseif(year1>=5 && amount<20000)
dis=0.15*amount;
else
dis=0.05*amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}




import java.util.HashMap;
import java.util.Iterator;

import java.util.TreeMap;

import java.util.Scanner;

publicclassAdd{
publicstaticvoid main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));

}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=UserMainCode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}


