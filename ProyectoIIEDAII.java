/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiiedaii;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Mateo
 */
public class ProyectoIIEDAII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        heap();
        // TODO code application logic here
    }

    static void heap() {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Cuantos elementos vas a agregar en tu arbol HEAP: ");
        size = sc.nextInt();
        int[] arregloHeap = new int[size];
        TreeSet<Integer> ts = new TreeSet();

        for (int x = 0; x < size; x++) {
            System.out.println("ingresa tu elemento " + (x + 1) + ":");
            arregloHeap[x] = sc.nextInt();
            // Integer value=new Integer(arregloHeap[x]);
            ts.add(arregloHeap[x]);
        }

        System.out.println("*******************");
        for (Integer num : ts) {
            System.out.println(num);
        }

        /*
         * for(int i=0;i < ts.size();i++){
         * System.out.println(ts.);
         * }
         */
    }
}
