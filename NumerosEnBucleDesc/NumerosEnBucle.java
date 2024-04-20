import java.util.Scanner;
public class  NumerosEnBucle

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
          for(int i=a ;i>=0;i--)
            {
                System.out.println(""+i);
            }
          

            }
        }while(d>0);
} 
}
