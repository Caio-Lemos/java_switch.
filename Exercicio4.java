package respostas_switch;

import java.util.Scanner;


public class exercicio4 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
   double a;
   double b;
   double c;
   int media;
   
   System.out.println("Escreva suas notas");
   
   System.out.println("Primeira nota");
   a = leitor.nextDouble();
   
   System.out.println("Segunda nota");
   b = leitor.nextDouble();
   
   System.out.println("Terceira nota");
   c = leitor.nextDouble();

     
   System.out.println("Opção1 = Média aritimética");
   System.out.println("Opção2 = Média ponderada  ");
   
   System.out.println("Escolha a opção");
  media = leitor.nextInt();
   
 
   
   switch (media) {
   case 1:
	   System.out.println( "Sua média é = "+  (a+b+c)/3 );
	   break;
	   
   case 2:
	   System.out.println(" Sua nota é = "+  (a*30 + b*30 + c*40)/100);
	   break;
	   default:
		   System.out.println("Esta opção não é valida");
      
	   
   
   }
	}
	
}
