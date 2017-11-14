/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import logicanegocio.*;

/**
 *
 * @author Daniel y Cielo
 */
public class CargaArchivo {
    ArrayList<Sucursal> sc;

    public CargaArchivo() {
    
    public void CargaDatos (String sr){
        File data = new File(sr);
        Scanner entrada = null;
        if(data.exists()){
            try{
                entrada = new Scanner(data);
                entrada.useDelimiter(",");
                String sign = null;
                while(entrada.hasNext()){
                    sign = entrada.next().trim();
                    if(sign.equals("S")){
                        String num = entrada.next().trim();
                        int n = Integer.parseInt(num);
                        Sucursal ns = new Sucursal(n);
                        sc.add(ns);
                    } else if (sign.equals(""))
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
    
}
