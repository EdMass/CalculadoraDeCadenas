import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeCadenas {

    private String[] listaStrings = null;
    private String delimitador;

    public int validacionCadena(String cadena) throws Exception{
        if(cadena.length() == 0){
            return 0;
        }if(Integer.parseInt(cadena) < 0){
            throw new Exception("El valor es negativo y no aplica");
        }if(Integer.parseInt(cadena) > 1000){
            throw new Exception("El valor es mayor a mil y no aplica");
        }else {
            return Integer.parseInt(cadena);
        }
    }

    public int sumaDosNumerosPorComaOSalto (String cadena){
        listaStrings = cadena.split("[,|\n]");
        int suma = 0;
        for (String elemento:listaStrings) {
            suma += Integer.parseInt(elemento);
        }
        return suma;
    }

    public int separarYSumar(String cadena, String delimitador) throws Exception{
        cadena = cadena.replace(" ","");
        delimitador = delimitador.replace(" ","");
        this.delimitador = delimitador;
        int suma = 0;
        String deli =""+cadena.charAt(1);
        if(deli.equals(delimitador)){
            String[] listaModificada = null;
            listaModificada = cadena.split(delimitador);
            for (String elemento:listaModificada) {
                suma += Integer.parseInt(elemento);
            }
            return suma;

        } else{
            throw new IllegalArgumentException("El delimitador debe ser el mismo");
        }
    }

    public void validacionNegativoYMayorAMil(String cadena) throws Exception{
        int valor= Integer.parseInt(cadena);
        if(valor < 0){
            throw new Exception("El valor es negativo y no aplica");
        }if(valor > 1000){
            throw new Exception("El valor es mayor a mil y no aplica");
        }
    }


    public static void main(String[] args) throws Exception {
        CalculadoraDeCadenas calculadoraDeCadenas = new CalculadoraDeCadenas();

        System.out.println(calculadoraDeCadenas.separarYSumar("1 \n2\n3"," \n"));
    }

}
