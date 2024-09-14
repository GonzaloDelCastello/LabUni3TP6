/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.awt.List;
import java.util.ArrayList;


public class Producto {

    public String categoria;
    public String nombre;
    public double precio;
    public int idProducto; 
    
    static int idProductoS = 1;
    static ArrayList<String> listaCategorias = new ArrayList();
    
    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = idProductoS;
        idProductoS = idProductoS + 1;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public void cargarLista(){
        listaCategorias.add("Perfumeria");
        listaCategorias.add("Electronica");
        listaCategorias.add("Ropa");
        listaCategorias.add("Alimentos");
        
    }
    
}
