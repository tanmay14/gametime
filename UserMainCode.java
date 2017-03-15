package p1;

public class UserMainCode {
	/*
	 * 1.Start Case
Write a program to read a sentence in string variable and convert the first letter of each word to capital case. Print the final string.
Note: - Only the first letter in each word should be in capital case in final string.
Include a class UserMainCode with a static method printCapitalized which accepts a string. The return type (String) should return the capitalized string.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a strings.
Output consists of a String (capitalized string).
Refer sample output for formatting specifications.
Sample Input:
Now is the time to act!
Sample Output:
Now Is The Time To Act!
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args){
                String s1="Now is the time to act!";        
                System.out.println(capsStart(s1));
}
public static String capsStart(String s1){
                StringBuffer sb=new StringBuffer();
                StringTokenizer t=new StringTokenizer(s1," ");
                while(t.hasMoreTokens()){
                                String s2=t.nextToken();
                                String s3=s2.substring(0,1);
                                String s4=s2.substring(1, s2.length());
                                sb.append(s3.toUpperCase()).append(s4).append(" ");                }
                return sb.toString();
}
}
 
 
 
2.Maximum Difference
Write a program to read an integer array and find the index of larger number of the two adjacent numbers with largest difference. Print the index.
Include a class UserMainCode with a static method findMaxDistance which accepts an integer array and the number of elements in the array. The return type (Integer) should return index.
Create a Class Main which would be used to accept an integer array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers, where n corresponds the size of the array followed by n integers.
Output consists of an Integer (index).
Refer sample output for formatting specifications.
Sample Input :
6
4
8
6
1
9
4
Sample Output :
4
 
[In the sequence 4 8 6 1 9 4 the maximum distance is 8 (between 1 and 9). The function should return the index of the greatest of two. In this case it is 9 (which is at index 4). output = 4.]
import java.util.Scanner;


public class Add
{

        public static void main(String[] args)
        {
                int a[]=new int[20];
                
               int max=checkDifference(a);
               System.out.println(max);

        }

        private static int checkDifference(int[] a)
        {
                Scanner s=new Scanner(System.in);
                int n=s.nextInt();
                for(int i=0;i<n;i++)
                {
                        a[i]=s.nextInt();

                }
                int max=0,index=0;
                for(int i=0;i<n;i++)
                {
                        int d=Math.abs(a[i]-a[i+1]);
                        if(d>max)
                        {
                                max=d;
                                if(a[i]>a[i+1])
                                {
                                        index=i;
                                }
                                else
                                {
                                        index=i+1;
                                }
                        }
                }
                




                return index;


        }
} 

3.Palindrome - In Range
Write a program to input two integers, which corresponds to the lower limit and upper limit respectively, and find the sum of all palindrome numbers present in the range including the two numbers. Print the sum.
 
Include a class UserMainCode with a static method addPalindromes which accepts two integers. The return type (Integer) should return the sum if the palindromes are present, else return 0.
Create a Class Main which would be used to accept two integer and call the static method present in UserMainCode.
Note1 : A palindrome number is a number which remains same after reversing its digits.
Note2 : A single digit number is not considered as palindrome.
Input and Output Format:
Input consists of 2 integers, which corresponds to the lower limit and upper limit respectively.
Output consists of an Integer (sum of palindromes).
Refer sample output for formatting specifications.
Sample Input :
130
150
Sample Output :
272
(131+141 = 272)
import java.util.*;
public class Add {
                public static int sumOfPalindromeNos(int n1,int n2){
                    int sum=0;           
                	for(int i=n1;i<=n2;i++){
                                                int r=0,n3=i;
                                                while(n3!=0){
                                                                               r=(r*10)+(n3%10);
                    n3=n3/10; 
}
                        // System.out.println(n3);           
                           if(r==i)
                            	sum=sum+i;
                                               
                              	} 
                
                            return sum;
                }

                                              
         
               
                                
									
                public static void main(String[] args) {
                                Scanner s=new Scanner(System.in);
                                System.out.println("enter the range:");
                                int n1=s.nextInt();
                                int n2=s.nextInt();
                                System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
                }
}
 
4.PAN Card
Write a program to read a string and validate PAN no. against following rules:
1. There must be eight characters.
2. First three letters must be alphabets followed by four digit number and ends with alphabet
3. All alphabets should be in capital case.
 
Print �Valid� if the PAN no. is valid, else print �Invalid�.
 
Include a class UserMainCode with a static method validatePAN which accepts a string. The return type (Integer) should return 1 if the string is a valid PAN no. else return 2.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string, which corresponds to the PAN number.
Output consists of a string - "Valid" or "Invalid"
Refer sample output for formatting specifications.
Sample Input 1:
ALD3245E
Sample Output 1:
Valid
Sample Input 2:
OLE124F
Sample Output 2:
Invalid
 public class Main {
public static void main(String[] args) {
String s1="OLE124F";
getvalues(s1);
}
public static void getvalues(String s1) {
if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
{
System.out.println(1);
}
else
System.out.println(-1);
}
}
 
5.Fibonacci Sum
Write a program to read an integer n, generate fibonacci series and calculate the sum of first n numbers in the series. Print the sum.
Include a class UserMainCode with a static method getSumOfNfibos which accepts an integer n. The return type (Integer) should return the sum of n fibonacci numbers.
Create a Class Main which would be used to accept an integer and call the static method present in UserMainCode.
Note: First two numbers in a Fibonacci series are 0, 1 and all other subsequent numbers are sum of its previous two numbers. Example - 0, 1, 1, 2, 3, 5...
Input and Output Format:
Input consists of an integer, which corresponds to n.
Output consists of an Integer (sum of fibonacci numbers).
Refer sample output for formatting specifications.
Sample Input :
5
Sample Output :
7
[0 + 1 + 1 + 2 + 3 = 7]
import java.util.ArrayList;
import java.util.Scanner;
public class Add {
public static int sumOfFibonacci(int n){
int a=0,b=1,c=0,d=0;
for(int i=3;i<=n;i++)
{
	c=a+b;
	b=c;
	a=b;
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
 

6.Test Vowels
Write a program to read a string and check if given string contains exactly five vowels in any order. Print �Yes� if the condition satisfies, else print �No�.
Assume there is no repetition of any vowel in the given string and all characters are lowercase.
Include a class UserMainCode with a static method testVowels which accepts a string. The return type (Integer) should return 1 if all vowels are present, else return 2.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of a string (�Yes� or �No�).
Refer sample output for formatting specifications.
Sample Input 1:
acbisouzze
Sample Output 1:
Yes
 
Sample Input 2:
cbisouzze
Sample Output 2:
No
public class Add {
public static void main(String[] args) {
String s1="AEIOU";
System.out.println(vowelsCheck(s1));
}
public static boolean vowelsCheck(String s1) {
boolean b=false;
int n1=0,n2=0,n3=0,n4=0,n5=0;
String s2=s1.toLowerCase();
for(int i=0;i<s2.length();i++){
char c=s2.charAt(i);
if(c=='a')
n1++;
if(c=='e')
n2++;
if(c=='i')
n3++;
if(c=='o')
n4++;
if(c=='u')
n5++;}
if(n1==1&&n2==1&n3==1&&n4==1&&n5==1)



	b=true;
else b=false;

return b;

}
}
7.Dash Check
Write a program to read two strings and check whether or not they have dashes in the same places. Print �Yes� if the condition satisfies, else print �No�.
Include a class UserMainCode with a static method compareDashes which accepts two strings. The return type (Integer) should return 1 if all dashes are placed correctly, else return 2.
Create a Class Main which would be used to accept two strings and call the static method present in UserMainCode.
Note: The strings must have exactly the same number of dashes in exactly the same positions. The strings might be of different length.
Input and Output Format:
Input consists of two strings.
Output consists of a string (�Yes� or �No�).
Refer sample output for formatting specifications.
Sample Input 1:
hi�there-you.
12--(134)-7539
Sample Output 1:
Yes
 
Sample Input 2:
-15-389
-xyw-zzy
Sample Output 2:
No
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
String s1="hi-there-you.";
String s2="12-(134)-7539";
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
ArrayList<Integer>l1=new ArrayList<Integer>();
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)=='-')
{
l1.add(i);
}
}
ArrayList<Integer>l2=new ArrayList<Integer>();
for(int i=0;i<s2.length();i++)
{
if(s2.charAt(i)=='-')
{
l2.add(i);
}
}
//System.out.println(l1);
//System.out.println(l2);
if(l1.equals(l2))
{
System.out.println(1);
}
else
System.out.println(-1);
}
}
 

8.Reverse Split
Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
Include a class UserMainCode with a static method reshape which accepts a string and a character. The return type (String) should return the final string.
Create a Class Main which would be used to accept a string and a character, and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of a string and a character.
Output consists of a string (the final string).
Refer sample output for formatting specifications.
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R
public class UserMainCode{
	public static String reShape(String s){
		
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb2=new StringBuffer();
		String s2=sb.reverse().toString();
		for(int i=0;i<s2.length();i++)
		{
			

			sb2.append(s2.charAt(i));
			sb2.append("-");

	
		}
		sb2.deleteCharAt(sb2.length()-1);
		System.out.println(sb2.toString());
		return sb2.toString();
	}
	
} 


9.Remove 10's
 
Write a program to read an integer array and remove all 10s from the array, shift the other elements towards left and fill the trailing empty positions by 0 so that the modified array is of the same length of the given array.
 
Include a class UserMainCode with a static method removeTens which accepts the number of elements and an integer array. The return type (Integer array) should return the final array.
Create a Class Main which would be used to read the number of elements and the input array, and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of n+1 integers, where n corresponds to size of the array followed by n elements of the array.
Output consists of an integer array (the final array).
Refer sample output for formatting specifications.
 
Sample Input :
5
1
10
20
10
2
Sample Output :
1
20
import java.io.*;
import java.util.*;
public class Add {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i, k = 0;
int a[] = new int[n];
ArrayList<Integer> al = new ArrayList<Integer>();
for (i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
for (i = 0; i < n; i++) {
if (a[i] != 10) {
al.add(a[i]);
}
}
if (al.size() < n) {
k = n - al.size();
for (i = 0; i < k; i++) {
al.add(0);
}
}
System.out.println(al);
int b[] = new int[n];
for (i = 0; i < n; i++) {
b[i] = al.get(i);
System.out.println(b[i]);
}
}
}
 
10.Last Letters
Write a program to read a sentence as a string and store only the last letter of each word of the sentence in capital letters separated by $. Print the final string.
 
Include a class UserMainCode with a static method getLastLetter which accepts a string. The return type (string) should return the final string.
Create a Class Main which would be used to read a string, and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of a string (the final string).
Refer sample output for formatting specifications.
 
Smaple Input :
This is a cat
Sample Output :
S$S$A$T

 
import java.util.StringTokenizer;
 
 
public class UserMainCode {
    public static String display(String input){ 
          String str1=null;
   
     StringTokenizer st=new StringTokenizer(input," ");
    StringBuffer sb=new StringBuffer();
     while(st.hasMoreTokens()){
           str1=st.nextToken();
           
          /// String str2=Character.toString(str1.charAt(str1.length()-1));

       String str2=str1.substring(str1.length()-1);
         String str3=  str2.toUpperCase();
         

        
         sb.append(str3).append("$");
               
               
     }sb.deleteCharAt(sb.length()-1);
     return sb.toString();
    }
}
 

11.Largest Key in HashMap
 
Write a program that construts a hashmap and returns the value corresponding to the largest key.
Include a class UserMainCode with a static method getMaxKeyValue which accepts a string. The return type (String) should be the value corresponding to the largest key.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers equals the integer key and value as string.
Output consists of a string which is the value of largest key.
Refer sample output for formatting specifications.
Sample Input 1:
3
12
amron
9
Exide
7
SF
Sample Output 1:
Amron
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
public class Main {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(12,"amron");
hm.put(9, "excide");
hm.put(7,"SF");
getvalues(hm);
}
public static void getvalues(HashMap<Integer, String> hm) {
int max=0;
String s3=null;
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int a=itr.next();
if(a>max)
{
max=a;
s3=hm.get(a);

}
}
System.out.println(s3);
}
}
 
12.All Numbers
 
Write a program to read a string array and return 1 if all the elements of the array are numbers, else return -1.
Include a class UserMainCode with a static method validateNumber which accepts a string aray. The return type (integer) should be -1 or 1 based on the above rules.
Create a Class Main which would be used to accept Input string array and call the static method present in UserMainCode.
The string array is said to be valid if all the elements in the array are numbers. Else it is invalid.
 
Input and Output Format:
Input consists of an integer specifying the size of string array followed by n strings.
Refer sample output for formatting specifications.
Sample Input 1:
4
123
24.5
23
one
Sample Output 1:
invalid
Sample Input 2:
2
123
24.5
Sample Output 2:
import java.util.Scanner;
 
public class kape {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       String []s1=new String[size];
       for(int i=0;i<size;i++)
       {
                   s1[i]=sc.next();
       }
       System.out.println(kape1.display(s1));
    }}
 
public class kape1 {
public static int display(String a[])
{int c=0;
for(int i=0;i<a.length;i++)
{
String s=a[i];
int k=0;
for(int j=0;j<s.length();j++)
{
char a1=s.charAt(j);
//System.out
if(a1>='0' && a1<='9' || a1=='.' )
k++;
 
}
if(k==s.length())
c++;
}
if(c==a.length)
return 1;
else
return -1;
}}
 
13.Day of the Week
 
Write a program to read a date as string (MM-dd-yyyy) and return the day of week on that date.
Include a class UserMainCode with a static method getDay which accepts the string. The return type (string) should be the day of the week.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
07-13-2012
Sample Output 1:
Friday
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
                                SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
                                SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
                                Date d=sdf.parse(s1);
                                String s=sdf1.format(d);
                                return s;
                }
}
 

 

14.Max Substring
 
Write a program to accept two string inputs. The first being a source string and second one a delimiter. The source string contains the delimiter at various locations. Your job is to return the substring with maximum number of characters. If two or more substrings have maximim number of characters return the substring which appears first. The size of the delimiter is 1.

 
Include a class UserMainCode with a static method extractMax which accepts the string. The return type (string) should be the max substring.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a source string and delimiter.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
delhi-pune-patna
-
Sample Output 1:
Delhi\
import java.util.*;
public class PO {
                public static void main(String[]args){
                                Scanner sc=new Scanner(System.in);
                                String s=sc.nextLine();
                                String s1=sc.nextLine();
                                int max=0;
                                String s3=null;
                StringTokenizer st=new StringTokenizer(s,"-");
                while( st.hasMoreTokens())
                {
                                String s2=st.nextToken();
                                int n=s2.length();
                                if(n>max)
                                {
                                                max=n;
                                                s3=s2;
                                }
                }System.out.print(s3);
                }}
 

15.States and Capitals
 
Write a program that construts a hashmap with �state� as key and �capital� as its value. If the next input is a state, then it should return capital$state in lowercase.
Include a class UserMainCode with a static method getCapital which accepts a hashmap. The return type is the string as given in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+2 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the state and capital. The last value consists of the �state� input.
Output consists of a string as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
3
Karnataka
Bangaluru
Punjab
Chandigarh
Gujarat
Gandhinagar
Punjab
Sample Output 1:
chandigarh$punjab
import java.util.HashMap;
import java.util.Scanner;
 
 
 
public class Add
{
                public static void main(String[] args)
                {
               
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                                HashMap<String,String> hm=new HashMap<String,String>();
                                for(int i=0;i<n;i++)
                                {
                                                String s1=sc.next();
                                                String s2=sc.next();
                                                hm.put(s1,s2);
                                }
                                String sa=sc.next();
                                                System.out.print(UserMainCode.display(hm,sa));
 
                                                               
                }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 
public class UserMainCode
{
                public static String display(HashMap<String,String> hm,String sa)
                {
                String chan=null;
                Iterator<String>it=hm.keySet().iterator();
                StringBuffer sb=new StringBuffer();
                
                while(it.hasNext()){
                	String a=it.next();
                if(a.equals(sa))
                {
                	chan=hm.get(a);
                	sb.append(chan).append("$").append(sa);
                }

                }
                return sb.toString();

                }
}
 
16.Simple String Manipulation - II
 
Write a program to read a string and return an integer based on the following rules.
If the first word and the last word in the String match, then return the number of characters in the word else return sum of the characters in both words. Assume the Strings to be case - sensitive.
Include a class UserMainCode with a static method calculateWordSum which accepts a string. The return type (integer) should be based on the above rules.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
COGNIZANT TECHNOLOGY SOLUTIONS COGNIZANT
Sample Output 1:
9
Sample Input 2:
HOW ARE YOU
Sample Output 2:
6
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main {
               
                public static void main(String args[]) throws Exception {
                                Scanner sc=new Scanner(System.in);
                                String inpList=sc.nextLine();
                               
                                System.out.println(UserMainCode.calculateWordSum(inpList));                              
                }
}
 
public class UserMainCode {
               
                public static int calculateWordSum(String inp) {
                                int count=0;
                                String st[]=inp.split(" ");
                                String s1=st[0];
                                String slst=st[st.length-1];
                                if(s1.equals(slst))
                                {
                                                count=s1.length();
                                }
                                else
                                {
                                                count=s1.length()+slst.length();
                                }
                                return count;
                                                                               
                                                                               
                }                             
}
 
17.Vowels, Arrays & ArrayLists
 
Write a program to read an array of strings and return an arraylist which consists of words whose both first and last characters are vowels. Assume all inputs are in lowecase.
Include a class UserMainCode with a static method matchCharacter which accepts a string array. The return type shoud be an arraylist which should contain elements as mentioned above.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' string correspond to the elements in the array.
Output consists of strings which are elements of arraylist
Refer sample output for formatting specifications.

 
Sample Input 1:
4
abcde
pqrs
abci
orto

 
Sample Output 1:
abcde
abci
orto
import java.util.*;
 
public class Main
{
public static void main(String[] args)
{
int n;
                                 
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
String[] str=new String[n];
for(int i=0;i<n;i++)
{
str[i]=sc.nextLine();
                                 
}
ArrayList<String> arr=new ArrayList<String>();
arr=UserMainCode.getName(str);
Iterator<String> it=arr.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
                                 
}
                                 
}
import java.util.*;
 
public class UserMainCode
{
                public static ArrayList<String> getName(String[] ss)
{
ArrayList<String> as=new ArrayList<String>();
for(int i=0;i<ss.length;i++)
{
String sp=ss[i];
char[] mp=sp.toLowerCase().toCharArray();
if((mp[0]=='a'||mp[0]=='e'||mp[0]=='i'||mp[0]=='o'||mp[0]=='u')&&(mp[sp.length()-1]=='a'||mp[sp.length()-1]=='e'||mp[sp.length()-1]=='i'||mp[sp.length()-1]=='o'||mp[sp.length()-1]=='u'))
{
as.add(sp);
}
}
return as;
}
}

 
18.Transfer from Hashmap to Arraylist
 
Write a program that constructs a hashmap with �employee id� as key and �name� as its value. Based on the rules below, on being satisfied, the name must be added to the arraylist.
i)First character should be small and the last character should be Capital.
ii)In name at least one digit should be there.
Include a class UserMainCode with a static method getName which accepts a hashmap. The return type is an arraylist as expected in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the employee id and name.
Output consists of arraylist of strings as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
4
1
ravi5raJ
2
sita8gitA
3
ram8sitA
4
rahul
Sample Output 1:
ravi5raJ
sita8gitA
ram8sitA
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Add {
public static void main(String[] args)
{
HashMap<Integer,String> hm1=new HashMap<Integer,String>();
int n;
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
hm1.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
}
ArrayList<String> al1=new ArrayList<String>();
al1=getName(hm1);
Iterator<String> it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
public static ArrayList<String> getName(HashMap<Integer,String> hm1)
{
ArrayList<String> al2=new ArrayList<String>();
 
Iterator<Integer> it =hm1.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
String name=hm1.get(id);
if(name.matches("[a-z]{1,}[0-9]{1}[a-z]{1}.*[A-Z]{1}"))
	al2.add(name);
}
return al2;
 
}
}
 
19.Max Admissions
 
Write a program that reads details about number of admissions per year of a particular college, return the year which had maximum admissions. The details are stored in an arraylist with the first index being year and next being admissions count.
Include a class UserMainCode with a static method getYear which accepts a arraylist. The return type is an integer indicating the year of max admissions.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the data (year & admissions). The next n pair of numbers contains the year and admissions count.
Output consists of an integer as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
4
2010
200000
2011
300000
2012
45000
2013
25000
Sample Output 1:
2011
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
 
public class Add {
 
          public static void main(String[] args) {
                    // TODO Auto-generated method stub
                    Scanner s=new Scanner(System.in);
                    int n=s.nextInt();
                    HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
                    for(int i=0;i<n;i++)
                    {
                    hm.put(s.nextInt(),s.nextInt());
                    }
                    
                    System.out.println(getvalues(hm));
                    }
                    public static int getvalues(HashMap<Integer,Integer> hm) {
          int b=0,max=0,c=0,d=0;
          String s1=new String();
                              Iterator<Integer> i=hm.keySet().iterator();
                    while(i.hasNext())
                    {
                              b=i.next();
                              c=hm.get(b);
                              if(c>max)
                              {
                                        max=c;
                                        d=b;
                              }
                    }
                    return d;
                    }
}

20.Sum Non Prime Numbers
 
Write a program to calculate the sum of all the non prime positive numbers less than or equal to the given number.
 
Note: prime is a natural number greater than 1 that has no positive divisors other than 1 and itself
 
Example:
input = 9
Prime numbers = 2,3,5 and 7
output = 1+4+6+8+9=28
 
Include a class UserMainCode with a static method �addNumbers� that accepts an integer arguement and returns an integer.
 
Create a class Main which would get an integer as input and call the static method validateNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of an integer.
 
Sample Input:
9
 
Sample Output:
28
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
 
 
public class Add {
	public static void main(String[] args)
	{
		int n=9;
		System.out.println(func(n));
	}
                public static int func(int n) {
                                int sum=0;int k=0;int sum1=0;
                                for(int i=1; i<=n; i++)
                                { k=0;
                                for(int j=1; j<=i; j++)
                                {
                                	if(i%j==0)
                                		k++;
                                	
                                }
                                if(k!=2)
                                {
                                                sum=sum+i;
                                }
                                }
                              
                                return sum;
                                }
}
 
 
21.Date Format Conversion
 
Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy.
 
Include a class UserMainCode with a static method �convertDateFormat� that accepts a String and returns a String.
 
Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
12/11/1998
 
Sample Output:
12-11-98
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s1="12/12/1998";
getvalues(s1);
}
public static void getvalues(String s1) {
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yy");
String s2=sdf1.format(d1);
System.out.println(s2);
} catch (ParseException e) {
e.printStackTrace();
}
}
}
 
 
 
22.Valid Date
 
Given a date string as input, write a program to validate if the given date is in any of the following formats:
dd.mm.yyyy
dd/mm/yy
dd-mm-yyyy
 
Include a class UserMainCode with a static method �validateDate� that accepts a String and returns an integer. This method returns 1 if the date is valid, else return -1.
 
Create a class Main which would get a String as input and call the static method validateDate present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String that is either 'Valid' or 'Invalid'.
 
Sample Input 1:
12.03.2012
 
Sample Output 1:
Valid
 
Sample Input 2:
27#01#1977
 
Sample Output 2:
Invalid
 
import java.util.ArrayList;
import java.util.Collections;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s="12.03.2012";
getvalues(s);
}
public static void getvalues(String s) {
if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else
System.out.println(-1);
}
}
23.Convert Format
 
Given a 10 digit positive number in the format XXX-XXX-XXXX as a string input, write a program to convert this number to the format XX-XX-XXX-XXX.
 
Include a class UserMainCode with a static method �convertFormat� that accepts a String argument and returns a String.
 
Create a class Main which would get a String as input and call the static method convertFormat present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
555-666-1234
 
Sample Output:
55-56-661-234
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
                String s="555-666-1234";
                System.out.println(display(s));
                }
public static String display(String s) {
                StringTokenizer t=new StringTokenizer(s,"-");
                String s1=t.nextToken();
                String s2=t.nextToken();
                String s3=t.nextToken();
                               
                StringBuffer sb=new StringBuffer();
                sb.append(s1.substring(0, s1.length()-1)).append('-');
                sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
                sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
                sb.append(s3.substring(1, s3.length()));
               
                return sb.toString();
}
}
 
 
24.Add and Reverse
 
Given an int array and a number as input, write a program to add all the elements in the array greater than the given number. Finally reverse the digits of the obtained sum and print it.
 
Include a class UserMainCode with a static method �addAndReverse� that accepts 2 arguments and returns an integer.The first argument corresponds to the integer array and the second argument corresponds to the number.
 
Create a class Main which would get the required input and call the static method addAndReverse present in the UserMainCode.
 
Example:
Input Array = {10,15,20,25,30,100}
Number = 15
sum = 20 + 25 + 30 + 100 = 175
output = 571
 
Input and Output Format:
The first line of the input consists of an integer that corresponds to the number of elements in the array.
The next n lines of the input consists of integers that correspond to the elements in the array.
The last line of the input consists of an integer that corresponds to the number.
 
Output consists of a single integer.
 
Sample Input
6
10
15
20
25
30
100
15
 
Sample Output
571
public class Main {
public static void main(String[] args) {
                               
              int[] a={10,15,20,25,30,100};
              int b=15;
              int i,sum=0,r=0;
              for(i=0;i<a.length;i++)
              {
                  if(a[i]>b)
                  {
                                  sum=sum+a[i];
                  }
              }
              //System.out.println(sum);
             while(sum!=0)
             {
                 r=(r*10)+(sum%10);
                 sum=sum/10;
             }
             System.out.println(r);
                }
 
}
 
25.Next Year day
 
Given a date string in dd/mm/yyyy format, write a program to calculate the day which falls on the same date next year. Print the output in small case.
 
The days are sunday, monday, tuesday, wednesday, thursday, friday and saturday.
 
Include a class UserMainCode with a static method �nextYearDay� that accepts a String and returns a String.
 
Create a class Main which would get a String as input and call the static method nextYearDay present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
13/07/2012
 
Sample Output:
saturday
 import java.util.ArrayList;import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s1="29/02/2000";
getvalues(s1);
}
public static void getvalues(String s1) {
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
Calendar cal=Calendar.getInstance();
cal.setTime(d1);
cal.add(Calendar.YEAR, 1);
Date d2=cal.getTime();
SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
String s=sdf1.format(d2);
System.out.println(s);
}
catch (ParseException e)
{
                e.printStackTrace();
}
}
}
 
26.Sum Squares of Digits
 
Write a program that accepts a positive number as input and calculates the sum of squares of individual digits of the given number.
 
Include a class UserMainCode with a static method �getSumOfSquaresOfDigits� that accepts an integer argument and returns an integer.
 
Create a class Main which would get an integer as input and call the static method getSumOfSquaresOfDigits present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of an integer.
 
Sample Input:
321
 
Sample Output:
14
public class Main {
 
public static void main(String[] args) {
int n=321;
getvalues(n);
}
public static void getvalues(int n) {
int a=n;
int rem=0;
int sum=0;
while(a!=0)
{
rem=a%10;
sum=sum+(rem*rem);
a=a/10;
}
System.out.println(sum);
}
}
 
 
27.Even and Odd Index Sum
 
Write a program that accepts a positive number as input and calculates the sum of digits at even indexes (say evenSum) and sum of digits at odd indexes (say oddSum) in the given number. If both the sums are equal , print 'yes', else print no.
 
Example:
input = 23050
evenSum = 2 + 0 + 0 = 2
oddSum = 3 + 5 = 8
output = no
 
Include a class UserMainCode with a static method �sumOfOddEvenPositioned� that accepts an integer and returns an integer. The method returns 1 if the 2 sums are equal. Else the method returns -1.
 
Create a class Main which would get an integer as input and call the static method sumOfOddEvenPositioned present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of a string that is either �yes� or �no�.
 
Sample Input 1:
23050
 
Sample Output 1:
no
 
Sample Input 2:
231
 
Sample Output 2:
Yes
import java.util.Scanner;
public class Add {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
getvalues(n);
}
public static void getvalues(int n) {
int rem = 0, i = 0;
int a[] = new int[10];
while (n > 0) {
rem = n % 10;
a[i] = rem;
n = n / 10;
i++;
}
int sume = 0, sumo = 0;
for (int j = i - 1; j >= 0; j--) {
	if(j%2!=0)
	{
sumo = sumo + a[j];
}
	else
		
 {
sume = sume + a[j];
}
}
if (sume == sumo) {
System.out.println(1);
} else
System.out.println(-1);
}
}

 
28.Remove 3 Multiples
 
Write a program that accepts an ArrayList of integers as input and removes every 3rd element and prints the final ArrayList.
 
Suppose the given arrayList contains 10 elements remove the 3rd, 6th and 9th elements.
 
Include a class UserMainCode with a static method �removeMultiplesOfThree� that accepts an ArrayList<Integer> as arguement and returns an ArrayList<Integer>.
 
Create a class Main which would get the required input and call the static method removeMultiplesOfThree present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of an integer n, that corresponds to the number of elements to be added in the ArrayList.
The next n lines consist of integers that correspond to the elements in the ArrayList.
 
Output consists of an ArrayList of integers.
 
Sample Input:
6
3
1
11
19
17
19
 
Sample Output
3
1
19
17
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
 
public class HelloWorld{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> al1=new ArrayList<Integer>();
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
al.add(sc.nextInt());
}
al1=User.findFruitName(al);
Iterator it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
 
 
public class User
{
public static ArrayList<Integer> findFruitName(ArrayList<Integer> al)
{
ArrayList<Integer> al2=new ArrayList<Integer>();
 
for(int i=0;i<al.size();i++)
{
if((i+1)%3!=0)
al2.add(al.get(i));
}
 
return al2;
}
}
 
 
29.String Occurances - II

Obtain two strings S1,S2 from user as input. Your program should count the number of times S2 appears in S1.

Return the count as output. Note - Consider case.

Include a class UserMainCode with a static method getSubstring which accepts two string variables. The return type is the count.

Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of two strings with maximum size of 100 characters.

Output consists of an integer.

Refer sample output for formatting specifications.

Sample Input 1:
catcowcat
cat

Sample Output 1:
2


Sample Input 2:
catcowcat
CAT

Sample Output 2:
0
import java.util.*;
public class UserMainCode {
                public static void main(String[]args){
                                Scanner sc=new Scanner(System.in);
                                String s=sc.nextLine();
                                String s1=sc.nextLine();
                                char []c=s.toCharArray();
                                char[] c1=s1.toCharArray();
                                int count=0,result=0;
                                for(int i=0;i<s.length();i++)
                                {
                                                for(int j=0;j<s1.length();j++)
                                                {
                                                                if(c[i]==c1[j])
                                                                {
                                                                                i++;
                                                                                count++;
                                                                                if(i>=s.length())
 
                                                                break;
                                                                                }
                                                }
                               
                if(count==s1.length())
                {
                                result++;
                                
                }
                count=0;
                                }
                                System.out.print(result);
                }}
 
30.Programming Logic

Write a Program that accepts three integer values (a,b,c) and returns their sum. However, if one of the values is 13 then it does not count towards the sum and the next number also does not count. So for example, if b is 13, then both b and c do not count.

Include a class UserMainCode with a static method getLuckySum which accepts three integers. The return type is integer representing the sum.

Create a Class Main which would be used to accept the input integers and call the static method present in UserMainCode.

Input and Output Format:

Input consists of three integers.

Output consists of a single integer.

Refer sample output for formatting specifications.

Sample Input 1:
1
2
3

Sample Output 1:
6


Sample Input 2:
1
2
13

Sample Output 2:
3


Sample Input 3:
13
3
8

Sample Output 3:
8
 
31.Triplets

Given an integer array, Write a program to find if the array has any triplets. A triplet is a value if it appears 3 consecutive times in the array.

Include a class UserMainCode with a static method checkTripplets which accepts an integer array. The return type is boolean stating whether its a triplet or not.

Create a Class Main which would be used to accept the input arrayand call the static method present in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer would represent the size of array and the next n integers would have the values.

Output consists of a string stating TRUE or FALSE.

Refer sample output for formatting specifications.

Sample Input 1:
7
3
3
5
5
5
2
3

Sample Output 1:
TRUE

Sample Input 2:
7
5
3
5
1
5
2
3

Sample Output 2:
FALSE
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
int n;
int[] a=new int[10];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
boolean s=UserMain.checkTripplets(a);
if(s)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
 
}
 
public class UserMain {
public static boolean checkTripplets(int[] a)
{
boolean b=false;
for(int i=0;i<a.length-3;i++)
{
if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
{
b=true;
}
}
return b;
}
}
 
32.Repeat Front

Given a string (s) and non negative integer (n) apply the following rules.
1.	    Display the first three characters as front.
2.	    If the length of the string is less than 3, then consider the entire string as front and repeat it n times.

Include a class UserMainCode with a static method repeatFirstThreeCharacters which accepts the string and integer. The return type is the string formed based on rules.

Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string and integer.

Output consists of a string .

Refer sample output for formatting specifications.

Sample Input 1:
Coward
2

Sample Output 1:
CowCow


Sample Input 2:
So
3

Sample Output 2:
SoSoSo
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=Integer.parseInt(sc.nextLine());
System.out.println(Usermaincode.display(s,n));
}
}
 
import java.util.StringTokenizer;
public class Usermaincode
{public static String display(String s,int n)
{
StringBuffer sb=new StringBuffer();
StringBuffer sb1=new StringBuffer();
if(s.length()>3)
{ sb.append(s.substring(0,3));
s=sb.toString();
}
for(int i=0;i<n;i++)
sb1.append(s);
return sb1.toString();
}
}
 
33.Sorted Array

Write a program to read a string array, remove duplicate elements and sort the array.
Note:
1.	    The check for duplicate elements must be case-sensitive. (AA and aa are NOT duplicates)
2.	    While sorting, words starting with upper case letters takes precedence.

Include a class UserMainCode with a static method orderElements which accepts the string array. The return type is the sorted array.

Create a Class Main which would be used to accept the string arrayand integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer n which is the number of elements followed by n string values.

Output consists of the elements of string array.

Refer sample output for formatting specifications.

Sample Input 1:
6
AAA
BBB
AAA
AAA
CCC
CCC

Sample Output 1:
AAA
BBB
CCC


Sample Input 2:
7
AAA
BBB
aaa
AAA
Abc
A
b

Sample Output 2:
A
AAA
Abc
BBB
aaa
b
import java.util.*;
 
public class Main
{
                public static void main(String[] args)
                {
                                int n;
                                Scanner sin = new Scanner(System.in);
                                n = sin.nextInt();
                                String[] a1 = new String[n];
                                for(int i=0;i<n;i++)
                                {
                                                a1[i] = sin.next();
                                }
                                a1 = UserMainCode.orderElements(a1);
                                for(int i=0;i<a1.length;i++)
                                                System.out.println(""+a1[i]);
}
}
import java.util.*;
 
public class UserMainCode
{
                public static String[] orderElements(String[] arr)
                {
                                HashSet<String> al=new HashSet<String>();
                                for(int i=0;i<arr.length;i++)
                                {
                                                al.add(arr[i]);                    
                                }
                                Iterator<String> itr=al.iterator();
                                 arr[] = new String[al.size()];
                                int i =0 ; 
                                while(itr.hasNext()){ 
                                                arr[i] = itr.next(); 
i++;
                                }
                                Arrays.sort(arr);
                                return arr;
                               
                               
                }
}
 

34.Pattern Matcher

Write a program to read a string and check if it complies to the pattern 'CPT-XXXXXX' where XXXXXX is a 6 digit number. If the pattern is followed, then print TRUE else print FALSE.

Include a class UserMainCode with a static method CheckID which accepts the string. The return type is a boolean value.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output should print TRUE or FALSE .

Refer sample output for formatting specifications.

Sample Input 1:
CPT-302020

Sample Output 1:
TRUE

Sample Input 2:
CPT123412

Sample Output 2:
FALSE
import java.util.*;
public class UserMainCode
{
                public static boolean matchCharacter(String s)
                {
                                boolean b=false;
                                if(s.matches("(CPT)[-]{1}[0-9]{6}"))
                                {
                                                b=true;
                                }
                                else
                                {
                                                b=false;
                                }
                               
                                return b;
                                               
                }
}

 
35.Playing with String - I

Given a string array and non negative integer (n) apply the following rules.

1. Pick nth character from each String element in the String array and form a new String.
2. If nth character not available in a particular String in the array consider $ as the character.
3. Return the newly formed string.

Include a class UserMainCode with a static method formString which accepts the string and integer. The return type is the string formed based on rules.

Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of strings and an integer (n).
Output consists of a string .
Refer sample output for formatting specifications.

Sample Input 1:
4
ABC
XYZ
EFG
MN
3

Sample Output 1:
CZG$
import java.util.Scanner;
public class Main
{
                public static void main(String[] arg)
                {
                               
Scanner s=new Scanner(System.in);
int n=Integer.parseInt(s.nextLine());
String[] sc=new String[n];
for(int i=0;i<n;i++)
{
                sc[i]=s.nextLine();
}
int a=Integer.parseInt(s.nextLine());
System.out.println(UserMainCode.get(n,sc,a));
                }
}
public class UserMainCode {
    public static String get(int n,String[] input,int a)
    {       
   StringBuffer sb=new StringBuffer();
   for(int i=0;i<n;i++)
   {
                   if(input[i].length()>=a)
                   {
                                   String a1=input[i];
                                   sb.append(a1.charAt(a-1));
                   }
                   else
 
                   {
                                   sb.append('$');
                   }
   }
return sb.toString();
   
 
    }
}

36.Regular Expression - 1

Given a string (s) apply the following rules.

1. String should be only four characters long.
2. First character can be an alphabet or digit.
3. Second character must be uppercase 'R'.
4. Third character must be a number between 0-9.

If all the conditions are satisifed then print TRUE else print FALSE.

Include a class UserMainCode with a static method validate which accepts the string. The return type is the boolean formed based on rules.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output consists of TRUE or FALSE .

Refer sample output for formatting specifications.

Sample Input 1:
vR4u

Sample Output 1:
TRUE

Sample Input 2:
vRau

Sample Output 2:
FALSE

Sample Input 3:
vrau

Sample Output 3:
FALSE
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
System.out.println(Usermaincode.display(n));
}
}
 
public class Usermaincode
{
public static String display(String s)
{
String w="FALSE";
if(s.length()==4 && (Character.isDigit(s.charAt(0))||Character.isAlphabetic(s.charAt(0)))&&s.charAt(1)=='R')
{
if(Character.isDigit(s.charAt(2)))
w="TRUE";
}
return w;
 
}
}
 
37.Regular Expression � 2 (Age Validator) (level 1 77)

Given the age of a person as string, validate the age based on the following rules.

1. Value should contain only numbers.
2. Value should be non-negative.
3. Value should be in the range of 21 to 45'.

If all the conditions are satisifed then print TRUE else print FALSE.

Include a class UserMainCode with a static method ValidateAge which accepts the string. The return type is the boolean formed based on rules.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of TRUE or FALSE .
Refer sample output for formatting specifications.

Sample Input 1:
23

Sample Output 1:
TRUE

Sample Input 2:
-34

Sample Output 2:
FALSE

Sample Input 3:
3a

Sample Output 3:
FALSE
AcB/TRUE  


38.Regular Expression � 3 (Phone Validator)

Given a phone number as string, validate the same based on the following rules.

1. Value should contain only numbers.
2. Value should contain 10 digits.
3. Value should not start with 00.

If all the conditions are satisifed then print TRUE else print FALSE.

Include a class UserMainCode with a static method validatePhone which accepts the string. The return type is the boolean formed based on rules.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of TRUE or FALSE .
Refer sample output for formatting specifications.

Sample Input 1:
9987684321

Sample Output 1:
TRUE

Sample Input 2:
0014623452

Sample Output 2:
FALSE
If(s.matches([i-9]{2}[0-9]{8})
39.String Splitter

Write a program which would accept a string and a character as a delimiter. Apply the below rules

1. Using the delimiter, split the string and store these elements in array.
2. Reverse each element of the string and convert it into lowercase.

Include a class UserMainCode with a static method manipulateLiteral which accepts the string and character. The return type is the string array formed.

Create a Class Main which would be used to accept the string and characterand call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string and character.
Output consists of a string array.

Refer sample output for formatting specifications.

Sample Input 1:
AAA/bba/ccc/DDD
/

Sample Output 1:
aaa
abb
ccc
ddd
import java.util.*;
public class UserMainCode
{
                public static void main(String[] args)
                {
                                String ip1="AAA/bba/ccc/DDD";
                                char ip2='/';
                                String op[]=loweringCasenReverseofaString(ip1,ip2);
                                for(String s:op)
                                System.out.println(s);
                }
                public static String[] loweringCasenReverseofaString(String ip1, char ip2)
                {
                                StringTokenizer t1 = new StringTokenizer(ip1,"/");
                                ArrayList<String> lst = new ArrayList<String>();
                                while(t1.hasMoreTokens())
                                {
                                                StringBuffer sb = new StringBuffer();
                                                sb.append(t1.nextToken().toLowerCase());
                                                lst.add(sb.reverse().toString());
                                }
                                String[] op = new String[lst.size()];
                                for(int i = 0;i<lst.size();i++)
                                {
                                                op[i] = lst.get(i);
                                }
                                return op;
                }
}

40.Vowel Count

Write a program to read a string and count the number of vowels present in it.

Include a class UserMainCode with a static method tellVowelCount which accepts the string. The return type is the integer giving out the count of vowels.

Note: The check is case-insensitive.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
NewYork

Sample Output 1:
2

Sample Input 2:
Elephant

Sample Output 2:
3
import java.util.*;
public class PO
                {public static void main(String[]args){
                                Scanner sc=new Scanner(System.in);
                                String s=sc.nextLine();
                               
                                int max=0;
                                int count=0;
                                for(int i=0;i<s.length();i++)
                                {
                                                char c=s.charAt(i);
                                                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                                                {
                                                                count++;
                                                }
                                }
                                if(count>max)
                                {
                                                max=count;
                                               
                                }
                System.out.print(max);}}
 

41.Playing with String - II

Write a program to accept a string array as input, convert all the elements into lowercase and sort the string array. Display the sorted array.

Include a class UserMainCode with a static method sortArray which accepts the string array. The return type is the string array formed based on requirement.

Create a Class Main which would be used to accept the string array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of strings,
Output consists of a string array.
Refer sample output for formatting specifications.

Sample Input 1:
5
AAA
BB
CCCC
A
ABCDE

Sample Output 1:
a
aaa
abcde
bb
cccc
import java.util.*;
 
public class Main {
 
                /**
                 * @param args
                 * @throws ParseException
                 */
                public static void main(String[] args)  {
                                // TODO Auto-generated method stub
                                String s1[]={"AAA","BB","CCCC","A","ABCDE"};
                                String s2[]=new String[s1.length];
                                for (int i = 0; i < s1.length; i++)
                                {
                                                s2[i]=s1[i].toLowerCase();
                                               
                                                }
                                Arrays.sort(s2);
                                for (int i = 0; i < s2.length; i++) {
                                                System.out.println(s2[i]);            
                                }
                               
                }
}
 
 
42.Median Calculation

Write a program to accept an int array as input, and calculate the median of the same.

Median Calculation Procedure:
1.	    Sort the sequence of numbers.
2.	    The total number count is odd, Median will be the middle number.

    The total number count is even, Median will be the average of two middle numbers, After calculating the average, round the number to nearest integer.

Include a class UserMainCode with a static method calculateMedian which accepts the int array. The return type is the integer which would be the median.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of integers.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
1
2
1
4
7
1
2

Sample Output 1:
2

Sample Input 2:
6
52
51
81
84
60
88

Sample Output 2:
71
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
System.out.println(""+UserMainCode.calculateMedian(a1));
}
}
import java.util.*;
 
public class UserMainCode
{
public static int calculateMedian(int[] a)
{
Arrays.sort(a);
int length = a.length;
int result=0,mid=0,midNext=0;
if((length%2) != 0)
{
mid = (length/2)+1;
result = a[mid];
}
else
{
mid = length/2;
midNext = mid+1;
float add = a[mid-1]+a[midNext-1];
float div = add/2;
result = Math.round(div);
}
return result;
 
}
}
 

43.Sequence in Array

Write a program to accept an int array as input, and check if [1,2,3] appears somewhere in the same sequence.

Include a class UserMainCode with a static method searchSequence which accepts the int array. The return type is a boolean which returns true or false.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of integers.
Output should print true or false.
Refer sample output for formatting specifications.

Sample Input 1:
9
11
-2
5
1
2
3
4
5
6

Sample Output 1:
TRUE

Sample Input 2:
6
-2
5
1
3
2
6

Sample Output 2:
FALSE
public class Main
{
                public static void main(String[] args)
                {
                                //int[] a={2,1,4,1,2,3,6,1,2,3};
                                int[] a={1,2,1,3,4,5,8};
                                System.out.println(sequenceInArray(a));
                }
                public static boolean sequenceInArray(int[] a)
                {
                                boolean b = false;
                               
                                for(int i = 0 ; i< a.length-3; i++)
                                {
                                                if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
                                                                b = true;
                                }
                               
                                return b;
                }
}
 
44.Asterisk & Characters

Write a program to read a string and return true or false based on the below rule:

1. Return true if for every '*' in the string, there are same characters both side immediately before and after the star, else return false.

Include a class UserMainCode with a static method scanStarNeighbors which accepts the string. The return type is the boolean TRUE or FALSE based on the rule.

Note: The check is case-insensitive.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of TRUE or FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
Hello*World

Sample Output 1:
FALSE

Sample Input 2:
Welcome*elizabeth

Sample Output 2:
TRUE
import java.util.*;
public class Main {
public static void main(String[] args) {
String input="Welcome*elizabeth";
System.out.println(characterCheck(input));
}
public static boolean characterCheck(String input) {
boolean b=false;
StringTokenizer t=new StringTokenizer(input,"*");
String s1=t.nextToken();
String s2=t.nextToken();
String s3=s1.substring(s1.length()-1);
String s4=s2.substring(0,1);
if(s3.equalsIgnoreCase(s4))
b=true;
return b;
}
}

45.Occurance Count

Write a program to read a string that contains a sentence and read a word. Check the number of occurances of that word in the sentence.

Include a class UserMainCode with a static method countWords which accepts the two strings. The return type is the integer giving the count.

Note: The check is case-sensitive.

Create a Class Main which would be used to accept the two strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of two strings.
Output consists of count indicating the number of occurances.
Refer sample output for formatting specifications.

Sample Input 1:
Hello world Java is best programming language in the world
world

Sample Output 1:
2

Sample Input 2:
hello world
World

Sample Output 2:
0
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
 
public class Main {
 
                public static void main(String[] args) throws IOException, ParseException  {
                                // TODO Auto-generated method stub
                                String s1="hello world hello";
                                String s2="World";
                                int c=0;
                                StringTokenizer t=new StringTokenizer(s1," ");
                                while(t.hasMoreTokens())
                                {
                                                String s3=t.nextToken();
                                                if(s3.equals(s2))
                                                                c++;
                                }
         System.out.println(c);
                }
}

46.Regular Expressions - III

Write a program to read two strings S1 & S2, compute the number of times that S2 appears in S1.

Include a class UserMainCode with a static method searchString which accepts the two strings. The return type is the integer giving the count.

Note: The check is case-insensitive.

Create a Class Main which would be used to accept the two strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of two strings.
Output consists of count indicating the number of occurances.
Refer sample output for formatting specifications.

Sample Input 1:
Catcowcat
cat

Sample Output 1:
2

Sample Input 2:
Catcowcat
catp

Sample Output 2:
0
47.Strings Processing

Write a program to read a string that contains comma separated fruit names and also a number N. Pick the nth fruit and return it. If the total number of elements are less than the number specified in N, then return the last element.

Include a class UserMainCode with a static method findFruitName which accepts the the string and the number n. The return type is the string which has the fruit name.

Create a Class Main which would be used to accept the string and integer and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string and integer.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
Apple,Banana,Orange
2

Sample Output 1:
Banana

Sample Input 2:
Apple,Banana,Orange
4

Sample Output 2:
Orange
import java.util.Scanner;
 
public class Main
{
public static void main(String args[])
{
 
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int n=sc.nextInt();
String k=UserMainCode.findFruitName(str, n);
System.out.println(k);
 
}
import java.util.StringTokenizer;
 
 
public class UserMainCode
{
public static String findFruitName(String m,int n)
{
int i=0;
String h=null;
StringTokenizer st=new StringTokenizer(m,",");
 
int max=st.countTokens();
String[] ss=new String[max];
while(st.hasMoreElements())
{
ss[i++]=st.nextToken();
}
if(n>max)
h=ss[i-1];
else
h=ss[n-1];
return h;
}
}
 
48.Proper Case

Write a program to read a string and convert the intial letter of each word to uppercase.

Include a class UserMainCode with a static method changeCase which accepts the string. The return type is the modified string.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
This is cognizant academy

Sample Output 1:
This Is Cognizant Academy
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args){
                String s1="This is cognizant academy";  
                System.out.println(capsStart(s1));
}
public static String capsStart(String s1){
                StringBuffer s5=new StringBuffer();
                StringTokenizer t=new StringTokenizer(s1," ");
                while(t.hasMoreTokens()){
                                String s2=t.nextToken();
                                String s3=s2.substring(0,1);
                                String s4=s2.substring(1, s2.length());
                                s5.append(s3.toUpperCase()).append(s4).append(" ");                }
                return s5.toString();
}
}
 

49.Length of same word

Write a program to read a string containing multiple words find the first and last words, if they are same, return the length and if not return the sum of length of the two words.

Include a class UserMainCode with a static method compareLastWords which accepts the string. The return type is the length as per problem.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
This is Cognizant Academy

Sample Output 1:
11

Sample Input 2:
Hello World Hello

Sample Output 2:
5
import java.util.*;
 
public class Main {
 
               
                public static void main(String[] args)  {
                                // TODO Auto-generated method stub
                                String s1="this is cognizant academy";
                                List<String> l=new ArrayList<String>();
                                StringTokenizer t=new StringTokenizer(s1," ");
                                while(t.hasMoreTokens())
                                {
                                                String s2=t.nextToken();
                                                l.add(s2);
                                }
                                String s3=l.get(0);
                                String s4=l.get(l.size()-1);
                                if(s3.equals(s4))
                                {
                                                int n=s3.length();
                                                System.out.println(n);
                                }
                                else
                                {
                                                int n1=s3.length();
                                                int n2=s4.length();
                                                System.out.println(n1+n2);
                                }
                }
}
 
 

50.Perfect Number

Write a program to that takes a positive integer and returns true if the number is perfect number.

A positive integer is called a perfect number if the sum of all its factors (excluding the number itself, i.e., proper divisor) is equal to its value.

For example, the number 6 is perfect because its proper divisors are 1, 2, and 3, and 6=1+2+3; but the number 10 is not perfect because its proper divisors are 1, 2, and 5, and 1+2+5 is not equal to 10

Include a class UserMainCode with a static method getPerfection which accepts the number. The return type is boolean (true / false).

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a integer.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
28

Sample Output 1:
TRUE
public class Main {
public static void main(String[] args) {
int n=28;
System.out.println(perfectNumber(n));
}
public static boolean perfectNumber(int n) {
int n1=0;
boolean b=false;
for(int i=1;i<n;i++)
if(n%i==0)
n1+=i;
System.out.println(n1);
if(n1==n)
b=true;
return b;
}
}

51.Find Digits

For a given double number with atleast one decimal value, Write a program to compute the number of digits before and after the decimal point in the following format � noOfDigitsBeforeDecimal:noOfDigitsAfterDecimal.

Note: Ignore zeroes at the end of the decimal (Except if zero is the only digit after decimal. Refer Example 2 and 3)

Include a class UserMainCode with a static method findNoDigits which accepts the decimal value. The return type is string.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a double.
Output consists of string.
Refer sample output for formatting specifications.

Sample Input 1:
843.21

Sample Output 1:
3:2

Sample Input 2:
20.130

Sample Output 2:
2:2

Sample Input 3:
20.130

Sample Output 3:
2:2
import java.util.*;
public class Main {
public static void main(String[] args) {
double d=845.69;
System.out.println(noOfDigits(d));
}
public static String noOfDigits(double d) {
int n1=0,n2=0;
String s=String.valueOf(d);
StringTokenizer t=new StringTokenizer(s,".");
String s1=t.nextToken();
String s2=t.nextToken();
n1=s1.length();
n2=s2.length();
if(s1.charAt(0)=='0')
n1=s1.length()-1;
if(n2!=1)
if(s2.charAt(s2.length()-1)=='0')
n2=s2.length()-1;
String s3=String.valueOf(n1)+":"+String.valueOf(n2);
return s3;
}
}

52.Employees & Designations

A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
    Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.
    Build a hashmap which contains the name as key and designation as value.
    You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string List of employee names who belong to that designation as output. Include this function in class UserMainCode. Display employee name's in ascending order.
Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next two values indicate the employee name employee designation. The last string would be the designation to be searched.
Output consists of a array values containing employee names.
Refer sample output for formatting specifications.

Sample Input 1:
4
Manish
MGR
Babu
CLK
Rohit
MGR
Viru
PGR
MGR

Sample Output 1:
Manish
Rohit
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int k1=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
for(int i=0;i<k1;i++)
{
String k=sc.nextLine();
String s=sc.nextLine();
hm.put(k,s);
}
String n=sc.nextLine();
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
hm1=UserMainCode.dis(hm,n);
Iterator<String> it=hm1.keySet().iterator();
 
while(it.hasNext())
{
String s2=it.next();
System.out.println(s2);
}
}
}
 
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class UserMainCode
{
public static LinkedHashMap<String,String> dis(LinkedHashMap<String,String> h1,String n)
{
 
int k=0;
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
Iterator<String>it=h1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
String s3=h1.get(s2);
if(s3.equals(n))
hm1.put(s2,s3);
}
return hm1;
}}

53.Grade Calculator

A School wants to give assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
    Read student details from the User. The details would include name, mark in the given order. The datatype for name is string, mark is float.
    You decide to build a hashmap. The hashmap contains name as key and mark as value.

BUSINESS RULE:
1. If Mark is less than 60, then grade is FAIL.
2. If Mark is greater than or equal to 60, then grade is PASS.
Note: FAIL/PASS should be in uppercase.
Store the result in a new Hashmap with name as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmap as input and returns the hashmap as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read student details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:

Input consists of student details. The first number indicates the size of the students. The next two values indicate the name, mark.

Output consists of a name and corresponding grade for each student.

Refer sample output for formatting specifications.

Sample Input 1:
3
Avi
76.36
Sunil
68.42
Raja
36.25

Sample Output 1:
Avi
PASS
Sunil
PASS
Raja
FAIL
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
 
import java.util.Scanner;
 
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
hm.put(sc.nextInt(),sc.nextInt());
}
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
tm=Usermaincode.display(hm);
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
public class Usermaincode
{
public static TreeMap<Integer,String> display (HashMap<Integer,Integer>hm)
{
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
int mark=hm.get(id);
if(mark>=80)
tm.put(id,"GOLD");
else if(mark<80 && mark>=60)
tm.put(id,"SILVER");
else if(mark<60 && mark>=45)
tm.put(id,"BRONZE");
else
tm.put(id,"FAIL");
}
return tm;
}}
54.DOB - Validation

Write a program to validate the Date of Birth given as input in String format (MM/dd/yyyy) as per the validation rules given below. Return true for valid dates else return false.
1. Value should not be null
2. month should be between 1-12, date should be between 1-31 and year should be a four digit number.
Include a class UserMainCode with a static method ValidateDOB which accepts the string. The return type is TRUE / FALSE.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
12/23/1985

Sample Output 1:
TRUE

Sample Input 2:
31/12/1985

Sample Output 2:
FALSE
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
public static void main(String[] args)
{
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(str);
System.out.println("TRUE");
}
catch(Exception e)
{
System.out.println("FALSE");
}
}
}

55.Experience Validator
 
Write a program to valiadate the experience of an employee.
    An employee who has recently joined the organization provides his year of passing and total number of years of experience in String format. Write code to validate his experience against the current date.

1) Input consists of two String first represent the year of passed out and the second string reperesent the year of experience.
2) create a function with  name validateExp which accepts two string as input and boolean as output.
3) The difference between current year and year of pass should be more than or equal to Experience
Return true if all condition are true.

Note:Conside 2015 as the current year.

Include a class UserMainCode with the static function validateExp

Create a Class Main which would be used to accept the boolean and call the static method present in UserMainCode.

Input and Output Formate:
Input consists of two Strings.
output will display true if the given data are correct.

Sample Input:
2001
5

Sample Output:
TRUE
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
 
      String s=sc.nextLine();
      String s1=sc.nextLine();
     
     System.out.print(UserMainCode.getvalues(s,s1));
    }
}
import java.util.Calendar;
 
import java.util.Date;
 
 
public class UserMainCode {
                public static boolean getvalues(String s,String s1)
                {
                                int y1=Integer.parseInt(s);
                                Date d=new Date();
                                Calendar c=Calendar.getInstance();
                                int y2=c.get(Calendar.YEAR);
                               
                                int y=Math.abs(y1-y2);
                                int e=Integer.parseInt(s1);
                                if(y>=e)
                                                return true;
                                else
                                                return false;
                               
                                }}

56.ArrayList to String Array

Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them into a string array.
    Return the array.
Include a class UserMainCode with the static method convertToStringArray which accepts an arraylist and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer denotes the size of the arraylist, the next n strings are values to the arraylist.
Output consists of an arrayas per step 4.
Refer sample output for formatting specifications.

Sample Input 1:
4
a
d
c
b
Sample Output 1:
a
b
c
d
import java.util.*;
public class Main {
public static void main(String[] args) {
                List<String> l1=new ArrayList<String>();
                l1.add("Apple");
                l1.add("Chery");
                l1.add("Grapes");
                List<String> l2=new ArrayList<String>();
                l2.add("Orange");
                l2.add("Mango");
                l2.add("Melon");
                l2.add("Apple");
                String[] s2=fruitsList(l1,l2);
                for(String s3:s2)
                                System.out.println(s3);
}
public static String[] fruitsList(List<String> l1, List<String> l2){
                List<String> l3=new ArrayList<String>();
                for(int i=0;i<l1.size();i++){
                                String s1=l1.get(i);
                               
                                if(s1.charAt(s1.length()-1)!='a' && s1.charAt(s1.length()-1)!='A' && s1.charAt(s1.length()-1)!='e' && s1.charAt(s1.length()-1)!='E')
                                                l3.add(s1); }
                for(int i=0;i<l2.size();i++){
                                String s1=l2.get(i);
                                if(s1.charAt(0)!='m' && s1.charAt(0)!='M' && s1.charAt(0)!='a' && s1.charAt(0)!='A')
                                                l3.add(s1); }
                Collections.sort(l3);
                String[] s2=new String[l3.size()];
                for(int i=0;i<s2.length;i++)
                                s2[i]=l3.get(i);
                return s2;
}
 
 
57.State ID generator

Write a program to generate the state ID.
     1)Read n Strings as input(as State Name).
     2)Create a String Array to Store the above Input.
     3)Write a function getStateId which accepts String Array as input.
     4)Create a HashMap<String,String> which stores state name as key and state Id as Value.
     5)The function getStateId returns the HashMap to the Main Class.

Include UserMainCode Class With static method getStateId which accepts String array and return a hashmap.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.


Input and Output Format:
Input Consists of an integer n denotes the size of the string array.
Output consists of an HashMap displayed in the string array order.

Sample Input 1:
3
Kerala
Gujarat
Goa

Sample Output 1:
KER:Kerala
GUJ:Gujarat
GOA:Goa
import java.util.*;
public class UserMainCode
{
                public static void main(String[] args)
                {
                                String[] s1={"goa","kerala","gujarat"};
                                putvalues(s1);
                }
                public static void putvalues(String[] s1)
                {
                                HashMap<String, String> hm = new HashMap<String, String>();
                                ArrayList<String> lst1 = new ArrayList<String>();
                                ArrayList<String> lst2 = new ArrayList<String>();
                                for(String s : s1)
                                                lst1.add(s.toUpperCase().substring(0,3));
                                for(String s : s1)
                                                lst2.add(s);
                                for(int i=0;i<s1.length;i++)
                                {
                                                hm.put(lst1.get(i),lst2.get(i));
                                }
                                //System.out.println(map);
                                for(Map.Entry<String, String> ans: hm.entrySet())
                                {
                                                System.out.println(ans.getKey()+":"+ans.getValue());
                                }
                }
}
 

58.ArrayList to String Array

Write a program that performs the following actions:

1.Read m strings as input (fruit names).
2.Create an arraylist to store the above m strings in this arraylist.
3.Read n strings as input (fruit names).
4.Create an arraylist to store the above n strings in this arraylist.
5.Write a function fruitSelector which accepts the arraylists as input.
6.Remove all fruits whose name ends with 'a' or 'e' from first arrayList and remove all fruits whose name begins  with 'm' or 'a' from second arrayList then combine the two lists and return the final output as a String array.
7.If the array is empty the program will print as �No fruit found�
Include a class UserMainCode with the static method fruitSelector which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array as per step 6. Refer sample output for formatting specifications.

Sample Input 1:
3
Apple
Cherry
Grapes
4
Orange
Mango
Melon
Apple
Sample Output 1:
Cherry
Grapes
Orange
import java.util.Collections;
import java.util.List;
public class UserMainCode{
 
public static String[]convertToString(List <String>l)
{
Collections.sort(l);
String answer[]=new String[l.size()];
for(int i=0;i<l.size();i++)
{
answer[i]=l.get(i);
}
return answer;
}
}
 
59.Elements in ArrayList

Use Collection Methods.
Write a program that takes two ArrayLists as input and  finds out all elements present either in A or B, but not in both.

Include a class UserMainCode with the static method arrayListSubtractor which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read the inputs and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array. The elements in the output array need to be printed in sorted order.

Refer sample output for formatting specifications.

Sample Input 1:
4
1
8
3
5
2
3
5
Sample Output 1:
1
8

Sample Input 2:
4
9
1
3
5
4
1
3
5
6
Sample Output 2:
6
9
import java.util.*;
 
public class Main
{
                public static void main(String[] args)
                {
                                int n,m;
                                Scanner sin = new Scanner(System.in);
                                n = sin.nextInt();
                                ArrayList<Integer> a1 = new ArrayList<Integer>(n);
                                for(int i=0;i<n;i++)
                                {
                                                int k = sin.nextInt();
                                                a1.add(k);
                                }
                                m = sin.nextInt();
                                ArrayList<Integer> a2 = new ArrayList<Integer>(m);
                                for(int i=0;i<m;i++)
                                {
                                                int k = sin.nextInt();
                                                a2.add(k);
                                }
                                int[] result = UserMainCode.arrayListSubtractor(a1,a2);
                                Arrays.sort(result);
                                for(int i=0;i<result.length;i++)
                                                System.out.println(result[i]);
}
}
import java.util.*;
 
public class UserMainCode
{
                public static int[] arrayListSubtractor(ArrayList<Integer> arrlist1,ArrayList<Integer> arrlist2)
                {
 
                                int count=0,key;
                                int max = arrlist1.size();
                                if(arrlist1.size() < arrlist2.size())
                                                max = arrlist2.size();
                                ArrayList<Integer> temp = new ArrayList<Integer>(max);
                                for(int i=0;i<arrlist1.size();i++)
                                {
                                                key = (int)arrlist1.get(i);
                                                if(arrlist2.indexOf(key) == -1)
                                                {
                                                                ++count;
                                                                temp.add(key);
                                                }
                                }
                                for(int i=0;i<arrlist2.size();i++)
                                {
                                                key = (int)arrlist2.get(i);
                                                if(arrlist1.indexOf(key) == -1)
                                                {
                                                                if(!temp.contains(key))
                                                                {
                                                                                ++count;
                                                                                temp.add(key);
                                                                }
                                                }
                                }
                                int[] result = new int[count];
                                for(int i=0;i<count;i++)
                                                result[i] = (int)temp.get(i);
                                return result;
                               
                }
}

60.Price Calculator - II

Write a small price calculator application with the below mentioned flow:

1. Read a value n indicating the total count of devices. This would be followed by the name and price of the device. The datatype for name would be String and price would be float.

2. Build a hashmap containing the peripheral devices with name as key and price as value.

3. Read a value m indicating the number of devices for which the price has to be calculated. This would be followed by device names.

4. For each devices mentioned in the array calcuate the total price.

5. You decide to write a function costEstimator which takes the above hashmap and array as input and returns the total price (float) as output with two decimal points. Include this function in class UserMainCode.

Create a Class Main which would be used to read details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:

Input consists of device details. The first number indicates the size of the devices. The next two values indicate the name,price.

This would be followed by m indicating the size of the device array. The next m values would be the device names.
Output consists of the total price in float.
Refer sample output for formatting specifications.

Sample Input 1:
3
Monitor
1200.36
Mouse
100.42
Speakers
500.25
2
Speakers
Mouse
Sample Output 1:
600.67
import java.util.*;
public class UserMainCode {
public static void main(String[] args) {
HashMap<String, String> m1=new HashMap<String, String>();
m1.put("monitor", "1200.36");
m1.put("mouse","100.42");
m1.put("speaker", "500.25");
String[] s={"speaker","mouse"};
System.out.println(getTheTotalCostOfPheripherals(m1,s));
}
public static float getTheTotalCostOfPheripherals(HashMap<String,String> m1,String[] s) {
Float f=(float) 0;
Iterator<String> i=m1.keySet().iterator();
while(i.hasNext()){
String s1=(String) i.next();
Float f1=Float.parseFloat(m1.get(s1));
for(int j=0;j<s.length;j++)
if(s[j].equals(s1))
f+=f1; }
return f;
}}
 
 
 
 
61.String Processing - ZigZag

Write a program to read a string containing date in DD-MM-YYYY format. find the number of days in the given month.

Note - In leap year February has got 29 days.

Include a class UserMainCode with a static method getLastDayOfMonth which accepts the string. The return type is the integer having number of days.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
12-06-2012
Sample Output 1:
30

Sample Input 2:
10-02-2012
Sample Output 2:
29
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
 
public class User {
 
               
                public static void main(String[] args) throws IOException, ParseException  {
                                // TODO Auto-generated method stub
                String s1="10-02-2012";
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal=Calendar.getInstance();
                Date d1=sdf.parse(s1);
                cal.setTime(d1);
                int n=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                System.out.println(n);
                }
}

62.Leap Year

Write a program to read a string containing date in DD/MM/YYYY format and check if its a leap year. If so, return true else return false.

Include a class UserMainCode with a static method isLeapYear which accepts the string. The return type is the boolean indicating TRUE / FALSE.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output consists of TRUE / FALSE.

Refer sample output for formatting specifications.

Sample Input 1:

23/02/2012

Sample Output 1:

TRUE

Sample Input 2:

12/12/2011

Sample Output 2:

FALSE
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
 
public class UserMainCode {
 
               
                public static void main(String[] args) throws IOException, ParseException  {
                               
                                String s1="23/02/2012";
                                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                                GregorianCalendar g=new GregorianCalendar();
                                StringTokenizer t=new StringTokenizer(s1,"/");
                                String s2=t.nextToken();
                                String s3=t.nextToken();
                                String s4=t.nextToken();
                                int n1=Integer.parseInt(s4);
                                Date d1=sdf.parse(s1);
                                boolean b=g.isLeapYear(n1);
                                System.out.println(b);
                                }
}

63.Largest Chunk

Write a program to read a string and return the length of the largest "chunk" in the string.
A chunk is a repetition of same character 2 or more number of times. If the given string doest not contain any repeated chunk of characters return -1.
Include a class UserMainCode with a static method getLargestSpan which accepts the string. The return type is the integer.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
This place is soooo good
Sample Output 1:
4
import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="this is soooo good";
System.out.println(maxChunk(s1));
}
public static int maxChunk(String s1) {
int max=0;
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
int n=0;
for(int i=0;i<s2.length()-1;i++)
if(s2.charAt(i)==s2.charAt(i+1))
n++;
if(n>max)
max=n;
}
return (max+1);
}
}
 

64.Largest Span

Write a program to read a integer array, find the largest span in the array.
Span is the count of all the elements between two repeating elements including the repeated elements.
Include a class UserMainCode with a static method getLargestSpan which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
6
4
2
1
4
5
7
Sample Output 1:
4
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 
 int n=sc.nextInt();
 int []a=new int[n];
 for(int i=0;i<n;i++)
 {
                 a[i]=sc.nextInt();
 }
 System.out.print(UserMainCode.display(a,n));
}}
public class UserMainCode {
                                public static int display(int[] x,int n)
                                {
                                                int gap=0,max=0;
                                                for(int i=0;i<n;i++)
                                                {
                                                                for(int j=i+1;j<n;j++)
                                                                {
                                                                                if(x[i]==x[j])
                                                                                {
                                                                                                gap=j;
                                                                                }
                                                                }
                                                                if(gap-i>max)
                                                                                max=gap-i;
                                                               
                                                }
                                                return max+1;
                                }
 
                }
 

65.Even Sum & Duplicate Elements

Write a program to read a integer array, Remove the duplicate elements and display sum of even numbers in the output. If input array contain only odd number then return -1.
Include a class UserMainCode with a static method sumElements which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
2
3
54
1
6
7
7
Sample Output 1:
62

Sample Input 2:
6
3
7
9
13
17
21
Sample Output 2:
-1
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
 
for(int i=0;i<n;i++)
{
                a[i]=sc.nextInt();
}
System.out.println(UserMainCode.display(a));
}}
 
 
import java.util.Iterator;
import java.util.LinkedHashSet;
 
public class UserMainCode {
                public static int display(int a[])
                {
                                LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
                                int s=0;
                                for(int i=0;i<a.length;i++)
                                {
                                                h1.add(a[i]);
                                }
                                Iterator<Integer> it=h1.iterator();
                                while(it.hasNext())
                                {
                                                int k=it.next();
                                                if(k%2==0)
                                                {
                                                                s=s+k;
                                                }
                                }
                                if(s>0)
                                                return s;
                                else
                                                return -1;
                                }}

66.Regular Expression - III
 
Given a string (s)  apply the following rules.
I)At least 8 characters must be present
II)At least one capital letter must be present
III)At least one small letter must be present
Iv)At least one special symbol must be present
V)At least one numeric value must be present
If the condition is satisifed then print valid else print invalid.

Include a class UserMainCode with a static method passwordValidation which accepts the string. The return type is the string.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of string (valid / invalid) .
Refer sample output for formatting specifications.
Sample Input 1:
Technology$1213
Sample Output 1:
valid
public class UserMainCode
{
      public static int display(String s)
      {
           
              if(s.matches(".*[0-9]{1,}.*") && s.matches(".*[@#$]{1,}.*") && s.length()>=8 && s.matches(".*[A-Z]{1,}.*") && s.matches(".*[a-z]{1,}.*"))
                    return 1;
              else
                    return -1;
      }}
67.Integer Factorial

Give an array of integer as input, store the numbers and their factorials in an hashmap and print the same.
Include a class UserMainCode with a static method getFactorial which accepts the integer array. The return type is the hashmap which is printed key:value.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a number denoting the size of the array and followed by the elements.
Output consists of a hashmap printed in the output format .
Refer sample output for formatting specifications.

Sample Input1:
4
2
3
5
4
Sample Output1:
2:2
3:6
5:120
4:24
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
 
import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
int []a=new int[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextInt();
}
LinkedHashMap<Integer,Integer>hm2=new LinkedHashMap<Integer,Integer>();
hm2=kapes4.display(a);
Iterator<Integer> it=hm2.keySet().iterator();
for(int i=0;i<s;i++)
{
int n=it.next();
int fac=hm2.get(n);
System.out.println(n+":"+fac);
}
}
}
 
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class kapes4
{public static LinkedHashMap<Integer,Integer> display(int[] a)
{
 
LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>();
for(int i=0;i<a.length;i++)
{
int u=1;
for(int j=1;j<=a[i];j++)
{u=u*j;}
hm.put(a[i],u);
}
return hm;
}}
68.String processing � Long + Short + Long

Obtain two strings S1,S2 from user as input. Your program should form a string of  �long+short+long�, with the shorter string inside of the longer String.
Include a class UserMainCode with a static method getCombo which accepts two string variables. The return type is the string.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two strings with maximum size of 100 characters.
Output consists of an string.

Refer sample output for formatting specifications.
Sample Input 1:
Hello
Hi
Sample Output 1:
HelloHiHello
import java.util.StringTokenizer;
 
public class User {
public static void main(String[] args){
                String s1="Hi";  
                String s2="Hello";
                System.out.println(capsStart(s1,s2));
}
public static String capsStart(String s1,String s2){
                StringBuffer s5=new StringBuffer();
                int q=s1.length();
                int w=s2.length();
                if(q>w)
                {
                                s5.append(s1).append(s2).append(s1);
                }
                else
                {
                                s5.append(s2).append(s1).append(s2);
                }
                return s5.toString();
}
}

69.Age for Voting

Given a date of birth (dd/MM/yyyy) of a person in string, compute his age as of 01/01/2015.

If his age is greater than 18, then println eligible else println not-eligible.

Include a class UserMainCode with a static method getAge which accepts the string value. The return type is the string.

Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
16/11/1991

Sample Output 1:
eligible
import java.util.Scanner;
 
public class Main {
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
String s =sc.nextLine();
System.out.println(UserMainCode.display(s));}}
 
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
public static String display(String n)
{
               
int year=0;
 String now="01/01/2015";
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
               
Date d=sdf1.parse(n);
Date d1=sdf1.parse(now);
sdf1.setLenient(false);
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
}
catch(Exception e)
{
e.printStackTrace();
}
if(year>18)
return "eligible";
else
return "not-eligible";
}}
 


	 
	 */

}
