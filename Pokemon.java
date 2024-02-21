public class Pokemon {
    //declaration des proprietes qui seront heritees ensuite j'ai mis le modificateur d'acces sur protected pour que les classes nom pokemon vont heriter ces proprietes

    protected static String nom;
    protected static String type;
    protected static Integer point_vie;
    protected static String cri;
    protected static String attaque;


    //initialisation des avec un constructeur
    public Pokemon (String nom, String type, Integer point_vie, String cri, String attaque){
        this.nom = nom;
        this.type = type;
        this.point_vie = point_vie;
        this.cri = cri;
        this.attaque = attaque;
    }


}



