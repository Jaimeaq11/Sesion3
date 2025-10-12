package pkg;

public class Movimiento {

	public enum signo {Ingreso, Retirada}; //ingresos - gastos
	
	private double importe;
	private signo signo;
	private String detalle;
	
	public Movimiento(signo Signo, double importe, String detalle) {
		this.signo = Signo;
		this.importe = importe;
		this.detalle = detalle;
	}
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public signo getSigno() {
		return signo;
	}
	public void setSigno(signo signo) {
		this.signo = signo;
	}
}