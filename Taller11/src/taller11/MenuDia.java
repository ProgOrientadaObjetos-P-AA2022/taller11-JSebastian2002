/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author E.N.D
 */
public class MenuDia extends Carta {
    
    double Valorpostre;
    double ValorBebida;
    

    public MenuDia(String nb, double inicial, double postre, double bebida) {
        super(nb, inicial);
       Valorpostre = postre;
       ValorBebida = bebida;
    }

    public void setValorpostre(double Valorpostre) {
        this.Valorpostre = Valorpostre;
    }

    public void setValorBebida(double ValorBebida) {
        this.ValorBebida = ValorBebida;
    }

    public double getValorpostre() {
        return Valorpostre;
    }

    public double getValorBebida() {
        return ValorBebida;
    }
    @Override
    public void calcularvalorMenuTotal() {
        Valormenu = (Valorinicial + Valorpostre + ValorBebida);
    }
    public double getValortotal(){
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte=String.format("Menu del dia\n%s",super.toString());
        reporte=String.format("%s"
                + "Valor Postre:%.2f\n"
                + "Valor Bebida:%.2f\n"
                + "Valor Menu:%.2f\n",reporte,
                getValorpostre(),
                getValorBebida(),
                getValormenu());
        return reporte;
    }
    
}
