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
public class Empleado extends Treballador {

    private int HoresExtres;

    public Empleado(int HoresExtres, int Edad, String TipusTreballador, String Nombre, float Nomina) {
        super(Edad, TipusTreballador, Nombre, Nomina);
        this.HoresExtres = HoresExtres;
    }

}
