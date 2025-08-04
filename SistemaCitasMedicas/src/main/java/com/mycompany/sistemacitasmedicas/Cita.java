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
public class Cita {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;

    public Cita(int id, Paciente paciente, Medico medico, String fecha, String hora) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,
            "Cita:\n" +
            "ID: " + id + "\n" +
            "Paciente: " + paciente.getNombre() + "\n" +
            "Médico: " + medico.getNombre() + "\n" +
            "Fecha: " + fecha + "\n" +
            "Hora: " + hora);
    }
}