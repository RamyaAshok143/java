import java.util.Scanner;
public class EvenNubr {
public static void main(String[] args) {
System.out.println("Enter Even Numbers ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    if(i%2==0) 
       {
	System.out.print(i+" ");
	   }
	}
     }
}              