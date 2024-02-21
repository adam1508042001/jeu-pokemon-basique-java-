public class main {

    public static void main(String[] args) {
        affichage();

        //creation une instance (un objet raavus)
        Ravuus ravuus = new Ravuus("RAVUUS", "humain", 100, "Ravuuuuuuuuuus", "stream");
        ravAffichage();
    }

    public static void affichage() {
        System.out.println("salut c'est la fonction systemeoutprint ");
        System.out.println("salut c'est la println");
    }



    public static void ravAffichage(){
        System.out.println("Nom : " + Ravuus.nom);
        System.out.println("Type : " + Ravuus.type);
        System.out.println("Point de vie : " + Ravuus.point_vie);
        System.out.println("Cri : " + Ravuus.cri);
        System.out.println("Attaque : " + Ravuus.attaque);
    }



}
