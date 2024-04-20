import java.util.Scanner;
class Operaciones {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        double d,e;
        int a;
        do {
            System.out.println("\nIngresa la opcion correcta");
            System.out.println("1: suma "); 
            System.out.println("2: resta ");
            System.out.println("3: Divicion ");
            System.out.println("4: Multiplicacion ");
            System.out.println("5: Numeros iguales");
            System.out.println("6:Numeros en bucle decendientes ");
            System.out.println("7:Numeros en bucle  ");
            System.out.println("8: Numeros acomodados");
            System.out.println("9:Numero mayor");
            System.out.println("10:Validar numero ");
            System.err.println("11: Area de circulo");
            System.out.println("12:Area del triangulo");
            System.out.println("13:Area del cuadrado");
            System.out.println("0: cerrar programa");
            a = option.nextInt();
            int b,c;
            double z=3.1416;
            switch (a) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la suma es: ");
                    System.out.println(b+c);
                break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la resta es: ");
                    System.out.println(b-c);
                break;
                case 3:
                System.out.println("divicion");
                System.out.println("ingresa 1 numero entero");
                          b=option.nextInt();
                        System.out.println("ingresa otro numero entero");
         c=option.nextInt();

         System.out.println("el resultado es: ");
         System.out.print(c/b);
         break;
                case 4:
                System.out.println("Multiplicacion");
                System.out.println("ingresa 1 numero entero");
                          b=option.nextInt();
                        System.out.println("ingresa otro numero entero");
         c=option.nextInt();

         System.out.println("el resultado es: ");
         System.out.print(c*b);
         break;
         case 5:
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
          break; 
          case 6:
          System.out.println("ingres un numero ");
          c=option.nextInt();
          for(int i=c ;i>=0;i--)
            {
                System.out.println(""+i);
            }
            break;
            case 7:
              
          System.out.println("ingres un digino ");
          c=option.nextInt();
          for(int i=0 ;i<=c;i++)
            {
                System.out.println(""+i);
            }
            break;
            case 8:
            System.out.println("Primer numero: ");
            a=option.nextInt();
            System.out.println("Segundo numero: ");
            b=option.nextInt();
            System.out.println("Tercer numero: ");
            e=option.nextInt();
            
            if(a<b && a<e){
               if (b<e) {
                System.out.println("primero "+ a );
                System.out.println("segundo "+ b );
                System.out.println("tercero "+ e );
                   
            }
               else{
                System.out.println("primero "+ a );
                System.out.println("segundo "+ e );
                System.out.println("tercero "+ b );
               }
            }

            if(b<a && b<e){
                if (a<e) {
                 System.out.println("primero "+ b );
                 System.out.println("segundo "+ a );
                 System.out.println("tercero "+ e );
                    
             }
                else{
                 System.out.println("primero "+ b );
                 System.out.println("segundo "+ e );
                 System.out.println("tercero "+ a );
                }
             }
             if(e<a && e<b){
                if (a<b) {
                 System.out.println("primero "+ e );
                 System.out.println("segundo "+ a );
                 System.out.println("tercero "+ b );
                    
             }
                else{
                 System.out.println("primero "+ e );
                 System.out.println("segundo "+ b );
                 System.out.println("tercero "+ a );
                }
             }

                    break;
                    case 9:
                    System.out.println("ingresa el valor ");
                    c=option.nextInt();
                    System.out.println("ingresa el valor ");
                    b=option.nextInt();
                    if (c>b)
                    {
                       System.out.print("NUMERO MAYOR");
                       System.out.println(""+c);
                    }
                    else if (c==b){
                       System.out.println("los numeros son iguales a mi no me engaña");
                    }
                    else{
                       System.out.print("NUMERO MENOR");
                       System.out.println(""+b);
                    }
                    break;
                    case 10:
                         
          System.out.println("ingres un numero ");
          c=option.nextInt();
        if (c != 0) {
          
        
            
          
         if (c %2 == 0) {
            System.out.println("numero PAR");
         }
        
          else{
                System.out.println("NUMERO IMPAR");
          }
        
        }
                    break;
                    case 11:
                    
                         System.out.println("ingresa el valor del radio");
                         a=option.nextInt();
                
                         System.out.print("el resultado es: ");
                         System.out.println((a*a)*z
                         );
                    break;
                    case 12:
                    System.out.println("ingresa el valor de la base");

                    c=option.nextInt();
                    System.out.println("ingresa el valor de la altura");
           
                    b=option.nextInt();
           
                    System.out.print("el resultado es: ");
                    System.out.println((c*b)/2);
                    break;
                    case 13:
                    System.out.println("ingresa el valor del lado");

                    c=option.nextInt();
           
                    System.out.print("el resultado es: ");
                    System.out.println(c*c);
                default:
                    break;
                
            }
        } while (a>0);
    }
}