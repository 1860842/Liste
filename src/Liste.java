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
    public boolean estVide() {
        return nbElements == 0;
    }

    public int getElementAt(int indexRechercher) {
        if(indexRechercher >= 0 && indexRechercher < nbElements)
            return getNoeudAt(indexRechercher).valeur;
        else
            return -1;
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
        if(index < 0 || index > nbElements)
            System.out.println("Index invalide");
        else {
            Noeud precedent = getNoeudAt(index - 1);
            Noeud nouveau = new Noeud(valeur);
            if (index == 0) {
                nouveau.prochain = premier;
                premier = nouveau;
            } else {
                nouveau.prochain = precedent.prochain;
                precedent.prochain = nouveau;
            }
            nbElements++;
        }
    }
    public void ajouter(Liste autre) {
        for (int i = 0; i < autre.getNbElements(); i++) {
            int elementToAdd = autre.getElementAt(i);
            this.ajouter(elementToAdd);
        }
    }
    public void replace(int valeur, int index) {
        int indexActuel = 0;
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if(indexActuel == index)
                courant.valeur = valeur;
            indexActuel++;
        }
    }
    public void inverse(int pos1, int pos2) {
        Noeud position1 = getNoeudAt(pos1);
        Noeud position2 = getNoeudAt(pos2);
        int valeur;
        valeur = position1.valeur;
        position1.valeur = position2.valeur;
        position2.valeur = valeur;
        }


    public int trouver(int valeur) {
        int index = 0;
        for (Noeud courant = premier; courant != null; courant = courant.prochain) {
            if (courant.valeur == valeur)
                return index;
            else
                index++;
        }
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

        if (index == 0) {
            premier = premier.prochain;
        } else {
            Noeud precedent = getNoeudAt(index - 1);
            precedent.prochain = precedent.prochain.prochain;
        }
        nbElements--;
        return true;
    }
    public boolean effaceElement(int valeur) {
        Noeud courant = premier;
        Noeud precedent = null;

        // Parcourir la liste
        while (courant != null) {
            // Si la valeur du nœud courant correspond à la valeur spécifiée
            if (courant.valeur == valeur) {
                // Si le nœud à supprimer est en tête de liste
                if (precedent == null) {
                    premier = courant.prochain;
                } else {
                    // Sinon, ajuster la référence du nœud précédent
                    precedent.prochain = courant.prochain;
                }
                nbElements--; // Décrémenter le nombre d'éléments
                return true; // Indiquer que l'élément a été supprimé
            }
            // Avancer dans la liste
            precedent = courant;
            courant = courant.prochain;
        }
        // Si la valeur n'a pas été trouvée dans la liste
        return false;
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
        // Efface la tête de la liste et donc plus de noeuds
        premier = null;
        nbElements = 0;
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

}
