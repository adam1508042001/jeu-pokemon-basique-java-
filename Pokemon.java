public abstract class Pokemon {
    //declaration des proprietes qui seront heritees ensuite j'ai mis le modificateur d'acces sur protected pour que les classes nom pokemon vont heriter ces proprietes

    protected  String nom;
    protected  String type;
    protected Integer point_vie;
    protected  String cri;
    protected  Integer attaque;
    protected Integer degats;





    //initialisation des avec un constructeur
    protected Pokemon (String nom, String type, Integer point_vie, String cri, Integer attaque){
        this.nom = nom;
        this.type = type;
        this.point_vie = point_vie;
        this.cri = cri;
        this.attaque = attaque;

    }


    public void inflige_degats(Pokemon pokemon ){
        int degat = this.attaque;
        int point_vie = pokemon.point_vie;
        int points_vie_restants = point_vie - degat;
        pokemon.point_vie = points_vie_restants;

    }
    public String toString(){
        return
                "nom=" + nom + "\n" +
                "type=" + type + "\n" +
                " point_vie=" + point_vie + "\n" +
                " cri=" + cri + "\n" +
                "attaque=" + attaque + "\n" ;
    }
}



