import java.util.Scanner;
class Acueducto
{
   public static void main(String h[])
   {
      Scanner digite = new Scanner(System.in);
      int litros, cargo_basico,costo_litros=0;
      double total=0, descuento=0;
      cargo_basico=20000;
      System.out.println("ACUEDUCTO EL CHORRITO DE ANDERSON"); 
      System.out.println("CUANTOS LITROS CONSUMIO");
      litros = digite.nextInt();
      if(litros <= 50)
      {
          total = cargo_basico;
      }
             
 
      
      if((litros > 50)  && (litros < 100))
      {
          litros = litros -50;
          costo_litros = litros * 350;
          descuento = costo_litros * 0.15;
          total = (cargo_basico + costo_litros) -  descuento ;
      }
      if((litros >=100)  && (litros <= 200))
      {
          litros = litros -50;
          costo_litros = litros * 350;
          descuento = costo_litros * 0.05;
          total = (cargo_basico + costo_litros) -  descuento ;
      }
      if((litros >200)  )
      {
          litros = litros -50;
          costo_litros = litros * 350;
          descuento = costo_litros * 0.20;
          total = (cargo_basico + costo_litros) +  descuento ;
      }
      System.out.println("EL TOTAL DE LA FACTURA ES "+ total);

   }
}   
    