import java.util.Scanner;
class Solutionsqrt
{
static int mySqrt(int x)
{
if (x == 0 || x == 1)
return x;
int i = 1, result = 1;
while (result <= x)
{
i++;
result = i * i;
}
return i - 1;
}
public static void main(String[] args)
{
int x;
System.out.println("Enter your number: ");
Scanner sc= new Scanner(System.in);
x=sc.nextInt();
System.out.print(mySqrt(x));
}
}