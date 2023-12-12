
package com.mycompany.boletavet;


import javax.swing.JOptionPane;


public class Boleta {
    
    double monto;
    String rut;

    public Boleta(String rut, double monto){
        this.rut = rut;
        this.monto = monto;
    }
    
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public void mostrarBoleta(){
         JOptionPane.showMessageDialog(null,"RUT: "+ this.rut + "\nMonto" + this.monto);
    }
    
    
    
}

