/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacitasmedicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 7
 */
public class SistemaCitasMedicas {

    public static void main(String[] args) {
        GestionPaciente gp = new GestionPaciente();
        GestionMedico gm = new GestionMedico();
        GestionCita gc = new GestionCita();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Bienvenido al Sistema de citas de la Clínica Integral Vitalis \n Menú Principal:\n" +
                "1. Gestión de Pacientes\n" +
                "2. Gestión de Médicos\n" +
                "3. Gestión de Citas\n" +
                "4. Salir");

            if (opcion == null || opcion.equals("4")) {
                break;
            }

            switch (opcion) {
                case "1":
                    menuPacientes(gp);
                    break;
                case "2":
                    menuMedicos(gm);
                    break;
                case "3":
                    menuCitas(gc, gp, gm);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    static void menuPacientes(GestionPaciente gp) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Gestión de Pacientes:\n" +
                "1. Ver\n" +
                "2. Añadir\n" +
                "3. Editar\n" +
                "4. Eliminar\n" +
                "5. Volver");

            if (opcion == null || opcion.equals("5")) break;

            switch (opcion) {
                case "1": gp.ver(); break;
                case "2": gp.anadir(); break;
                case "3": gp.editar(); break;
                case "4": gp.eliminar(); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    static void menuMedicos(GestionMedico gm) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Gestión de Médicos:\n" +
                "1. Ver\n" +
                "2. Añadir\n" +
                "3. Editar\n" +
                "4. Eliminar\n" +
                "5. Volver");

            if (opcion == null || opcion.equals("5")) break;

            switch (opcion) {
                case "1": gm.ver(); break;
                case "2": gm.anadir(); break;
                case "3": gm.editar(); break;
                case "4": gm.eliminar(); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    static void menuCitas(GestionCita gc, GestionPaciente gp, GestionMedico gm) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Gestión de Citas:\n" +
                "1. Ver\n" +
                "2. Agendar\n" +
                "3. Editar\n" +
                "4. Eliminar\n" +
                "5. Volver");

            if (opcion == null || opcion.equals("5")) break;

            switch (opcion) {
                case "1": gc.ver(); break;
                case "2": gc.agendar(gp, gm); break;
                case "3": gc.editar(); break;
                case "4": gc.eliminar(); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}