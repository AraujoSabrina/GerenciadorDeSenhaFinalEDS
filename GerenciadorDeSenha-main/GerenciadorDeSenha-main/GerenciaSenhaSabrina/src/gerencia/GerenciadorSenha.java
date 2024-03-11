package gerencia;

public class GerenciadorSenha {	
	private Fila Normal = new Fila();
	private Fila Preferencial = new Fila();
	
	
	public Senha criarNormal() {
		Senha senhaNormal = new Senha();
		senhaNormal.CountNormal();
		
		return senhaNormal;
	}

	public Senha criarPrefer() {
		Senha senhaPref = new Senha();
		senhaPref.CountPreferencial();
		
		return senhaPref;
	}
	
	
	public void adcNormal(Senha senha) {
		Normal.adicionarSenha(senha);
		System.out.println("Senha NORMAL: " + senha.getIDNormal() + "\n");
	}
	
	public void adcPreferencial(Senha senha) {
		Preferencial.adicionarSenha(senha);
		System.out.println("Senha PREFERENCIAL: " + senha.getIDPreferencial() + "\n");
		
	}
	
	public void chamarSenha() {
		if(!Preferencial.ehVazia()) {
			System.out.println("\t\nChamando Senha Preferencial: " + Preferencial.pegarPrimeira().getIDPreferencial());
			Preferencial.removerSenha();
			return;
		}
		
		if(!Normal.ehVazia()) {
			System.out.println("\t\nChamando SenhaNormal: " + Normal.pegarPrimeira().getIDNormal());
			Normal.removerSenha();
			return;
		}
		
		System.out.println("\nNão há senhas para chamar.");
	}
	
}
