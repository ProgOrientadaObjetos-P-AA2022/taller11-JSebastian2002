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
    double Porcentaje;


    public MenuCarta(String nb, double inicial, double porcion, double bebida) {
        super(nb, inicial);
        Valorporcion = porcion;
        Valorbebida = bebida;
    }

    public void setValorporcion(double Valorporcion) {
        this.Valorporcion = Valorporcion;
    }

    public void setValorbebida(double Valorbebida) {
        this.Valorbebida = Valorbebida;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getValorporcion() {
        return Valorporcion;
    }

    public double getValorbebida() {
        return Valorbebida;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    @Override
    public void calcularvalorMenuTotal() {
        Valormenu = (Valorinicial + Valorporcion + Valorbebida) + (((Porcentaje*Valorinicial))/100);
    }
    public double getValortotal(){
        return Valormenu;
    }
        @Override
    public String toString() {
        String reporte=String.format("Menu a la carta\n%s",super.toString());
        reporte=String.format("%s"
                + "Valor porcion guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Porcentaje Adicional:%.2f\n"
                + "Valor menu:%.2f\n", reporte,
                getValorporcion(),
                getValorbebida(),
                getPorcentaje(),
                getValormenu());
        return reporte;
    }
    
}
