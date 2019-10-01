public class Fatorial{
    public static void main(String[] args){

        System.out.println("Fatorial: "+fatorial(5));

    }

    public static double fatorial(int numero){

        if(numero <= 1){
            return 1;
        } else{
            return numero * fatorial(numero-1);
        }

    }

}