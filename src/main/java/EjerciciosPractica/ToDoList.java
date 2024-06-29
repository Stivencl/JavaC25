package EjerciciosPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        int cont=1;
        int salir;
        int op;
        int ind;
        int indx=0;
        String addTarea;
        int deleteTarea;
        System.out.println("To DO List \n");

      ArrayList<String> todolist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

while (cont==1){
    System.out.println("Seleccione una de las 4 opciones digitando el número correspondiente");
    System.out.println("1-Agregar tarea");
    System.out.println("2-Eliminar tarea");
    System.out.println("3-Listar todas las tareas");
    System.out.println("4-Marcar tarea como completa");

    op = scanner.nextInt();


    switch (op){
        case 1:

            System.out.println("++Agregar tarea++\n");
            addTarea = scanner.next();
            todolist.add(addTarea);
            break;
        case 2:
            System.out.println("++Eliminar tarea++\n");

            for(String lista : todolist){
                System.out.println(indx+" "+lista);
                indx+=1;
            }
            indx=0;
            System.out.println("Digite el indice a eliminar\n");
            deleteTarea = scanner.nextInt();
            todolist.remove(deleteTarea);

            break;
        case 3:
            System.out.println("++Listar las tareas guardadas++");

            for(String tareas : todolist){
                System.out.println(indx+" "+tareas);
                indx+=1;
            }
            indx=0;
            break;
        case 4:
            System.out.println("++Marcar tarea como completa++\n");
            for(String tareas : todolist){
                System.out.println(indx+" "+tareas);
                indx+=1;
            }
            indx=0;
            System.out.println("Digite el indice a marcar como tarea completa\n");
            ind = scanner.nextInt();
            todolist.set(ind, todolist.get(ind)+"-> TareaCompleta");
            break;
        default:
            System.out.println("La opcion digitada no esta en el menú de opciones\n");
    }
    System.out.println("Desea continuar: presione la tecla 1: si o 2: no");
    salir = scanner.nextInt();
     cont = salir;
}

        scanner.close();
    }
}
