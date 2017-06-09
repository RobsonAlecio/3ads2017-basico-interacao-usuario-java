package run;

import javax.swing.JOptionPane;

public class RunWithMe {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Oi! Eu sou um programa rodando Java.\nVamos conversar.");
		
		int resposta = JOptionPane.showConfirmDialog(null, "Voc� est� apto a interagir com um programa t�o avan�ado?", 
				"Voc� est� certo disso?", JOptionPane.YES_NO_OPTION);
		
		boolean disseSim = resposta == JOptionPane.YES_OPTION;
		
		if (!disseSim) {
			JOptionPane.showMessageDialog(null, "Sabia que voc� n�o era bom o suficiente.");
			return;
		}
		
		String nome = JOptionPane.showInputDialog("Antes de mais nada, me diga seu nome.");
		
		JOptionPane.showMessageDialog(null, "Foi um prazer conversa contigo " + nome + ".\n At� uma pr�xima vez.");
	}

}
