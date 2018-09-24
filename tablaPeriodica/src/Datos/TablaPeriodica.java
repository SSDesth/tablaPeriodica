/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SSDesth
 */
@XmlRootElement
public class TablaPeriodica {

    private int Tamano;
    private List<Elemento> elementos;
    private List<Familia> familia;

    public TablaPeriodica() {

    }

    public TablaPeriodica(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public List<Familia> getFamilia() {
        return familia;
    }

    public void setFamilia(List<Familia> familia) {
        this.familia = familia;
    }

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
