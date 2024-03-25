public class Liste {
    private Noeud premier;
    private int nbElements;

    public Liste(){
        premier = null;
        nbElements = 0;
    }
    public Liste(Noeud premier){
        this.premier = premier;
        nbElements++;
    }

    public String toString() {
        String str = "[";
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            str += courant + ",";
        }
        // Sans le toString dans Noeud on ecrit
        // str += courant.valeur;
        return str + "]";
    }


    public int getNbElements() {
        return nbElements;
    }


    public boolean estVide() {
        return nbElements == 0;
    }

    public int getElementAt(int indexRechercher) {
        return getNoeudAt(indexRechercher).valeur;
        /* // Version longue
        int indexActuel = 0;
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if (indexActuel == indexRechercher)
                return courant.getValeur();
            indexActuel++;
        }
        return -1;  */
    }
    // Private car utilisé que dans la Classe
    private Noeud getNoeudAt(int indexRechercher) {
        //return tableau[index];
        int indexActuel = 0;
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if (indexActuel == indexRechercher)
                return courant;
            indexActuel++;
        }
        return null;
    }

    // Ajoute a la fin
    public void ajouter(int valeur) {
        //tableau[nbElements++] = valeur;
        Noeud dernier = null;
        // La boucle ne s'arrête pas tant qu'il n'atteint pas le dernier Noeud, donc s'sarrete a null
        for (Noeud courant = premier; courant != null; courant = courant.prochain)
            // Le dernier noeud prend la valeur du noeud courant
            dernier = courant;
        // premier == null veut dire que la Liste est vide
        if(premier == null) {
            premier = new Noeud(valeur);
        } else {
            // le Noeud après le dernier prend la valeur du nouveau Noeud
            dernier.prochain = new Noeud(valeur);
        }
        nbElements++;
    }


    public void ajouter(int valeur, int index) {
        Noeud precedent = getNoeudAt(index - 1);
        Noeud nouveau = new Noeud(valeur);
        if(index == 0) {
            nouveau.prochain = premier;
            premier = nouveau;
        } else {
            nouveau.prochain = precedent.prochain;
            precedent.prochain = nouveau;
        }
        nbElements++;
       /* index--;
        Noeud precedent = null;
        Noeud nouveau = new Noeud(valeur);
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {

            if(index-- == 0) {
                precedent = courant;
                precedent.prochain = nouveau;
                nouveau.prochain = precedent.prochain;
                break;
            }
            nbElements++;
        }*/
    }
    public void remplacer(int valeur, int index) {
        int indexActuel = 0;
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if(indexActuel == index)
                courant.valeur = valeur;
            indexActuel++;
        }
    }
    public void inverser(int valeur, int index) {
        Noeud precedent = getNoeudAt(index - 1);
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if (index == 0) {
                courant.prochain = premier;
                premier = courant;
            } else {
                courant.prochain = precedent.prochain;
                precedent.prochain = courant;
            }
        }
    }


    public void ajouter(Liste autre) {
        for (int i = 0; i < autre.getNbElements(); i++)
            this.ajouter(autre.getElementAt(i));
    }
    /*

    public int trouver(int valeur) {
        for (int i = 0; i < nbElements; i++)
            if (tableau[i] == valeur)
                return i;
        return -1;
    }

    public boolean trouverTout(Liste autre) {
        for (int i = 0; i < autre.getNbElements(); i++)
            if (this.trouver(autre.getElementAt(i)) == -1)
                return false;
        return true;
    }

    public boolean effacerAt(int index) {
        if (index < 0 || index > nbElements)
            return false;

        for (int i = index; i < nbElements; i++)
            tableau[i] = tableau[i + 1];
        nbElements--;
        return true;
    }

    public boolean effacerTout(Liste autre) {
        boolean modifie = false;
        for (int i = 0; i < autre.getNbElements(); i++) {
            int valeurCherchee = autre.getElementAt(i);
            int indexTrouve = this.trouver(valeurCherchee);
            if (indexTrouve != -1) {
                effacerAt(indexTrouve);
                modifie = true;
            }
        }
        return modifie;
    }

    public void effacerTout() {
        //effacerTout(this);
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }
 */
}
