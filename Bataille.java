public class Bataille {

    private Pokemon pokemon1;
    private Pokemon pokemon2;

    private   String nom;
    protected Integer degats;

    public Bataille(String nom, Pokemon p1, Pokemon p2){
        this.nom= nom;
        this.pokemon1 = p1;
        this.pokemon2 = p2;

    }



    public void combat(){
        System.out.println(pokemon2);
        pokemon1.inflige_degats(pokemon2);
        System.out.println(pokemon2);

    }

    @Override
    public String toString() {
        return this.pokemon1.toString() + "\n" + this.pokemon2.toString();
    }
}
