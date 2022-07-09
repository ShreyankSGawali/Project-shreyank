public class armstrong
{

public static void main(String[] args)

{
      int no=371;
int rev=0;
int rem=0;
int x=no;

// hi hello


while(no!=0)
{
rem=no%10;
rev=rev+rem*rem*rem;
no=no/10;
}
if(x==rev)
{
System.out.println("armstrong number "+rev);
}

}
}