import java.util.* ;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Perssone array [] ={

                new Perssone ('Anis','Hadj Ramdane',19);
                new Perssone ('Abdallah','Abdiche',19);
                new Perssone ('Walid','Lafdal',19);

        }
        Arrays.sort(array ,new Perssone.NomPrenomComparator());
        System.out.println(Array.toString({array}));
    }
    Arrays.sort(array ,new Compare(){
        public int Compare ()

    });
}
