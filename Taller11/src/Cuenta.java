
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
    private double iva;
    private ArrayList<Menu> allmenu = new ArrayList<>();
    
    public Cuenta(){
        
    }

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
            subtotal = subtotal + allmenu.get(i).getValorMenu();
        }
        iva = subtotal * iva;
        valortotal = subtotal + iva;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = 0.12;
    }

    public ArrayList<Menu> getAllmenu() {
        return allmenu;
    }

    public void setAllmenu(ArrayList<Menu> allmenu) {
        this.allmenu = allmenu;
    }
    
    

}
