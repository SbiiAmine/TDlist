import java.util.Vector;

public class EspritVector {
    private Vector<Etudiant> liste = new Vector<>();

    public void ajouter(Etudiant e) {
        liste.add(e);
    }

    public void afficher() {
        for (Etudiant e : liste) {
            System.out.println(e);
        }
    }
}
