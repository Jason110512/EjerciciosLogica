import java.util.Scanner;
public class  ValidarNumeros

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
        if (a != 0) {
          
        
            
          
         if (a %2 == 0) {
            System.out.println("numero PAR");
         }
        
          else{
                System.out.println("NUMERO IMPAR");
          }
        
        }
          }
        }while(d>0);
} 
}

