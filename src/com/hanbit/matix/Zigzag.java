package com.hanbit.matix;

/**
@FILE   : Zigzag.java
@DATE   : 2016. 12. 29.
@AUTHER : Park Seoung-soo
@STORY  :  1   2   3   4   5
 10   9   8   7   6
 11  12  13  14  15
 20  19  18  17  16
 21  22  23  24  25
 * */
public class Zigzag {
    public static void main(String[] args) {
        int length = 5; // 배열 길이
        int[][] arr = new int[length][length];
        int k = 0; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열
        for(i=0;i<arr.length;i++){
            System.out.println("");
            for(j=0;j<arr[i].length;j++){
        	k+=1;
        	arr[j][i]=k;
        	if(){
        	    
        	}
        	System.out.printf("%d\t",arr[j][i]);
            }
        }
    }
}
