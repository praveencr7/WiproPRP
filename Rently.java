/*
WE HAVE TO GET A STRING AND AN INTEGER WITH TWO DIGITS
AND WE HAVE TO SEPERATE FIRST AND LAST DIGIT OF INTEGER
THE OUTPUT SHOULD BE
I/P:
Today is a Nice day
41
o/p:
iNce doTday
*/
import java.util.*;
class SplitExample{  
public StringBuilder find(int a,String s2){
    StringBuilder sb=new StringBuilder();
    if(s2.length()%2==0){
int length= s2.length()/2;
sb = new StringBuilder(s2.substring(0,length));
sb.reverse();
sb.append(s2.substring(length));
}
else{
    int length= s2.length()/2;
    sb = new StringBuilder(s2.substring(0,length+1));
sb.reverse();
sb.append(s2.substring(length));
}
return sb;
}
}
public class Test{
    public static void main(String args[]){ 
    Scanner sc =new Scanner(System.in);
    String s1=sc.nextLine();  
    StringBuilder sb = new StringBuilder();
    int n =sc.nextInt();
    int a = n/10;
    int b=n%10;
    SplitExample obj = new SplitExample();
    String[] words=s1.split("\\s");
    sb.append(obj.find(a,words[a-1]));
    sb.append(" ");
    sb.append(obj.find(b,words[b-1]));
     System.out.println(sb);
    
}
}
