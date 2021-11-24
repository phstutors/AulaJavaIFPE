
public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Disciplina dip1 = new Disciplina();
		Disciplina dip2 = new Disciplina();
		
		Notas nota1 = new Notas(8,8,8,8);
		Notas nota2 = new Notas(10,10,10,10);
		dip1.setNotas(nota1);
		dip2.setNotas(nota2);
		aluno.getListaDisciplina().add(dip1);
		aluno.getListaDisciplina().add(dip2);
		
		for(Disciplina dip : aluno.getListaDisciplina()) {
			System.out.println(dip.getNotas().calcularMedia());
		}
		}
	}

