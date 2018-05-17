package roteiro;

import javax.swing.JOptionPane;

public class Media {
	public static void main(String [] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua terceira nota: "));
		double media = (nota1+nota2+nota3)/3;
		if(media>7) {
			System.out.println("Parabéns! Você está aprovado! Sua média foi: " + media);
		}
		else if(media>=4 && media<7) {
			double notaPraPassar = (5-0.6*media)/0.4;
			System.out.println("Você está na Prova Final e precisará de " + notaPraPassar + " para ser aprovado!" );
		}
		else {
			System.out.println("Você está reprovado.");
		}
	}
}
