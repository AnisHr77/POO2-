import java.util.*;
import java.util.Arrays;

    public class Test implements Comparator {
    public static void main(String[] args) throws CloneNotSupportedException {

        Perssone p1 = new Perssone("walid", "laa", 19);
        Perssone p2 = new Perssone("walid", "lab",20);
        Perssone p3 = new Perssone("walid", "lac", 30);

        Perssone[] personnes = {p1, p2, p3};


        System.out.println("Sorting using anonymous inner classes:");
        Arrays.sort(personnes, new Comparator() {
            public int compare(Object pp1,Object pp2) {;
                Perssone z1=(Perssone)pp1;
                Perssone z2=(Perssone)pp2;
                int result = z1.getNom().compareTo(z2.getNom());
                if (result == 0) {
                    return z1.getPrenom().compareTo(z2.getPrenom());
                }
                return result;
            }
        });
        printArray(personnes);


        Arrays.sort(personnes, ()->{
                ( z3,z4) -> {

            int result = z3.getNom().compareTo(z4.getNom());
            if (result == 0) {
                return z3.getPrenom().compareTo(z4.getPrenom());
            }
            return result;
        }});
        printArray(personnes);


        Arrays.sort(personnes, Perssone().NomPrenomComparator::compare);
    }



    private static void printArray(Perssone[] personnes) {
        for (Perssone p : personnes) {
            System.out.println(p);
        }
    }
}