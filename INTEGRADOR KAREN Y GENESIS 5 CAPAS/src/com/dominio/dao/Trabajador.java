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
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fecha_nac;
    private String sexo;
    private String direccion;
    private String telefono;
    private String contraseña;
    private int id_cargo;

    public Trabajador() {
    }

    public Trabajador(int id_trabajador, String cedula, String nombres, String apellidos, Date fecha_nac, String sexo, String direccion, String telefono, String contraseña, int id_cargo) {
        this.id_trabajador = id_trabajador;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        return this.getId_trabajador()+" "+ this.getCedula()+" "+this.getNombres()+" "+this.getApellidos()+" "+this.getFecha_nac()+" "+this.getSexo()+" "+this.getDireccion()+" "+this.getTelefono()+" "+this.getContraseña()+ 
                " "+this.getId_cargo();
    }
}
