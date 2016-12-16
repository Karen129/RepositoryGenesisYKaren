/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dao;

/**
 *
 * @author usuarioportatil
 */
public class Factura {
    private int Id_factura;
    private Trabajador cajero;
    private Clientes cliente;
    private double valor_cancelar;
    private String fecha;

    public Factura() {
    }

    public Factura(int Id_factura, Trabajador cajero, Clientes cliente, double valor_cancelar, String fecha) {
        this.Id_factura = Id_factura;
        this.cajero = cajero;
        this.cliente = cliente;
        this.valor_cancelar = valor_cancelar;
        this.fecha = fecha;
    }

    public int getId_factura() {
        return Id_factura;
    }

    public void setId_factura(int Id_factura) {
        this.Id_factura = Id_factura;
    }

    public Trabajador getCajero() {
        return cajero;
    }

    public void setCajero(Trabajador cajero) {
        this.cajero = cajero;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getValor_cancelar() {
        return valor_cancelar;
    }

    public void setValor_cancelar(double valor_cancelar) {
        this.valor_cancelar = valor_cancelar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
   
}
