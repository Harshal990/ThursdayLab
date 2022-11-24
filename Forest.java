package OopsConcept;


 class Animal {
		
		public void eat() {
			System.out.println("Animal is eating");
		}
		
		public void sleep() {
			System.out.println("Animal is sleeping");
		}
	}

 class Bird extends Animal{
		@Override
		
		public void eat() {
			super.eat();
			System.out.println("override eat");
		}
		@Override
		public void sleep() {
			super.sleep();
			System.out.println("override sleep");

		}
		public void fly() {
			System.out.println("Animal is flying");
		}
	}
 
 
	public class Forest {
	public static void main(String[] args) {

		Animal ani=new Animal();
		ani.eat();
		ani.sleep();
		
		
		Bird bi=new Bird();
				
		bi.eat();
		bi.sleep();
		bi.fly();

	}
}