package isc_eva3_oop_examen_cupcake;

import Problema1.*;
import java.io.IOException;
import java.util.Scanner;

public class ISC_EVA3_OOP_EXAMEN_CUPCAKE {

    public static void main(String[] args) {
        String ruta = "";
        //Creación de los objetos de tipo Estudiantes
        Estudiante estu1 = new Estudiante("Lana del Rey", 1, "Tercer semestre");
        Estudiante estu2 = new Estudiante("Rosalía Vita", 2, "Cuarto semestre");
        Estudiante estu3 = new Estudiante("Beyonce Knowles", 3, "Segundo semestre");
        Estudiante estu4 = new Estudiante("Ethel Cain", 4, "Primer semestre");
        Estudiante estu5 = new Estudiante("Fiona Apple", 5, "Octavo semestre");
        Estudiante estu6 = new Estudiante("Kali Uchis", 6, "Sexto semestre");
        Estudiante estu7 = new Estudiante("Nicki Minaj", 7, "Quinto semestre");
        Estudiante estu8 = new Estudiante("ARRRCA ", 8, "Segundo semestre");
        Estudiante estu9 = new Estudiante("Phoebe Bridgers ", 9, "Sexto semestre");
        Estudiante estu10 = new Estudiante("Lady Gaga", 10, "Primer semestre");
        Estudiante estu11 = new Estudiante("Sophie Xeon", 11, "Octavo semestre");
        Estudiante estu12 = new Estudiante("FKA Twigs", 12, "Cuarto semestre");
        Estudiante estu13 = new Estudiante("Madonna", 13, "Quinto semestre");
        Estudiante estu14 = new Estudiante("Donna Summer", 14, "Octavo semestre");
        Estudiante estu15 = new Estudiante("Nina Simone", 15, "Septimo semstre");

        //Se añaden estudiantes a la lista
        StudentManagementSystem.addStudent(estu1);
        StudentManagementSystem.addStudent(estu2);
        StudentManagementSystem.addStudent(estu3);
        StudentManagementSystem.addStudent(estu4);
        StudentManagementSystem.addStudent(estu5);
        StudentManagementSystem.addStudent(estu6);
        StudentManagementSystem.addStudent(estu7);
        StudentManagementSystem.addStudent(estu8);
        StudentManagementSystem.addStudent(estu9);
        StudentManagementSystem.addStudent(estu10);
        StudentManagementSystem.addStudent(estu11);
        StudentManagementSystem.addStudent(estu12);
        StudentManagementSystem.addStudent(estu13);
        StudentManagementSystem.addStudent(estu14);
        StudentManagementSystem.addStudent(estu15);

        //Búsqueda de estudiante
        Estudiante busqueda = StudentManagementSystem.getEstudiante(10);
        System.out.println("Nombre: " + busqueda.getNombre());
        System.out.println("Número lista: " + busqueda.getNumero());
        System.out.println("Grado: " + busqueda.getGrado());
        do {
            try {
                Scanner sc = new Scanner(System.in);

                //Guardar los objetos
                System.out.println("Ingresa la ruta");
                ruta = sc.nextLine();
                StudentManagementSystem.storeData(ruta);

                //Leer los objetos
                StudentManagementSystem.loadData(ruta);
                //Borrar los datos de estudiantes
                StudentManagementSystem.lista.clear();
                StudentManagementSystem.storeData(ruta);

                break;
            } catch (IOException ex) {
                System.out.println("No se encontró la ruta especificada. Ingresa otra");
            } catch (ClassNotFoundException ex) {
                ex.getStackTrace();
            }
        } while (true);
    }
}
