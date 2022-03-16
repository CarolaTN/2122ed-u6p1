package ed.carolina;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nom = "Carolina";
		p.cognoms = "Torregrosa";
		p.cicleFormatiu = "1º DAM";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
