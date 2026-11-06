package br.edu.fatecpg.javalista.view;

import br.edu.fatecpg.javalista.controller.AlunoController;
import br.edu.fatecpg.javalista.model.Aluno;

public class Main {

	public static void main(String[] args) {
		AlunoController ac = new AlunoController();
		ac.setAluno(new Aluno(10,"Ale","DSM",5));
		ac.setAluno(new Aluno(40,"Aline","ADS",6));
		ac.setAluno(new Aluno(20,"Ana","DSM",1));
		ac.setAluno(new Aluno(80,"Maria","COMEX",2));
		
		System.out.println(ac.getAluno(2));
		
		System.out.println("Aluno removido: " + ac.removerAluno(12));
		
		System.out.println(ac.mostrarAlunos());
	}

}
