package Primenumber;

import java.util.Scanner;

public class Prime {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int input1=0,input2=0,k=0,p=100;
	boolean judge1,judge2;
	//宣告
    judge1=sc.hasNextInt();
    if(judge1==true) {
    	input1+=sc.nextInt();
     if(input1<1||input1>100) {
    	 sc.next();
    	 System.out.println("error");
    	}
    }
	//判斷輸入1是否符合1~100
    else {
		  	System.out.println("error");
    }
    judge2=sc.hasNextInt();
    if(judge2==true) {
    	input2+=sc.nextInt();
    	if(input2<1||input2>100) {
       	 System.out.println("error");
       	}
    //同樣判斷輸入2是否3符合1~100
    }
    else {
        System.out.println("error");   
    } 
    
    for(int count1=input1;count1<input2;count1++) {
       	if(isPrime(count1)) {
       		System.out.print(count1+"\r");
       	}
    }//物件導向isPrime，迴圈假設如果與isPrime數字相同就輸出
   
 }
private static boolean isPrime(int count1) {
	for(int j=2;j<count1;j++) {
		if(count1%j==0) {
			return false;
		}
	}
	return true;
}
}
