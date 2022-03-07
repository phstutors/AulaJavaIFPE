package AtvClasse;

public class Conta {

	float saldo = 100;
	
	public float debitar(float valor) throws SaldoInsuficienteException {
		
		if(saldo <= 0 || saldo < valor) 
			throw new SaldoInsuficienteException();
		return saldo - valor;
		
		}

		
	}
