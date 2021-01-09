package Exercicio_Aluno;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno: ");
		aluno.nomeAluno = sc.next();

		System.out.println("Entre com o nome do curso: ");
		aluno.curso = sc.next();

		System.out.println("Entre com a matrícula: ");
		aluno.matricula = sc.next();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i + 1));
			aluno.nomeDisciplinas[i] = sc.next();

		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {

			System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);

			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {

				System.out.println("Entre com a nota " + (j + 1));
				aluno.notasDisciplinas[i][j] = sc.nextDouble();

			}

		}
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" foi aprovado");
			}
			else {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" foi reprovado");
			}
		}
		
		
               sc.close();
	}

}
