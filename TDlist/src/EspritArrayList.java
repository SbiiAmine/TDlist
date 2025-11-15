import java.util.ArrayList;

public class EspritArrayList {
    private ArrayList<Etudiant> liste = new ArrayList<>();

    public void ajouter(Etudiant e) {
        liste.add(e);
    }

    public void afficher() {
        for (Etudiant e : liste) {
            System.out.println(e);
        }
    }
}
