import java.util.Scanner;

/**
 * Esta clase pertenece a la operaciï¿½n suma de la calculadora
 * @author Grupo 
 * @version 2.0
 * @since 22/02/2021
 */
public class Suma extends Principal{
	static Scanner leer = new Scanner(System.in);
	
	/**
	 * Método que suma dos números reales, con dos parámetros de entrada (num1 y num2) y un parámetro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si algun numero es negativo, la suma se realiza igual.
	 *		<li>Si algun numero es 0, la suma se realiza de la misma forma.
	 *		<li>Si algun numero es decimal, la suma se realiza de la misma forma.
	 *		<li>Si algun numero es demasiado alto da error.
	 *	</ul>
	 *
	 * @param num1 Primer numero de tipo real para operar en la suma
	 * @param num2 Segundo numero de tipo real  para operar en la suma
	 * @param resultado Resultado final de la suma de los dos nï¿½meros
	 * @return Devuelve el resultado
	 * 
	 */
	public static double sumaTipoUno(double num1, double num2) {
		double resultado = 0;
		resultado = num1 + num2;
		return resultado;
	}
	
	/**
	 * Mï¿½todo que suma dos numero enteros, con dos parametros de entrada (num1 y num2) y un parametro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si algun numero es negativo, la suma da ERROR.
	 *		<li>Si algun numero es 0, la suma se realiza de la misma forma.
	 *		<li>Si algun numero es decimal, la suma no se realizaria porque es con numeros enteros.
	 *	</ul>
	 *
	 * @param num1 Primer numero de tipo entero para operar en la suma
	 * @param num2 Segundo numero de tipo entero para operar en la suma
	 * @param resultado Resultado final de la suma de los dos numeros
	 * @return
	 */
	public static int sumaTipoDos(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	/**
	 * Metodo que suma 3 numeros reales, con 3 parametros de entrada (num1, num2, num3) y un parametro de salida (resultado).
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si algun numero es negativo, la suma se realiza igual.
	 *		<li>Si algun numero es 0, la suma se realiza de la misma forma.
	 *		<li>Si algun numero es decimal, la suma se realizaria de la misma forma.
	 *	</ul>
	 *
	 * @param num1 Primer numero real para operar en la suma
	 * @param num2 Segundo numero real  para operar en la suma
	 * @param num3 Tercer numero real para operar en la suma
	 * @param resultado Variable que almacena el resultado de la suma
	 * @return
	 */
	public static double sumaTipoTres(double num1,double num2,double num3) {
		double resultado = num1 + num2 + num3;
		return resultado;
	}
	
	/**
	 * Metodo que acumula el valor del numero que escribas. Tiene 1 parametro de entrada (num) y un acumulador que almacena el valor.
	 * 
	 *Casos Especiales:
	 *
	 * 	<ul>
	 *		<li>Si algun numero es negativo, se sumaria al acumulador.
	 *		<li>Si algun numero es 0, sumaria al acumulador.
	 *		<li>Si algun numero es decimal, sumaria al acumulador.
	 *	</ul>
	 *
	 * @param num Numero que mete el usuario y se acumula.
	 * @param acumulador Variable encargada de acumular los numeros introducidos.
	 * @return Devuelve el acumulador
	 */
	public static double sumaTipoCuatro(double num) {
		double acumulador = 0;
		acumulador = acumulador + num;
		return acumulador;
	}

}
