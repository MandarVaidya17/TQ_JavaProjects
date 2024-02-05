package com.covariant;
	class A{
		public A display() {
			return new A();
			
		}
	}

	class B extends A{
//		public B display() {
//			return new B();
//		}
		
		public A display() {
			return new B();
		}
	}

	public class CovarDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
				B obj=new B();
				A obj1=new A();
				obj1=obj.display();
		}

	}


