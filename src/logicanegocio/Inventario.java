/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;
import java.util.*;

/**
 *
 * @author Daniel y Cielo
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void añadProd(String name, int codigo, double precio, int cant){
        Producto p = new Producto(name, codigo, precio);
        if(cant > 1)
            p.setCantidad(cant);
        else 
            p.setCantidad(1);
        this.productos.add(p);
    }
    
    public boolean elimProd(String name){
        boolean r = false;
        for(int i = 0; i < this.productos.size(); i++){
            if(this.productos.get(i).getNombre().equals(name)){
                this.productos.remove(i);
                r = true;
            }
            else
                r = false;
        }
        return r;
    }
    
    public String verinfoProd(){
        String r = null, r1 = null;
        for(Producto p : this.productos){
            r1 = "Producto: " + p.getNombre() + ", Codigo: " + p.getCodigo() + ", Precio: " + p.getPrecio() + ", Cantidad: " + p.getCantidad() + ".\n";
            r += r1;
        }
        return r;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
}
