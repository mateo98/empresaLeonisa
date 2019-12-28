package io.grisales.leonisa;

public class Leo extends Producto implements ProntoPagable, Cashable {

    public Leo(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }


    public int descProntoPago(int prontoPago) {
        if(prontoPago > 20){
            return 10;
        }
        if(prontoPago >= 2 && prontoPago <= 10){
            return 20;
        }
        if(prontoPago < 2){
            return 30;
        }
        return 0;
    }

    public int descPagoEfectivo(int cantidadUnidad, String metodoPago) {
        int descuento = 0;
        if(metodoPago == "Efectivo"){
            descuento += 40;
        }
        if(cantidadUnidad > 10){
            descuento += 10;
        }
        return descuento;
    }
}
