package codevita;

public class freq {
	public static void main(String args[])
	{
		int arr[]= {0,1,2,1,0,2,1,0,2};
		int dp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			dp[arr[i]]++;
		}
		int v=0;
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (dp[arr[i]] < dp[arr[j] ]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                } 
	                else if (dp[arr[i]] == dp[arr[j]] && arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
