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
public class hospital {
    private String nombreH;
    private ciudad ciudad;
    private int numeroEs;
    private medicos[] medicos;
    private enfermeros[] enfermeros;
    private double sueldos;
    private String direccion;

    public hospital(String n, String d, ciudad c, int es, medicos[] m, enfermeros[] e) {
        nombreH = n;
        direccion = d;
        numeroEs = es;
        ciudad = c;
        medicos = m;
        enfermeros = e;
    }

    public void establecerNombreHospital(String n) {
        nombreH = n;
    }

    public void establecerCiudad(ciudad n) {
        ciudad = n;
    }

    public void calcularNumeroE() {
        numeroEs = obtenerMedicos().length + obtenerEnfermeros().length;
    }

    public void establecerMedicos(medicos[] n) {
        medicos = n;
    }

    public void establecerEnfermeros(enfermeros[] n) {
        enfermeros = n;
    }

    public void calcularSueldo() {
        for (int i = 0; i < obtenerMedicos().length; i++) {
            sueldos = sueldos + obtenerMedicos()[i].obtenerSueldo();
        }
        for (int j = 0; j < obtenerEnfermeros().length; j++) {
            sueldos = sueldos + obtenerEnfermeros()[j].obtenerSueldo();
        }
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public String obtenerNombreHospital() {
        return nombreH;
    }

    public ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroE() {
        return numeroEs;
    }

    public medicos[] obtenerMedicos() {
        return medicos;
    }

    public enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldo() {
        return sueldos;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        /*
        HOSPITAL ZARUMA
        Dirección: Barrio Central
        Ciudad: Zaruma 
        Provincia: El Oro
        Número de especialidades: 7
        Listado de médicos
        - Richard Obrien - sueldo: 1000 - Pediatría
        - Jacob Mcintyre - sueldo: 1100 - General
        - Craig Alexander - sueldo: 1200 - Pediatría
        - John Hernandez - sueldo: 1000 - Internista
        Listado de enfermeros(as)
        - William Bradshaw - sueldo: 800 - contrato
        - Jennifer Muñoz - sueldo: 700 - contrato
        - Jeffrey Bryant - sueldo: 1000 - nombramiento
        Total de sueldos a pagar por mes: 13600
         */

        String cadena;
        cadena = String.format("HOSPITAL %s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n",
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccion(),
                obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),
                obtenerNumeroE());

        cadena = String.format("%s\nListado de médicos\n", cadena);

        for (int i = 0; i < obtenerMedicos().length; i++) {

            cadena = String.format("%s-%s \t - sueldo: %.2f \t - %s\n",
                    cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);

        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s-%s \t - sueldo: %.2f \t - %s\n",
                    cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }

        cadena = String.format("%s\n\nTotal de sueldos a pagar por mes: %.2f", cadena, obtenerSueldo());

        return cadena;

    }
}
