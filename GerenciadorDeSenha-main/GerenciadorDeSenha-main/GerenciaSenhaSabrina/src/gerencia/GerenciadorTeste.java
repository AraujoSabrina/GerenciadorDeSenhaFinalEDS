package gerencia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GerenciadorTeste {
	Fila fila;
	Senha senha;
	GerenciadorSenha gerencia;
	@BeforeEach
	void inicializarGerencia() {
		gerencia = new GerenciadorSenha();
		
	}
	@BeforeEach
	void inicializarFila() {
		fila = new Fila();
	}
	@BeforeEach
	void inicializarSenha() {
		senha = new Senha();
		
	}
	
	
	@Test
	void verificarCriarNormal() {
		gerencia.criarNormal();
		assertEquals(0, senha.getIDNormal());
	}
	@Test
	void verificarCriarPreferencial() {
		
		gerencia.criarPrefer();
		assertEquals(0, senha.getIDPreferencial());
	}
	@Test
	void verificarAdcionarNormal() {
		
		gerencia.adcNormal(senha);
		assertEquals(0, senha.getIDNormal());
	}
	@Test
	void verificarAdcionarPreferencial() {
		
		gerencia.adcPreferencial(senha);
		assertEquals(0, senha.getIDPreferencial());
	}
	
	
	

}
