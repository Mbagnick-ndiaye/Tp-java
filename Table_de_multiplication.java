public class Table_de_multiplication{
    public static void main(String[] args) {
        int nombre=2;
        int resultat;
        System.out.println("Entrer un nombre entier:");
        System.out.println("La table de multiplication de"+nombre+":");
           for (int i = 1; i <=10; i++){
            resultat=nombre*i;
            System.out.println(nombre+"x"+i+"="+resultat);
    }
  }
}