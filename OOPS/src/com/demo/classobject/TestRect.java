package com.demo.classobject;
	class Rectangle{
		double len;
		double br;
		
		public void color() {
			System.out.println("Color instace method");
		}
	}
public class TestRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.color();
		System.out.println(r1.br);
		System.out.println(r1.len);
	}

}
