package codevita;
import java.util.*;
public class swapinindex
{
	public static void main(String[] args) {
		
		int n=123456;
		String str="rltdrrtrs2s1";
		char c[]=str.toCharArray();
		
		int size=(int)Math.log10(n)+1;
		int arr[]=new int[size];
		int i=arr.length-1;
		while(n!=0){
		    int rem=n%10;
		    arr[i--]=rem;
		    n=n/10;
		}

		int right=0;

        int j=0;
        while(j<c.length)
        {
		    if(c[j]=='r'){
		        ++right;
		        j++;
		    }
		    else if(c[j]=='l'&&j!=0){
		        --right;
		        j++;
		    }
		    else if(c[j]=='t'){
		        arr[right]=arr[right]+1;
		        j++;
		    }
		    else if(c[j]=='d')
		    {
		        arr[right]=arr[right]-1;
		        j++;
		    }
		    else if(c[j]=='s'){
		        if(j+1<=c.length){
		        char k=c[++j];
		        int store=Integer.parseInt(String.valueOf(k));
		      
		       if (store >= 1 && store <= arr.length && right != store - 1)
		       {
		      int temp=arr[right];
		       arr[right]=arr[store-1];
		      arr[store-1]=temp;
		       }
		        }
		     
		      j++;
		     
		      

		    }
		    
		}
		String s="";
		for(int p=0;p<arr.length;p++)
		{
		  s+=arr[p];
		}
		int x=Integer.parseInt(s);
		System.out.println(x);
	
	}
}
