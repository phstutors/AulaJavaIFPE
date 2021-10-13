/*nao mexa nos meus arquivos por favor
 * esse arquivo é de autoria de PhsTutors
 * Nao Mexa nele por favor
 * github: PhsTutors ;/
 * 
██████╗░██╗░░██╗░██████╗████████╗██╗░░░██╗████████╗░█████╗░██████╗░░██████╗
██╔══██╗██║░░██║██╔════╝╚══██╔══╝██║░░░██║╚══██╔══╝██╔══██╗██╔══██╗██╔════╝
██████╔╝███████║╚█████╗░░░░██║░░░██║░░░██║░░░██║░░░██║░░██║██████╔╝╚█████╗░
██╔═══╝░██╔══██║░╚═══██╗░░░██║░░░██║░░░██║░░░██║░░░██║░░██║██╔══██╗░╚═══██╗
██║░░░░░██║░░██║██████╔╝░░░██║░░░╚██████╔╝░░░██║░░░╚█████╔╝██║░░██║██████╔╝
╚═╝░░░░░╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░░╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═════╝
*
 */



public class Contato {
	private int Telefone;
	private String Nome;
	private float Notas;
	
public String getNome() {
	return Nome;
}
public void setNome(String Nome) {
	this.Nome = Nome;
}
public int getTelefone() {
	return Telefone;
}
public void setTelefone(int Telefone) {
	this.Telefone = Telefone;
}
public void  informar() {
	System.out.println("O Telefone De "+Nome+" é "+Telefone);
}
public float getNotas() {
	return Notas;
}
public void setNotas(float notas) {
	Notas = notas;
}
public void aprovado() {
	if(Notas == 6) {
		System.out.println("Aprovado! Parabéns Senhor "+Nome+" Entraremos em Contato pelo Telefone"+Telefone+" Para lhe passar os horarios de trabalho!");
	}
	else {
		System.out.println(Nome+" foi Reprovado!, iremos entrar em contato para marcar uma nova prova com você no telefone "+Telefone);
	}
}
}
