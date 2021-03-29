import java.util.Scanner;
class Ciclos
{
   Scanner digite_mi_pez = new SCanner (System.in);
   int k_personas, k_matriz=0, k_kevin=0, k_sandro=0, k_ivan=0;voto=0;
   
   k_personas = 1;
   while(k_personas <= 7 )

   
   System.out.println("___________________________")
   System.out.println("_______REINADO_____________")
   System.out.println("___________________________")
   System.out.println("____1. MATRIZ    __________")
   System.out.println("____2. KEVIN     __________")
   System.out.println("____3. SANDRO    __________")
   System.out.println("____4. IVAN      __________")
   System.out.println("___________________________")
   System.out.println("________ESCOJA    _________")
   System.out.println("___________________________")
   System.out.println("____VOTANTE # "+ k_personas +"___");
   voto = digite_mi_pez.nextInt();
   if (voto)
   {
      case 1
         System.out.println(" VOTO POR LA MATRIX ")
         k_matriz++;
         break;
      case 2
         System.out.println(" VOTO POR LA KEVIN ")
         k_kevin=1;
         break;
      case 3
         System.out.println(" VOTO POR LA SANDRO ")
         k_sandro = k_sandro + 1
         break;
      case 4
         System.out.println(" VOTO POR LA IVAN")
         k_ivan = k_ivan +1;
         break;
         default:
         System.out.println(" NO LE GUSTA CUALQUIERA")
         break;
   }     //FIN CASE
   
   k_personas = 1;
   while(k_personas <= 7)
   {
      k_persona++
      //incrementa de uno en uno k_personas+=1;
      //k_personas = k_personas + 1; k_personas++ k_personas+=1;
     } //FIN MIENTRAS
     
     System.out.println(" VOTOS POR LA MATRIX "+ k_matriz);
     System.out.println(" VOTOS KEVIN "+ k_kevin);
     System.out.println(" VOTOS POR EL CANTANTE "+ k_sandro);
     System.out.println(" VOTOS POR IVAN "+ k_ivan);
   }
 }
 