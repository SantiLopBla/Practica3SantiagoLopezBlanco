/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasuperchino;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class Productos {

    private String nombreSuper = "Super Chino"; //Declarado de variables
    private String codigoSuper;
    private String codigoProducto;
    private String nombreProducto;
    private String nombreEmpleado;
    private String cedulaEmpleado;
    private int cantProductos;
    private double precioBase = 0;
    private double precioBruto = 0;
    private double gananciaEsperada = 0;

    //Lo intente profe, pero entre en crisis
    public Productos() {
    }

    public Productos(String nombreSuper, String codigoSuper, String codigoProducto, String nombreProducto, String nombreEmpleado, String cedulaEmpleado, int cantProductos) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantProductos = cantProductos;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(String codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    public static void solicitaDatasEmpleado(Productos[] e1) { //funcion de solicitar Datos empleado
        for (int i = 0; i < e1.length; i++) {
            String nombreEmpleado = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
            String cedulaEmpleado = JOptionPane.showInputDialog("Digite la cedula del empleado");
            String codigoSuper = JOptionPane.showInputDialog("Ingrese el codigo del super");
            e1[i] = new Productos(nombreEmpleado, cedulaEmpleado, codigoSuper);
        }
    }

    public static void solicitaProductos(Productos[] p1) { //funcion para solicitar productos

        double sumaPrecio = 0;
        for (int k = 0; k < p1.length; k++) {
            int cantProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));

            for (int j = 0; j < cantProductos; j++) {
                String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                String codigoProducto = JOptionPane.showInputDialog("Ingrese el codigo del producto");
                int precioProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                p1[k] = new Productos(nombreProducto, codigoProducto, precioProducto);

            }

        }
    }

    @Override
    public String toString() { //To String de las variables
        return "Productos{" + "nombreSuper=" + nombreSuper + ", codigoSuper=" + codigoSuper + ", codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", nombreEmpleado=" + nombreEmpleado + ", cedulaEmpleado=" + cedulaEmpleado + ", cantProductos=" + cantProductos + ", precioBase=" + precioBase + ", precioBruto=" + precioBruto + ", gananciaEsperada=" + gananciaEsperada + '}';
    }
}
