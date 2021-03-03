
/**
 * 
 * @author alberto
 * @version 2.0
 * @since 24/02/21
 *
 */
import java.util.Scanner;
import java.lang.Math;


/**
 * <h1>Clase que devuelve el resultado de multiplicar distintos numeros.</h1>
 * @param multiplo es el primer numero que vamos a multiplicar. 
 * @param multiplo2 es el segundo. Al ser una multiplicacion, el orden no importa.
 * @param resultado es la solucion de la operacion.
 * @return otorga la solucion recien obtenida
 */
public class Producto extends Principal {
	
	
	/**
	 * Creo un escaner para introducir el texto.
	 */
	static Scanner productoIntroduce = new Scanner(System.in);
	
	
	/**
	 * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parametros es cero, el resultado sera cero.
 *     <li>Si la multiplicacion resulta demasiado alta, da error.
 *     <li>Si se multiplicaran dos numeros negativos, saldran  positivos
 *     <li>Si se multiplica un decimal, saldra el resultado.
 *  </ul>
	 * <h1>Metodo disenado para multiplicar dos numeros reales.</h1>
	 * @param multiplo es el primer numero que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicacion, el orden no importa.
	 * @param resultado es la solucion de la operacion.
	 * @return otorga la solucion recien obtenida
	 */
	public static double ProductoVariedad1(double multiplo, double multiplo2) {
		double resultado = multiplo * multiplo2;
		return resultado;
	}
	
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parametros es cero, el resultado sera cero.
 *     <li>Si la multiplicacion resulta demasiado alta, da error.
 *     <li>Si se multiplicaran dos numeros negativos, saldran  positivos
 *     <li>Si se multiplica un decimal, dara error.
 *  </ul>
	 * <h1>Metodo disenado para multiplicar dos numeros enteros.</h1>
	 * @param multiplo es el primer numero que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicacion, el orden no importa.
	 * @param resultado es la solucion de la operacion.
	 * @return otorga la solucion recien obtenida
	 */
    public static int ProductoVariedad2(int multiplo, int multiplo2) {
		int resultado = multiplo * multiplo2;
		return resultado;
}
    
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si uno de los parametros es cero, el resultado sera cero.
 *     <li>Si la multiplicacion resulta demasiado alta, da error.
 *     <li>Si se multiplicaran tres numeros negativos, saldra negativo.
 *     <li>Si se multiplica por un decimal, muestra el resultado.
 *  </ul>
	 * <h1>Método diseñado para multiplicar tres números reales.</h1>
	 * @param multiplo es el primer número que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicación, el orden no importa.
	 * @param resultado es la solución de la operación.
	 * @return otorga la solución recién obtenida
	 */
    public static double ProductoVariedad3(double multiplo, double multiplo2, double multiplo3){
    
		double resultado = multiplo * multiplo2 * multiplo3;
		return resultado;
	}
    
	/**
	 *  * <h1>Casos especiales:</h1>
 *  <ul>
 *     <li>Si la base es cero, el resultado sera cero.
 *     <li>Si la potencia es demasiado alta, da error.
 *     <li>Si el exponente es cero, el resultado sera uno.
 *     <li>Si el exponente es un medio, se calculara la raiz cuadrada de la base.
 *     <LI>Si la base es negativa devuelve resultado.
 *  </ul>
	 * <h1>Metodo disenado para calcular la potencia de un numero real elevado a otro.</h1>
	 * @param multiplo es el primer numero que vamos a multiplicar. 
	 * @param multiplo2 es el segundo. Al ser una multiplicacion, el orden no importa.
	 * @param resultado es la solucion de la operacion.
	 * @return otorga la solucion recien obtenida
	 */
    public static double ProductoVariedad4(double base, double exponente) {
		double resultado = (Math.pow(base, exponente));
		return resultado;
	}
}