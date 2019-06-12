import java.util.Scanner;
public class StringReplace {
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  String s1 = sc.nextLine();
	  char[]ch=s1.toCharArray();
	  for(int i=0;i<ch.length;i++){
		  if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
			  ch[i]='"';
		  }
	  }
	  System.out.println(ch);
	  String s2 = sc.next();
	  char[]ch1=s2.toCharArray();
	  for(int i=0;i<ch.length;i++){
		  if(ch1[i]!='a'&&ch1[i]!='e'&&ch1[i]!='i'&&ch1[i]!='o'&&ch1[i]!='u'&&ch1[i]!='A'&&ch1[i]!='E'&&ch1[i]!='I'&&ch1[i]!='O'&&ch1[i]!='U'){
			  ch1[i]='*';
		  }
  }
	  System.out.println(ch1);
      String s3 =sc.next();
      String s4=s3.toLowerCase();
      System.out.println(s4);
}
}
