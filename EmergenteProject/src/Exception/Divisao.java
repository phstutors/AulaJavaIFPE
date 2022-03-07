package Exception;

public class Divisao {
	
	public int dividir(int n1, int n2) throws DivisaoException {
		if(n2 == 0) 
			throw new DivisaoException();
		return n1/n2;
	}
}
