/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg6;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double porcentaxe;//sacarlo por pantalla (es el porcentaje que le hicieron de descuento
        double n;//prezoorixinal
        double p;//prezopagado
        double porcentaxereal;
        Scanner obx1 = new Scanner (System.in);
        n = obx1.nextDouble();
        Scanner obx2 = new Scanner (System.in);
        p = obx2.nextDouble();
        porcentaxe=(p*100)/n;
        porcentaxereal=100-porcentaxe;
        System.out.println("o porcentaxe de desconto que lle fixeron foi de "+porcentaxereal);   
    }
}
