/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class MenuCarta extends Carta{
    
    double Valorporcion;
    double Valorbebida;
    double porcentaje;

    public MenuCarta(String nombre, double valor,double porcion, double bebida){
        super(nombre, valor);
        Valorporcion=porcion;
        Valorbebida=bebida;
    }
    public double getValorporcion() {
        return Valorporcion;
    }

    public void setValorporcion(double Valorporcion) {
        this.Valorporcion = Valorporcion;
    }

    public double getValorbebida() {
        return Valorbebida;
    }

    public void setValorbebida(double Valorbebida) {
        this.Valorbebida = Valorbebida;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = (porcentaje * Valorinicalmenu)/100;
    }
    @Override
    public void calcularvValortotal() {
        Valormenu = (Valorinicalmenu + Valorporcion + Valorbebida) + porcentaje;
    }
    
    public double getValortotal() {
        return Valormenu;
    }
    @Override
    public String toString() {
        String reporte=String.format("Restaurante\n"
                + "Carta\n %s",super.toString());
        reporte=String.format("%s"
                + "Valor de la porcion de guarnicion:%.2f\n"
                + "Valor de la bebida:%.2f\n"
                + "porcentaje adicional por servicio en relación del valor inicial del menú: %.2f\n"
                + "Valor del Menu: %.2f\n"
                ,reporte,
                getValorporcion(),
                getValorbebida(),
                getPorcentaje(),
        getValormenu());
        return reporte;
    }
    
    
}

    

