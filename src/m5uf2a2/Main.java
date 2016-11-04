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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Treballador tr=new Treballador() {
};
        ArrayList<Treballador> treballadors = new ArrayList<>();
        
        CostPersonal cp = new CostPersonal();
        Director Vicente = new Director(43, "DIRECTOR", "Vicente", 1800);
        Subdirector Fernandez = new Subdirector(55, "SUBDIRECTOR", "Carlos", 1700);
        Empleado Augusto = new Empleado(8, 20, "EMPLEADO", "Augusto", 800);

        treballadors.add(Vicente);
        treballadors.add(Fernandez);
        treballadors.add(Augusto);
        System.out.println(treballadors.get(2).getHoresExtres());
        System.out.println(cp.CostDelPersonal(treballadors));
       
        
    }

}
