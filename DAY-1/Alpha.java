import java.util.Scanner;
class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Values:");
char ch=sc.next().charAt(0);
if(ch=='a' && ch=='z'||ch=='A'&& ch=='Z')
{
System.out.println("This is a Alphabet");
}
else if(ch>='0' && ch<='9')
{
System.out.println("This is Number");
}
else
{
System.out.println("This is Special Character");
}
}
}