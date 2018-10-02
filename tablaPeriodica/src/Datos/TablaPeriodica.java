package Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
@XmlRootElement
public class TablaPeriodica {

    //---------- Variables de la clase TablaPeriodica----------//
    private int Tamano;
    private List<Elemento> elementos;
    private List<Familia> familia;

    //----------Contructor(es)---------//
    /**
     * Contructor default de la clase TablaPeriodica
     */
    public TablaPeriodica() {
    }

    //----------Setters y Getters---------//
    /**
     * Get de la variable Tamano
     *
     * @return Tamano
     */
    public int getTamano() {
        return Tamano;
    }

    /**
     * Set de la variable Tamano
     *
     * @param Tamano: int
     */
    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    /**
     * Get de la variable Elementos
     *
     * @return elementos
     */
    public List<Elemento> getElementos() {
        return elementos;
    }

    /**
     * Set de la variable Elementos
     *
     * @param elementos: List
     */
    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    /**
     * Get de la variable Familia
     *
     * @return familia:List
     */
    public List<Familia> getFamilia() {
        return familia;
    }

    /**
     * Set de la Variable Familia
     *
     * @param familia: List
     */
    public void setFamilia(List<Familia> familia) {
        this.familia = familia;
    }

    /**
     * Metodo que recibe un numero y busca dentro de la Lista elementos y
     * retorna el elemento buscado
     *
     * @param eNumeroAtomico: int
     * @return Elemento
     */
    public Elemento MostrarElemento(int eNumeroAtomico) {

        Elemento salida = new Elemento();
        for (int i = 0; i < elementos.size(); i++) {
            salida = elementos.get(i);
            if (salida.getNumeroAtomico() == eNumeroAtomico) {
                return salida;
            }
        }
        return null;
    }

    /**
     * Metodo que recibe un String con el nombre de la familia y busca dentro de
     * la Lista familia y retorna String con la informacion de la familia
     *
     * @param entrada
     * @return " /informacion de la Familia"
     */
    public String MostrarInfoFamilia(String entrada) {

        Familia temp;
        if (entrada != null) {
            for (int i = 0; i < familia.size(); i++) {
                temp = familia.get(i);

                if (entrada.equals(temp.getNombre())) {
                    return temp.getCaracteristicas();
                }
            }
        }
        return "";
    }
    
    /**
     * Este metodo retorna una lista con los elementos ordenados alfabeticamente
     * @return List 
     */
    public List<Elemento> OrdenamientoAlfaBetico(){
      
        List<Elemento> temporal = elementos;
        Collections.sort(temporal, new Comparator<Elemento>() {
            @Override
            public int compare(Elemento objeto1, Elemento objeto2) {
                return objeto1.getNombre().compareTo(objeto2.getNombre());
            }
        });
        
       return temporal;
    
    }
    
    /**
     * Este metodo retorna una lista con los elementos ordenados por familia
     * @return List 
     */
    public List<Elemento> OrdenamientoFamilia(){
      
        List<Elemento> temporal = elementos;
        Collections.sort(temporal, new Comparator<Elemento>() {
            @Override
            public int compare(Elemento objeto1, Elemento objeto2) {
                return objeto1.getFamilia().compareTo(objeto2.getFamilia());
            }
        });
       return temporal;
    
    }
    
    /**
     * Este metodo retorna una lista con los elementos ordenados por Numero Atomico
     * @return List 
     */
    public List<Elemento> OrdenamientoNumeroAtomico(){
      
        List<Elemento> temporal = elementos;
        Collections.sort(temporal, new Comparator<Elemento>() {
            @Override
            public int compare(Elemento objeto1, Elemento objeto2) {
                return new Integer(objeto1.getNumeroAtomico()).compareTo(new Integer(objeto2.getNumeroAtomico()));
            }
        });
       return temporal;
    }
    
    /**
     * Este metodo retorna una lista con los elementos ordenados por cantidad De Isotopos
     * @return List 
     */
    public List<Elemento> OrdenamientoCantIsotopos(){
      
        List<Elemento> temporal = elementos;
        Collections.sort(temporal, new Comparator<Elemento>() {
            @Override
            public int compare(Elemento objeto1, Elemento objeto2) {
                return new Integer(objeto1.getCantidadIsotopos()).compareTo(new Integer(objeto2.getCantidadIsotopos()));
            }
        });
       return temporal;
    }

}
