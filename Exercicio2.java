package respostas_switch;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[]args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 int codigo;
		float quantidade;
		
				 
				 
				 
		 System.out.println("-----------------");
		 System.out.println("Especificações |Código |Preço");
		 System.out.println("-----------------");
		 System.out.println("Cachorro quente|  100  |3,20");
		 System.out.println("Bauru simples  |  101  |4,30");
		 System.out.println("Bauro com ovo  |  102  |5,50");
		 System.out.println("Hambúrger      |  103  |3,20");
		 System.out.println("Cheeseburguer  |  104  |4,30");
		 System.out.println("Refrigerante   |  105  |4,00");
		
		 System.out.println("Escreva o código do item que deseja");
		 codigo = leitor.nextInt();
		 
		 System.out.println("Qual a quantidade?");
		 quantidade = leitor.nextFloat();
		 
		 switch(codigo){
		 case (100):
			 System.out.printf("O total a ser pago pelo seu pedido é = " + quantidade*3.20 +"R$!" );
			 break;
		 case (101):
			 System.out.printf("O total a ser pago pelo seu pedido é = "+ quantidade*4.30+ " R$!" );
			 break;
		 case (102):
			 System.out.printf("O total a ser pago pelo seu pedido é = "+ quantidade*5.50+ " R$!" );
			 break;
		 case (103):
			 System.out.printf("O total a ser pago pelo seu pedido é = "+ quantidade*3.20+ " R$!" );
			 break;
		 case (104):
			 System.out.printf("O total a ser pago pelo seu pedido é = "+ quantidade*4.30+ " R$!" );
			 break;
		 case (105):
			 System.out.printf("O total a ser pago pelo seu pedido é = "+ quantidade*4.00+ " R$!" );
			 break;
			 
			 
		 }
	}

}
