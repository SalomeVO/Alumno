package com.Principal;

import  java.util.Scanner; //para poder ingresar datos

public class Main {
    public static void main(String[] args) {
        Scanner entradaDeTeclado = new Scanner(System.in);
        int seleccion = 0;

        System.out.println("\t*************************");
        System.out.println("\t* Programa Inicializado *");
        System.out.println("\t*************************\n");


        System.out.print("Ingrese el numero de alumnos que va a ingresar: ");
        RegistroAlumno registros = new RegistroAlumno(Integer.parseInt(entradaDeTeclado.nextLine()));

    boolean salir = false;

    do{
        System.out.println("\n\t* Menu *");
        System.out.println("1. Registrar Alumno");
        System.out.println("2. Visualizar registros");
        System.out.println("3. Modificar alumnos");
        System.out.println("4. Salir del Programa");
        System.out.print("\nIngrese la opcion: ");
        int opcion = Integer.parseInt(entradaDeTeclado.nextLine());

        switch (opcion){
            case 1: {
                String[][] vector = registros.obtenerAlumnosRegistrados();
                for (int i=0; i<vector.length; i++){

                    System.out.println("\nIngresar nombres del alumno: ");
                    String nombreAlumno = entradaDeTeclado.nextLine();

                    System.out.println("Ingresar apellidos del alumno: ");
                    String apellidoAlumno = entradaDeTeclado.nextLine();

                    System.out.println("Ingresar DPI del alumno: ");
                    String DPIAlumno = entradaDeTeclado.nextLine();

                    System.out.println("Ingresar correo del alumno: ");
                    String correoAlumno = entradaDeTeclado.nextLine();

                    System.out.println("Ingresar telefono del alumno: ");
                    String telefonoAlumno = entradaDeTeclado.nextLine();


                    Alumno nuevoAlumno = new Alumno(nombreAlumno, DPIAlumno, apellidoAlumno, correoAlumno, telefonoAlumno,  "");

                    nuevoAlumno.automaticoCarnet(registros);
                    System.out.println("\nSe ha generado el carne: " + nuevoAlumno.mostrarCarnet());

                    if(registros.registrarAlumno(nuevoAlumno)){
                        System.out.println("**********************************");
                        System.out.println("* Alumno registrado exitosamente *");
                        System.out.println("**********************************");
                    }
                    else{
                        System.out.println("******************************************");
                        System.out.println("* El alumno ingresado ya está registrado *");
                        System.out.println("******************************************");
                        i -= 1; //para evitar lineas en blanco
                    }
                }
            } break;

            case 2: {
                String[][] vector = registros.obtenerAlumnosRegistrados();
                System.out.println("\n\t********************************");
                System.out.println("\t* Lista de Alumnos Registrados *");
                System.out.println("\t********************************");

                for(int i=0; i<vector.length; i++){                      //if(vector[i]!=null) // otra forma de escribirlo
                    if(!(vector[i]==null)){                             //se valida si el registro no es nulo
                        System.out.println("\nNombre: "  + vector[i][0]);
                        System.out.println("Apellidos: " + vector[i][1]);
                        System.out.println("DPI: "       + vector[i][2]);
                        System.out.println("Correo: "    + vector[i][3]);
                        System.out.println("Telefono: "  + vector[i][4]);
                        System.out.println("Carnet: "    + vector[i][5]);
                    }
                }
            } break;

            case 3: {

                System.out.print("\nIngrese el numero  de carnet: ");
                String numeroCarnet = entradaDeTeclado.nextLine();

                registros.corregirAlumno(numeroCarnet);

            } break;

            case 4:
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~ Acaba de salir del programa ~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                salir = true; break;

            default:
                System.out.println("***********************************");
                System.out.println("* La opcion que ingreso no existe *");
                System.out.println("***********************************");
        };

    } while (!salir);
    }
}
