/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author E.N.D
 */
public class MenuEconomico extends Carta{
    double Porcentajedescuento=25.00;

    public MenuEconomico(String nb, double inicial) {
        super(nb, inicial);
    }
    public void setPorcentajedescuento(double Porcentajedescuento) {
        this.Porcentajedescuento = Porcentajedescuento;
    }
        public double getPorcentajedescuento() {
        return Porcentajedescuento;
    }

    @Override
    public void calcularvalorMenuTotal() {
        Valormenu =  Valorinicial - (((Porcentajedescuento * Valorinicial))/ 100);
    }
    public double getValortotal(){
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte = String.format("Menu Economico\n%s", super.toString());
        reporte = String.format("%s"
                + "Porcentaje descuento%.2f\n"
                + "Valor Menu:%.2f\n", reporte,
                getPorcentajedescuento(),
                getValormenu());
        return reporte;
    }

    
}
