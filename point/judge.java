package point;
import java.util.Scanner;
public class judge {
public static void main(String argsp[]) {
   Scanner sc=new Scanner(System.in);
   boolean inputtest1,inputtest2,inputtest3;
   int test1,test2,test3,avg;
   String fake1,fake2,fake3;
   System.out.println("input point1:");
   inputtest1=sc.hasNextInt();
   if(inputtest1==true) {
	   test1=sc.nextInt();
	   if(test1<1) {
		   test1=0;
	   }
   }
   else {
	   test1=0;
       fake1=sc.nextLine();
       }
   System.out.println("input point2:");
   inputtest2=sc.hasNextInt();
   if(inputtest2==true) {
	   test2=sc.nextInt();
	   if(test2<1) {
		   test2=0;
	   }
   }
   else {
       fake2=sc.nextLine();
       sc.next();
	   test2=0;
}
   System.out.println("input point3:");
   inputtest3=sc.hasNextInt();  
   if(inputtest3==true) {
	   test3=sc.nextInt();
	   if(test3<1) {
		   test3=0;
	   }
   }
   else {
       fake3=sc.nextLine();
	   test3=0;
       }
   avg=(test1+test2+test3)/3;
   if(avg>=60&&avg<=100) {
	   System.out.println("pass:"+avg);
   }
   if(avg<60) {
	   System.out.println("failed:"+avg);
   }
   if(avg>100) {
	   System.out.println("full mark:"+100);
   }
}
}
//簡易的平均分數判斷，基礎