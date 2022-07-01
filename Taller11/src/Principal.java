
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E.N.D
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Carta> allmenu = new ArrayList<>();
        Cuenta cuenta = new Cuenta();       
        cuenta.setNombre("Rene Elizalde");
        cuenta.setAllmenu(allmenu);
        cuenta.calcularValortotal();     
        MenuNiños niño1 = new MenuNiños("Niños 01",2.00 , 1.00, 1.50);
        niño1.calcularValortotal();
        MenuNiños niño2 = new MenuNiños("Niños 02",3.00, 1.00, 1.50);
        niño2.calcularValortotal();
        MenuEconomico ec = new MenuEconomico("Econo 001",4.00);
        ec.setDescuento(10);
        ec.calcularValortotal();
        MenuDia dia1 = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        dia1.calcularValortotal();
        MenuCarta carta = new MenuCarta("Carta 001", 6.0, 1.5, 2.0);
        carta.setPorcentaje(10.00);
        carta.calcularValortotal();
        allmenu.add(niño1);
        allmenu.add(niño2);
        allmenu.add(ec);
        allmenu.add(dia1);
        allmenu.add(carta);
        
        System.out.println(cuenta);




        
        
     
        
    }
    
}
