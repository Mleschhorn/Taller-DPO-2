package uniandes.dpoo.estructuras.logica;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Esta clase tiene un conjunto de mÃ©todos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los mÃ©todos deben operar sobre los atributos ListaEnteros y ListaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los mÃ©todos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulaciÃ³n de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas {
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> ListaEntero;
    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones.
     */
    private List<String> ListaCadena;
    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías.
     */

    public SandboxListas() {
        ListaEntero = new ArrayList<Integer>();
        ListaCadena = new LinkedList<String>();
    }
    /**
     * Agrega un entero a la lista de enteros.
     * @param entero El entero que se va a agregar.
     */

    public void NuevoEntero(int entero) {
        ListaEntero.add(entero);
    }
    /**
     * Agrega una cadena a la lista de cadenas.
     * @param cadena La cadena que se va a agregar.
     */

    public void NuevaCadena(String cadena) {
        ListaCadena.add(cadena);
    }
    /**
     * Retorna la lista de enteros.
     * @return La lista de enteros.
     */

    public List<Integer> getListaEnteros() {
        return ListaEntero;
    }
    /**
     * Retorna la lista de cadenas.
     * @return La lista de cadenas.
     */

    public List<String> getListaCadenas() {
        return ListaCadena;
    }
    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaÃ±o que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */

    public List<Integer> getCopiaEnteros() {
        return new ArrayList<>(ListaEntero);
    }
    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaÃ±o que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */

    public List<String> getCopiaCadenas() {
        return new ArrayList<>(ListaCadena);
    }
    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaÃ±o que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */

    public int[] getEnterosComoArreglo() {
        int[] arreglo = new int[ListaEntero.size()];
        for (int i = 0; i < ListaEntero.size(); i++) {
            arreglo[i] = ListaEntero.get(i);
        }
        return arreglo;
    }
    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */

    public int getCantidadEnteros() {
        return ListaEntero.size();
    }
    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */

    public int getCantidadCadenas() {
        return ListaCadena.size();
    }
    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este mÃ©todo siempre deberÃ­a aumentar en 1 el tamaÃ±o de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero(int entero) {
        ListaEntero.add(entero);
    }
    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este mÃ©todo siempre deberÃ­a aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */

    public void agregarCadena(String cadena) {
        ListaCadena.add(cadena);
    }
    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero(int valor) {
        for (int i = 0; i < ListaEntero.size(); i++) {
            if (ListaEntero.get(i) == valor) {
                ListaEntero.remove(i);
                i--;  
            }
        }
    }
    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena(String cadena) {
        for (int i = 0; i < ListaCadena.size(); i++) {
            if (ListaCadena.get(i).equals(cadena)) {
                ListaCadena.remove(i);
                i--;  
            }
        }
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posiciÃ³n donde debe quedar el nuevo valor en la lista aumentada. Si la posiciÃ³n es menor a 0, se inserta el valor en la primera posiciÃ³n. Si la
     *        posiciÃ³n es mayor que el tamaÃ±o de la lista, se inserta el valor en la Ãºltima posiciÃ³n.
     */

    public void insertarEntero(int entero, int posicion) {
        if (posicion < 0) {
            posicion = 0;
        } else if (posicion > ListaEntero.size()) {
            posicion = ListaEntero.size();
        }
        ListaEntero.add(posicion, entero);
    }
    /**
     * Elimina un valor de la lista de enteros dada su posiciÃ³n.
     * @param posicion La posiciÃ³n donde estÃ¡ el elemento que debe ser eliminado. Si el parÃ¡metro posicion no corresponde a ninguna posiciÃ³n de la lista de enteros, el mÃ©todo
     *        no debe hacer nada.
     */

    public void eliminarEnteroPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < ListaEntero.size()) {
            ListaEntero.remove(posicion);
        }
    }
    /**
     * Reinicia la lista de enteros con los valores contenidos en el parÃ¡metro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista deberÃ­a quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */

    public void reiniciarArregloEnteros(double[] valores) {
        ListaEntero.clear();
        for (double valor : valores) {
            ListaEntero.add((int) valor);
        }
    }
    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parÃ¡metro 'objetos'.
     * 
     * Use el mÃ©todo toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */

    public void reiniciarArregloCadenas(List<Object> objetos) {
        ListaCadena.clear();
        for (Object obj : objetos) {
            ListaCadena.add(obj.toString());
        }
    }
    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posiciÃ³n habÃ­a un valor negativo, despuÃ©s de ejecutar el mÃ©todo debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos() {
        for (int i = 0; i < ListaEntero.size(); i++) {
            if (ListaEntero.get(i) < 0) {
                ListaEntero.set(i, -ListaEntero.get(i));
            }
        }
    }
    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */

    public void organizarEnteros() {
        ListaEntero.sort(Collections.reverseOrder());
    }
    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicogrÃ¡ficamente.
     */
    public void organizarCadenas() {
        Collections.sort(ListaCadena);
    }
    /**
     * Cuenta cuÃ¡ntas veces aparece el valor recibido por parÃ¡metro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones(int valor) {
        int contador = 0;
        for (int n : ListaEntero) {
            if (n == valor) {
                contador++;
            }
        }
        return contador;
    }

    public int contarApariciones(String cadena) {
        int contador = 0;
        for (String s : ListaCadena) {
            if (s.equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador;
    }
    /**
     * Cuenta cuÃ¡ntas veces aparece la cadena recibida por parÃ¡metro en la lista de cadenas.
     * 
     * La bÃºsqueda no debe diferenciar entre mayÃºsculas y minÃºsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */

    public int contarEnterosRepetidos() {
        Set<Integer> unicos = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();
        for (int n : ListaEntero) {
            if (!unicos.add(n)) {
                repetidos.add(n);
            }
        }
        return repetidos.size();
    }
    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */

    public boolean compararArregloEnteros(int[] otroArreglo) {
        if (otroArreglo.length != ListaEntero.size()) {
            return false;
        }
        for (int i = 0; i < otroArreglo.length; i++) {
            if (otroArreglo[i] != ListaEntero.get(i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribuciÃ³n uniforme usando Math.random().
     * 
     * Los nÃºmeros en la lista deben quedar entre el valor mÃ­nimo y el mÃ¡ximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mÃ­nimo para los nÃºmeros generados
     * @param maximo El valor mÃ¡ximo para los nÃºmeros generados
     */
    public void generarEnteros(int cantidad, int minimo, int maximo) {
        ListaEntero.clear();
        for (int i = 0; i < cantidad; i++) {
            int n = minimo + (int) (Math.random() * (maximo - minimo + 1));
            ListaEntero.add(n);
        }
    }
}