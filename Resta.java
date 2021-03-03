import java.util.Scanner;

/**
 * Esta clase pertenece a la operacion resta de la calculadora
 * @author Jaime Hebrero
 *@version 2.0
 *@since 24/02/2021
 */


public class Resta extends Principal {
	
	static Scanner leer = new Scanner(System.in);
	
	/**
	 * Metodo para restar 2 numeros reales, tiene 2 parametros de entrada y uno de salida (la solucion).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param resultado Resultado de la resta entre los 2 parametros.
	 * @return Devuelve resultado.
	 */
	public static double restaTipoUno(double num1, double num2){
		/**
		 *  Casos especiales:
		 *  <ul>
		 *  	<li> Si se resta un numero negativo este se suma.
		 *  	<li> si se resta 0 no cambia nada.
		 *  <ul>
		 */
		double resultado = num1 - num2;		
		return resultado;
	}

	/**
	 * Metodo para restar 2 numeros enteros, tiene 2 parametros de entrada y uno de salida (la solucion).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param resultado Resultado de la resta entre los 2 parametros.
	 * @return Devuelve resultado.
	 */	
	public static int restaTipoDos(int num1, int num2){
		/**
		 *  Casos especiales:
		 *  <ul>
		 *  	<li> Si se resta un numero negativo este se suma.
		 *  	<li> si se resta 0 no cambia nada.
		 *  <ul>
		 */
		int resultado= 0;
		resultado = num1 - num2;
		return resultado;
	}			
	
	/**
	 * Metodo para restar 3 numeros enteros, tiene 3 parametros de entrada y uno de salida (la solucion).
	 * @param num1 Primer parametro para operar la resta.
	 * @param num2 Segundo parametro para operar la resta.
	 * @param num3 Tercer parametro para operar en la resta.
	 * @param resultado Resultado de la resta entre los 2 parametros.
	 * @return Devuelve resultado.
	 */	
	public static double restaTipoTres(double num1, double num2, double num3){
		/**
		 *  Casos especiales:
		 *  <ul>
		 *  	<li> si se resta 0 no cambia nada.
		 *  <ul>
		 */
		double resultado = 0;
		resultado = num1 - num2 - num3;
		return resultado;
	}
	
	/**
	 * Metodo para acumular un numero que escribamos. Tiene un parametro de entrada y un parametro acumulador al que se le suma el parametro de entrada.
	 * @param num parametro de entrada.
	 * @param acumulador parametro donde se van restando los numeros ingresados.
	 * @return Devuelve resultado.
	 */
	public static double restaTipoCuatro(double acumulador, double num){
		/**
		 *  Casos especiales:
		 *  <ul>
		 *  	<li> si se resta 0 no cambia nada.
		 *  <ul>
		 */
		acumulador = 0;
		acumulador = acumulador - num;
		return acumulador;
	}
	
}
