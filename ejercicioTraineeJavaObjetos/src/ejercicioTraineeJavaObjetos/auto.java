package ejercicioTraineeJavaObjetos;

import java.text.DecimalFormat;

public class auto {

	protected String marcaAuto;
	protected String modeloAuto;
	protected int cantPuertas;
	protected int cilindradaAuto;
	protected float precio;
	
	public auto(String marcaAuto, String modeloAuto, int cantPuertas, int cilindradaAuto, float precio) {
		super();
		this.marcaAuto = marcaAuto;
		this.modeloAuto = modeloAuto;
		this.cantPuertas = cantPuertas;
		this.cilindradaAuto = cilindradaAuto;
		this.precio = precio;
	}
	
	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getMarcaAuto() {
		return marcaAuto;
	}

	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}
	public String getModeloAuto() {
		return modeloAuto;
	}
	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public int getCilindradaAuto() {
		return cilindradaAuto;
	}
	public void setCilindradaAuto(int cilindradaAuto) {
		this.cilindradaAuto = cilindradaAuto;
	}
	
	boolean mostrarAuto(boolean cilindrada)
	{
		//DecimalFormat para el formato del precio
		DecimalFormat unidad = new DecimalFormat("###,###.00");
		
		if (cilindrada==false)
		{
			System.out.println("Marca: "+ marcaAuto +" // Modelo: " + modeloAuto +" // Puertas: "+ cantPuertas + " // Precio: $"+  unidad.format(precio));
			return true;
		}
		else
		{
			System.out.println("Marca: "+ marcaAuto +" // Modelo: " + modeloAuto +" // Cilindrada: "+ cilindradaAuto + "cc // Precio: $"+ unidad.format(precio));
			return true;	
		}
	}

}
