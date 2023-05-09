import java.util.Scanner;
import java.util.Random;

class Taller1
{
   public static void main(String e[])
   {
      Scanner lea = new Scanner (System.in);
      int contador=300;
      
      while( contador>=200 )
      {
         System.out.println("Numero = "+ contador); 
         contador = contador - 1;
     }
   }
}
//Taller realizado en Java
//EJERCICIO 1
import java.util.Scanner;
class Ejercicio1

{
 public static void main(String h[])
 {
 Scanner lea=new Scanner(System.in);
 int numero;
 System.out.println("digite su numero");
 numero=lea.nextInt();
 
 if(numero %2!=0)
 {
 System.out.println("Es impar");
 }
 else
 {
 System.out.println("Es par");
 }
 }
 }
//EJERCICIO 3
import java.util.Scanner;
class Ejercicio3
{
  public static void main(String h[])
  {
  Scanner lea=new Scanner(System.in);
  int numero1,numero2;
  System.out.println("ESRIBA LOS NUMERO");
  numero1=lea.nextInt();
  numero2=lea.nextInt();
  
  if(numero1 == numero2)
  {
  System.out.println("SON IGUALES");
  }
  else
  {
  System.out.println("NO SON IGUALES");
   }
  }
 } 
//EJERCICIO 5
import java.util.Scanner;
class Ejercicio5
{
 public static void main(String h[])
  {
  Scanner lea=new Scanner (System.in);
  int n1,n2,n3;
  System.out.println("DIGITE SU NUMERO ");
  n1=lea.nextInt();    //3
   n2=lea.nextInt();   //2
    n3=lea.nextInt();   //1
    
    //para el mayor n1
    
    if ((n1>n2) && (n1>n3)) 
    {   
    System.out.println("may "+n1);           
    {   
    if (n2>n3)
    {
    System.out.println("med"+n2);
    System.out.println("menor"+n3);
    }
    else
    {
    System.out.println("medio"+n3);
    System.out.println("menor"+n2);
    }
    }
    }
    
    //mayor n2
    
    if ((n2>n1 ) && (n2>n3))
    {
    System.out.println("mayor"+n2);
    {
    if (n1>n3)
    {
    System.out.println("medi"+n1);
    System.out.println("menor"+n3);
    }
    else
    {
    System.out.println("medi"+n3);
    System.out.println("menor"+n1);
    }
    }
    }
    
    //Mayor n3
    //1
    //2
    //3
    if ((n3>n2 ) && ( n3>n1))
    {
    System.out.println("may"+n3);
    {
    if (n2>n1)
    {
    System.out.println("medio"+n2);
    System.out.println("menor"+n1);
    }
    else
    {
    System.out.println("medio"+n1);
    System.out.println("menor"+n2);
    }
    }
    }
//EJERCICIO 7
import java.util.Scanner;
class Ejercicio7 
{
   public static void main(String h[])
   {
   Scanner lea=new Scanner(System.in);
   int peso;
   float altura,imc;
   System.out.println("DE SU PESO");
   peso=lea.nextInt();
   System.out.println("DE su altura");
   altura=lea.nextFloat();
   
   imc=peso/(altura*altura);
   
   if (imc <18.5)
   
   {
   System.out.println("BAJO PESO "+imc); 
   }
   
   if ((imc>=18.6) && (imc<=24.96))
   
    {
   System.out.println("PESO IDEAL "+imc); 
   }
   
   if((imc >=25) && (imc<=29.9))
    {
   System.out.println("SOBRE PESO"+imc); 
   }
   
   if((imc >=30) && (imc <=34.9))
    {
   System.out.println("OBESIDAD "+imc); 
   }
   
   if((imc >=35) && (imc<=39.9))
    {
   System.out.println("OBESIDAD SEVERA "+imc); 
   }
   if(imc>=40)
    {
   System.out.println("OBESIDAD MORVIDA "+imc); 
   }

//EJERCICIO 9
import java.util.Scanner;
class Ejercicio9
{
 public static void main(String h[])
 {
 
 Scanner lea=new Scanner(System.in);
 int number;
 System.out.println("DIGITE NUMERO");
 number=lea.nextInt();
 
 
 if((number>=51) && (number<=100))
 {
 System.out.println("SE ENCUENTRA EN EL INTERVALO CERRADO");
 }
 else
 {
  System.out.println("NOOOO  SE ENCUENTRA EN EL INTEVALO");
 
 }
 }
}
//EJERCICIO 11
import java.util.Scanner;
class Ejecicio11
{

 public static void main(String h[])
 {
 Scanner lea=new Scanner(System.in);
 int number;
 System.out.println("ESCRIBA SU NUMERO");
 number=lea.nextInt();
 
 
 if ((number>60) && (number<90))
 
 {
 System.out.println("SE ENCUENTRA EN EL INTERVALO ABIERTO");
 
 }
 
  if (number<0) 
 
 {
 System.out.println("ERROOOOOOOR  NUMERO DIGITADO ES NEGATIVO");
 
 }
//EJERCICIO 13
import java.util.Scanner;
class Ejercicio13
{
  public static void main(String h[])
  {
  Scanner lea=new Scanner(System.in);
  double compra,ab,c,d=20,abf;
  
  System.out.println("VALOR DE SU COMPRA");
  compra=lea.nextDouble();
  
  ab=compra*d/100;
  abf=compra-ab;

  if(compra>=300)
  {

  System.out.println("el descuento que se le va hacer "+ab);
   System.out.println("SU COMPRA CON DESCUENTO "+abf);
  }
  }
}
//EJERCICIO 15
import java.util.Scanner;
class Ejercicio15
{
 public static void main(String h[])
  {
  Scanner lea=new Scanner(System.in);
  int multiplicacion,horas_trabajo,multiplicacion2,paga_extra,total2,horas_trabajo2,HorasExtra;
  
  int paga_hora1=20000;
  int paga_hora2=19000;
  
  System.out.println("horas de trabajo");
  horas_trabajo=lea.nextInt();
  
  
  
  multiplicacion=horas_trabajo*20000 ;
  
  
  
  
  if(horas_trabajo<=40)
  {
   System.out.println("usted trabajo "+multiplicacion);
  
  }
  
  HorasExtra=horas_trabajo-40;
  paga_extra=HorasExtra*25000;
  
  if(horas_trabajo>=41)
  {
  horas_trabajo2=horas_trabajo-HorasExtra;
  multiplicacion2=horas_trabajo2*19000;
  total2=paga_extra+multiplicacion2;
  
  System.out.println("USTED TRABAJA MUCHO  "+total2);
  
  }
  }
}  

//EJERCICIO 17
import java.util.Scanner;
class Ejercicio17
{
  public static void main(String h[])
  {
  
  Scanner lea=new Scanner(System.in);
  int a,b,c;
  System.out.println("DIGITE 3 NUMEROS");
  a=lea.nextInt();  //1
  b=lea.nextInt(); //2
  c=lea.nextInt(); //3
  //number mayor
  
if ((a>b) && (a>b))
{
System.out.println("a "+a);
}
if ((b>a) && (b>c))
{
System.out.println("b "+b);
}
if ((c>a) && (c>b))
{
System.out.println("c "+c);
}
  }
  }
//EJERCICIO 19
import java.util.Scanner;
class Ejercicio19
{
 public static void main(String h[])
 {
 Scanner lea=new Scanner(System.in);
  System.out.println("DIGITE UN NUMERO");
 int number=lea.nextInt();
 int cuadrado;
 double raiz;
 
 

 
 if (number<=0)
 {
 System.out.println("Error");
 }
 else
 {
 cuadrado=number*number;
 raiz=Math.sqrt(number);//sqrt para raiz
 System.out.println("la raiz es "+raiz);
 System.out.println("EL CUADRADO ES "+cuadrado);
 }
 }
 
 }
 //pow para elevado
//EJERCICIO 21
import java.util.Scanner;

class  Ejercicio21
{
   public static void main(String e[])
     {
      Scanner lea = new Scanner(System.in);
      int mes,precio;
      
      System.out.println("DIGITE EL MES");
      mes = lea.nextInt();
      System.out.println("DIGITE VALOR A PAGAR");
      precio = lea.nextInt();
      
      if (mes == 10)
      {
      System.out.println ("EL VALOR TATAL A PAGAR ES: " +(precio - (precio * 0.15)));
      }
      else
      {
      System.out.println ("EL VALOR TOTAL A PAGAR ES: "+precio);
      }
   }
}
