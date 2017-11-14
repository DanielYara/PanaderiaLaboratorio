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
public class Cliente {
    private String name;
    private int cedula;
    private ArrayList<Venta> compras;

    public Cliente(String name, int cedula) {
        this.name = name;
        this.cedula = cedula;
        this.compras = new ArrayList<>(); 
    }
    
    public boolean añadCompra(String cedula, Venta venta){
        if(Integer.parseInt(cedula) == this.cedula){
            this.compras.add(venta);
            return true;
        } else 
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}
