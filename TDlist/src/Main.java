import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestionUniversity gu = new GestionUniversity();

        Etudiant e1 = new Etudiant(1, "amine", "1");
        Etudiant e2 = new Etudiant(2, "khalil", "2");
        Etudiant e3 = new Etudiant(3, "feres", "3");

        gu.ajouterEtudiant(e1);
        gu.ajouterEtudiant(e2);
        gu.ajouterEtudiant(e3);

        gu.displayEtudiants();

        System.out.println("recherche e2 " + gu.rechercherEtudiant(e2));

        System.out.println("recherche amine : " + gu.rechercherEtudiant("amine"));

        gu.supprimerEtudiant(e1);
        System.out.println("suppression e1");
        gu.displayEtudiants();

        System.out.println("tri id");
        gu.trierEtudiantsParId();
        gu.displayEtudiants();

        System.out.println("tri nom");
        gu.trierEtudiantsParNom();
        gu.displayEtudiants();
    }
}
