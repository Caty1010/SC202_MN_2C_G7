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
public class GestionMedico {
    Medico[] medicos = new Medico[100];
    int contador = 0;

    public GestionMedico() {
        medicos[contador++] = new Medico(1 , " Dra. Gabriela Arroyo ", "Psicología ", "Lunes y Miércoles ", "9:00 AM - 12:00 PM");
        medicos[contador++] = new Medico(2 , " Dr. Luis Jiménez ", "Nutrición ", "Martes y Viernes ", "1:00 PM - 4:00 PM");
        medicos[contador++] = new Medico(3 , " Dra. Viviana Torres ", "Pediatría ", "Lunes y Jueves ", "10:00 AM - 2:00 PM");
        medicos[contador++] = new Medico(4 , " Dr. Andrés Molina ", "Medicina General ", "Miércoles y Viernes ", "8:00 AM - 11:00 AM");
        medicos[contador++] = new Medico(5 , " Dra. Mariana Porras ", "Ginecología ", "Martes y Jueves ", "1:00 PM - 5:00 PM");
    }

    public void ver() {
        String lista = "Lista de médicos :\n\nID \tNombre \tEspecialidad \tDías \tHorario \n";
        for (int i = 0; i < contador; i++) {
            lista += medicos[i].getId() + "\t" + medicos[i].getNombre() + "\t" + medicos[i].getEspecialidad() + "\t" + medicos[i].getDias() + "\t" + medicos[i].getHorario() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void agendar() {
        JOptionPane.showMessageDialog(null, "Función de agendar cita para médico aún no implementada");
    }

    public void editar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del médico a editar:"));
        for (int i = 0; i < contador; i++) {
            if (medicos[i].getId() == id) {
                medicos[i].setNombre(JOptionPane.showInputDialog("Nuevo nombre:", medicos[i].getNombre()));
                medicos[i].setEspecialidad(JOptionPane.showInputDialog("Nueva especialidad:", medicos[i].getEspecialidad()));
                medicos[i].setDias(JOptionPane.showInputDialog("Nuevos días:", medicos[i].getDias()));
                medicos[i].setHorario(JOptionPane.showInputDialog("Nuevo horario:", medicos[i].getHorario()));
                JOptionPane.showMessageDialog(null, "Médico actualizado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Médico no encontrado.");
    }

    public void anadir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID del nuevo médico:"));
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String especialidad = JOptionPane.showInputDialog("Especialidad:");
        String dias = JOptionPane.showInputDialog("Días disponibles:");
        String horario = JOptionPane.showInputDialog("Horario disponible:");
        medicos[contador++] = new Medico(id, nombre, especialidad, dias, horario);
        JOptionPane.showMessageDialog(null, "Médico añadido correctamente.");
    }

    public void eliminar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del médico a eliminar:"));
        for (int i = 0; i < contador; i++) {
            if (medicos[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    medicos[j] = medicos[j + 1];
                }
                medicos[--contador] = null;
                JOptionPane.showMessageDialog(null, "Médico eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Médico no encontrado.");
    }
}