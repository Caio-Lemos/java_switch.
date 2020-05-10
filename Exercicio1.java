package respostas_switch;

import java.util.Scanner;

public class exercicio1 {
	 public  static  void  main ( String [] args ) {       
	        Scanner leitor =  new Scanner ( System.in ); 
	        int e;
	        
	System.out.println("--------------------------");
	System.out.println("001-=parafuso");
	System.out.println("002=porca");
	System.out.println("003=prego");
	System.out.println("004=ferramenta");
	System.out.println("--------------------------");

	System.out.println("escolha o código de um produto");
	e = leitor.nextInt();
	
	switch(e) {
	case 001: System.out.println("parafuso");
	break;
	
	case 002:
	 System.out.println("porca");
	break;
	
	case 003:
		 System.out.println("prego");
		break;
	
	case 004:
		 System.out.println("ferramenta");
		break;
		
		default:  System.out.println("Diversos");
	}
	
}
}