package Ejercicio1;

public class Arbol {

	public Arbol(int entero)
	{
		System.out.println("un arbol de "+ entero+ " metros ");
	}
	
	public Arbol(String cadena)
	{
		System.out.println("un " + cadena);
		
	}
	public Arbol()
	{
		System.out.println("Un arbol generico");
		
	}
	
	public Arbol(int entero, String cadena)
	{
		System.out.println("un " + cadena + "de " + entero + " metros");
	}
}
