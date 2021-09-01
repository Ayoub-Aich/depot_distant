package newpackage;

public class TestUser {

	public boolean TestString(String s) {
		if(s.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public boolean TestEmail(String e) {
		if(e.indexOf("@") == -1) {
			return false;
		}
		return true;
	}
	
	public boolean TestAge(int a) {
		if(a <= 18) {
			return false;
		}
		return true;
	}
	
	public boolean TestPass(String p) {
		if(p.length() <= 5) {
			return false;
		}
		return true;
	}
	
	//public boolean TestingUser(int id, String nom, String prenom, String email, String password, int age, String grade) {
	public boolean TestingUser(User u) {
		
		if(TestString(String.valueOf(u.getId())) && TestString(u.getNom()) && TestString(u.getPrenom()) && TestString(u.getEmail()) && TestString(u.getPassword()) && TestString(String.valueOf(u.getAge())) && TestString(u.getGrade()) && TestEmail(u.getEmail()) && TestAge(u.getAge()) && TestPass(u.getPassword())) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		User u1 = new User(1, "Aich", "Ayoub", "ayoubaich1994@gmail.com", "formation", 27, "Cadre");
		User u2 = new User(2, "Aich", "", "ayoubaich1994@gmail.com", "formation", 27, "Cadre");
		User u3 = new User(3, "Aich", "Ayoub", "ayoubaich1994gmail.com", "formation", 27, "Cadre");
		User u4 = new User(4, "Aich", "Ayoub", "ayoubaich1994@gmail.com", "formation", 16, "Cadre");
		User u5 = new User(5, "Aich", "Ayoub", "ayoubaich1994@gmail.com", "form", 27, "Cadre");
		
		TestUser tu = new TestUser();
		
		if(tu.TestingUser(u1)) {
			System.out.println("User 1 est valide");
		}
		if(tu.TestingUser(u2)) {
			System.out.println("User 2 est valide");
		}
		if(tu.TestingUser(u3)) {
			System.out.println("User 3 est valide");
		}
		if(tu.TestingUser(u4)) {
			System.out.println("User 4 est valide");
		}
		if(tu.TestingUser(u5)) {
			System.out.println("User 5 est valide");
		}
		
	}
	
}
