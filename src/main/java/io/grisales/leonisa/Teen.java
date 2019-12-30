package io.grisales.leonisa;

public class Teen extends Producto implements Cashable {

    public Teen(){}

    public Teen(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public int descPagoEfectivo(int cantidadUnidad, String metodoPago) {
        if(metodoPago == "Efectivo"){
            return  40;
        }
        return 0;
    }
}
