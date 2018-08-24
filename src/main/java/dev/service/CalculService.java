package dev.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {
	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);
	
	public int additionner(String expression) {
		LOG.debug("Evaluation de l'expression {}", expression);
		int resultat = 0;

		if(!expression.matches("[0-9]+(\\+[0-9]+)+")){
			LOG.info("Alors je soulève une exception !");
			throw new CalculException();
		}
		for(String str : expression.split("\\+")){
			resultat += Integer.parseInt(str);
		}
		return resultat;
	 }
}
