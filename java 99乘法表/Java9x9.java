package java9x9;

public class Java9x9 {
	public static void main(String[] args) {
	      int i=1,k;
	      while(i<=9){
	      int j=1;
	      while(j<=9){
	    	  k=i*j;
	    	  System.out.print(i+"x"+j+"=");
	    	  if(k<10){
	    		  System.out.print(" "+k+" ");
	          }
	    	  else
	          {
               System.out.print(k+" ");
              }
	          j++;
	          }
              System.out.println();
              i++;
}
}
}
//基礎的99乘法表利用java呈現