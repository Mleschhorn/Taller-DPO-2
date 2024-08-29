package uniandes.dpoo.estructuras.logica;

import java.util.*;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre conjuntos implementados usando un árbol (TreeSet).
 *
 * Todos los métodos deben operar sobre el atributo arbolCadenas que se declara como un NavigableSet.
 * 
 * El objetivo de usar el tipo NavigableSet es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (TreeSet).
 * 
 * A diferencia de un Set, en un NavigableSet existe una noción de orden que en este caso corresponde al orden lexicográfico.
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxConjuntos {

    private NavigableSet<String> arbolCadenas;

    /**
     * Constructor que inicializa el conjunto con un TreeSet vacío.
     */
    public SandboxConjuntos() {
        arbolCadenas = new TreeSet<String>();
    }

    /**
     * Método para añadir una cadena al conjunto.
     * @param cadena La cadena que se va a añadir.
     */
    public void NuevaCadena(String cadena) {
        arbolCadenas.add(cadena);
    }

    /**
     * Método para obtener el conjunto de cadenas.
     * @return El conjunto de cadenas en forma de un NavigableSet.
     */
    public NavigableSet<String> getArbolCadenas() {
        return arbolCadenas;
    }

    /**
     * Retorna una lista con las cadenas del conjunto ordenadas lexicográficamente.
     * @return Una lista con las cadenas ordenadas.
     */
    public List<String> getCadenasComoLista() {
        return new ArrayList<>(arbolCadenas);
    }

    /**
     * Retorna una lista con las cadenas del conjunto, ordenadas lexicográficamente de mayor a menor.
     * @return Una lista con las cadenas ordenadas de mayor a menor.
     */
    public List<String> getCadenasComoListaInvertida() {
        return new ArrayList<>(arbolCadenas.descendingSet());
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor en el conjunto de cadenas.
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return La primera cadena del conjunto, o null si está vacío.
     */
    public String getPrimera() {
        return arbolCadenas.isEmpty() ? null : arbolCadenas.first();
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor en el conjunto de cadenas.
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return La última cadena del conjunto, o null si está vacío.
     */
    public String getUltima() {
        return arbolCadenas.isEmpty() ? null : arbolCadenas.last();
    }

    /**
     * Retorna una colección con las cadenas que hacen parte del conjunto de cadenas y son mayores o iguales a la cadena que se recibe por parámetro.
     * @param cadena
     * @return Una colección de cadenas mayores a la cadena dada. Si la cadena hace parte del conjunto, debe hacer parte de la colección retornada.
     */
    public Collection<String> getSiguientes(String cadena) {
        return arbolCadenas.tailSet(cadena, true);
    }

    /**
     * Retorna la cantidad de valores en el conjunto de cadenas.
     * @return La cantidad de cadenas en el conjunto.
     */
    public int getCantidadCadenas() {
        return arbolCadenas.size();
    }

    /**
     * Agrega un nuevo valor al conjunto de cadenas.
     * 
     * Este método podría o no aumentar el tamaño del conjunto, dependiendo de si el número está repetido o no.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena(String cadena) {
        arbolCadenas.add(cadena);
    }

    /**
     * Elimina una cadena del conjunto de cadenas.
     * @param cadena La cadena que se va a eliminar.
     */
    public void eliminarCadena(String cadena) {
        arbolCadenas.remove(cadena);
    }

    /**
     * Elimina una cadena del conjunto de cadenas, independientemente de las mayúsculas o minúsculas.
     * @param cadena La cadena que se va a eliminar, sin tener en cuenta las mayúsculas o minúsculas.
     */
    public void eliminarCadenaSinMayusculasOMinusculas(String cadena) {
        arbolCadenas.removeIf(s -> s.equalsIgnoreCase(cadena));
    }

    /**
     * Elimina la primera cadena del conjunto.
     */
    public void eliminarPrimera() {
        if (!arbolCadenas.isEmpty()) {
            arbolCadenas.pollFirst();
        }
    }

    /**
     * Reinicia el conjunto de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos.
     */
    public void reiniciarConjuntoCadenas(List<Object> objetos) {
        arbolCadenas.clear();
        for (Object objeto : objetos) {
            arbolCadenas.add(objeto.toString());
        }
    }

    /**
     * Modifica el conjunto de cadenas para que todas las cadenas estén en mayúsculas.
     * 
     * Note que esta operación podría modificar el orden de los elementos dentro del conjunto.
     */
    public void volverMayusculas() {
        NavigableSet<String> nuevoConjunto = new TreeSet<>();
        for (String cadena : arbolCadenas) {
            nuevoConjunto.add(cadena.toUpperCase());
        }
        arbolCadenas = nuevoConjunto;
    }

    /**
     * Construye un árbol de cadenas donde todas las cadenas están organizadas de MAYOR a MENOR.
     */
    public TreeSet<String> invertirCadenas() {
        return new TreeSet<>(arbolCadenas.descendingSet());
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del conjunto de cadenas.
     * @param otroArreglo El arreglo de cadenas con el que se debe comparar.
     * @return True si todos los elementos del arreglo están dentro del conjunto.
     */
    public boolean compararElementos(String[] otroArreglo) {
        for (String cadena : otroArreglo) {
            if (!arbolCadenas.contains(cadena)) {
                return false;
            }
        }
        return true;
    }

}