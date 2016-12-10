/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dao;

import java.sql.Date;

/**
 *
 * @author Usuario1
 */
public class Factura {
    private int id_factura;
    private Clientes cliente;
    private Trabajador trabajador;
    private double valor_cancelado;
    private Date fecha;

    public Factura() {
    }

    public Factura(int id_factura, Clientes cliente, Trabajador trabajador, double valor_cancelado, Date fecha) {
        this.id_factura = id_factura;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.valor_cancelado = valor_cancelado;
        this.fecha = fecha;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public double getValor_cancelado() {
        return valor_cancelado;
    }

    public void setValor_cancelado(double valor_cancelado) {
        this.valor_cancelado = valor_cancelado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.getId_factura()+"  "+
                this.getCliente()+" "+
                this.getTrabajador()+" "+
                this.getValor_cancelado()+" "+
                this.getFecha();
    }

    
    
}
