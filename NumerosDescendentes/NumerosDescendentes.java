
import java.util.Scanner;
public class NumerosDescendentes
{
    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a, b, c,d;
        do {
            System.out.println("1:calcular numeros ");
            System.out.println("0:cerrar programa");
            d=option.nextInt();
            if (d==1) {
            
            System.out.println("Primer numero: ");
            a=option.nextInt();
            System.out.println("Segundo numero: ");
            b=option.nextInt();
            System.out.println("Tercer numero: ");
            c=option.nextInt();
            
            if(a<b && a<c){
               if (b<c) {
                System.out.println("primero "+ a );
                System.out.println("segundo "+ b );
                System.out.println("tercero "+ c );
                   
            }
               else{
                System.out.println("primero "+ a );
                System.out.println("segundo "+ c );
                System.out.println("tercero "+ b );
               }
            }

            if(b<a && b<c){
                if (a<c) {
                 System.out.println("primero "+ b );
                 System.out.println("segundo "+ a );
                 System.out.println("tercero "+ c );
                    
             }
                else{
                 System.out.println("primero "+ b );
                 System.out.println("segundo "+ c );
                 System.out.println("tercero "+ a );
                }
             }
             if(c<a && c<b){
                if (a<b) {
                 System.out.println("primero "+ c );
                 System.out.println("segundo "+ a );
                 System.out.println("tercero "+ b );
                    
             }
                else{
                 System.out.println("primero "+ c );
                 System.out.println("segundo "+ b );
                 System.out.println("tercero "+ a );
                }
             }

            }
        }while(d>0);
} 
}
