package respostas_switch;

import java.util.Scanner;

public class exercicio5 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
        int a;
       double preço;
      
       System.out.println("Insira o valor do produto que deseja comprar");
      preço = leitor.nextDouble();
       
        System.out.println("--------------------------");
        System.out.println("Opção  | Condições de pagamento");
        System.out.println("  1    | À vista em dinheiro ou cheque, com 10% de desconto");
        System.out.println("  2    | À vista com cartão de crédito, com 5% de desconto" );
        System.out.println("  3    | Em 2 vezes, preço normal de etiqueta sem juros    ");
        System.out.println("  4    | Em 3 vezes, preço de etiqueta com acréscimo de 10%");
        
        System.out.println("Escolha usa opção de pagamento");
        a = leitor.nextInt();
        
        switch (a) {
        case 1:
        	 System.out.println("Seu total a pagar com 10% de desconto é = "+ (preço-((preço*10)/100))  );
        	 break;
        	 
        case 2:
       	 System.out.println("Seu total a pagar com 5% de desconto é = "+ (preço-((preço*5)/100))  );
       	 break;
       	 
        case 3:
          	 System.out.println("Seu total a pagar em 2 vezes, preço normal de etiqueta sem juros é = "+ preço/2   );
          	 break;
        case 4:
         	 System.out.println("Seu total a pagar em 3 vezes, preço normal de etiqueta sem juros é = "+(preço+((preço*10)/100))/3  );
         	 break;
        
       	 
       	 
        
        }
        	
        
	}
}

