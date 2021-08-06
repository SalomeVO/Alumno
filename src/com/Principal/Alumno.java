package com.Principal;

import java.util.Random; //Libreria random

public class Alumno {
    private String nombre;
    private String apellido;
    private String DPI;
    private String correo;
    private String telefono;
    private String carnet;
    private int indice;

    //Constructor #1: Es un método especial de la clase, que se encarga de inicializar los valores de la clase
    public Alumno(){
        this.indice = 1; //inicializa la clase
    }

    //Constructor #2
    public Alumno(String nombre, String apellido, String correo, String telefono, String DPI, String carnet){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DPI = DPI;
        this.correo = correo;
        this.telefono = telefono;
        this.carnet = carnet;
    }

    public String[] datos(){
        String[] lista = new String[6];
        lista[0] = this.nombre;
        lista[1] = this.apellido;
        lista[2] = this.DPI;
        lista[3] = this.correo;
        lista[4] = this.telefono;
        lista[5] = this.carnet;
        return lista;
    }

    public String mostrarCarnet(){
        return this.carnet;
    }

    public String automaticoCarnet(RegistroAlumno registro){

        String tiempo = "2021";

        Random  rnd = new Random();

        int numero_random = rnd.nextInt(1000);
        String random = Integer.toString(numero_random);
        String carnet = tiempo + "-" + random;

        while(registro.existeAlumnoRegistrado(carnet)){
            numero_random = rnd.nextInt(1000);
            random = Integer.toString(numero_random);
            carnet = tiempo + "-" + random;

            if (!(registro.existeAlumnoRegistrado(carnet))){
                break;
            }else
            {

            }
        }
        this.carnet = carnet;

        return "";
    }

}