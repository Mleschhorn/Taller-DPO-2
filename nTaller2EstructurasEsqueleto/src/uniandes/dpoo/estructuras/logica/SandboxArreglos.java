package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de mÃ©todos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los mÃ©todos deben operar sobre los atributos ArreglosEnteros y ArreglosCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los mÃ©todos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulaciÃ³n de arreglos).
 */
public class SandboxArreglos {
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] ArreglosEnteros;
    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] ArreglosCadenas;
    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0).
     */

    public SandboxArreglos() {
        ArreglosEnteros = new int[0]; 
        ArreglosCadenas = new String[0];
    }
    /**
     * Retorna una copia del arreglo de enteros, es decir, un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original.
     * @return Una copia del arreglo de enteros.
     */

    public int[] getCopiaEnteros() {
        return ArreglosEnteros.clone();
    }
    /**
     * Retorna una copia del arreglo de cadenas, es decir, un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original.
     * @return Una copia del arreglo de cadenas.
     */

    public String[] getCopiaCadenas() {
        return ArreglosCadenas.clone();
    }
    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */

    public int getCantidadEnteros() {
        return ArreglosEnteros.length;
    }
    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */

    public int getCantidadCadenas() {
        return ArreglosCadenas.length;
    }
    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este mÃ©todo siempre deberÃ­a aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */

    public void agregarEntero(int entero) {
        ArreglosEnteros = Arrays.copyOf(ArreglosEnteros, ArreglosEnteros.length + 1);
        ArreglosEnteros[ArreglosEnteros.length - 1] = entero;
    }
    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este mÃ©todo siempre deberÃ­a aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */

    public void agregarCadena(String cadena) {
        ArreglosCadenas = Arrays.copyOf(ArreglosCadenas, ArreglosCadenas.length + 1);
        ArreglosCadenas[ArreglosCadenas.length - 1] = cadena;
    }
    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero(int valor) {
        int count = 0;
        for (int i = 0; i < ArreglosEnteros.length; i++) {
            if (ArreglosEnteros[i] == valor) {
                count++;
            }
        }
        if (count > 0) {
            int[] nuevoArreglo = new int[ArreglosEnteros.length - count];
            int index = 0;
            for (int i = 0; i < ArreglosEnteros.length; i++) {
                if (ArreglosEnteros[i] != valor) {
                    nuevoArreglo[index++] = ArreglosEnteros[i];
                }
            }
            ArreglosEnteros = nuevoArreglo;
        }
    }
    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */

    public void eliminarCadena(String cadena) {
        int count = 0;
        for (String s : ArreglosCadenas) {
            if (s.equals(cadena)) {
                count++;
            }
        }
        if (count > 0) {
            String[] nuevoArreglo = new String[ArreglosCadenas.length - count];
            int index = 0;
            for (String s : ArreglosCadenas) {
                if (!s.equals(cadena)) {
                    nuevoArreglo[index++] = s;
                }
            }
            ArreglosCadenas = nuevoArreglo;
        }
    }
    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posiciÃ³n donde debe quedar el nuevo valor en el arreglo aumentado. Si la posiciÃ³n es menor a 0, se inserta el valor en la primera posiciÃ³n. Si la
     *        posiciÃ³n es mayor que el tamaÃ±o del arreglo, se inserta el valor en la Ãºltima posiciÃ³n.
     */
    public void insertarEntero(int entero, int posicion) {
        if (posicion < 0) {
            posicion = 0;
        } else if (posicion > ArreglosEnteros.length) {
            posicion = ArreglosEnteros.length;
        }
        int[] nuevoArreglo = new int[ArreglosEnteros.length + 1];
        System.arraycopy(ArreglosEnteros, 0, nuevoArreglo, 0, posicion);
        nuevoArreglo[posicion] = entero;
        System.arraycopy(ArreglosEnteros, posicion, nuevoArreglo, posicion + 1, ArreglosEnteros.length - posicion);
        ArreglosEnteros = nuevoArreglo;
    }
    /**
     * Elimina un valor del arreglo de enteros dada su posiciÃ³n.
     * @param posicion La posiciÃ³n donde estÃ¡ el elemento que debe ser eliminado. Si el parÃ¡metro posicion no corresponde a ninguna posiciÃ³n del arreglo de enteros, el mÃ©todo
     *        no debe hacer nada.
     */

    public void eliminarEnteroPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < ArreglosEnteros.length) {
            int[] nuevoArreglo = new int[ArreglosEnteros.length - 1];
            System.arraycopy(ArreglosEnteros, 0, nuevoArreglo, 0, posicion);
            System.arraycopy(ArreglosEnteros, posicion + 1, nuevoArreglo, posicion, ArreglosEnteros.length - posicion - 1);
            ArreglosEnteros = nuevoArreglo;
        }
    }
    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parÃ¡metro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros deberÃ­a quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArreglosEnteros(double[] valores) {
        ArreglosEnteros = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            ArreglosEnteros[i] = (int) valores[i];
        }
    }
    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parÃ¡metro 'objetos'.
     * 
     * Use el mÃ©todo toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArreglosCadenas(Object[] objetos) {
        ArreglosCadenas = new String[objetos.length];
        for (int i = 0; i < objetos.length; i++) {
            ArreglosCadenas[i] = objetos[i].toString();
        }
    }
    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posiciÃ³n habÃ­a un valor negativo, despuÃ©s de ejecutar el mÃ©todo debe quedar el mismo valor muliplicado por -1.
     */

    public void volverPositivos() {
        for (int i = 0; i < ArreglosEnteros.length; i++) {
            if (ArreglosEnteros[i] < 0) {
                ArreglosEnteros[i] = -ArreglosEnteros[i];
            }
        }
    }
    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */

    public void organizarEnteros() {
        Arrays.sort(ArreglosEnteros);
    }
    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicogrÃ¡ficamente.
     */
    public void organizarCadenas() {
        Arrays.sort(ArreglosCadenas);
    }
    /**
     * Cuenta cuÃ¡ntas veces aparece el valor recibido por parÃ¡metro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones(int valor) {
        int count = 0;
        for (int i : ArreglosEnteros) {
            if (i == valor) {
                count++;
            }
        }
        return count;
    }
    /**
     * Cuenta cuÃ¡ntas veces aparece la cadena recibida por parÃ¡metro en el arreglo de cadenas.
     * 
     * La bÃºsqueda no debe diferenciar entre mayÃºsculas y minÃºsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */

    public int contarApariciones(String cadena) {
        int count = 0;
        for (String s : ArreglosCadenas) {
            if (s.equalsIgnoreCase(cadena)) {
                count++;
            }
        }
        return count;
    }
    /**
     * Busca en quÃ© posiciones del arreglo de enteros se encuentra el valor que se recibe en el parÃ¡metro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los nÃºmeros de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaÃ±o 0.
     */
    public int[] buscarEntero(int valor) {
        int count = contarApariciones(valor);
        if (count == 0) {
            return new int[0];
        }
        int[] posiciones = new int[count];
        int index = 0;
        for (int i = 0; i < ArreglosEnteros.length; i++) {
            if (ArreglosEnteros[i] == valor) {
                posiciones[index++] = i;
            }
        }
        return posiciones;
    }
    /**
     * Calcula cuÃ¡l es el rango de los enteros (el valor mÃ­nimo y el mÃ¡ximo).
     * @return Un arreglo con dos posiciones: en la primera posiciÃ³n, debe estar el valor mÃ­nimo en el arreglo de enteros; en la segunda posiciÃ³n, debe estar el valor mÃ¡ximo
     *         en el arreglo de enteros. Si el arreglo estÃ¡ vacÃ­o, debe retornar un arreglo vacÃ­o.
     */

    public int[] calcularRangoEnteros() {
        if (ArreglosEnteros.length == 0) {
            return new int[0];
        }
        int min = ArreglosEnteros[0];
        int max = ArreglosEnteros[0];
        for (int i = 1; i < ArreglosEnteros.length; i++) {
            if (ArreglosEnteros[i] < min) {
                min = ArreglosEnteros[i];
            }
            if (ArreglosEnteros[i] > max) {
                max = ArreglosEnteros[i];
            }
        }
        return new int[]{min, max};
    }
    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma() {
        HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int valor : ArreglosEnteros) {
            histograma.put(valor, histograma.getOrDefault(valor, 0) + 1);
        }
        return histograma;
    }
    /**
     * Cuenta cuÃ¡ntos valores dentro del arreglo de enteros estÃ¡n repetidos.
     * @return La cantidad de enteos diferentes que aparecen mÃ¡s de una vez
     */
    public int contarEnterosRepetidos() {
        HashMap<Integer, Integer> histograma = calcularHistograma();
        int count = 0;
        for (int frecuencia : histograma.values()) {
            if (frecuencia > 1) {
                count++;
            }
        }
        return count;
    }
    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idÃ©nticos y false de lo contrario
     */
    public boolean compararArreglosEnteros(int[] otroArreglo) {
        return Arrays.equals(ArreglosEnteros, otroArreglo);
    }
    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podrÃ­a ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros(int[] otroArreglo) {
        if (ArreglosEnteros.length != otroArreglo.length) {
            return false;
        }
        int[] copia1 = ArreglosEnteros.clone();
        int[] copia2 = otroArreglo.clone();
        Arrays.sort(copia1);
        Arrays.sort(copia2);
        return Arrays.equals(copia1, copia2);
    }
    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribuciÃ³n uniforme usando Math.random().
     * 
     * Los nÃºmeros en el arreglo deben quedar entre el valor mÃ­nimo y el mÃ¡ximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mÃ­nimo para los nÃºmeros generados
     * @param maximo El valor mÃ¡ximo para los nÃºmeros generados
     */
    public void generarEnteros(int cantidad, int minimo, int maximo) {
        ArreglosEnteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            ArreglosEnteros[i] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        }
    }
}