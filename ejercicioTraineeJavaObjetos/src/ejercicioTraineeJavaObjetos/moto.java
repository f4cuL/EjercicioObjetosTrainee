package ejercicioTraineeJavaObjetos;

import java.text.DecimalFormat;

public class moto extends vehiculo{
	
	protected int cilindrada;
	public moto(String marca, String modelo, float precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	 //Marca: Honda // Modelo: Titan // Cilindrada: 125cc // Precio: $60.000,00
	@Override
	public String toString() {
		DecimalFormat unidad = new DecimalFormat("###,###.00");
		return "Marca: " + modelo + " // Cilindrada: " + cilindrada + "cc to// Precio $" + unidad.format(precio);
	}
	
}
