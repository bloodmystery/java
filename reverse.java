import java.util.Scanner;
public class reverse 
{ 
public static void main(String[] args)
{ 
String st;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
str=sc.nextLine(); 
System.out.println("Reverse of a String '"+st+"' is :");
for(int j=st.length();j>0;--j) 
{ 
System.out.print(st.charAt(j-1));
} } }
