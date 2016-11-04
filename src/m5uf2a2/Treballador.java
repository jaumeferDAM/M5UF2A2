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
public abstract class Treballador {

    private int Edad;
    private String TipusTreballador;
    private int HoresExtres;

    public int getHoresExtres() {
        return HoresExtres;
    }

    public void setHoresExtres(int HoresExtres) {
        this.HoresExtres = HoresExtres;
    }

    public Treballador(int Edad, String TipusTreballador, String Nombre, float Nomina) {
        this.Edad = Edad;
        this.TipusTreballador = TipusTreballador;
        this.Nombre = Nombre;
        this.Nomina = Nomina;
    }

    public void setTipusTreballador(String TipusTreballador) {
        this.TipusTreballador = TipusTreballador;
    }

    public String getTipusTreballador() {
        return TipusTreballador;
    }

    private String Nombre;
    private float Nomina;

    public Treballador() {
        this.Nombre = Nombre;
        this.Nomina = Nomina;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getNomina() {
        return Nomina;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNomina(float Nomina) {
        this.Nomina = Nomina;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

}
