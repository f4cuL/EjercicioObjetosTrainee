package ejercicioTraineeJavaObjetos;

public abstract class vehiculo {
	protected String marca;
	protected String modelo;
	protected float precio;
	
	public vehiculo(String marca, String modelo, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public abstract String toString();
	
}
