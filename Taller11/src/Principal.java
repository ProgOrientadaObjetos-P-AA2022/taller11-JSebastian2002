/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author E.N.D
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Carta>allmenu = new ArrayList<>();
        MenuDia nn1 = new MenuDia("NiÃ±os 01",2, 1, 1.50);
        nn1.calcularvalorMenuTotal();
        
        MenuDia nn2 = new  MenuDia("NiÃ±os 02",3, 1, 1.50);
        nn2.calcularvalorMenuTotal();
        
        MenuEconomico ec1 = new MenuEconomico("Econo 001",4);
        ec1.setPorcentajedescuento(25);
        ec1.calcularvalorMenuTotal();
        
        MenuDia nn3 = new MenuDia("Dia 001",5,1,1);
        nn3.calcularvalorMenuTotal();
        
        MenuCarta ct1 = new MenuCarta("Carta 001", 6 ,1.5, 2);
        ct1.setPorcentaje(10);
        ct1.calcularvalorMenuTotal();
        
        allmenu.add(nn1);
        allmenu.add(nn2);
        allmenu.add(ec1);
        allmenu.add(nn3);
        allmenu.add(ct1);
        
        Cuenta cuenta = new Cuenta();
        cuenta.setAllmenu(allmenu);
        cuenta.setNombre("Rene Elizalde");
        cuenta.calcularValortotal();
        System.out.println(cuenta);
        

        
    }
}
