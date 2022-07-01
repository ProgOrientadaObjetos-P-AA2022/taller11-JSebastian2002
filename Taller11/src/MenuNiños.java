/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class MenuNiños extends Carta{
    double Valorhelado;
    double valorpaste;

    
    public MenuNiños(String nombre, double valor, double porcionhelado, double porcionpastel){
        super(nombre, valor);
        Valorhelado = porcionhelado;
        valorpaste = porcionpastel;

    }

    public double getValorhelado() {
        return Valorhelado;
    }

    public void setValorhelado(double Valorhelado) {
        this.Valorhelado = Valorhelado;
    }

    public double getValorpaste() {
        return valorpaste;
    }

    public void setValorpaste(double valorpaste) {
        this.valorpaste = valorpaste;
    }

    @Override
    public void calcularvValortotal() {
        Valormenu = (Valorinicalmenu + Valorhelado + valorpaste);
    }
    public double getValortotal(){
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte=String.format("Restaurante"
                + "Menu Para niños\n%s",super.toString());
        reporte=String.format("%s"
                + "Costo de la porcion de helado:%.2f\n"
                + "Costo de la porcion de pastel:%.2f\n"
                + "Valor del menu:%.2f\n",reporte,
                getValorhelado(),
                getValorhelado(),
                getValormenu());
        return reporte;
    }
    
    
    
}
    

