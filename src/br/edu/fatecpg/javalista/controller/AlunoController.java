package br.edu.fatecpg.javalista.controller;

import java.util.List;
import java.util.ArrayList;
import br.edu.fatecpg.javalista.model.Aluno;

public class AlunoController {
	private List<Aluno> listaAlunos;
	
	public AlunoController() {
		listaAlunos = new ArrayList();
	}
	public void setAluno(Aluno a) {
		listaAlunos.add(a);
	}
	public Aluno getAluno(int index) {
		return listaAlunos.get(index);
	}
	public String mostrarAlunos() {
		StringBuilder sb = new StringBuilder();
		for(Aluno a:listaAlunos) {
			sb.append(a.toString()+"\n");
		}
		return sb.toString();
	}
	
	public Aluno removerAluno(int matricula) {
		for(Aluno a:listaAlunos) {
			if(a.getMatricula() == matricula) {
				listaAlunos.remove(a);
				return a;
			}
		}
		System.out.println("O aluno não exite");
		return null;
	}
	
	
}
