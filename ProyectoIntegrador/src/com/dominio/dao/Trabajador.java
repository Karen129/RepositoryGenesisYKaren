/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dao;

import java.sql.Date;

/**
 *
 * @author USUARIO
 */
public class Trabajador {
    private int id_trabajador;
    private int cedula;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String sexo;
    private String direccion;
    private String telefono;
    private String contraseña;
    private int id_cargo;

    public Trabajador() {
    }

    public Trabajador(int id_trabajador, int cedula, String nombre, String apellido, Date fecha_nac, String sexo, String direccion, String telefono, String contraseña, int id_cargo) {
        this.id_trabajador = id_trabajador;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.id_cargo = id_cargo;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

   
    @Override
    public String toString() {
        return this.getId_trabajador()+" "+this.getNombre()+" "+this.getApellido()+" "+this.getFecha_nac()+" "+this.getSexo()+" "+this.getDireccion()+" "+this.getTelefono()+" "+this.getContraseña();
    }
}
