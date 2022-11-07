import java.util.Scanner;
public class marks {

    public static void main(String [] nrg)
    {
        int a,b,c,d,e,sum;
        Scanner sc=new Scanner (System.in);
       System.out.print("Enter the mathes marks =");
       a=sc.nextInt();
       System.out.print("Enter the mathes marks =");
       b=sc.nextInt();
       System.out.print("Enter the mathes marks =");
       c=sc.nextInt();
       System.out.print("Enter the mathes marks =");
       d=sc.nextInt();
       System.out.print("Enter the mathes marks =");
       e=sc.nextInt();
       sum=a+b+c+d+e;
       System.out.print("Sum="+sum);
       if(299<sum)
       {
        System.out.print("\n You are first");
       }
       else
       {
        System.out.print("\n You are Second");
       }
    }
    
}
