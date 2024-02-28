/*
 * Copyright 2023 Modulo Programacion
 * https://www.edu.xunta.gal/fpadistancia/
 */
package Cuentas;

/**
 *
 * @author Fredo
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        operativa_cuenta(null);
    }

    public static void operativa_cuenta(Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1= new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
   
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(1000);
            }catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
            }

    }

    
