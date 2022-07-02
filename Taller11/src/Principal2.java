/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author E.N.D
 */
public class Principal2 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"NiÃ±os 01", "2.00", "1", "1.5"},
        {"NiÃ±os 02", "3.00", "1", "1.5"},
        {"NiÃ±os 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Carta> allmenu = new ArrayList<>();
        /* Agregar un proceso para generar objetos de tipo Menu Carta, DÃ­a, 
        Economico y NiÃ±o*. Cada arreglo datos, se corresponde a un tipo de MenÃº.
        Iterar y crear los objetos segÃºn corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de soluciÃ³n
        
        for (int i = 0; i < datos001.length; i++) {
            String nPlato = datos001[i][0];
            double vInicio = Double.parseDouble(datos001[i][1]);
            double vHelado = Double.parseDouble(datos001[i][2]);
            double vPastel = Double.parseDouble(datos001[i][3]);

            MenuNinos nn1 = new MenuNinos(nPlato, vInicio, vHelado, vPastel);
            nn1.calcularvalorMenuTotal();
            allmenu.add(nn1);

        }     
        
        for (int i = 0; i < datos002.length; i++) {
            String nPlato= datos002[i][0];
            double vInicio= Double.parseDouble(datos002[i][1]);
            double vPorcentajeDescuento = Double.parseDouble(datos002[i][2]);
            
            MenuEconomico ec1= new MenuEconomico(nPlato, vInicio);
            ec1.setPorcentajedescuento(vPorcentajeDescuento);
            ec1.calcularvalorMenuTotal();
            allmenu.add(ec1);
        }
        
        for (int i = 0; i < datos003.length; i++) {
            String nPlato=datos003[i][0];
            double vInicio=Double.parseDouble(datos003[i][1]);
            double vPostre=Double.parseDouble(datos003[i][2]);
            double vBebida=Double.parseDouble(datos003[i][3]);
            
            MenuDia nn2= new MenuDia(nPlato, vInicio, vPostre, vBebida);
            nn2.calcularvalorMenuTotal();
            allmenu.add(nn2);
            
        }
        
        for (int i = 0; i < datos004.length; i++) {
            String nPlato= datos004[i][0];
            double vInicio= Double.parseDouble(datos004[i][1]);
            double vPorcionGuarnicion= Double.parseDouble(datos004[i][2]);
            double vBebida=Double.parseDouble(datos004[i][3]);
            
            MenuCarta ct1= new MenuCarta(nPlato, vInicio, vPorcionGuarnicion, vBebida);
            ct1.setPorcentaje(10);
            ct1.calcularvalorMenuTotal();
            allmenu.add(ct1);
            
        } 
        Cuenta cuenta= new Cuenta();
        cuenta.setAllmenu(allmenu);
        cuenta.setNombre("Atem");
        //cuenta.setNombre("Rene Elizalde");
        cuenta.calcularValortotal();
        System.out.println(cuenta);
    }

}