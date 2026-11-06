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
		if(!listaAlunos.isEmpty())
			return listaAlunos.get(index);
		else {
			System.out.println("A lista está vazia");
			return null;
		}
	}
	public String mostrarAlunos() {
		if(!listaAlunos.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for(Aluno a:listaAlunos) {
				sb.append(a.toString()+"\n");
			}
			return sb.toString();
		} else {
			System.out.println("A lista está vazia");
			return "";
		}
	}
	public Aluno removerAluno(int matricula) {
		for(Aluno a:listaAlunos) {
			if(a.getMatricula() == matricula) {
				listaAlunos.remove(a);
				return a;
			}
		}
		System.out.println("Aluno não encontrado");
		return null;
	}
	public int buscarIndice(int matricula) {
		for(Aluno a:listaAlunos) {
			if(a.getMatricula() == matricula) {
				return listaAlunos.indexOf(a);
			}
		}
		System.out.println("Aluno não encontrado");
		return -1;
	}
	public int buscarIndice(String nome) {
		for(Aluno a:listaAlunos) {
			if(a.getNome() == nome) {
				return listaAlunos.indexOf(a);
			}
		}
		System.out.println("Aluno não encontrado");
		return -1;
	}
	public void limparLista() {
		listaAlunos.clear();
	}
	public void virarSemestre() {
		if(!listaAlunos.isEmpty()) {
	        for (int i = listaAlunos.size() - 1; i >= 0; i--) {
	            Aluno a = listaAlunos.get(i);
	            if (a.getCiclo() >= 6) {
	                listaAlunos.remove(i);
	            } else {
	                a.setCiclo(a.getCiclo() + 1);
	            }
	        }
		} else {
			System.out.println("A lista está vazia");
		}
	}
	
}
