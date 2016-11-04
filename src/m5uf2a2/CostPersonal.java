/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5uf2a2;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class CostPersonal extends Treballador {

    static Treballador treballador = new Treballador() {
    };
    static float costFinal = 0;

    /*
    * Metode per calcular el cost final de treballadors
     */
    static float CostDelPersonal(ArrayList<Treballador> treballadors) {

        for (int i = 0; i < treballadors.size(); i++) {
            treballador = treballadors.get(i);
            //Cas que no sigui ni director ni subdirector suma les hores extres
            if ("DIRECTOR".equals(treballador.getTipusTreballador())
                    || "SUBDIRECTOR".equals(treballador.getTipusTreballador())) {
                costFinal = costFinal + treballador.getNomina();
            } else {
                calcularCostFinal();
            }
        }
        return costFinal;
    }

    public static float getCostFinal() {
        return costFinal;
    }

    public static float calcularCostFinal() {
        costFinal += treballador.getNomina() + (treballador.getHoresExtres() * 20);
        return costFinal;
    }

}
