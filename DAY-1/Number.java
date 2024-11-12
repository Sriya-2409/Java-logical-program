import java.util.Scanner;
class Number
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number you want to check:");
n = sc.nextInt();
if (n>0)
{
          System.out.println("The given number  "+n+" is positive") ;
}
else if(n<0)
{
        System.out.println("The given number "+n+" is Negative");
}
else{
    System.out.println("The given number "+n+" is neither Positive nor Negative");
}
}
}
