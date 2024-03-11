package gerencia;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FilaTeste {
	Fila fila;
	Senha senha;
	Senha senha1;
	Senha senha2;
	Senha senha3;
	
	@BeforeEach
	void inicializarFila() {
		fila = new Fila();
	}
	@BeforeEach
	void inicializarSenha() {
		senha = new Senha();
		senha1 = new Senha();
		senha2 = new Senha();
		senha3 = new Senha();
	}

	@Test
	void verificarFilaVazia() {
			fila.ehVazia();		
			assertEquals(0, fila.pegarTotalElementos());
	}
	@Test
	void verificarAdicionarFila() {
		senha.CountPreferencial();
		fila.adicionarSenha(senha);
		fila.adicionarSenha(senha1);
		fila.adicionarSenha(senha2);
		assertEquals(3, fila.pegarTotalElementos());
		
	}
	@Test 
	void verificarPegarPrimeira(){
		senha.CountNormal();
		fila.adicionarSenha(senha);
		fila.adicionarSenha(senha1);

		assertEquals(senha, fila.pegarPrimeira());
	}
	@Test
	void pegarComFilaVaziaTestandoPegarPrimeira() {
		
		assertThrows(RuntimeException.class, ()->fila.pegarPrimeira());
	}
	@Test 
	void verificarPegarUltima(){
		senha.CountNormal();
		fila.adicionarSenha(senha);
		fila.adicionarSenha(senha1);
		fila.adicionarSenha(senha2);
		fila.adicionarSenha(senha3);
		assertEquals(senha3, fila.pegarUltima());
	}
	@Test
	void pegarComFilaVaziaTestandoPegarUltimo() {
		
		assertThrows(RuntimeException.class, ()->fila.pegarUltima());
	}
	@Test 
	void verificarRemoverFila(){
		senha.CountPreferencial();
		fila.adicionarSenha(senha);
		fila.adicionarSenha(senha1);
		fila.removerSenha();
		assertEquals(senha1, fila.pegarPrimeira());
	}
	@Test 
	void verificarRemoverFilaComUmElemento(){
		senha.CountPreferencial();
		fila.adicionarSenha(senha);
		fila.removerSenha();
		assertTrue(fila.ehVazia());
	}
	@Test
	void pegarComFilaVaziaTestandoRemoverUltimo() {
		
		assertThrows(RuntimeException.class, ()->fila.removerSenha());
	}
	

}
