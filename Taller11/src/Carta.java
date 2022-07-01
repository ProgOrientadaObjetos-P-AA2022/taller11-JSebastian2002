/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public abstract class Carta {
    
    protected String Nombreplato;
    protected double Valormenu;
    protected double Valorinicalmenu;
    
    public Carta(String nombre, double valor) {
        Nombreplato = nombre;
        Valorinicalmenu = valor;
    }

    public String getNombreplato() {
        return Nombreplato;
    }

    public void setNombreplato(String Nombreplato) {
        this.Nombreplato = Nombreplato;
    }

    public double getValormenu() {
        return Valormenu;
    }

    public void setValormenu(double Valormenu) {
        this.Valormenu = Valormenu;
    }

    public double getValorinicalmenu() {
        return Valorinicalmenu;
    }

    public void setValorinicalmenu(double Valorinicalmenu) {
        this.Valorinicalmenu = Valorinicalmenu;
    }
    
    public abstract void calcularValortotal();
    @Override
    public String toString() {
        String reporte = String.format(""
                + "\tNombre del plato: %s\n"
                + "\tValor del menu inicial: %.2f\n",
                getNombreplato(),
                getValorinicalmenu());
        return reporte;
    }
    

    

    
}
