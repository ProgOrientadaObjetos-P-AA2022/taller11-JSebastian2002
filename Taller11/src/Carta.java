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
    protected double Valorinicial;
    
    public Carta(String nb, double inicial){
        Nombreplato = nb;
        Valorinicial = inicial;
    }

    public void setNombreplato(String Nombreplato) {
        this.Nombreplato = Nombreplato;
    }

    public void setValormenu(double Valormenu) {
        this.Valormenu = Valormenu;
    }

    public void setValorinicial(double Valorinicial) {
        this.Valorinicial = Valorinicial;
    }

    public String getNombreplato() {
        return Nombreplato;
    }

    public double getValormenu() {
        return Valormenu;
    }

    public double getValorinicial() {
        return Valorinicial;
    }
    
    public abstract void calcularvalorMenuTotal();

    @Override
    public String toString() {
        String cadena = String.format("Plato:%s\n"
                + "Valor menu inicial:%.2f\n",getNombreplato(),
                getValorinicial());
        return cadena;
    }

}