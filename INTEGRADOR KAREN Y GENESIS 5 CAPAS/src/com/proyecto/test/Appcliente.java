/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.protecto.dominio.Clientes;
import com.proyecto.dao.Iclientedao;
import com.proyecto.implementacion.clientedao;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Appcliente {
     public static void main(String[] args) {
        
        Iclientedao ipc = new clientedao();
        List<Clientes> listacliente = ipc.consultarCliente();
        for (Clientes t : listacliente) {
            System.out.println(t.getCedula()+" "+t.getNombre()+" "+t.getApellido()+" "+t.getFecha_nac()+
                    " "+t.getSexo()+" "+t.getDireccion()+" "+t.getTelefono());
            
        }
    }
}
