package Thursday_lab;

	public class LibraryInterfaceDemo {

		public static void main(String[] args) {
			
			KidUsers kid= new KidUsers();
			AdultUsers adult= new AdultUsers();
			
			kid.setAge(10);
			kid.registerAccount();
			kid.setAge(18);
			kid.registerAccount();
			System.out.println();
			kid.setBookType("Kids");
			kid.requestbook();
			kid.setBookType("Fiction");
			kid.requestbook();
			
			
			System.out.println();
			
			adult.setAge(5);
			adult.registerAccount();
			adult.setAge(23);
			adult.registerAccount();
			System.out.println();
			adult.setBookType("Kids");
			adult.requestbook();
			adult.setBookType("Fiction");
			adult.requestbook();

		}

	}