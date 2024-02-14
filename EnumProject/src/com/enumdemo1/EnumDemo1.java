package com.enumdemo1;

class ConstatntDirec{
	static final String NORTH="NORTH";
}
public class EnumDemo1 {
	public enum Direction{NORTH,EAST,WEST,SOUTH};
	public static void main(String[] args) {
			Direction d1=Direction.NORTH;
			System.out.println(d1);
			
			Direction d2=Direction.NORTH;
			
			if(d1==d2) {
				System.out.println("Equal");
			}
			if(d1.equals(d2)) {
				System.out.println("Equal");
			}
			System.out.println("-----------------------");
			for(Direction d: Direction.values()) {
				System.out.println(d);
			}
			
			System.out.println("-----------------------");
			
			System.out.println(Direction.valueOf("NORTH"));
			System.out.println(Direction.SOUTH.ordinal());
		}
}
