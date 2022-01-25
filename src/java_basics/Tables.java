package java_basics;

import java.util.Scanner;


public class Tables {

	public static void main(String[] args) {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter the number for mutiplication table: ");
		int Num=myobj.nextInt();
		for(int ind=1;ind<=10;ind++)
		{
			System.out.println(Num+" * "+ind+" = "+(Num*ind));
			
		}

	}

}
