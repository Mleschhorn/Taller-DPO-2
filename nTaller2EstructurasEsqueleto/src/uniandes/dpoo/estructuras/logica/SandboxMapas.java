package uniandes.dpoo.estructuras.logica;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo MapaCadena que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas {
    private Map<String, String> MapaCadena;

    public SandboxMapas() {
        MapaCadena = new HashMap<>();
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public void addString(String key, String value) {
        MapaCadena.put(reverseString(key), value);
    }

    public String getValueForReversedKey(String reversedKey) {
        return MapaCadena.get(reversedKey);
    }
    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista() {
        List<String> valores = new ArrayList<>(MapaCadena.values());
        Collections.sort(valores);
        return valores;
    }
    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */

    public List<String> getLlavesComoListaInvertida() {
        List<String> llaves = new ArrayList<>(MapaCadena.keySet());
        llaves.sort(Collections.reverseOrder());
        return llaves;
    }
    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera() {
        if (MapaCadena.isEmpty()) {
            return null;
        }
        return Collections.min(MapaCadena.keySet());
    }
    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima() {
        if (MapaCadena.isEmpty()) {
            return null;
        }
        return Collections.max(MapaCadena.values());
    }
    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves() {
        List<String> llavesMayusculas = new ArrayList<>();
        for (String llave : MapaCadena.keySet()) {
            llavesMayusculas.add(llave.toUpperCase());
        }
        return llavesMayusculas;
    }
    /**
     * Retorna la cantidad de valores diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes() {
        return new HashSet<>(MapaCadena.values()).size();
    }
    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena(String cadena) {
        MapaCadena.put(reverseString(cadena), cadena);
    }
    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave(String llave) {
        MapaCadena.remove(llave);
    }
    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor(String valor) {
        MapaCadena.values().removeIf(v -> v.equals(valor));
    }
    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadena(List<Object> objetos) {
        MapaCadena.clear();
        for (Object obj : objetos) {
            String cadena = obj.toString();
            MapaCadena.put(reverseString(cadena), cadena);
        }
    }
    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas() {
        Map<String, String> mapaNuevo = new HashMap<>();
        for (Map.Entry<String, String> entrada : MapaCadena.entrySet()) {
            mapaNuevo.put(entrada.getKey().toUpperCase(), entrada.getValue());
        }
        MapaCadena = mapaNuevo;
    }
    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores(String[] otroArreglo) {
        Set<String> valores = new HashSet<>(MapaCadena.values());
        for (String valor : otroArreglo) {
            if (!valores.contains(valor)) {
                return false;
            }
        }
        return true;
    }
}