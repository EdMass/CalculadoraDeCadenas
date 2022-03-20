import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraDeCadenasTest {

    public CalculadoraDeCadenas calculadoraDeCadenas = new CalculadoraDeCadenas();

    @Test
    public void cadenaVaciaTest() throws Exception{
        int esperado = 0;
        int obtenido = calculadoraDeCadenas.validacionCadena("");
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

    @Test
    void exceptionNegativeTesting() {
        Exception thrown = assertThrows(Exception.class, () ->
                calculadoraDeCadenas.validacionCadena("-1"));
        assertEquals("El valor es negativo y no aplica", thrown.getMessage());
    }

    @Test
    void exceptionThousandTesting() {
        Exception thrown = assertThrows(Exception.class, () ->
                calculadoraDeCadenas.validacionCadena("1001"));
        assertEquals("El valor es mayor a mil y no aplica", thrown.getMessage());
    }

}