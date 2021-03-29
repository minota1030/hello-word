import java.util.Scanner;
class ciclos
 {
      public static void main(String h [])
    {
       Scanner lea=new Scanner(System.in);
       int k_personas,k_matrix=0,k_kevin=0,k_sandro=0,k_ivan=0,voto=0;
       
       

       
       k_personas=1;
       
       while (k_personas<=5)
       {
       
              //menu
       System.out.println("____");
       System.out.println("_REINADO_ ");
       System.out.println("_____");
       System.out.println("____");
       System.out.println("_1...MATRIX____ ");
       System.out.println("_2...KEVIN_____ ");
       System.out.println("_3...SANDRO____ ");
       System.out.println("_4...IVAN______ ");
       System.out.println("________________");
       System.out.println("_ESCOJA________ ");
       System.out.println("____");
       System.out.println("_VOTANTE # "+ k_personas+"__");
       
       voto=lea.nextInt();
       
       switch(voto)
       {
        case 1:
        
          System.out.println("_VOTO POR MATRIX_ ");
          k_matrix++;
        
        
        break;
        
          case 2:
        
          System.out.println("_VOTO POR kevin_ ");
          k_kevin++;
        
        
           break;
           
           case 3:
        
          System.out.println("_VOTO POR CANTANTE_ ");
          k_sandro++;
        
        
            break;
            
           case 4:
        
          System.out.println("_VOTO POR ivan_ ");
          k_ivan++;
        
        
           break;
          default:
           System.out.println("NO LE GUSTO NINGUN CANDIDATO");
           
       } //fin del case
      

       
       
           System.out.println("De ");
          //k++ es el de siempre ,k_personas= k_personas+1;
           k_personas++;//incrementa de 1 en 1 ,k_personas+=2 
      }
      
       System.out.println("_VOTO POR MATRIX_ "+k_matrix);
       System.out.println("_2...KEVIN_ "+k_kevin);
       System.out.println("_3...SANDRO_ "+k_sandro);
       System.out.println("_4...IVAN_ "+k_ivan);
                
         
        

   }
 }