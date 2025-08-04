/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacitasmedicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 7
 */
public class Medico {
    private int id;
    private String nombre;
    private String especialidad;
    private String dias;
    private String horario;

    public Medico() {
    }

    public Medico(int id, String nombre, String especialidad, String dias, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.dias = dias;
        this.horario = horario;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,
            "ID: " + id +
            "\nNombre: " + nombre +
            "\nEspecialidad: " + especialidad +
            "\nDías: " + dias +
            "\nHorario: " + horario);
    }
}
