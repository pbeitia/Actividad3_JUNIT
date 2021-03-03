//Importo las clases necesarias
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Creo la clase ProductoTest para realizar las pruebas
class ProductoTest {
	
	//Preparo las pruebas
	private Producto prod;
	
	@BeforeEach //PREPARAR
	public void setup() {
		prod = new Producto();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	//PRODUCTO TIPO UNO-------------------------------------------------
	
	@Test //Prueba normal
	void laMultiplicacionDe2Por2Es4Double() {
		//1-PREPARACIÓN
		double multiplo = 2;
		double multiplo2 = 2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad1(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si uno de los parametros es cero, el resultado sera cero.
	void laMultiplicacionDe0Por2Es0Double() {
		//1-PREPARACIÓN
		double multiplo = 0;
		double multiplo2 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad1(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si la multiplicacion resulta demasiado alta, da error.
	void laMultiplicacionDe999999999Por2EsErrorDouble() {
		//1-PREPARACIÓN
		double multiplo = 999999999;
		double multiplo2 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad1(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test //Si se multiplicaran dos numeros negativos, saldran  positivos
	void laMultiplicacionDeMenos2PorMenos2Es4Double() {
		//1-PREPARACIÓN
		double multiplo = -2;
		double multiplo2 = -2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad1(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si se multiplica un decimal, saldrá el resultado.
	void laMultiplicacionDe2coma2Por2Es4coma4Double() {
		//1-PREPARACIÓN
		double multiplo = 2.2;
		double multiplo2 = 2;
		double esperando = 4.4;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad1(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4.4");
	}
	
	//PRODUCTO TIPO DOS-------------------------------------------------	
	@Test //Prueba normal
	void laMultiplicacionDe2Por2Es4Int() {
		//1-PREPARACIÓN
		int multiplo = 2;
		int multiplo2 = 2;
		int esperando = 4;
		
		//2-EJECUCIÓN
		int obtenido = prod.ProductoVariedad2(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si uno de los parametros es cero, el resultado sera cero.
	void laMultiplicacionDe0Por2Es0Int() {
		//1-PREPARACIÓN
		int multiplo = 0;
		int multiplo2 = 2;
		int esperando = 0;
		
		//2-EJECUCIÓN
		int obtenido = prod.ProductoVariedad2(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si la multiplicacion resulta demasiado alta, da error.
	void laMultiplicacionDe999999999Por2EsErrorInt() {
		//1-PREPARACIÓN
		int multiplo = 999999999;
		int multiplo2 = 2;
		int esperando = 0;
		
		//2-EJECUCIÓN
		int obtenido = prod.ProductoVariedad2(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test //Si se multiplicaran dos numeros negativos, saldran  positivos
	void laMultiplicacionDeMenos2PorMenos2Es4Int() {
		//1-PREPARACIÓN
		int multiplo = -2;
		int multiplo2 = -2;
		int esperando = 4;
		
		//2-EJECUCIÓN
		int obtenido = prod.ProductoVariedad2(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si se multiplica un decimal, dará ERROR.
	void laMultiplicacionDe2coma2Por2EsErrorInt() {
		//1-PREPARACIÓN
		int multiplo = 2.2;
		int multiplo2 = 2;
		int esperando = 4.4;
		
		//2-EJECUCIÓN
		int obtenido = prod.ProductoVariedad2(multiplo, multiplo2);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4.4");
	}
	
	
	//PRODUCTO TIPO TRES-------------------------------------------------
	
	@Test //Prueba normal
	void laMultiplicacionDe2Por2Por2Es8Double() {
		//1-PREPARACIÓN
		double multiplo = 2;
		double multiplo2 = 2;
		double multiplo3 = 2;
		double esperando = 8;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad3(multiplo, multiplo2,multiplo3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 8");
	}
	
	@Test //Si uno de los parametros es cero, el resultado sera cero.
	void laMultiplicacionDe0Por2Por2Es0Double() {
		//1-PREPARACIÓN
		double multiplo = 0;
		double multiplo2 = 2;
		double multiplo3 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad3(multiplo, multiplo2,multiplo3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si la multiplicacion resulta demasiado alta, da error.
	void laMultiplicacionDe999999999Por2Por2EsErrorDouble() {
		//1-PREPARACIÓN
		double multiplo = 999999999;
		double multiplo2 = 2;
		double multiplo3 = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad3(multiplo, multiplo2,multiplo3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test //Si se multiplicaran tres numeros negativos, saldra  negativo
	void laMultiplicacionDeMenos2PorMenos2PorMenos2EsMenos8Double() {
		//1-PREPARACIÓN
		double multiplo = -2;
		double multiplo2 = -2;
		double multiplo3 = -2;
		double esperando = -8;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad3(multiplo, multiplo2,multiplo3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -8");
	}
	
	@Test //Si se multiplica por un decimal, saldrá el resultado.
	void laMultiplicacionDe2coma2Por2Por2Es8coma8Double() {
		//1-PREPARACIÓN
		double multiplo = 2.2;
		double multiplo2 = 2;
		double multiplo3 = 2;
		double esperando = 8.8;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad3(multiplo, multiplo2,multiplo3);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 8.8");
	}
	
	
	//PRODUCTO TIPO CUATRO-------------------------------------------------
	
	@Test //Prueba Normal
	void laPotenciaDe2a2es4Double() {
		//1-PREPARACIÓN
		double base = 2;
		double exponente = 2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	@Test //Si la base es cero, el resultado sera cero
	void laPotenciaDe0a2es4Double() {
		//1-PREPARACIÓN
		double base = 0;
		double exponente = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test //Si la potencia es demasiado alta, da error.
	void laPotenciaDe999999999a2esErrorDouble() {
		//1-PREPARACIÓN
		double base = 999999999;
		double exponente = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser ERROR");
	}
	
	@Test //Si el exponente es cero, el resultado sera uno.
	void laPotenciaDe2a0Es1Double() {
		//1-PREPARACIÓN
		double base = 2;
		double exponente = 0;
		double esperando = 1;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 1");
	}
	
	@Test//Si la base o exponente es decimal, devuelve el resultado.
		//Si el exponente es un medio, se calculara la raiz cuadrada de la base.
	
	void laPotenciaDe25a1coma5Es125Double() {
		//1-PREPARACIÓN
		double base = 25;
		double exponente = 1.5;
		double esperando = 125;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 125");
	}
	
	@Test //Si la base es negativa devuelve resultado.
	void laPotenciaDeMenos2a2Es4Double() {
		//1-PREPARACIÓN
		double base = -2;
		double exponente = 2;
		double esperando = 4;
		
		//2-EJECUCIÓN
		double obtenido = prod.ProductoVariedad4(base, exponente);
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 4");
	}
	
	
}