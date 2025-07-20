package com.mycompany.clasemedico;
import javax.swing.JOptionPane;

/**
 *
 * @author 50684
 */
public class ClaseMedico {
    // Atributos
    private String nombre;
    private String codigo;
    private String correo;
    private String telefono;
    private String especialidad;
    private String[] diasDisponibles;
    private String[] horasDisponibles;

    // Constructor
    public ClaseMedico(String nombre, String codigo, String correo, String telefono, String especialidad,
                       String[] diasDisponibles, String[] horasDisponibles) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.diasDisponibles = diasDisponibles;
        this.horasDisponibles = horasDisponibles;
    }

    // Métodos para mostrar información
    public void mostrarMedico() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo CMC: " + codigo);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Especialidad: " + especialidad);
    }

    public void mostrarDiasPorEspecialidad() {
        System.out.println("Dias disponibles: ");
        for (String dia : diasDisponibles) {
            System.out.println("- " + dia);
        }
    }

    public void mostrarHoraPorEspecialidad() {
        System.out.println("Horarios disponibles: ");
        for (String hora : horasDisponibles) {
            System.out.println("- " + hora);
        }
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Método main para ejecutar pruebas
    public static void main(String[] args) {
        ClaseMedico[] medicos = {
        new ClaseMedico("Dra. Gabriela Arroyo", "CR00234", "gabriela@vitalis.com", "2223-2004", "Psicologia",
                new String[]{"Lunes", "Miercoles"}, new String[]{"9:00 AM", "12:00 PM"}),
        new ClaseMedico("Dr. Luis Jimenez", "CR00765", "luis@vitalis.com", "2223-2005", "Nutricion",
                new String[]{"Martes", "Viernes"}, new String[]{"13:00 PM", "16:00 PM"}),
        new ClaseMedico("Dra. Viviana Torres", "CR00954", "viviana@vitalis.com", "2223-2006", "Fisioterapia",
                new String[]{"Viernes", "Sabado"}, new String[]{"11:00 AM", "12:00 PM"}),
        new ClaseMedico("Dra. Rachell Chavarria", "CR00523", "rachell@vitalis.com", "2223-2008", "Dermatologia",
                new String[]{"Martes", "Viernes"}, new String[]{"9:30 AM", "11:30 AM"}),
  
    };
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de citas de clínica Vitalis, te mostramos las especialidades disponibles en la clinica: \n"
               + "- Psicologia\n" + "- Nutricion\n"+ "- Fisioterapia\n" + "- Dermatologia\n");

        String especialidadBuscada = JOptionPane.showInputDialog("Ingrese la especialidad que busca, por favor excluya las tildes: ");

        boolean encontrado = false;
        for (ClaseMedico medico : medicos) {
            if (medico.getEspecialidad().equalsIgnoreCase(especialidadBuscada)) {
                encontrado = true;
                medico.mostrarMedico();
                medico.mostrarDiasPorEspecialidad();
                medico.mostrarHoraPorEspecialidad();
                System.out.println("-------------------------");
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, aún no contamos con médicos con esa especialidad.");
        }
    }
}
