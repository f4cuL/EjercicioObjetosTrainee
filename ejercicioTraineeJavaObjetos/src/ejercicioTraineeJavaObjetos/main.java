package ejercicioTraineeJavaObjetos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class main{

	public static void main(String[] args) {
     //Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
	 vehiculo Auto1 = new auto("Peugeot","206",200000.00f,4);
	 //Marca: Honda // Modelo: Titan // Cilindrada: 125cc // Precio: $60.000,00
	 vehiculo Moto1 = new moto("Honda","Titan",60000.00f,125);
	 //Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
	 vehiculo Auto2 = new auto("Peugeot","208",250000.00f,5);
	 //Marca: Yamaha // Modelo: YBR // Cilindrada: 160cc // Precio: $80.500,50
	 vehiculo Moto2 = new moto("Yamaha","YBR",80500.50f,160);
	 
	 
	 //Instancia de concesionaria con lista creada
	 concesionaria con = new concesionaria (new ArrayList <vehiculo>(Arrays.asList(Auto1,Moto1,Auto2,Moto2)));
	 
	 //DecimalFormat para el formato del precio
	 
	 con.mostrarLista();
	 
	 DecimalFormat unidad = new DecimalFormat("###,###.00");
	 espacio();
	 System.out.println("Veh�culo m�s caro: "+ con.buscarMasCaro().getMarca() + " " + con.buscarMasCaro().getModelo());
	 System.out.println("Veh�culo m�s barato: "+ con.buscarMasBarato().getMarca() + " " + con.buscarMasBarato().getModelo());
	 System.out.println("Veh�culo que contiene en el modelo la letra �Y�: " + con.buscarAutoLetra('Y').getMarca() + " " + con.buscarAutoLetra('Y').getModelo() + " " + "$"+ unidad.format(con.buscarAutoLetra('Y').getPrecio()));
	 espacio();
	 System.out.println("Veh�culos ordenados por precio de mayor a menor:");
	 con.ordenarMayorMenor();
	 con.mostrarVehiculo();
	 
	}
	
	static void espacio()
	{
		System.out.println("=============================");
	}
	
	
	

	


	

}
