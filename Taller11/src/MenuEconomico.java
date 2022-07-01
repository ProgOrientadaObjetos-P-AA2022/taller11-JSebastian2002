/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class MenuEconomico extends Carta{
    double Descuento;
    
    public MenuEconomico(String nombre, double valor) {
        super(nombre, valor);
        
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = (Descuento * Valorinicalmenu)/100;
    }


    public double getValortotal(){
        return Valormenu;
    }
        @Override
    public String toString() {
        String reporte=String.format("Restaurante\n"
                + "\tMenu Economico\n%s",super.toString());
        reporte=String.format("%s"
                + "\tPorcentaje de descuento:%.2f\n"
                + "\tValor del Menu: %.2f\n"
                ,reporte,
                getDescuento(),
                getValormenu());
        return reporte;
    }

    @Override
    public void calcularValortotal() {
        Valormenu = Valorinicalmenu - Descuento;
    }
 
}
