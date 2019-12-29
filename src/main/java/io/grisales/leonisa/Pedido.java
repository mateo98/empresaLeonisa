package io.grisales.leonisa;

import java.util.ArrayList;

public class Pedido {
    private int cantidadUnidad;
    private String medioPago;
    private int descuento;
    private int prontoPago;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Pedido(){}

    public void asignarProducto(Leonisa leonisa){
        productos.add(leonisa);
    }
    public void asignarProducto(Leo leo){
        productos.add(leo);
    }
    public void asignarProducto(Teen teen){
        productos.add(teen);
    }

    public Producto buscarProducto(String ciu){
        for(Producto pd: productos){
            if(pd.getCiu() == ciu){
                return pd;
            }
        }
        return null;
    }
}
