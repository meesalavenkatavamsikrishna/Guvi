import java.util.*;
import java.util.Scanner;
public class Positive
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n>0)
System.out.println("Positive");
else if(n<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}
