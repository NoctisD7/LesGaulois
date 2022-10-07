package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
		}
		
		
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("parle");
		asterix.frapper();
		
		
		
		}
		


}
