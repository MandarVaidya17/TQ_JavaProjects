package com.inheritance;

public class Demo1 {
		private int a=90;
		int b=80;
		protected int c=100;
		public int d=20;
		
		private void show() {
			System.out.println("bye");
		}
		void display() {
			System.out.println("hello");
		}
		protected void print() {
			System.out.println("welcome");
		}
		public void demo() {
			System.out.println("ok");
		}
		
		public static void main(String[] args) {
			Demo1 d=new Demo1();
			System.out.println(d.a);
			System.out.println(d.b);
			System.out.println(d.c);
			System.out.println(d.d);
			
			d.show();
			d.display();
			d.print();
			d.demo();
			
		}
		
}
