/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5uf2a2;

/**
 *
 * @author ALUMNEDAM
 */

public class CostPersonal extends Treballador{

	static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		
		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			
			if (treballador.getTipusTreballador() == Treballador.DIRECTOR || 
			treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal = costFinal + treballador.getNomina();
			} else {
				costFinal = costFinal + treballador.getNomina() + 
					(treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}
}
