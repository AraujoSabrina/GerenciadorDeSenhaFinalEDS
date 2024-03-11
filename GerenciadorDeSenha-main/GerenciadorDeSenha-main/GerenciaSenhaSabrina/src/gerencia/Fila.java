package gerencia;

public class Fila {
		
		private Senha primeiraSenha = null;
		private Senha ultimaSenha = null;
		
		private int totalDeElementos = 0;
		
		public boolean ehVazia() {
			return totalDeElementos == 0;
			
		}
		
		public void adicionarSenha(Senha num) {
			
			if(ehVazia()) {
				primeiraSenha = num;
			}else {
				
				ultimaSenha.setProxima(num);
				num.setAnterior(ultimaSenha);
			}
			
			ultimaSenha = num;
			totalDeElementos++;
		}
		
		public Senha pegarPrimeira() {
			
			if (primeiraSenha == null)
				throw new RuntimeException("Não há senhas para chamar");
			
			return primeiraSenha;
		}
		
		public Senha pegarUltima() {
			
			if (ultimaSenha == null)
				throw new RuntimeException("Não há senhas para chamar");
			
			return ultimaSenha;
		}
		
		
		
		public int pegarTotalElementos() {
			return totalDeElementos;
		}
		
		public void removerSenha() {
			
			if(ehVazia()) {
				throw new RuntimeException("Não há senhas para chamar");
			}
			
			primeiraSenha = primeiraSenha.getProxima();
			
			if (totalDeElementos > 1) {
				primeiraSenha.setAnterior(null);
				totalDeElementos--;
				return;
			}
			ultimaSenha = null;
			totalDeElementos--;
		}
		
	
}
