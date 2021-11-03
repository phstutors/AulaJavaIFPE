public class Pessoas {
	private int Id;
	private int Cpf;
	private String Nome;
	public static void main(String[] args) {
		}
	
	Pessoas(int Id, int Cpf, String Nome){
		this.setId(Id);;
		this.setCpf(Cpf);
		this.setNome(Nome);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCpf() {
		return Cpf;
	}

	public void setCpf(int cpf) {
		Cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}
