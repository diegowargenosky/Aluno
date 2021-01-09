package Exercicio_Aluno;

public class Aluno {

	String nomeAluno;
	String curso;
	String matricula;

	String[] nomeDisciplinas = new String[3];

	double[][] notasDisciplinas = new double[3][4];

	void mostrarInfo() {

		System.out.println("Nome do aluno: " + nomeAluno);
		System.out.println("Curso: " + curso);
		System.out.println("Matr�cula: " + matricula);

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
		}
	}

	boolean verificarAprovado(int indice) {
		double soma = 0;
		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma / 4;
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}
}
