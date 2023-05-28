package Problema1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    //---Los atributos y métodos de la clase fueron declarados de tipo 
    //---static para no tener que crear un objeto al momento de usarlos en el main
    //Se declara una Lista en la cual recibirá objetos de tipo Estudiantes
    public static List<Estudiante> lista = new ArrayList<>();

    //Este método se encarga de agregar los estudiantes a la lista
    //Recibe un estudiante como único parametro y lo agrega a la lista
    public static void addStudent(Estudiante estudiante) {
        lista.add(estudiante);
    }

    //Este metodo se encarga de buscar estudiantes por número de lista
    //Recibe el número de lista del estudiante como parametro y devuelve un estudiante
    public static Estudiante getEstudiante(int numeroBuscar) {

        //Iteración de todos los objetos en la lista
        for (Estudiante estu : lista) {
            if (estu.getNumero() == numeroBuscar) { //Si el número de lista del 
                //Estudiante coincide se regresa 
                return estu;
            }
        }
        //Si ningún miembro de la lista coincide, se regresa null
        System.out.println("No se encontró a ese estudiante");
        return null;
    }

    //Este método guarda los datos de la lista en un archivo .esto
    public static void storeData(String filename) throws IOException {
        //Se inicializan objetos para escribir los objetos
        FileOutputStream abrirArch = new FileOutputStream(filename);
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArch);
        //Se toma como parametro la lista
        
        ouStream.writeObject(lista);
        
        ouStream.close();

    }

    //Este metodo recibe el archivo de estudiantes y los imprime en consola
    public static void loadData(String filename) throws IOException, ClassNotFoundException {
        FileInputStream abrirArch = new FileInputStream(filename);
        ObjectInputStream oiStream = new ObjectInputStream(abrirArch);
        //Lee el objeto, se hace casting a una Lista de estudiantes y se guarda en otra lista diferente
        lista = (List<Estudiante>) oiStream.readObject();
        abrirArch.close();
        oiStream.close();
        //Después de haber guardado los objetos en la lista, los itera e imprime los datos de los estudiantes
       for (Estudiante estudiante : lista) {
           System.out.println(estudiante.getNumero() + " | " + estudiante.getNombre() + " | " + estudiante.getGrado());
        }
    }
}
