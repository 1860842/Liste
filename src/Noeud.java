public class Noeud {
    public int valeur;
    public Noeud prochain;

    public Noeud(int valeur){
        this.valeur = valeur;
    }
    public int getValeur() {
        return valeur;
    }
    public Noeud getProchain(){
        return null;
    }
    public String toString() {
        return String.valueOf(valeur);
    }
}
