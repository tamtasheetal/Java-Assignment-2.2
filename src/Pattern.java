public class Pattern 
{
public static void main(String[]args)
{
int j;
for(int i=1; i<=3; i++) //for 4 loops
{
for(j = 1; j<=4-i; j++) //for spaces
System.out.print(" ");
for(j = 1; j <= 2*i-1; j++)
if(j<=i)
System.out.print((char)(char)(j+64)+""); //for printing values
else
System.out.print((char)(char)(2*i-j+64)+"");
System.out.println(" "); //for line break
}
{
for(int k=2; k>= 1; k--) //for Reverse Pattern
{for(int l = 1; l <= 4-k; l++)
System.out.print(" "); //for spaces
for(int l = 1; l <= 2*k-1; l++)
if(l<=k)
System.out.print((char)(char)(l+64)+""); 
else
System.out.print((char)(char)(2*k-l+64)+""); //for output
System.out.println(); //for line break
}
}
}
}
