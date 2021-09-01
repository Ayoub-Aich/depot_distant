package newpackage;

public class User {
	
	int id;
	String nom;
	String prenom;
	String email; String password;
	int age;
	String grade;
	//getset
	
	public User(int i, String n, String p, String e, String pass, int a, String g) {
		
		this.id = i;
		this.nom = n;
		this.prenom = p;
		this.email = e;
		this.password = pass;
		this.age = a;
		this.grade = g;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGrade() {
		return grade;
	}
	
}

