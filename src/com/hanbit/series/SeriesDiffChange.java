package com.hanbit.series;

public class SeriesDiffChange {
    public static void main(String[] args) {
	int i = 0, d = 1, sum = 1;

	while (true) {
	    i++;
	    d+=i;
	    sum+=d;
	    if (i == 19) {
		break;
	    }
	    
	}

	System.out.printf("======================================\n" + "1+2+4+7+11+16+22.... 증가하는 수열의 20번째 합 \n"
		+ "======================================\n" + "%d \n" + "======================================\n",
		+sum);
    }

}
