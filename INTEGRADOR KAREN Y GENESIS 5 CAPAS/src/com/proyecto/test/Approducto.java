/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.dominio.dao.Productos;
import com.proyecto.dao.Iproductodao;
import com.proyecto.implementacion.productodao;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Approducto {
    
    public static void main(String[] args) {
        
        Iproductodao ipd = new productodao();
        List<Productos> listaProducto = ipd.consultarProducto();
        for (Productos p : listaProducto) {
            System.out.println(p.getDescripcion() + " " + p.getCantidad() + " " + p.getPrecio()+" "+p.getId_consumo1());
            
        }
        
    }
}
