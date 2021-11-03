import java.util.ArrayList;
import java.util.Scanner;
public class Lista {
	public static void main(String[] args) {
		//Scanner input = new Scanner()
		ArrayList<Pessoas> ListaPessoas = new ArrayList<Pessoas>();
		Pessoas p1 = new Pessoas(1, 2344, "Pedro");
		Pessoas p2 = new Pessoas(2, 5544, "Paulo");
		Pessoas p3 = new Pessoas(3, 7789, "Joao");
		ListaPessoas.add(p1);
		ListaPessoas.add(p2);
		ListaPessoas.add(p3);
		for(Pessoas p: ListaPessoas) {
			System.out.println(p.getNome());
		}
		}
	}

/*p1.Id = 1;
p1.Nome = "Pedro";
p1.Cpf = 1356544;
p2.Id = 2;
p2.Nome = "Paulo";
p2.Cpf = 124344;
p3.Id = 3;
p3.Nome = "Joao";
p3.Cpf = 13547744;
Segunda Forma que consegui!!!
*/