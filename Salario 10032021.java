import java.util.Scanner;
class Salario
{
   public static void main(String h[])
   {
      Scanner digite = new Scanner (System.in);
      int salario_semanal=0, horas_trabajadas,horas_extras;
      System.out.println("Ingrese las horas trabajadas durante la semana:");
      horas_trabajadas = digite.nextInt();
      if (horas_trabajadas<=40)
      {
         salario_semanal = horas_trabajadas * 20000;
         
      }
       if (horas_trabajadas>=40)
      {
         horas_extras = horas_trabajadas-40;
         salario_semanal = (40 * 19000) + (horas_extras * 25000);
      }
      System.out.println("SU SALARIO ES " + salario_semanal);
      
   }
}