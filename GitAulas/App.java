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



public class App {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Paula");
		aluno1.setSobrenome("Silva");
		aluno1.setSexo("Feminino");
		aluno1.setIdade(16);
		aluno1.falarNome();
		aluno1.sobrenome();
		aluno1.FalarSexo();
		aluno1.falarIdade();
	}
}
