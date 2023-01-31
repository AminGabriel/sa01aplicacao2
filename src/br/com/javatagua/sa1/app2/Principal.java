package br.com.javatagua.sa1.app2;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.CalculoBo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor;
		
		
		JOptionPane.showMessageDialog(null, "Embraer");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual"));
		
		
		CalculoBo cbo = new CalculoBo();
		
		JOptionPane.showMessageDialog(null,"A diferença entre o ano de lançamento do primeiro avião da Embraer e o ano atual é de: " + cbo.diminuir(valor) + " anos" + ".");
		
	
	}

}
