import java.util.Scanner;
class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number :");
int num=sc.nextInt();
if(num%5==0 && num%11==0)
System.out.println("This Number is Divisible by 5 and 11");
else
System.out.println("This Number is NotDivisible by 5 and 11");
}
}