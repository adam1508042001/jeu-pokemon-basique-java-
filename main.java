public class main {



    public static void affichageObjet(Object object) {
        System.out.println(object.toString());
    }

    public static void main(String[] args) {


        //test d'affichage
        //creation d'une instance (un objet raavus)
        Ravuus ravuus = new Ravuus("RAVUUS", "humain", 100, "Ravuuuuuuuuuus", 56);

        //creatoin d'une instance pour rhinastoc
        Rhinastoc rhinastoc = new Rhinastoc("Rhinastoc", "sol", 100, "rhina rhina", 41);

        //creation objet bataille
        Bataille bataille = new Bataille("navarine", ravuus, rhinastoc);

        System.out.println("PRESENTATION DES POKEMONS ");
        System.out.println("\n\n");


//appeler la bataille
        bataille.combat();

//affichage de mes pokemons
        System.out.println(rhinastoc.toString());
        affichageObjet(ravuus);
        System.out.println("la bataille navarine:");
        affichageObjet(bataille);

    }



}
