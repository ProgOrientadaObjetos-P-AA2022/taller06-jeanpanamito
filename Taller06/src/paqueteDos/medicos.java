/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDos;

/**
 *
 * @author JEanpa
 */
public class medicos {
    private String nombre;
    private String especialidad;
    private double sueldo;

    public medicos(String n, double s, String e) {
        nombre = n;
        especialidad= e;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
