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
    private int id_consumo;

    public Productos() {
    }

    public Productos(int id_productos, String descripcion, int cantidad, double precio, int id_consumo) {
        this.id_productos = id_productos;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_consumo = id_consumo;
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

    public int getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(int id_consumo) {
        this.id_consumo = id_consumo;
    }
    
}

