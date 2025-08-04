/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacitasmedicas;

import javax.swing.JOptionPane;

/**
 *
 * @author grupo7
 */
public class Paciente {
    private int id;
    private String nombre;
    private String cedula;
    private String telefono;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String cedula, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, 
            "Paciente:\n" +
            "ID: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Cédula: " + cedula + "\n" +
            "Teléfono: " + telefono);
    }
}