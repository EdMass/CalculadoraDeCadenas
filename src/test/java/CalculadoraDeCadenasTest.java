import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeCadenasTest {

    public CalculadoraDeCadenas calculadoraDeCadenas = new CalculadoraDeCadenas();

    @Test
    public void cadenaVaciaTest() throws Exception{
        int esperado = 0;
        int obtenido = calculadoraDeCadenas.cadenaVacia("");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void sumaDosNumerosPorComaTest() throws Exception {
        int esperado = 3;
        int obtenido = calculadoraDeCadenas.sumaDosNumerosPorComaOSalto("1,2");
        assertEquals(esperado, obtenido);
    }

        @Test
        public void sumaDosNumerosPorSaltoTest() throws Exception{
        int esperado2 = 3;
        int obtenido2 = calculadoraDeCadenas.sumaDosNumerosPorComaOSalto("1\n2");
        assertEquals(esperado2, obtenido2);
    }

    @Test
    public void separarYSumarTest() throws Exception{
        int esperado2 = 6;
        int obtenido2 = calculadoraDeCadenas.separarYSumar("1#2#3","#");
        assertEquals(esperado2, obtenido2);
    }

}