/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.dominio.dao.Trabajador;
import com.proyecto.dao.Itrabajadordao;
import com.proyecto.implementacion.trabajadordao;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Apptrabajador {
     public static void main(String[] args) {
        
        Itrabajadordao ipt = new trabajadordao();
        List<Trabajador> listatrabajador = ipt.consultarTrabajador();
        for (Trabajador t : listatrabajador) {
            System.out.println(t.getCedula()+" "+t.getNombres()+" "+t.getApellidos()+" "+t.getFecha_nac()+
                    " "+t.getSexo()+" "+t.getDireccion()+" "+t.getTelefono()+" "+t.getContraseña()+" "+t.getId_cargo());
            
        }
    }
}
