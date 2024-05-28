package test;
import java.util.Scanner;
public class Findsize {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    boolean input1,input2,input3,input4;
    int num1,num2,num3,num4;
    double fake1,fake2,fake3,fake4;
    input1=sc.hasNextInt();
    if(input1==true) {
 	   num1=sc.nextInt();
 	  if(num1<0) {
		   num1=0;
	   }
    }
    else {
        fake1=sc.nextDouble();
        num1=0;
        }
    
    input2=sc.hasNextInt();
    if(input2==true) {
 	   num2=sc.nextInt();
 	  if(num2<0) {
		   num2=0;
	   }
    }
    else {
        fake2=sc.nextDouble();
 	    num2=0;
 }
    
    input3=sc.hasNextInt();
    if(input3==true) {
 	   num3=sc.nextInt();
 	  if(num3<0) {
		   num3=0;
	   }
 
    }
    else {
        fake3=sc.nextDouble();
 	    num3=0;
        }
    input4=sc.hasNextInt();
    if(input4==true) {
 	   num4=sc.nextInt();
 	  if(num4<0) {
		   num4=0;
	   }
    }
    else {
        fake4=sc.nextDouble();
 	    num4=0;
        }
    
    int max,min;
    max=Math.max(num1, Math.max(num2, Math.max(num3,num4)));
    min=Math.min(num1, Math.min(num2, Math.min(num3,num4)));
    System.out.println("smallest:"+min);
    System.out.println("largest:"+max);
}
}
//這個看起來更像是剛學習JAVA的時候入門寫的，使用Math套件判斷最大最小值，判斷寫的很粗略