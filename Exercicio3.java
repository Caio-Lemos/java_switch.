package respostas_switch;

import java.util.Scanner;

public class exercicio3 {
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 

        int codigo;
        
        
        System.out.println("------");
        System.out.println("Opções");
        System.out.println("  1   ");
        System.out.println("  2   ");
        System.out.println("  3   ");
        System.out.println("  4   ");
        System.out.println("------");
        
        
        System.out.println("Selecione a opção desejada");
        codigo =leitor.nextInt();
        
        switch (codigo) {
        case 1:
        	System.out.println("Executa a rotina de Inclusão de Alunos");
        	break;
        case 2:
        	System.out.println("Executa a rotina de Alteração de Alunos");
        	break;
        case 3:
        	System.out.println("Executa a rotina de Exclusão de Alunos");
        	break;
        case 4:
        	System.out.println("Executa a rotina de Consulta de Alunos");
        	break;
      default:
    	  System.out.println("Esta opção não existe");
        		
        }
        
        

		
		
}
}