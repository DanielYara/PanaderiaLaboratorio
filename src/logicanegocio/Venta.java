/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import java.util.ArrayList;

/**
 *
 * @author Daniel y Cielo
 */
public class Venta {
    private Inventario inventario;

    public Venta() {
        this.inventario = inventario;
    }
    
    public double comprarProducto(int cod, int cant){
        int aux = 0;
        double r = 0.0;
        ArrayList<Producto> p = this.inventario.getProductos();
        for(int i = 0; i < p.size(); i++){
            if(cod == p.get(i).getCodigo()){
                aux = this.inventario.getProductos().get(i).getCantidad() - cant;
                this.inventario.getProductos().get(i).setCantidad(aux);
                r = p.get(i).getPrecio()*cant;
            } else
                throw new IllegalArgumentException("No existe el producto");
        }
        return r;
    }
    
    

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    
}
