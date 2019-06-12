/*
		Input Format:
		The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.
		Output Format:
		If the input value is not within the range, print "Invalid Input".
		In the first line of the output, print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.
		If the first line of the output is YES, the next line of the output consists of 2 integers separated by a space. In case of distinct integers, the smallest number should appear first.
		
		Sample Input 1
		8
		
		Sample Output 1
		YES
		4 4
		
		Sample Input 2
		11
		
		Sample Output 2
		NO
		
		Sample Input 3
		124
		
		Sample Output 3
		Invalid Input
*/
import java.util.*;
public class WaterMelon{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N ;
        if(W>=100){
            System.out.println("invalid input");
        }
        else {
            if(W%2!=0){
                System.out.println("No");
            }
            else if(W%2==0){
                System.out.println("Yes");
                N=W/2;
                if(N%2==0){
                    System.out.println(N+" "+N);
                }
                else{
                    int t1 = N-1;
                    int t2 = N+1;
                    System.out.println(t1+" "+t2);
                }
            }
        }
    }
}
