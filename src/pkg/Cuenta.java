package pkg;

import java.util.List;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> nMovimientos;
	
	public Cuenta(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(double saldo) {
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
	}
	
	public void ingresar(Double x) {
		saldo = saldo + x;
	}	
}
