package io.grisales.leonisa;

public class Leonisa extends Producto implements ProntoPagable {

    public Leonisa(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
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
}
