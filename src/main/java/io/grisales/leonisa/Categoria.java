package io.grisales.leonisa;

public class Categoria {
    private String tipoPrenda;
    private String talla;
    private String color;
    private String material;

    public Categoria(String tipoPrenda, String talla, String color, String material){
        this.tipoPrenda = tipoPrenda;
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
