package com.demo.object;

public class ItmDemo {
		int x=10; //instance var
		static int y=20; //static var
		
		static void staticmethod() {
			ItmDemo i=new ItmDemo();
		System.out.println(i.x);
		System.out.println(y);
		}
		public void show() {
			x++;
			y++;
			System.out.println(x);
			System.out.println(y);
		}
		void demo() {
			int x=200;
			System.out.println(x);
			int y=400;
			System.out.println(y);
		}
		public static void main(String args[]) {
			ItmDemo i1=new ItmDemo();
			ItmDemo i2=new ItmDemo();
			System.out.println(i1.x);
			System.out.println(y);
			i1.show();
			i2.show();
			i1.demo();
		}
	
}
