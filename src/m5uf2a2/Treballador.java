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
    static String DIRECTOR;
    static String SUBDIRECTOR;
    private String TipusTreballador;
    private int HoresExtres;

    public void setTipusTreballador(String TipusTreballador) {
        this.TipusTreballador = TipusTreballador;
    }

    public void setHoresExtres(int HoresExtres) {
        this.HoresExtres = HoresExtres;
    }

    public String getTipusTreballador() {
        return TipusTreballador;
    }

    public int getHoresExtres() {
        return HoresExtres;
    }
  private String Nombre;
  private float Nomina;

    public Treballador() {
        this.Nombre = Nombre;
        this.Nomina = Nomina;
    }

    public static String getDIRECTOR() {
        return DIRECTOR;
    }

    public static String getSUBDIRECTOR() {
        return SUBDIRECTOR;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getNomina() {
        return Nomina;
    }

    public static void setDIRECTOR(String DIRECTOR) {
        Treballador.DIRECTOR = DIRECTOR;
    }

    public static void setSUBDIRECTOR(String SUBDIRECTOR) {
        Treballador.SUBDIRECTOR = SUBDIRECTOR;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNomina(float Nomina) {
        this.Nomina = Nomina;
    }
  
  
}
