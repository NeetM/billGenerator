
package com.mycompany.boletavet;

import javax.swing.JOptionPane;

public class Paciente {
    String nombre, rut, especie;
    double peso;
    int edad;
    
    public Paciente(String nombre, String especie, int edad, double peso) {
       
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
   
    }

    public String getNom() {
        return nombre;
    }

    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public String getEspec() {
        return especie;
    }

    public void setEspec(String especie) {
        this.especie = especie;
    }
    
        public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
       public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void mostrarPaciente(){
        JOptionPane.showMessageDialog(null,"Nombre: " + this.nombre + "/nEspecie: " + this.especie + "/nEdad: " + this.edad + "/nPeso: " + this.peso);
    }
}

