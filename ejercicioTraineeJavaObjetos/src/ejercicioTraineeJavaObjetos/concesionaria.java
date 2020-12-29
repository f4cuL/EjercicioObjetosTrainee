package ejercicioTraineeJavaObjetos;

import java.util.ArrayList;

public class concesionaria {
	
	protected  ArrayList <auto> listaAuto;

	public concesionaria(ArrayList<auto> listaAuto) {
		super();
		this.listaAuto = listaAuto;
	}

	public ArrayList<auto> getListaAuto() {
		return listaAuto;
	}

	public void setListaAuto() {
		this.listaAuto = listaAuto;
	}
	
	//Busqueda mayor precio
	public auto buscarMasCaro()
	{
		auto max = listaAuto.get(0);
		for (int i=1 ; i< listaAuto.size(); i++)
		{
			if (listaAuto.get(i).getPrecio() > max.precio)
			{
				max=listaAuto.get(i);
			}
		}
		return max;
	}
	
	//Busqueda menor precio
	public auto buscarMasBarato()
	{
		auto min = listaAuto.get(0);
		for (int i=1 ; i< listaAuto.size(); i++)
		{
			if (listaAuto.get(i).getPrecio() < min.precio)
			{
				min=listaAuto.get(i);
			}
		}
		return min;
	}
	//Ordenamiento burbuja
	public boolean ordenarMayorMenor()
	{
		for (int i=0 ; i<listaAuto.size() ; i++)
		{
			for (int j=0; j<listaAuto.size()-1 ; j++)
			{
				if (listaAuto.get(j+1).precio > listaAuto.get(j).precio)
				{
					auto aux = listaAuto.get(j);
					listaAuto.set(j, listaAuto.get(j+1));
					listaAuto.set(j+1,aux);				
				}
			}
		}
		return true;
	}
	//Busqueda por letra
	public auto buscarAutoLetra(char L)
	{
		for (int i =0 ; i < listaAuto.size() ; i++)
		{
			for ( int j=0 ; j <listaAuto.get(i).getModeloAuto().length() ; j++)
			{
				
				if (listaAuto.get(i).getModeloAuto().charAt(j) == L )
				{
					return listaAuto.get(i);
				}
			}
		}
		return null;
	}
	//Mostrar list
	public boolean mostrarLista()
	{
		for (int i=0 ; i< listaAuto.size() ; i++)
		{
			System.out.println(listaAuto.get(i).getMarcaAuto() +" "+listaAuto.get(i).getModeloAuto());
		}
		return true;
	}
}
