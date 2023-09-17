package com.mateolambis.dominio;

import java.util.ArrayList;
import java.util.List;

public class maquinaDispensador {
    private List<Productos> productosML;

    public maquinaDispensador() {
        this.productosML = new ArrayList<>();
    }

    public void agregarProductosML(Productos productos){
        if (productosML.size() < 10){
            productosML.add(productos);
        }else{
            System.out.println("La maquina alcanzo su maximo de productos.");
        }

    }

    public void sacarUnidadML(Productos producto){
        if (productosML.contains(producto)) {
            if (producto.traerCantidadML() > 0) {
                producto.restarCantidadML();
            System.out.println("¡Producto vendido! sobran " + producto.traerCantidadML() + " unidades de " + producto.traerNombreML());
            } else {
                System.out.println("El producto " + producto.traerNombreML() + " está agotado.");
            }
        }
    }

    public int consultarTotalunidadesML(){
        int totalML = 0;
        for (Productos productos: productosML){
            totalML += productos.getCantidadML();
        }
        return totalML;
    }

    public void mostrarProductosML(){
        for (Productos productos: productosML){
            System.out.println("Nombre: " + productos.traerNombreML() + ", Precio: $" + productos.traerprecioML() + ", Cantidad: " + productos.traerCantidadML());
        }
    }

}
