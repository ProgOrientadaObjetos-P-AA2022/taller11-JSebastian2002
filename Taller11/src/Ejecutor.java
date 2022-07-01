
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class Ejecutor {
    public static void main(String[] args) {
        ArrayList<Carta> allmenu = new ArrayList<>();
        Cuenta cuenta = new Cuenta();
        
        cuenta.setNombre("Atem");
        cuenta.setAllmenu(allmenu);
        cuenta.calcularValortotal();
        
        MenuNiños niño1 = new MenuNiños("Porcion de pizza", 7, 5.7, 5);
        niño1.calcularvValortotal();
        MenuNiños niño2 = new MenuNiños("Helado de chocolate", 3.50, 6, 8);
        niño2.calcularvValortotal();
        MenuEconomico ec = new MenuEconomico("Medio Pollo", 8);
        ec.setDescuento(3);
        ec.calcularvValortotal();
        MenuDia dia1 = new MenuDia("Chanfaina", 3.50, 2, 5);
        dia1.calcularvValortotal();
        MenuCarta carta = new MenuCarta("Ramen", 3, 2.40, 4.55);
        carta.setPorcentaje(0.5);
        carta.calcularvValortotal();
        
        allmenu.add(niño1);
        allmenu.add(niño2);
        allmenu.add(ec);
        allmenu.add(dia1);
        allmenu.add(carta);
        
        System.out.println(cuenta);




        
        
     
        
    }
    
}
