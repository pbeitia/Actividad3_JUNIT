import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {
	
	//CONFIGURO LA CLASE PARA LLEVAR A CABO LAS PRUEBAS
	private Resta res;
	
	@BeforeEach 
	public void setup() {
		res = new Resta();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	//PRUEBO LA RESTA TIPO UNO
	@Test
	void laRestaDe4Menos2Es2Double() {
		//1 PREPARACION
		double num1 = 4;
		double num2 = 2;
		double esperando = 2;
		
		//2 EJECUCION
		double obtenido = res.restaTipoUno(num1, num2);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	//Y SUS EXCEPCIONES
	@Test 
	void laRestaDe4MenosMenos2Es6Double() {
		//1-PREPARACION
		double num1 = 4;
		double num2 = -2;
		double esperando = 6;
		
		//2-EJECUCION
		double obtenido = res.restaTipoUno(num1,num2);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 6");
	}
	
	@Test
	void laRestaDe2Menos0Es2Double() {
		//1-PREPARACION
		double num1 = 2;
		double num2 = 0;
		double esperando = 2;
		
		//2-EJECUCION
		double obtenido = res.restaTipoUno(num1,num2);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	//PRUEBO LA RESTA TIPO 2	
	@Test
	void laRestaDe6Menos2Es4Int() {
		//1-PREPARACIÓN
		int num1 = 6;
		int num2 = 2;
		int esperando = 4;
		
		//2-EJECUCIÓN
		int obtenido = res.restaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	//Y SUS EXCEPCIONES
	@Test 
	void laRestaDe4MenosMenos2Es6Int() {
		//1-PREPARACION
		int num1 = 4;
		int num2 = -2;
		int esperando = 6;
		
		//2-EJECUCION
		int obtenido = res.restaTipoDos(num1,num2);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 6");
	}
	
	@Test
	void laRestaDe2Menos0Es2Int() {
		//1-PREPARACION
		int num1 = 2;
		int num2 = 0;
		int esperando = 2;
		
		//2-EJECUCION
		int obtenido = res.restaTipoDos(num1,num2);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	//PRUEBO LA RESTA TIPO 3
	@Test
	void laRestaDe10Menos4Menos3Es3Double() {
		//1-PREPARACION
		double num1 = 10;
		double num2 = 4;
		double num3 = 3;
		double esperando = 3;
		
		//2-EJECUCION
		double obtenido = res.restaTipoTres(num1, num2, num3);
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 3");
	}
	
//Y SU EXCEPCION
	@Test
	void laRestaDe2Menos0Menos0Es2Double() {
		//1-PREPARACION
		double num1 = 2;
		double num2 = 0;
		double num3 = 0;
		double esperando = 2;
		
		//2-EJECUCION
		double obtenido = res.restaTipoTres(num1, num2, num3);
		
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	//PRUEBO LA RESTA TIPO 4
	@Test
	void laAcumulacionMenos2EsMenos2Double() {
		//1-PREPARACION
		double acumulador = 0;
		double num = 2;
		double esperando = -2;
		//2-EJECUCION
		double obtenido = res.restaTipoCuatro(acumulador, num);
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser -2");
	}
	
	//Y SU EXCEPCION
	@Test
	void laAcumulaciónMenos0Es0Double() {
		//1-PREPARACION
		double acumulador = 0;
		double num = 0;
		double esperando = -0;
		//2-EJECUCION
		double obtenido = res.restaTipoCuatro(acumulador, num);
		//3-COMPROBACION
		assertEquals(esperando, obtenido,"El resultado debe ser 0");		
	}
	
}