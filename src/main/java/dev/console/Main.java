package dev.console;

import dev.service.CalculService;

public class Main {

	public static void main(String[] args) {
		CalculService calcul = new CalculService();
		calcul.additionner("1+4");
	}
}
