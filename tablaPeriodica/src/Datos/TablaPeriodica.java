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
     private List<Elemento> elementos;

    public TablaPeriodica() {
        this.elementos= new ArrayList<Elemento>();
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
    
    public Elemento MostrarElemento(int eNumeroAtomico){
        Elemento salida = new Elemento();
        for(int i =0;i<elementos.size();i++){
            salida=elementos.get(i);
            if(salida)
        }
        return salida;
    }
     
     
    
}
