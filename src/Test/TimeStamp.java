package Test;

import java.util.Scanner;

public class TimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sample");
		int sample=sc.nextInt();
		if(sample==0)
		{
			System.out.println("yellow");
		}
		if(sample==1)
		{
			System.out.println("green");
		}
		else {
			System.out.println("sample is missing");
		}
	}

}
