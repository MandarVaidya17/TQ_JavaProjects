package com.operators;

public class IncDec10 {
		public static void main(String[] args) {
			int x=001,y=010,z=100;
			int i= --x + y++ - z-- - --z + ++y - --x + y-- - --x;
			System.out.println("x="+x);//-2
			System.out.println("y="+y);//9
			System.out.println("z="+z);//98
			System.out.println("i="+i);//-167
		}
}
