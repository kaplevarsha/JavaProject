package test;

public class StringExample {

	public static void main(String[] args) {
		System.out.println("Alan");
		System.out.println("Alan Sugae");

		String Fname = "Alan";
		String Lname = "Sugae";

		System.out.println(Fname);
		System.out.println(Lname);

		String Fullname = Fname + " " + Lname;
		System.out.println(Fullname);
		System.out.println(Fullname.length());
		System.out.println(Fullname.toUpperCase());
		System.out.println(Fullname.toLowerCase());
		System.out.println(Fullname.charAt(Fullname.length() - 1));
		String Newname = Fullname.replace("Sugae", "Parker");
		System.out.println(Newname);
		boolean check = Newname.contains("Parker"); 
		System.out.println(check);
		
		char c = 'A';
		System.out.println(Newname.indexOf(c));
		boolean check1 = Newname.contains("Parker"); 
		System.out.println(check1);
		
		char d = 'Z';
		System.out.println(Newname.indexOf(d));



	}

}
