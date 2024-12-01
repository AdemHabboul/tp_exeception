class Factorielle {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Erreur : Vous devez passer un entier en paramètre.");
            }

            int nbEntiers = 0;
            try {
                nbEntiers = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Erreur : Veuillez entrer un entier valide.");
            }

            if (nbEntiers < 0) {
                throw new IllegalArgumentException("Erreur : La factorielle n'est pas définie pour les entiers négatifs.");
            }

            int factorielle = 1;
            for (int i = 2; i <= nbEntiers; i++) {
                factorielle *= i;
            }

            System.out.println("La factorielle de " + nbEntiers + " est : " + factorielle);

        } catch (IllegalArgumentException | NumberFormatException e) {
     
            System.out.println(e.getMessage());
        } catch (Exception e) {
          
            System.out.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }
    }
}
