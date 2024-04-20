import java.util.Scanner;
public class  NumerosIguales

{
    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a, b, c,d;
        do {
            System.out.println("1:calcular numeros ");
            System.out.println("0:cerrar programa");
            d=option.nextInt();
            if (d==1) {
            
          System.out.println("ingres un numero ");
          a=option.nextInt();
          System.out.println("ingres un numero ");
          b=option.nextInt();
         if (a==b) {
            System.out.println("numeros iguales");
         }
          else{
                System.out.println("no son iguales");
          }

            }
        }while(d>0);
} 
}
