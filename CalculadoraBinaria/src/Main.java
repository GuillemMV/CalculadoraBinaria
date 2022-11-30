import java.util.ArrayList;

import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		Ventana conversor = new Ventana();
		conversor.setVisible(true);
	}
	
	// ========== CALC BINARIO ==========

	public static String calcularBinario(JTextField dec) {
		int decimal = Integer.parseInt(dec.getText());
		int binary[] = new int[20];
		int numeroDecimal = decimal;
		int index = 0;

		while (numeroDecimal > 0) {
			int remainder = numeroDecimal % 2;
			binary[index++] = remainder;
			numeroDecimal = numeroDecimal / 2;
		}

		String binario = "";

		for (int i = index - 1; i >= 0; i--) {
			binario += binary[i];
		}
		
		return binario;
	}
	
	// ========== CALC MASCARA DE SUBRED ==========
	
	public static String calcularRed(JTextField dec) {
		String red = "";
		return red;
	}
}
