/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author E.N.D
 */
public class MenuNinos extends Carta{
    double Valorhelado;
    double Valorpastel;

    public MenuNinos(String nb, double inicial, double porcionhelado, 
            double porcionpastel) {
        super(nb, inicial);
        Valorhelado = porcionhelado;
        Valorpastel = porcionpastel;
    }

    public void setValorhelado(double Valorhelado) {
        this.Valorhelado = Valorhelado;
    }

    public void setValorpastel(double Valorpastel) {
        this.Valorpastel = Valorpastel;
    }

    public double getValorhelado() {
        return Valorhelado;
    }

    public double getValorpastel() {
        return Valorpastel;
    }
    

    @Override
    public void calcularvalorMenuTotal() {
        Valormenu = (Valorinicial + Valorhelado + Valorpastel);
    }
    public double getValortotal(){
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte=String.format("Menu de Ninos\n%s", super.toString());
        reporte=String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", reporte,
                getValorhelado(),
                getValorpastel(),
                getValormenu());
        return reporte;
    }
    
    
}
