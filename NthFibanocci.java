import java.util.*;
public class NthFibanocci{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		 fib(n);
	}
	public static void fib(int n){
		int a=0,b=1,c;
		   if(n<=1){
			   System.out.println(n);
		   }
		   for(int i=2;i<=n;i++){
			   c=a+b;
			   a=b;
			   b=c;
		   }
		   System.out.println(b);
	   }
}
