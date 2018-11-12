/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("iniciando Main");
        A();
        System.out.println("terminaando Main");
        
    }
    public static void A(){
        System.out.println("iniciando A");
        B();
        System.out.println("terminando A");
    }
    public static void B(){
        System.out.println("iniciando B");
        C();
        System.out.println("terminando B");
    }
    public static void C(){
        System.out.println("iniciando C");
        System.out.println("terminando C");
    }
}