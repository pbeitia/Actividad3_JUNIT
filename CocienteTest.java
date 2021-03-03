import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocienteTest {
	
	private Cociente coc;
	
	@BeforeEach //PREPARAR
	public void setup() {
		coc = new Cociente();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
//COCIENTE TIPO UNO-------------------------------------------------------
	@Test
	void laDivisionDe2y2Es1Double() {
		//1-PREPARACIÓN
		double dividendo = 2;
		double divisor = 2;
		double esperando = 1;
		
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoUno(dividendo,divisor );
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 1");
	}
	
	@Test//caso especial
	void laDivisionDe0y2Es0Double() {
		//1-PREPARACIÓN
		double dividendo = 0;
		double divisor = 2;
		double esperando = 0;
		
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoUno(dividendo,divisor );
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
	}
	
	@Test//caso especial      //Da error dado que no se puede dividir
	void laDivisionDe2y0EsErrorDouble() {
		//1-PREPARACIÓN
		double dividendo = 2;
		double divisor = 0;
		double esperando = 0;
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoUno(dividendo,divisor );
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser error");
	
	}
	
	@Test//caso especial
	void laDivisionDe2y1NegativoEsMenos2Double() {
		//1-PREPARACIÓN
		double dividendo = 2;
		double divisor = -1;
		double esperando = -2;
		
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoUno(dividendo,divisor );
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -2");
	
	}
	
	@Test//caso especial
	void laDivisionDe2y3NoEsExactaDouble() {
		//1-PREPARACIÓN
		double dividendo = 2;
		double divisor = 3;
		double esperando = 0.67;
		
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoUno(dividendo,divisor );
		
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0.667");
	
	}
//COCIENTE TIPO DOS-------------------------------------------------------
	@Test
	void laDivisionDe2y2Es1Int() {
		//1-PREPARACIÓN
		int dividendo = 2;
		int divisor = 2;
		int esperando = 1;
			
		//2-EJECUCIÓN
		int obtenido = coc.CocienteTipoDos(divisor,dividendo);
			
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 1");
		}
	
	@Test//caso especial
	void  laDivisionDe0y2Es0Int() {
		//1-PREPARACIÓN
		int dividendo = 0;
		int divisor = 2;
		int esperando = 0;
			
		//2-EJECUCIÓN
		int obtenido = coc.CocienteTipoDos(divisor,dividendo);
			
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0");
		}
	
	@Test//caso especial
	void  laDivisionDe2y0EsErrorInt() {
		//1-PREPARACIÓN
		int dividendo = 2;
		int divisor = 0;
		int esperando = 0;//debe dar error
			
		//2-EJECUCIÓN
		int obtenido = coc.CocienteTipoDos(divisor,dividendo);
			
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser error");
		}
	
	@Test//caso especial
	void  laDivisionDe2y1NegativoEsMenos2Int() {
		//1-PREPARACIÓN
		int dividendo = 2;
		int divisor = -1;
		int esperando = -2;
			
		//2-EJECUCIÓN
		int obtenido = coc.CocienteTipoDos(divisor,dividendo);
			
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -2");
		}
	
	@Test//caso especial
	void  laDivisionDe2y3NoEsExactaInt() {
		//1-PREPARACIÓN
		int dividendo = 2;
		int divisor = 3;
		int esperando = 1;
			
		//2-EJECUCIÓN
		int obtenido = coc.CocienteTipoDos(divisor,dividendo);
			
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 1");
		}
	
//COCIENTE TIPO TRES-------------------------------------------------------
	@Test
	void InversoNumeroRealUnoEntreCuatro() {
		//1-PREPARACIÓN
		double numeroReal1 = 4;
		double resultado = 0.25;
		double esperando= 0.25;
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoTres(resultado,numeroReal1);
				
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0.25");
		}
	
	@Test//caso especial
	void InversoNumeroRealUnoEntreCeroError() {
		//1-PREPARACIÓN
		double numeroReal1 = 0;
		double resultado = 0;//debe dar error
		double esperando= 0;
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoTres(resultado,numeroReal1);
				
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser Error");
		}
	
	@Test//caso especial
	void InversoNumeroRealUnoEntreMenosCuatro() {
		//1-PREPARACIÓN
		double numeroReal1 = 4;
		double resultado = -0.25;
		double esperando= -0.25;
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoTres(resultado,numeroReal1);
				
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser -0.25");
		}
	
	@Test//caso especial
	void InversoNumeroConDecimalesUnoEntreCuatroComaCinco() {
		//1-PREPARACIÓN
		double numeroReal1 = 4.5;
		double resultado = 0.22;
		double esperando= 0.22;
		//2-EJECUCIÓN
		double obtenido = coc.CocienteTipoTres(resultado,numeroReal1);
				
		//3-COMPROBAR
		assertEquals(esperando, obtenido,"El resultado debe ser 0.22");
		}
	//COCIENTE TIPO CUATRO-------------------------------------------------------
		@Test
		void RaizCuadradaDeNueve() {
			//1-PREPARACIÓN
			double raiz = 9;
			double resultado = 3;
			double esperando = 3;
			//2-EJECUCIÓN
			double obtenido = coc.CocienteTipoCuatro(resultado,raiz);
					
			//3-COMPROBAR
			assertEquals(esperando, obtenido,"El resultado debe ser 3");
			}
		
		@Test//caso especial
		void RaizCuadradaDeMenosNueve() {
			//1-PREPARACIÓN
			double raiz = -9;
			double resultado = 0;//debe dar error
			double esperando = 0;
			//2-EJECUCIÓN
			double obtenido = coc.CocienteTipoCuatro(resultado,raiz);
					
			//3-COMPROBAR
			assertEquals(esperando, obtenido,"El resultado debe ser Error");
			}
		
		@Test//caso especial
		void RaizCuadradaDeNueveComaCinco() {
			//1-PREPARACIÓN
			double raiz = 9.5;
			double resultado = 3.08;
			double esperando = 3.08;
			//2-EJECUCIÓN
			double obtenido = coc.CocienteTipoCuatro(resultado,raiz);
					
			//3-COMPROBAR
			assertEquals(esperando, obtenido,"El resultado debe ser 3,08");
			}
		
		@Test//caso especial
		void RaizCuadradaDeCero() {
			//1-PREPARACIÓN
			double raiz = 0;
			double resultado = 0;
			double esperando = 0;
			//2-EJECUCIÓN
			double obtenido = coc.CocienteTipoCuatro(resultado,raiz);
					
			//3-COMPROBAR
			assertEquals(esperando, obtenido,"El resultado debe ser 0");
			}
}