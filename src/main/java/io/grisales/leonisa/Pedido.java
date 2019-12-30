package io.grisales.leonisa;

import java.util.ArrayList;

public class Pedido {
    private int cantidadLeonisa;
    private int cantidadLeo;
    private int cantidadTeen;
    private String medioPago;
    private int prontoPago;
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private double totalLeonisa = 0;
    private double totalLeo = 0;
    private double totalTeen = 0;
    private int descLeonisa;
    private int descLeo;
    private int descTeen;

    public Pedido(int prontoPago, String medioPago){
        this.prontoPago = prontoPago;
        this.medioPago = medioPago;
    }

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

    public void totalCategoria(){

        for(Producto pd: productos){
            if(pd instanceof Leonisa){
                cantidadLeonisa++;
                totalLeonisa += pd.getPrecio();
            }
            if(pd instanceof Leo){
                cantidadLeo++;
                totalLeo += pd.getPrecio();
            }
            if(pd instanceof Teen){
                cantidadTeen++;
                totalTeen += pd.getPrecio();
            }
        }
    }

    public int getCantidadLeonisa() {
        return cantidadLeonisa;
    }

    public int getCantidadLeo() {
        return cantidadLeo;
    }

    public int getCantidadTeen() {
        return cantidadTeen;
    }

    public double getTotalLeonisa() {
        return totalLeonisa;
    }

    public double getTotalLeo() {
        return totalLeo;
    }

    public double getTotalTeen() {
        return totalTeen;
    }

    public void asignarDescuentos(){
        Leonisa descLeonisa = new Leonisa();
        Leo descLeo = new Leo();
        Teen descTeen = new Teen();
        this.descLeonisa = descLeonisa.descProntoPago(prontoPago);
        this.descLeo = descLeo.descProntoPago(prontoPago)+  descLeo.descPagoEfectivo(cantidadLeo, medioPago);
        this.descTeen = descTeen.descPagoEfectivo(cantidadTeen,medioPago);
    }

    public int getDescLeonisa() {
        return descLeonisa;
    }

    public int getDescLeo() {
        return descLeo;
    }

    public int getDescTeen() {
        return descTeen;
    }
}
