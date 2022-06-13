package com.company.view;

import com.company.model.Memoria;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color COR_ROXO = new Color(71, 72, 136);
	private final Color COR_AZUL_BEBE = new Color(71, 121, 136);
	private final Color COR_LARANJA = new Color(100, 150, 200);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		// Linha 1
		c.gridwidth = 2;
		adicionarBotao("AC", COR_ROXO, c, 0, 0);

		c.gridwidth = 1;
		adicionarBotao("±", COR_ROXO, c, 2, 0);
		adicionarBotao("/", COR_LARANJA, c, 3, 0);

		// Linha 2
		adicionarBotao("7", COR_AZUL_BEBE, c, 0, 1);
		adicionarBotao("8", COR_AZUL_BEBE, c, 1, 1);
		adicionarBotao("9", COR_AZUL_BEBE, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);
		
		// Linha 3
		adicionarBotao("4", COR_AZUL_BEBE, c, 0, 2);
		adicionarBotao("5", COR_AZUL_BEBE, c, 1, 2);
		adicionarBotao("6", COR_AZUL_BEBE, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);
		
		// Linha 4
		adicionarBotao("1", COR_AZUL_BEBE, c, 0, 3);
		adicionarBotao("2", COR_AZUL_BEBE, c, 1, 3);
		adicionarBotao("3", COR_AZUL_BEBE, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);
		
		// Linha 5
		c.gridwidth = 2;
		adicionarBotao("0", COR_AZUL_BEBE, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao(",", COR_AZUL_BEBE, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);
	}

	private void adicionarBotao(String texto, Color cor, 
			GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
