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

public class App {

	public static void main(String[] args) {
		Contato c1 = new Contato();
		c1.setNome("Pedro");
		c1.setTelefone(819877);
		c1.setNotas(6);
		c1.aprovado();
		Contato c2 = new Contato();
		c2.setNome("João");
		c2.setTelefone(40028922);
		c2.setNotas(5);
		c2.aprovado();
	}
}