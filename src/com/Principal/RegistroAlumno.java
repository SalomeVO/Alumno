package com.Principal;

import java.util.Scanner;

public class RegistroAlumno {
    //{Area de declaraciones}

    Scanner entradaDeTeclado = new Scanner(System.in);
    private String[][] alumnosRegistrados;// solo se declara la matriz

    private int indiceVector;

    //{ Area de métodos de clase}
    public RegistroAlumno(int cantidadDeRegistros) {
        this.alumnosRegistrados = new String[cantidadDeRegistros][6]; //Iniciaizacion de la matriz
        this.indiceVector = 0;
    }

    public boolean registrarAlumno(Alumno alumno) {
        String[] datoalumno = alumno.datos();

        if (!(this.existeAlumnoRegistrado(datoalumno[1]))) {          // if(this.existeAlumnoRegistrado(nombreAlumno)==false){

            this.alumnosRegistrados[this.indiceVector][0] = datoalumno[0];
            this.alumnosRegistrados[this.indiceVector][1] = datoalumno[1];
            this.alumnosRegistrados[this.indiceVector][2] = datoalumno[2];
            this.alumnosRegistrados[this.indiceVector][3] = datoalumno[3];
            this.alumnosRegistrados[this.indiceVector][4] = datoalumno[4];
            this.alumnosRegistrados[this.indiceVector][5] = datoalumno[5];
            this.incrementarIndice();

            return true;

        } else {

            return false;
        }
    }

    private void incrementarIndice() {
        this.indiceVector = this.indiceVector + 1;
    }

    //getAlumnosRegistrados();
    public String[][] obtenerAlumnosRegistrados(){
        return this.alumnosRegistrados;
    }

    public boolean existeAlumnoRegistrado(String carnetAlumno){
        for(int i=0; i<this.alumnosRegistrados.length; i++){//length devuelve el tamaño del vector
            if(this.alumnosRegistrados[i][1]!=null){
                //nombreAlumno==alumnosRegistrados[i] esto tambien funciona
                if(carnetAlumno.equals(this.alumnosRegistrados[i][0])){
                    return true;
                }
            }
        }
        return false;
    }

    public void corregirAlumno(String carnetAlumno){
        for(int i=0; i<this.alumnosRegistrados.length; i++){                           //length devuelve el tamaño del vector
            if(this.alumnosRegistrados[i][5]!=null){

                if(carnetAlumno.equals(this.alumnosRegistrados[i][5])){               //nombreAlumno==alumnosRegistrados[i] esto tambien funciona
                    System.out.println("\nInformacion de alumno: ");

                    for(int j=0; j<this.alumnosRegistrados[0].length; j++){

                        if(!(this.alumnosRegistrados[i]==null)) {                 //se valida si el registro no es nulo

                            System.out.println("\nNombre: "  + this.alumnosRegistrados[i][0]);
                            System.out.println("Apellidos: " + this.alumnosRegistrados[i][1]);
                            System.out.println("DPI: "       + this.alumnosRegistrados[i][2]);
                            System.out.println("Correo: "    + this.alumnosRegistrados[i][3]);
                            System.out.println("Telefono: "  + this.alumnosRegistrados[i][4]);
                            System.out.println("Carne: "     + this.alumnosRegistrados[i][5]);

                            System.out.println("\nIngrese el nuevo Nombre: ");
                            this.alumnosRegistrados[i][0] = entradaDeTeclado.nextLine();

                            System.out.println("Ingrese el nuevo Apellido: ");
                            this.alumnosRegistrados[i][1] = entradaDeTeclado.nextLine();

                            System.out.println("Ingrese el nuevo DPI: ");
                            this.alumnosRegistrados[i][3] = entradaDeTeclado.nextLine();

                            System.out.println("Ingrese el nuevo Correo: ");
                            this.alumnosRegistrados[i][4] = entradaDeTeclado.nextLine();

                            System.out.println("Ingrese el nuevo Telefono: ");
                            this.alumnosRegistrados[i][5] = entradaDeTeclado.nextLine();

                            break;
                        }
                    }
                }
            }
        }
    }
}