import java.util.Scanner;
class SolutionPalin
{  
public static void main(String args[])
{
int r,sum=0,temp,n;
System.out.print("Enter your number: ");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;    
}    
if(temp==sum)    
System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");    
}  
} 