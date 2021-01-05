package ejercicioTraineeJavaObjetos;

import java.text.DecimalFormat;

public class auto extends vehiculo {

	protected int cantPuertas;

	public auto(String marca, String modelo, float precio, int cantPuertas) {
		super(marca, modelo, precio);
		this.cantPuertas = cantPuertas;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	// Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
	@Override
	public String toString() {
		DecimalFormat unidad = new DecimalFormat("###,###.00");
		return "Marca: " + modelo + " // Puertas: " + cantPuertas + " // Precio $" + unidad.format(precio);
	}

}
