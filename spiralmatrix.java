//package training;
//import java.util.*;
//public class spiralmatrix {
//	public static void main(String args)
//	{
//		int n=3;
//        int[][] spiral=new int[n][n];
//        int value=1;
//        int r1=0;
//        int r2=n-1;
//        int c1=0;
//        int c2=n-1;
//        while(value<=n*n) {
//            for(int i=c1;i<=c2;i++) {
//                spiral[r1][i]=value++;
//            }
//            r1++;
//            for(int i=r1;i<=r2;i++) {
//                spiral[i][c2]=value++;
//            }
//            c2--;
//            for(int i=c2;i>=c1;i--) {
//                spiral[r2][i]=value++;
//            }
//            r2--;
//            for(int i=r2;i>=r1;i--) {
//                spiral[i][c1]=value++;
//            }
//            c1++;
//        }
//        for(int i=0;i<n;i++) {
//            for (int j=0;j<n;j++) {
//                System.out.printf("%2d ",spiral[i][j]);
//            }
//            System.out.println();
//        }
//
//	}
//	}