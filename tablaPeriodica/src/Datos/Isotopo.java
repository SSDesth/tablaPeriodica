/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author SSDesth
 */
public class Isotopo {
    private int neutrones;
    private int numeroMasico;
    private int protones;

    public Isotopo() {
    }

    public Isotopo(int neutrones, int protones) {
        this.neutrones = neutrones;
        this.protones = protones;
        this.numeroMasico= protones + neutrones;
    }

    public int getNeutrones() {
        return neutrones;
    }

    public void setNeutrones(int neutrones) {
        this.neutrones = neutrones;
    }

    public int getNumeroMasico() {
        return numeroMasico;
    }

    public void setNumeroMasico(int numeroMasico) {
        this.numeroMasico = numeroMasico;
    }

    public int getProtones() {
        return protones;
    }

    public void setProtones(int protones) {
        this.protones = protones;
    }
    
    
    
}
