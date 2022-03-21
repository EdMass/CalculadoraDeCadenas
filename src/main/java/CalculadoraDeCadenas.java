import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculadoraDeCadenas {

    private String[] listaStrings = null;


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
        Pattern pat = Pattern.compile(".*"+delimitador+".*");
        Matcher mat = pat.matcher(cadena);
        int suma = 0;
        if(mat.matches()){
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


    public static void main(String[] args) throws Exception {
        CalculadoraDeCadenas calculadoraDeCadenas = new CalculadoraDeCadenas();

        System.out.println(calculadoraDeCadenas.separarYSumar("1 ==2== 3","== "));
    }

}
