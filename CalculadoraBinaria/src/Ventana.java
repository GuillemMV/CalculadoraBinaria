import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	public Ventana() {
		super("Calculadora Binaria");
		setSize(600, 250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//IP DECIMAL.
			
		JPanel panelDecimal = new JPanel();

		JTextField dec1 = new JTextField(4);
		JTextField dec2 = new JTextField(4);
		JTextField dec3 = new JTextField(4);
		JTextField dec4 = new JTextField(4);
		JTextField numSubredes = new JTextField(4);

		panelDecimal.add(new JLabel("Ip decimal: "));
		panelDecimal.add(dec1);
		panelDecimal.add(dec2);
		panelDecimal.add(dec3);
		panelDecimal.add(dec4);
		panelDecimal.add(new JLabel("/"));
		panelDecimal.add(numSubredes);

		//IP BINARIA.

		JPanel panelBinario = new JPanel();

		JTextField bin1 = new JTextField(8);
		JTextField bin2 = new JTextField(8);
		JTextField bin3 = new JTextField(8);
		JTextField bin4 = new JTextField(8);

		bin1.setEditable(false);
		bin2.setEditable(false);
		bin3.setEditable(false);
		bin4.setEditable(false);

		panelBinario.add(new JLabel("Ip binaria: "));
		panelBinario.add(bin1);
		panelBinario.add(bin2);
		panelBinario.add(bin3);
		panelBinario.add(bin4);

		//MASCARA DE SUBRED.

		JPanel panelMascara = new JPanel();

		JTextField masc1 = new JTextField(8);
		JTextField masc2 = new JTextField(8);
		JTextField masc3 = new JTextField(8);
		JTextField masc4 = new JTextField(8);

		masc1.setEditable(false);
		masc2.setEditable(false);
		masc3.setEditable(false);
		masc4.setEditable(false);

		panelMascara.add(new JLabel("Mascara de subred: "));
		panelMascara.add(masc1);
		panelMascara.add(masc2);
		panelMascara.add(masc3);
		panelMascara.add(masc4);

		//IP DE RED.

		JPanel panelRed = new JPanel();

		JTextField red1 = new JTextField(8);
		JTextField red2 = new JTextField(8);
		JTextField red3 = new JTextField(8);
		JTextField red4 = new JTextField(8);

		red1.setEditable(false);
		red2.setEditable(false);
		red3.setEditable(false);
		red4.setEditable(false);

		panelRed.add(new JLabel("Ip de red: "));
		panelRed.add(red1);
		panelRed.add(red2);
		panelRed.add(red3);
		panelRed.add(red4);
		
		//PANEL BOTON CALCULAR.
		
		JPanel panelEnviar = new JPanel();
		JButton ok = new JButton("Calcular");
		panelEnviar.add(ok);
		
		//PANEL INFO ERRORES.
		
		JPanel panelInfo = new JPanel();
		JTextField info = new JTextField(20);
		info.setEditable(false);
		panelInfo.add(info);
		

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(panelDecimal, BorderLayout.CENTER);
		cp.add(panelBinario, BorderLayout.CENTER);
		cp.add(panelMascara, BorderLayout.CENTER);
		cp.add(panelRed, BorderLayout.CENTER);
		cp.add(panelInfo);
		cp.add(panelEnviar);
		
		ok.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            try {
	            	bin1.setText(Main.calcularBinario(dec1));
		            bin2.setText(Main.calcularBinario(dec2));
		            bin3.setText(Main.calcularBinario(dec3));
		            bin4.setText(Main.calcularBinario(dec4));
		            
		            info.setText("");
	            }catch (Exception exc){
	            	info.setText("ERROR: "+exc.toString());
	            }
	         }
	      });
	}
	
}