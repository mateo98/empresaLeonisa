package io.grisales.leonisa;

public class Producto {
    private String ciu;
    private int precio;
    private Categoria ct;

    public Producto(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
        ct = new Categoria(tipoPrenda, talla, color, material);
        this.ciu = ciu;
        this.precio = precio;
    }

    public String getCiu() {
        return ciu;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
