/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class MenuDia extends Carta{
    double Valorpostre;
    double Valorbebida;
    
public MenuDia(String nombre, double valor,double costopostre, double cosotbebida){
        super(nombre, valor);
        Valorpostre = costopostre;
        Valorbebida = cosotbebida;
        
    }
    public double getValorpostre() {
        return Valorpostre;
    }

    public void setValorpostre(double Valorpostre) {
        this.Valorpostre = Valorpostre;
    }

    public double getValorbebida() {
        return Valorbebida;
    }

    public void setValorbebida(double Valorbebida) {
        this.Valorbebida = Valorbebida;
    }

    @Override
    public void calcularvValortotal() {
        Valormenu = (Valorinicalmenu + Valorpostre + Valorbebida);
    }
    public double getValortotal(){
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte=String.format("Restaurante"
                + "Menu del dia\n%s",super.toString());
        reporte=String.format("%s"
                + "Costo del postre:%.2f\n"
                + "Costo de la bebida:%.2f\n"
                + "Valor del menu:%.2f\n",reporte,
                getValorpostre(),
                getValorbebida(),
                getValormenu());
        return reporte;
    }
    
    
}