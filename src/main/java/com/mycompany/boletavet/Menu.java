package com.mycompany.boletavet;
import javax.swing.JOptionPane;

public class Menu {
      public static void main(String[] args) {
        
        Boleta arrayBoleta[] = new Boleta[3];
        Paciente arrayPaciente[] = new Paciente[3];
        int contGato = 0;
        int esMenu = 0;
        boolean salir = true;
        
        do {
            
            int op = Integer.parseInt(JOptionPane.showInputDialog("1.INGRESAR BOLETAS\n2.BUSCAR PACIENTE POR NOMBRE\n3.CONTADOR DE GATOS ATENDIDOS\n4.BUSCAR BOLETA POR RUT\n5.SALIR"));
            
            switch(op){
                
                case 1:
                    for (int i = 0; i < 3; i++) {
                     
                        String nb = JOptionPane.showInputDialog("Ingrese rut del cliente");
                        double mo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Monto"));
                    
                        String n = JOptionPane.showInputDialog("Ingrese nombre del paciente");
                        String es = "";
                        
                        do {
                            esMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la especie\n1.Gato\n2.Perros\n3.Aves"));
                            switch (esMenu) {
                                case 1:
                                     es = "Gato";
                                     contGato++;
                                     arrayBoleta[i].setMonto( arrayBoleta[i].getMonto() * 0.6 );
                                    break;
                                    
                                case 2:
                                    es = "Perro";
                                    break;
                                    
                                    
                                case 3:
                                    es = "Ave";
                                    break;
                                    
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcion no existe");
                            }
                        } while (esMenu > 0 && esMenu < 3);
                        
                        
                        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                        double p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la peso"));
                        
                        arrayPaciente[i] = new Paciente(n,es,e,p); 
                        arrayBoleta[i] = new Boleta(nb,mo);
                        
                    }
                    
                break;
                    
                
                case 2:
                    String nomb = JOptionPane.showInputDialog("Ingrese nombre de paciente a buscar");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (arrayPaciente[i].getNom().equals(nomb)) {
                                
                                JOptionPane.showMessageDialog(null, "Paciente encontrado");
                                arrayPaciente[i].mostrarPaciente();
                                
                            }
                        }
                    }
                    
                break;
                
               
                case 3:
                    JOptionPane.showMessageDialog(null, "Gatos atendidos: " + contGato);
                break;
                
                case 4:
                    String rutb = JOptionPane.showInputDialog("Ingrese rut de boleta a buscar");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (arrayBoleta[i].getRut().equals(rutb)) {
                                
                                JOptionPane.showMessageDialog(null, "Boleta encontrado");
                                arrayBoleta[i].mostrarBoleta();
                                
                            }
                        }
                    }
                break;
                
                case 5:
                
                    JOptionPane.showMessageDialog(null, "Bye bye");
                    System.exit(0);
                    
                break;
                
            default:
                    JOptionPane.showMessageDialog(null, "Opcion no existe");   
            }
            
        } while (true);
    }
      
}

        