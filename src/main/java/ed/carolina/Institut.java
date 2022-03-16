package ed.carolina;

public class Institut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = "Carolina";
		p.cognoms = "Torregrosa";
		p.cicleFormatiu = "1º DAM";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
