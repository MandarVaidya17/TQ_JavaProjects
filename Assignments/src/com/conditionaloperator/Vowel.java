package com.conditionaloperator;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		
		System.out.println("Enter alphabet");
		c=sc.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o'||c=='u'|| c=='A' ||c=='E'|| c=='I'|| c=='O'|| c=='U') {
			System.out.println("Alphabet is vowel");
		}else if(c>='a' && c<='z' || c>='A' && c<='Z') {
			System.out.println("Alphabet is Consonet");
		}
		else {
			System.out.println("its special character");
		}
	}

}
