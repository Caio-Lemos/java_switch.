package respostas_switch;

import java.util.Scanner;

public class exercicio6 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
        int codigo;
       double salario;
       String cargonovo;
       
      
       System.out.println("Insira o valor que você recebe na empresa");
   salario = leitor.nextDouble();
   
   System.out.println("-------------------");
   System.out.println("Cargo      | Códig ");
   System.out.println("Diretor    | 001   ");
   System.out.println("Engenheiro | 002   ");
   System.out.println("Técnico    | 003   ");
   System.out.println("Gerente    | 004   "); 
   System.out.println("Analista   | 005   ");
   System.out.println("Coordenador| 006   ");
   System.out.println("-------------------");
   
System.out.println("Digite o código do cargo em que trabalha");
System.out.println("");

System.out.println("Se seu cargo não esta na lista, use um número aleatório");
        codigo = leitor.nextInt(); 
        
        System.out.println("--------------------------");
        System.out.println("Cargo      | Código | Percentual");
        System.out.println("Diretor    | 001    |    10%    ");
        System.out.println("Engenheiro | 002    |    20%    ");
        System.out.println("Técnico    | 003    |    30%    ");
        System.out.println("Gerente    | 004    |    10%    "); 
        System.out.println("Analista   | 005    |    30%    ");
        System.out.println("Coordenador| 006    |    20%    ");
       
       
        System.out.println("A tabela a cima mostra qual é a porcentagem de aumento para cada cargo");
        System.out.println("");
        
        switch (codigo) {
        case 001:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*10)/100)));
        	break;
        case 002:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*20)/100)));
        	break;
        case 003:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*30)/100)));
        	break;
        case 004:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*10)/100)));
        	break;
        case 005:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*30)/100)));
        	break;
        case 006:
        	System.out.println("Seu novo salário será de:"+ (salario+((salario*20)/100)));
        	break;
        	default:
        		System.out.println(" Por favor digite seu cargo ");
        		cargonovo = leitor.next();
        		
        		System.out.println(" Desculpe por seu cargo não estar na lista,olhei aqui ,e você receberá 40% de aumento");
        		
                System.out.println("Seu cargo é : "+cargonovo+ " | salario antigo >"+ salario+" |salario novo >"+  (salario+((salario*40)/100)) +"A diferença do seu salário antigo para o seu atual é  R$"+  (salario*40)/100     );
        	
        
        
        }
}
}