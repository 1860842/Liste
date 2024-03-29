public class Main {
    public static void main(String[] args) {
        // Test d'un vecteur vide
        Liste data = new Liste();
        System.out.println(data.getNbElements());
        System.out.println(data.estVide());
        // Test d'un vecteur avec 3 éléments
        data.ajouter(10);
        data.ajouter(20);
        data.ajouter(30);
        System.out.println("\n"+data);
        System.out.println(data.getNbElements());
        System.out.println(data.estVide());
        data.ajouter(40);
        System.out.println("\n"+data.getNbElements()+"\n");
        // Test d'ajout à index spécifique
        data.ajouter(5,-1);
        data.ajouter(5,0);
        System.out.println(data);
        // Ajouter les valeurs d'un Vecteur à un autre
        Liste data2 = new Liste();
        data2.ajouter(50);
        data.ajouter(data2);
        System.out.println("\n"+data);
        // Verifier la valeur d'un index du Vecteur
        System.out.println("\n"+data.getElementAt(2));
        System.out.println(data.getElementAt(6));
        // Donner l'index de la valeur recherchée
        System.out.println("\n"+data.trouver(0));
        System.out.println(data.trouver(50));
        // Vérifie si tous les éléments de test sont dans data
        Liste test = new Liste();
        test.ajouter(5);
        test.ajouter(10);
        test.ajouter(30);
        System.out.println("\n"+data.trouverTout(test));
        // test.trouverTout(data); = false;
        // Effacer un élément selon son index
        System.out.println("\n"+data.effacerAt(-1));
        data.effacerAt(0); // Effacer 5
        System.out.println(data);
        // Efface tous les elements d'un Vecteur présent dans un autre
        data.effacerTout(test); // Enlève 10 et 30 de data
        System.out.println("\n"+data);
        // Efface un élément recherché dans le Vecteur
        data.effaceElement(40);
        System.out.println("\n"+data);
        // Remplace un élément à l'index indiqué par la valeur indiquée
        data.replace(35,1);
        System.out.println("\n"+data);
        // Inverse deux données du tableau selon les index données
        data.inverse(0,1);
        System.out.println("\n"+data);
        // Efface tous les éléments d'un Vecteur
        data.effacerTout();
        System.out.println("\n"+data);
    }
}