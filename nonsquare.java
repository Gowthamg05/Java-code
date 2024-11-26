package codevita;
import java.util.*;
public class nonsquare {
	 public static boolean isSquareFree(int num) {
	        for (int i = 2; i * i <= num; i++) {
	            if (num % (i * i) == 0) { 
	                return false;
	            }
	        }
	        return true;
}
	public static void main(String args[])
	{
		int num=20;int count=0;
		List<Integer>l=new ArrayList<>();
		for(int i=2;i<=num;i++)
		{
			//double k=Math.sqrt(i);
			if(num%i==0&&isSquareFree(i))
			{
				l.add(i);
				count++;
			}
		}
		System.out.println(l);
		System.out.println(count);
		

}}
