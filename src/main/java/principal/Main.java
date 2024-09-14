/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import entidades.Producto;
import vistas.JFMenuPrincipal;


public class Main {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Limpieza", "Detergente", 2000);
        System.out.println(producto1.getIdProducto());
        Producto producto2 = new Producto("Comestible", "Alfajor", 1500);
        System.out.println(producto2.getIdProducto());
        producto1.cargarLista();
        
        JFMenuPrincipal menu = new JFMenuPrincipal();
        menu.setVisible(true);
        
    }
}
