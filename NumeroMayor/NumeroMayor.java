import java.util.Scanner;
class NumeroMayor
 {   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        int a,b,c;
do{
    System.out.println("1:calcular el numero mayor ");
    System.out.println("0:cerrar programa");
    c=option.nextInt();
    if (c==1){     
         System.out.println("ingresa el valor ");
         a=option.nextInt();
         System.out.println("ingresa el valor ");
         b=option.nextInt();
         if (a>b)
         {
            System.out.print("NUMERO MAYOR");
            System.out.println(""+a);
         }
         else if (a==b){
            System.out.println("los numeros son iguales a mi no me engaña");
         }
         else{
            System.out.print("NUMERO MENOR");
            System.out.println(""+b);
         }
           }
        }while( c>0);
           }
           }
