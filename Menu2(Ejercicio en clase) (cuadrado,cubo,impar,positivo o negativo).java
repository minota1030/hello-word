import java.util.Scanner;
class Menu2
{
   public static void main(String e[])
   {
      Scanner lea = new Scanner (System.in);
      int opcion=0,numero;
      double  cubo, cuadrado;
      
      System.out.println("ESCOJA UN NUMERO");
      numero = lea.nextInt();
      System.out.println("\n EJERCICIOXD");
      System.out.println("________________________________________");
      System.out.println("___________MENU DE OPCIONES_____________");
      System.out.println("____ 1  ..... EL CUBO __________________");
      System.out.println("____ 2  ..... IMPAR       ______________");
      System.out.println("____ 3  ..... EL CUADRADO ______________");
      System.out.println("____ 4  ..... POSITIVO O NEGATIVO ______");
      System.out.println("_____5 ..... DAR UN MENSAJE_____________");
      System.out.println("________________________________________");
      System.out.println("___________ESCOJA UN NUMERO_____________");

      
      switch(opcion)
      {
         case 1:
               cubo = Math.pow(numero,3); 
               System.out.println("EL CUBO DEL NUMERO: " + numero + " Es: " + cubo );
               break;
         case 2:
               if((numero % 2) != 0)
               {
                  System.out.println("____ EL NUMERO "+numero+" ES IMPAR ______________");
               }
               break;
         case 3:
               cuadrado = Math.pow(numero,2); 
               System.out.println("EL CUADRADO DEL NUMERO: "+numero+ " ES IMPAR __________");
               break;
         case 4:
         
               if( numero > 0)
               {
                  System.out.println("____ EL NUMERO "+numero+" ES POSITIVO");
               }
               else
               {
                  System.out.println("____ EL NUMERO "+numero+" ES NEGATIVO");
               }

               break;         
         case 5:
               System.out.println("HASTA LA VISTA BABY ");
               break;
          default:
               System.out.println("ESE DIA NO EXISTE, ESCOGIO MAL DIA ");
               break;
      }

     }
     } 