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
public class Sucursal {
    private int numSucursal;
    private Inventario inventario;
    private ArrayList<Venta> ventas;
    private ArrayList<Cliente> clientes;

    public Sucursal(int numSucursal) {
        this.numSucursal = numSucursal;
        this.inventario = inventario;
        this.ventas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    private boolean añadCliente(String name, String cedula){
        int r = Integer.parseInt(cedula);
        Cliente n = new Cliente(name,r);
        return this.clientes.add(n);
    }
    
    public boolean ventaProd(String type, int cod, int cant, String ced){
        Venta v = null;
        if(type == "Mayor"){
            for(int i = 0; i < this.inventario.getProductos().size(); i++){
                if(cod == this.inventario.getProductos().get(i).getCodigo()){
                    v = new Venta();
                    v.comprarProducto(cod, cant);
                    this.ventas.add(v);
                    for(int k = 0; k < this.clientes.size(); k++){
                        if(Integer.parseInt(ced) == this.clientes.get(k).getCedula())
                            this.clientes.get(i).añadCompra(ced, v);
                    }
                }
            }
        } else{
            for(int i = 0; i < this.inventario.getProductos().size(); i++){
                if(cod == this.inventario.getProductos().get(i).getCodigo()){
                    v = new Venta();
                    v.comprarProducto(cod, cant);
                    this.ventas.add(v);
                }
            }
        }
        return true;
    }
    
    
}
