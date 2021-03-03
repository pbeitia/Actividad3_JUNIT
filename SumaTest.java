//Importo las clases necesarias
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Creo la clase SumaTest para realizar las pruebas
class SumaTest {
	
	//Preparo las pruebas
	private Suma sum;
	
	@BeforeEach
	public void setup() {
		sum = new Suma();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	//SUMA TIPO UNO-------------------------------------------------------
	
	@Test //Prueba Normal
	void laSumaDe2Mas2Es4Double() {
		//1-PREPARACIÓN
		double num1 = 2;
		double num2 = 2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si algun numero es negativo, la suma se realiza igual.
	void laSumaDeMenos2Mas2Es0Double() {
		//1-PREPARACIÓN
		double num1 = -2;
		double num2 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si algun numero es 0, la suma se realiza de la misma forma.
	void laSumaDe0Mas2coma2Es2coma2Double() {
		//1-PREPARACIÓN
		double num1 = 0;
		double num2 = 2.2;
		double esperando = 2.2;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2.2");
	}
	
	@Test //Si algun numero es decimal, la suma se realiza de la misma forma.
	void laSumaDe2coma2Mas2coma2Es4coma4Double() {
		//1-PREPARACIÓN
		double num1 = 2.2;
		double num2 = 2.2;
		double esperando = 4.4;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4.4");
	}
	
	@Test //Si algun numero es demasiado alto da error.
	void laSumaDe999999999Mas2Es4ErrorDouble() {
		//1-PREPARACIÓN
		double num1 = 999999999;
		double num2 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	
	//SUMA TIPO DOS-------------------------------------------------------
	
	@Test //Prueba Normal
	void laSumaDe2Mas2Es4Int() {
		//1-PREPARACIÓN
		int num1 = 2;
		int num2 = 2;
		int esperando = 4;
		
		//2-EJECUCIÓN
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si algun numero es negativo, devuelve el resultado.
	void laSumaDeMenos2Mas2Es0Int() {
		//1-PREPARACIÓN
		int num1 = -2;
		int num2 = 2;
		int esperando = 0;
		
		//2-EJECUCIÓN
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si algun numero es 0, la suma se realiza de la misma forma.
	void laSumaDe0Mas2Es2Int() {
		//1-PREPARACIÓN
		int num1 = 0;
		int num2 = 2;
		int esperando = 2;
		
		//2-EJECUCIÓN
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	@Test //Si algun numero es decimal, la suma no se realizaria porque es con numeros enteros.
	void laSumaDe2coma2Mas0EsErrorInt() {
		//1-PREPARACIÓN
		int num1 = 2.2;
		int num2 = 0;
		int esperando = 2.2;
		
		//2-EJECUCIÓN
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test //Si algun numero es demasiado alto da error.
	void laSumaDe999999999Mas2EsErrorInt() {
		//1-PREPARACIÓN
		int num1 = 999999999;
		int num2 = 2;
		int esperando = 0;
		
		//2-EJECUCIÓN
		int obtenido = sum.sumaTipoDos(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	
	//SUMA TIPO TRES-------------------------------------------------------
	
	@Test
	void laSumaDe2Mas2Mas2Es6Double() {
		//1-PREPARACIÓN
		double num1 = 2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 6;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 6");
	}
	
	@Test
	void laSumaDe2coma2Mas2Mas2Es6coma2Double() {
		//1-PREPARACIÓN
		double num1 = 2.2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 6.2;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 6.2");
	}
	
	@Test
	void laSumaDe0Mas2Mas2Es4Double() {
		//1-PREPARACIÓN
		double num1 = 0;
		double num2 = 2;
		double num3 = 2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test
	void laSumaDeMenos2Mas2Mas2Es2Double() {
		//1-PREPARACIÓN
		double num1 = -2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 2;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	@Test //Si algun numero es demasiado alto da error.
	void laSumaDe999999999Mas2MasEsErrorDouble() {
		//1-PREPARACIÓN
		double num1 = 999999999;
		double num2 = 2;
		double num3 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	
	//SUMA TIPO CUATRO-------------------------------------------------------
	
	@Test //Prueba Normal
	void laAcumulaciónDe2Es2Double() {
		//1-PREPARACIÓN
		double num = 2;
		double esperando = 2;
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	@Test //Si algun numero es negativo, se sumaria al acumulador.
	void laAcumulaciónDeMenos2EsMenos2Double() {
		//1-PREPARACIÓN
		double num = -2;
		double esperando = -2;
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -2");
	}
	
	@Test //Si algun numero es 0, sumaria al acumulador.
	void laAcumulaciónDe0Es0Double() {
		//1-PREPARACIÓN
		double num = 0;
		double esperando = 0;
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si algun numero es decimal, sumaria al acumulador.
	void laAcumulaciónDe2coma2Es2coma2Double() {
		//1-PREPARACIÓN
		double num = 2.2;
		double esperando = 2.2;
		//2-EJECUCIÓN
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2.2");
	}
	
}

