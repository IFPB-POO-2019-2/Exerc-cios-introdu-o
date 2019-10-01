public class Equacao{
    public static void main(String[] args){
        double a = 2;
        double b = 3;
        double c = -2;

        double delta = Math.pow(b,2)-(4*a*c);

        if(delta <0){
            System.out.println("Não existem raízes");
        }else if(delta == 0){
            System.out.println("Uma Raíz: "+((-b)/(2*a)));
        }else{
            System.out.println("Raiz 1: "+
                ((-b+Math.sqrt(delta))/(2*a)));
            System.out.println("Raiz 2: "+
                ((-b-Math.sqrt(delta))/(2*a)));
        }

    }
}