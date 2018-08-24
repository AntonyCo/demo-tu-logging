package dev.service;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

/**
 * Test unitaire de la classe dev.service.CalculService.
 */
public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
	
	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService cs = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int resultat = cs.additionner("1+3+4");
		int somme = 8;
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(resultat);
	}
	
	@Test(expected = CalculException.class)
	public void testAdditionnerInvalide(){
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService cs = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1-2");
		int resultat = cs.additionner("1-2");
	}
} 	