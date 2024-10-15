public class Moyenne{
    public static void main(String[] args) {
    int note_francais=11 ;
    int note_histoie_geographie=14 ;
    int note_anglais= 10;
    int note_mathematique=19;
    int note_pc= 19;
    int note_svt=19 ;
    int note_eps=19 ;
    int note_totale=note_francais+note_histoie_geographie+note_anglais+note_mathematique+note_pc+note_svt+note_eps;
    int moyenne=note_totale/7;
        System.out.println("Votre nombre de point est:"+note_totale+"");
        System.out.println("Vous avez une moyenne de "+moyenne+"");
               if(moyenne>10){
                System.out.println("Vous avez une mention passable");
                }else if(moyenne>12){
                System.out.println("Felicitation vous avez une mention assez bien");
                }else if(moyenne>14){
                System.out.println("Felicitation vous avez une mention bien");
                }else{
                System.out.println("Felicitation vous avez une mention tres bien");
            }
    }
}  