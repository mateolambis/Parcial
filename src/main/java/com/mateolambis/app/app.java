package com.mateolambis.app;

import com.mateolambis.dominio.Productos;
import com.mateolambis.dominio.maquinaDispensador;

public class app {
    public static void main(String[] args){
        maquinaDispensador maquina = new maquinaDispensador();

        Productos producto1= new Productos( "Producto 1", 8, 1000);
        Productos producto2= new Productos("Producto 2", 7, 1500);
        Productos producto3= new Productos("Producto 3", 6, 1600);
        Productos producto4= new Productos("Producto 4", 4, 2000);
        Productos producto5= new Productos("Producto 5", 8, 2200);
        Productos producto6= new Productos("Producto 6", 4, 1600);
        Productos producto7= new Productos("Producto 7", 7, 4000);
        Productos producto8= new Productos("Producto 8", 5, 1600);
        Productos producto9= new Productos("Producto 9", 7, 1400);
        Productos producto10= new Productos("Producto 10", 6, 1000);

        maquina.agregarProductosML(producto1);
        maquina.agregarProductosML(producto2);



    }
}
