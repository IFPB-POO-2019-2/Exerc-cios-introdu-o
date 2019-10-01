public class Perfeito{

    public static void main(String[] args){

        int numero = 6;

        System.out.println(numero+" é perfeito? "
            +ehPerfeito(numero));

    }

    public static boolean ehPerfeito(int numero){
        int cont = 0;

        for(int i=1; i<numero;i++){
            if(numero % i == 0){
                cont += i;
            }
        }

        return cont == numero;
    }

}