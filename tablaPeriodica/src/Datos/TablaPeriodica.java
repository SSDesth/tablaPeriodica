package Datos;

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

}
