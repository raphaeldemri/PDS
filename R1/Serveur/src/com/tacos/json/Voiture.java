import java.util.ArrayList;


public class Voiture {

	private int annee;
	private int kilometrage;
	private String constructeur;
	private String modele;
	private String immatriculation;
	private boolean fonctionne;
	private ArrayList <Composant> pieceAchanger;
	
	
	
	public Voiture(int annee, int kilometrage, String constructeur,
			String modele, String immatriculation, boolean fonctionne,
			ArrayList<Composant> pieceAchanger) {
		super();
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.constructeur = constructeur;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.fonctionne = fonctionne;
		this.pieceAchanger = pieceAchanger;
	}
	
	
	

	
	
}
