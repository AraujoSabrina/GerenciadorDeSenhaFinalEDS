package gerencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		GerenciadorSenha senha = new GerenciadorSenha();
		Senha Normal = null;
		Senha senhaP = null;
		
		int opcao = 0;
		
		
		System.out.println("\t___________________Sistema de Senha___________________\t\n");
        System.out.println("\t______Trabalho Disciplinar de Estrutura de Dados______\t\n");
        System.out.println("\t_______________________________Sabrina Campos de Araujo\t\n");
		
		while(opcao != 4) {
	        System.out.println("\n\t1- Senha Normal\n" + "\t2- Senha Preferencial\n" + "\t3- Chamar Senha\n" + "\t4- Sair do Programa\t\n");
	        
	        System.out.println("\tEscolha uma opcao: \n");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				Normal = senha.criarNormal();
				senha.adcNormal(Normal);
				continue;
			}
			
			if (opcao == 2) {
				senhaP = senha.criarPrefer();
				senha.adcPreferencial(senhaP);
				continue;
			}
			
			if (opcao == 3) {
				senha.chamarSenha();
				continue;
			}
			
			if (opcao == 4) {
				System.out.println("\t\nEncerrando programa... \n\tAté mais!");
				break;
			}
			
			System.out.println("\nSelecione uma opção correta. \n");
		}
		
	}

}
