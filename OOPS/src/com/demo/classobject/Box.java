package com.demo.classobject;

public class Box {
	int volume;
	int height=10;
	int width=12;
	int length=15;
	
	public void setValue(int h,int l,int w) {
		height=h;
		length=l;
		width=w;
	}
	
	public void VolumeBox() {
		volume=height*width*length;
		System.out.println(volume);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		b1.VolumeBox();
		b1.setValue(10, 10, 9);
		b1.VolumeBox();
		
	}

}
