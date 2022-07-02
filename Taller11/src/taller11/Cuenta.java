/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author E.N.D
 */
public class Cuenta {
    
    String nombre;
    double valortotal;
    double subtotal;
    double iva = 0.10;
    double iva2= 10;
    ArrayList<Carta> allmenu = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void calcularValortotal() {
        for (int i = 0; i < allmenu.size(); i++) {
            subtotal = subtotal + allmenu.get(i).getValormenu();

        }
        iva = subtotal * iva;
        valortotal = subtotal + iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValortotal() {
        return valortotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public ArrayList<Carta> getAllmenu() {
        return allmenu;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setAllmenu(ArrayList<Carta> allmenu) {
        this.allmenu = allmenu;
    }

    public double getIva2() {
        return iva2;
    }

    public void setIva2(double iva2) {
        this.iva2 = iva2;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente:%s\n", getNombre());
        for (int i = 0; i < getAllmenu().size(); i++) {
            cadena = String.format("%s"
                
                    + "%s\n", cadena,
                    getAllmenu().get(i));

        }
        cadena=String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n", cadena,
                getSubtotal(),
                getIva2(),
                getValortotal());
        return cadena;
    }

}