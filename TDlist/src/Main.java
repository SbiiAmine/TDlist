import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> noms = new ArrayList<>();

        noms.add("amine");
        noms.add("karim");
        noms.add("sonia");

        System.out.println("noms " + noms);

        System.out.println("Premier nom" + noms.get(0));

        noms.set(1, "yassine");
        System.out.println("apres modification " + noms);

        noms.remove("sonia");
        System.out.println("apres suppression" + noms);

        for (String nom : noms) {
            System.out.println("- " + nom);
        }
    }
}