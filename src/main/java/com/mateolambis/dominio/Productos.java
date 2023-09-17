package com.mateolambis.dominio;

public class Productos {
    private String nombreML;
    private int cantidadML;
    private double precioML;

    public Productos(String nombreML, int cantidadML, double precioML) {
        this.nombreML = nombreML;
        this.cantidadML = cantidadML;
        this.precioML = precioML;
    }

    public String traerNombreML(){
        return nombreML;
    }
    public int traerCantidadML(){
        return cantidadML;
    }
    public double traerprecioML(){
        return precioML;
    }
    public void restarCantidadML(){
        if (cantidadML > 0){
            cantidadML--;
        }
    }

    public String getNombreML() {
        return nombreML;
    }

    public int getCantidadML() {
        return cantidadML;
    }

    public double getPrecioML() {
        return precioML;
    }

}
