import java.util.LinkedHashSet;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random randInt = new Random();
        LinkedHashSet<String> matches = new LinkedHashSet<>();
        matches.add("Galatasaray");
        matches.add("Fenerbahce");
        matches.add("Basaksehir");
        matches.add("Besiktas");
        matches.add("BursaSpor");

        LinkedHashSet<String> copyMatches = new LinkedHashSet<>();
        LinkedHashSet<String> copyMatches2 = new LinkedHashSet<>();
        for (int i = 0; i < matches.size(); i++) {
            copyMatches.add((String) matches.toArray()[i]);
            }

        for (int i = 0; i < (matches.size()/2); i++) {
            int rand1 = randInt.nextInt(0, copyMatches.size());
            copyMatches2.add((String) copyMatches.toArray()[rand1]);
            copyMatches.remove((String) copyMatches.toArray()[rand1]);

        }

        copyMatches2.add(null);

        for (int i = 0; i < copyMatches.size(); i++) {
            if (copyMatches2.toArray()[i] != null) {
                System.out.println(copyMatches.toArray()[i] + " vs " + copyMatches2.toArray()[i]);
            }
            else {
                System.out.println(copyMatches.toArray()[i] + " vs " + "BAY");
            }
        }
    }
}
