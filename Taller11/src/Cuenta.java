
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class Cuenta {
    private String nombre;
    private double valortotal;
    private double subtotal;
    private double iva=0.10;
    private ArrayList<Carta> allmenu = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValortotal() {
        return valortotal;
    }
    public void calcularValortotal() {
        for (int i = 0; i < allmenu.size(); i++) {
            subtotal = subtotal + allmenu.get(i).getValormenu();
        }
        iva = subtotal * iva;
        valortotal = subtotal + iva;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getSubtotal(){
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public ArrayList<Carta> getAllmenu() {
        return allmenu;
    }

    public void setAllmenu(ArrayList<Carta> allmenu) {
        this.allmenu = allmenu;
    }  
     @Override
    public String toString() {
        String reporte = String.format("Factura\n"
                +"Cliente: %s\n", getNombre());
        for (int i = 0; i < getAllmenu().size(); i++) {
            reporte  = String.format("%s"
                    + "%d "
                    + "%s\n", reporte ,(i+1),
                    getAllmenu().get(i));
        }
        reporte = String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n", reporte ,
                getSubtotal(),
                getIva(),
                getValortotal());
        return reporte;
    }

 
}
