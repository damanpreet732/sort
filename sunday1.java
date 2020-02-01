import java.util.*;
public class sunday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       while(a>0)
       {
    	   int size=sc.nextInt();
    	   int b[]=new int[size];
    	   for(int i=0;i<size;i++)
    	   {
    		   b[i]=sc.nextInt();
    	   }
    	   Arrays.sort(b);
    	   for(int i=0;i<size;i++)
    	   {
    		   System.out.print(b[i]);
    	   }
    	   a--;
       }
	}

}
