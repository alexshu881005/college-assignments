package dice;
import java.io.*;
import java.util.*;
import java.util.Random;
public class Test {
   public static void main(String args[])throws Exception {
	Random rand=new Random();
	int num=0;
	int one=0,two=0,three=0,four=0,five=0,six=0;
	for(int times=0;times<30000;times++) {
	num=rand.nextInt(6);
	if(num==0)
	{
		one++;
	}
	if(num==1)
	{
		two++;
	}
	if(num==2)
	{
		three++;
	}
	if(num==3)
	{
		four++;
	}
	if(num==4)
	{
		five++;
	}
	if(num==5)
	{
		six++;
	    }
      }

	System.out.println("1的次數為"+one);
	System.out.println("2的次數為"+two);
	System.out.println("3的次數為"+three);
	System.out.println("4的次數為"+four);
	System.out.println("5的次數為"+five);
	System.out.println("6的次數為"+six);
   }
}
//這個程式就蠻基礎的，計算骰子骰到各個數字次數為多少，其實可以就這基礎上嘗試去修改機率倍率，應用在抽卡或21點等，有空再去做應用修改
