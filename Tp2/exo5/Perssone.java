import java.util.*;

public class Perssone implements Cloneable,Comparable{

        private String nom;
        private String prenom;
        private int age;
        public static int count = 0;
        private int id;

        public Perssone(String nom, String prenom, int age) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
            this.id = count++;
        }
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public int getAge() {
            return age;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setAge(int age) {
            this.age = age;
        }



        public String toString () {
            return "Nom: " + nom + " Prénom: " + prenom + " Age: " + age + " ID: " + id;
        }

        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

        public static class NomPrenomComparator implements Comparator{
            public int compare(Object pp1, Object pp2) {
                Perssone p1=(Perssone)pp1;
                Perssone p2=(Perssone)pp2;
                int result = p1.nom.compareTo(p2.nom);
                if (result == 0) {
                    return p1.prenom.compareTo(p2.prenom);
                }
                return result;
            }
        }


            public int compareTo(Object otherr) {
                Perssone other=(Perssone) otherr ;
                return  this.age-other.age ;

        }


    }




