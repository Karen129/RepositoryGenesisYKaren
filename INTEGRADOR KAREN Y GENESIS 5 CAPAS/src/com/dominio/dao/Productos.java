/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dao;

/**
 *
 * @author USUARIO
 */
public class Productos {
   private int id_productos;
    private String descripcion;
    private int cantidad;
    private double precio;
    private int id_consumo1;

    public Productos() {
    }

    public Productos(int id_productos, String descripcion, int cantidad, double precio, int id_consumo1) {
        this.id_productos = id_productos;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_consumo1 = id_consumo1;
    }

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_consumo1() {
        return id_consumo1;
    }

    public void setId_consumo1(int id_consumo1) {
        this.id_consumo1 = id_consumo1;
    }

    

    @Override
    public String toString() {
        return this.getId_productos() + " "+ this.getDescripcion() + " "+ this.getCantidad() + " " + this.getPrecio() + " "+ this.getId_consumo1();
    }
    
}

