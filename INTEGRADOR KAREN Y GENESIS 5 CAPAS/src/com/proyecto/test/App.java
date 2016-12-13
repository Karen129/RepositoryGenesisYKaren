/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.dominio.dao.Cargos;
import com.formulario.dao.formulariocargo;
import com.proyecto.dao.Icargodao;
import com.proyecto.implementacion.cargodao;
import java.util.List;

/**
 *
 * @author Propietario
 */
public class App {
    public static void main(String[] args) {
        
        Icargodao icd = new cargodao();
        List<Cargos> listaCargo = icd.consultarcargo();
        for (Cargos c : listaCargo) {
            System.out.println(c.getId_cargo() + " " + c.getCargo() + " " + c.getSueldo());
            
        }
        
    }
}
