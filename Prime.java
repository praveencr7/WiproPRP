import java.util.*;
public class Prime{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		    int n =sc.nextInt();
		    int a=0,b=0;
			int count=0;
			int i;
			for(i=2;a!=n;i++){
				for(int k=2;k<i;k++){
					if(i%k==0){
						count++;
						break;
					}
				}
				if(count==0){
					b=i;
					a++;
				}
				else{
					count=0;
				}
			}
				System.out.println(b);
		}
	}
