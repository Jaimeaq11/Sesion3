package pkg;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("12345");
		Cuenta c2 = new Cuenta("67890");
		
		c1.setSaldo(50.0);
		c2.setSaldo(0.0);
		
		c1.retirar(200.0); //1
		c2.retirar(350.0); //2
		c1.ingresar(100.0); //3
		c2.retirar(200.0); //4
		c2.retirar(150.0); //5
		c1.retirar(200.0); //6
		c2.ingresar(50.0); //7
		c2.retirar(100.0); //8
		
		System.out.println("\nSaldo de la cuenta " + c1.getNumero() + ": " + c1.getSaldo());
		System.out.println("Saldo de la cuenta " + c2.getNumero() + ": " + c2.getSaldo());
	}
}
