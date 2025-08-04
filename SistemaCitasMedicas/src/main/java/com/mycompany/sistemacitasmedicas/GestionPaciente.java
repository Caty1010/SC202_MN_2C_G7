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
public class GestionPaciente {
    Paciente[] pacientes = new Paciente[100];
    int contador = 0;

    public GestionPaciente() {
        pacientes[contador++] = new Paciente(1, " Ana Morales ", "1-234-678 ", "7420-1111");
        pacientes[contador++] = new Paciente(2, " Luis Ramírez ", "2-256-485 ", "7365-2222");
        pacientes[contador++] = new Paciente(3, " Sofía Herrera ", "3-658-258 ", "8526-3333");
        pacientes[contador++] = new Paciente(4, " Carlos Pérez ", "4-584-896 ", "7125-4444");
        pacientes[contador++] = new Paciente(5, " María Fernández ", "5-854-856 ", "8695-5555");
    }

    public void ver() {
        String lista = "Lista de pacientes: \n\nID \tNombre \t\tCédula \tTeléfono \n";
        for (int i = 0; i < contador; i++) {
            lista += pacientes[i].getId() + "\t" + pacientes[i].getNombre() + "\t" + pacientes[i].getCedula() + "\t" + pacientes[i].getTelefono() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void agendar() {
        JOptionPane.showMessageDialog(null, "Función de agendar cita para paciente aún no implementada");
    }

    public void editar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente a editar:"));
        for (int i = 0; i < contador; i++) {
            if (pacientes[i].getId() == id) {
                String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:", pacientes[i].getNombre());
                String nuevaCedula = JOptionPane.showInputDialog("Nueva cédula:", pacientes[i].getCedula());
                String nuevoTelefono = JOptionPane.showInputDialog("Nuevo teléfono:", pacientes[i].getTelefono());
                pacientes[i].setNombre(nuevoNombre);
                pacientes[i].setCedula(nuevaCedula);
                pacientes[i].setTelefono(nuevoTelefono);
                JOptionPane.showMessageDialog(null, "Paciente actualizado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
    }

    public void anadir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID del nuevo paciente: "));
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String cedula = JOptionPane.showInputDialog("Cédula: ");
        String telefono = JOptionPane.showInputDialog("Teléfono: ");
        pacientes[contador++] = new Paciente(id, nombre, cedula, telefono);
        JOptionPane.showMessageDialog(null, "Paciente añadido correctamente.");
    }

    public void eliminar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente a eliminar:"));
        for (int i = 0; i < contador; i++) {
            if (pacientes[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    pacientes[j] = pacientes[j + 1];
                }
                pacientes[--contador] = null;
                JOptionPane.showMessageDialog(null, "Paciente eliminado correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
    }
}
