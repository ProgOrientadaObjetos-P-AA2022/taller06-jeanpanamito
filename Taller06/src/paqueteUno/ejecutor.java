/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteUno;

import java.util.Scanner;
import paqueteDos.ciudad;
import paqueteDos.enfermeros;
import paqueteDos.hospital;
import paqueteDos.medicos;

/**
 *
 * @author JEanpa
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);

        String nombreH;
        String direccion;
        String ciudad;
        String provincia;
        medicos[] medicos;
        int numeroM;
        String nombreM;
        double sueldoM;
        String especialidadM;
        enfermeros[] enfermeros;
        int numeroE;
        String nombreE;
        double sueldoE;
        String tipoE;
        int numeroEs;

        System.out.println("Ingrese el nombre del Hospital");
        nombreH = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        provincia = entrada.nextLine();
        
        ciudad c1 = new ciudad(ciudad, provincia);
        
        
        
        System.out.println("Ingrese el numero de médicos que tiene el hospital");
        numeroM = entrada.nextInt();
        medicos = new medicos[numeroM];
        entrada.nextLine();

        for (int i = 0; i < numeroM; i++) {
            
            System.out.printf("Ingrese el nombre del médico %d\n", i + 1);
            nombreM = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoM = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            especialidadM = entrada.nextLine();

            medicos m1 = new medicos(nombreM, sueldoM, especialidadM);

            medicos[i] = m1;
        }

        System.out.println("Ingrese el número de enfermeros(as)");
        numeroE = entrada.nextInt();
        enfermeros = new enfermeros[numeroE];
        
        entrada.nextLine();

        for (int i = 0; i < numeroE; i++) {
            System.out.printf("Ingrese el nombre del enfermero/a %d\n", i + 1);
            nombreE = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoE = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato que tiene");
            tipoE = entrada.nextLine();

            enfermeros e1 = new enfermeros(nombreE, sueldoE, tipoE);

            enfermeros[i] = e1;
            
        }
        numeroEs = numeroM + numeroE;
        
        hospital entidadHospitalaria = new hospital (nombreH, direccion, c1, numeroEs, medicos, enfermeros);
        entidadHospitalaria.calcularSueldo();
        
        
        System.out.printf("\n%s\n", entidadHospitalaria);
    }
}
    
    

