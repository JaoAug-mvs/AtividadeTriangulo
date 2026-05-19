/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulatriangulo;

/**
 *
 * @author João Augusto MVS
 */
public class AulaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Escreva o primeiro valor: ");
        double cat1 = entrada.nextDouble();
        System.out.print("Escreva o segundo valor: ");
        double cat2 = entrada.nextDouble();
        Triangulo tri = new Triangulo();
        tri.setC1(cat1);
        tri.setC2(cat2);
        double area = tri.calculaArea();
        double hipotenusa = tri.calculahipotenusa();
        
        System.out.println("Area do triangulo e: " + area);
        System.out.println("Hipotenusa do triangulo e: " + hipotenusa);
        
        entrada.close();
    }
    
}
