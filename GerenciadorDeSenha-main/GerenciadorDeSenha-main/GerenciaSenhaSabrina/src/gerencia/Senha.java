package gerencia;

public class Senha {
	
		private int idNormal;
		private int idPreferencial;
		
		private static int CountNormal = 1;
		private static int CountPreferencial = 1;
		
		private Senha anterior;
		private Senha proxima;
		
		
		public void CountNormal() {
			this.idNormal = CountNormal;
			CountNormal++;
		}
		
		public int getIDNormal() {
			return idNormal;
		}
		
		public void CountPreferencial() {
			this.idPreferencial = CountPreferencial;
			CountPreferencial++;
		}	
		
		
		public int getIDPreferencial() {
			return idPreferencial;
		}
		
		public Senha getAnterior() {
			return anterior;
		}

		public void setAnterior(Senha anterior) {
			this.anterior = anterior;
		}

		public Senha getProxima() {
			return proxima;
		}

		public void setProxima(Senha proxima) {
			this.proxima = proxima;
		}
	
}
