import java.util.Scanner;
class Vowel_Consonant
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Character :");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("This is a Vowel");
}
else
{
System.out.println("This is Consonant");
}
}
}