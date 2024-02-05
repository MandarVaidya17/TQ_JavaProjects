package com.demo.classobject;

class Area{
	
	int length;
	int width;
	int area;
	public void setVal(int l,int w) {
		length=l;
		width=w;
	}
	
	public void area() {
		area=length*width;
		System.out.println(area);
	}
	
}

public class AreaRect {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1=new Area();
		a1.setVal(10, 9);
		a1.area();
	}

}
