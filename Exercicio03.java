package MetodosDeString;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Exercício 03: Remover Caracteres Específicos Crie um programa que solicite ao
		 * usuário que insira uma string e, em seguida, remova todas as ocorrências de
		 * um caractere específico (por exemplo, "@") da string. Exiba a string
		 * resultante.
		 */

		String userInput;

		do {

			userInput = JOptionPane.showInputDialog(null, "Digite uma frase");

			if (userInput == null) {

				JOptionPane.showMessageDialog(null, "O campo não pode estar vazio");

				break;

			} else {

				JOptionPane.showMessageDialog(null, "Frase antes da alteração = " + userInput);

				userInput = userInput.replace(" ", "").replace("@", "!");

				JOptionPane.showMessageDialog(null, "Frase depois da alteração = " + userInput);

			}

		} while (userInput != null);

	}

}
