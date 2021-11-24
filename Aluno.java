//Notas com herença

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String matricula;
	private ArrayList<Disciplina> listaDisciplina;
	public Aluno() {
		listaDisciplina = new ArrayList<Disciplina>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public ArrayList<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}
	public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}
}
