/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dao;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Cargos {
    private int id_cargo;
    private String cargo;
    private double sueldo;

    public Cargos() {
    }

    public Cargos(int id_cargo, String cargo, double sueldo) {
        this.id_cargo = id_cargo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.getId_cargo() +" "+ this.getCargo() +" "+ this.getSueldo();
    }
  
    
    
}
