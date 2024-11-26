package codevita;
import java.util.*;
public class subset {
	public static void main(String args[])
	{
		int arr[]= {3,2,1};
		List<List<Integer>>a=new ArrayList<>();
		
		int n=arr.length;
		int sub=1<<n;
		for(int i=0;i<sub;i++)
		{
			List<Integer>a1=new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))>0)
				{
					a1.add(arr[j]);
				}
			}
			a.add(a1);
		}
		System.out.print(a);
	}

}
