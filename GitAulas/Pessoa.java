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



public class Pessoa {
	private String nome = " Pedro";
	private int cpf = 0;
	private String nome1 = "paulo";
			
public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
public void falar(){
	System.out.println(" "+nome+"Esá falando");
}
public void falarNome(){
	System.out.println(getNome());
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void falarcpf() {
	System.out.println(nome);
}
}