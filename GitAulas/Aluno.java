/*nao mexa nos meus arquivos por favor
 * esse arquivo é de autoria de PhsTutors
 * Nao Mexa nele por favor
 * github: PhsTutors ;/
██████╗░██╗░░██╗░██████╗████████╗██╗░░░██╗████████╗░█████╗░██████╗░░██████╗
██╔══██╗██║░░██║██╔════╝╚══██╔══╝██║░░░██║╚══██╔══╝██╔══██╗██╔══██╗██╔════╝
██████╔╝███████║╚█████╗░░░░██║░░░██║░░░██║░░░██║░░░██║░░██║██████╔╝╚█████╗░
██╔═══╝░██╔══██║░╚═══██╗░░░██║░░░██║░░░██║░░░██║░░░██║░░██║██╔══██╗░╚═══██╗
██║░░░░░██║░░██║██████╔╝░░░██║░░░╚██████╔╝░░░██║░░░╚█████╔╝██║░░██║██████╔╝
╚═╝░░░░░╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░░╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═════╝
*
 */



public class Aluno {
	private String nome = "Pedro";
	private String Sobrenome = "Henrique";
	private String sexo = "Masculino";
	private int idade = 18;
	
	public void FalarSexo(){
		System.out.println(sexo);
	}
	public void falarNome() {
		System.out.println(nome);
	}
	public void falarIdade() {
		System.out.println(idade);
	}
	public void sobrenome() {
		System.out.println(Sobrenome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	
}
