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
public class GestionCita {
    Cita[] citas = new Cita[100];
    int contador = 0;

    public void ver() {
        String lista = "Lista de citas:\n\nID\tPaciente\tMédico\tFecha\tHora\n";
        for (int i = 0; i < contador; i++) {
            lista += citas[i].getId() + "\t" + citas[i].getPaciente().getNombre() + "\t" + citas[i].getMedico().getNombre() + "\t" + citas[i].getFecha() + "\t" + citas[i].getHora() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void agendar(GestionPaciente gp, GestionMedico gm) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID de la nueva cita:"));

        gp.ver();
        int idPaciente = Integer.parseInt(JOptionPane.showInputDialog("ID del paciente:"));
        Paciente paciente = null;
        for (int i = 0; i < gp.contador; i++) {
            if (gp.pacientes[i].getId() == idPaciente) {
                paciente = gp.pacientes[i];
                break;
            }
        }

        gm.ver();
        int idMedico = Integer.parseInt(JOptionPane.showInputDialog("ID del médico:"));
        Medico medico = null;
        for (int i = 0; i < gm.contador; i++) {
            if (gm.medicos[i].getId() == idMedico) {
                medico = gm.medicos[i];
                break;
            }
        }

        String fecha = JOptionPane.showInputDialog("Fecha de la cita:");
        String hora = JOptionPane.showInputDialog("Hora de la cita:");

        citas[contador++] = new Cita(id, paciente, medico, fecha, hora);
        JOptionPane.showMessageDialog(null, "Cita agendada correctamente.");
    }

    public void editar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID de la cita a editar:"));
        for (int i = 0; i < contador; i++) {
            if (citas[i].getId() == id) {
                citas[i].setFecha(JOptionPane.showInputDialog("Nueva fecha:", citas[i].getFecha()));
                citas[i].setHora(JOptionPane.showInputDialog("Nueva hora:", citas[i].getHora()));
                JOptionPane.showMessageDialog(null, "Cita editada correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cita no encontrada.");
    }

    public void eliminar() {
        ver();
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID de la cita a eliminar:"));
        for (int i = 0; i < contador; i++) {
            if (citas[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    citas[j] = citas[j + 1];
                }
                citas[--contador] = null;
                JOptionPane.showMessageDialog(null, "Cita eliminada correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cita no encontrada.");
    }
}
