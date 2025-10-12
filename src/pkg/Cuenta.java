package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> nMovimientos = new ArrayList<Movimiento>();
	
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
		nMovimientos.add(new Movimiento(Movimiento.signo.Ingreso, x, "Ingreso"));
	}	
	
	public void retirar(Double x) {
		if (saldo - x >= -500) { // límite descubierto
	        saldo = saldo - x;
	        nMovimientos.add(new Movimiento(Movimiento.signo.Retirada, x, "Retirada"));
	    } else {
	        System.out.println("Fondos insuficientes para retirada (saldo " + saldo + "€) en la cuenta "
	        		+ numero + " para la retirada de " + x + "€");
	    }
	}	
}
