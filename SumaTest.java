import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {
	
	private Suma sum;
	
	@BeforeEach //PREPARAR
	public void setup() {
		sum = new Suma();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	//SUMA TIPO UNO-------------------------------------------------------
	@Test
	void laSumaDe2M�s2Es4Double() {
		//1-PREPARACI�N
		double num1 = 2;
		double num2 = 2;
		double esperando = 4;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test 
	void laSumaDeMenos2M�s2Es0Double() {
		//1-PREPARACI�N
		double num1 = -2;
		double num2 = 2;
		double esperando = 0;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test
	void laSumaDe0M�s2coma2Es2coma2Double() {
		//1-PREPARACI�N
		double num1 = 0;
		double num2 = 2.2;
		double esperando = 2.2;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2.2");
	}
	
	@Test
	void laSumaDe2coma2M�s2coma2Es4coma4Double() {
		//1-PREPARACI�N
		double num1 = 2.2;
		double num2 = 2.2;
		double esperando = 4.4;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoUno(num1,num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4.4");
	}
	
	//SUMA TIPO DOS-------------------------------------------------------
	
	@Test
	void laSumaDe2M�s2Es4Int() {
		//1-PREPARACI�N
		int num1 = 2;
		int num2 = 2;
		int esperando = 4;
		
		//2-EJECUCI�N
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test
	void laSumaDeMenos2M�s2EsErrorInt() {
		//1-PREPARACI�N
		int num1 = 2;
		int num2 = 2;
		int esperando = 0;
		
		//2-EJECUCI�N
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test
	void laSumaDe0M�s2Es2Int() {
		//1-PREPARACI�N
		int num1 = 0;
		int num2 = 2;
		int esperando = 2;
		
		//2-EJECUCI�N
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	@Test
	void laSumaDe2coma2M�s0EsErrorInt() {
		//1-PREPARACI�N
		int num1 = 2.2;
		int num2 = 0;
		int esperando = 2.2;
		
		//2-EJECUCI�N
		int obtenido = sum.sumaTipoDos(num1, num2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	//SUMA TIPO TRES-------------------------------------------------------
	@Test
	void laSumaDe2M�s2M�s2Es6Double() {
		//1-PREPARACI�N
		double num1 = 2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 6;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 6");
	}
	
	@Test
	void laSumaDe2coma2M�s2M�s2Es6coma2Double() {
		//1-PREPARACI�N
		double num1 = 2.2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 6.2;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 6.2");
	}
	
	@Test
	void laSumaDe0M�s2M�s2Es4Double() {
		//1-PREPARACI�N
		double num1 = 0;
		double num2 = 2;
		double num3 = 2;
		double esperando = 4;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test
	void laSumaDeMenos2M�s2M�s2Es2Double() {
		//1-PREPARACI�N
		double num1 = -2;
		double num2 = 2;
		double num3 = 2;
		double esperando = 2;
		
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoTres(num1, num2, num3);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	//SUMA TIPO CUATRO-------------------------------------------------------
	@Test
	void laAcumulaci�nDe2Es2Double() {
		//1-PREPARACI�N
		double num = 2;
		double esperando = 2;
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2");
	}
	
	@Test
	void laAcumulaci�nDeMenos2EsMenos2Double() {
		//1-PREPARACI�N
		double num = -2;
		double esperando = -2;
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -2");
	}
	
	@Test
	void laAcumulaci�nDe0Es0Double() {
		//1-PREPARACI�N
		double num = 0;
		double esperando = 0;
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test
	void laAcumulaci�nDe2coma2Es2coma2Double() {
		//1-PREPARACI�N
		double num = 2.2;
		double esperando = 2.2;
		//2-EJECUCI�N
		double obtenido = sum.sumaTipoCuatro(num);
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 2.2");
	}
	
}

