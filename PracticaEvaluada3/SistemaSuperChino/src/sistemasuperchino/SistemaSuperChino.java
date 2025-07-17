/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasuperchino;

/**
 *
 * @author sanlo
 */
public class SistemaSuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Productos [] p = new Productos [1]; //Abre el arreglo de Productos
        Productos.solicitaDatasEmpleado(p);
        Productos.solicitaProductos(p);
        
    }
    
}
