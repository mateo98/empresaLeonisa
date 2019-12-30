package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {

    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;
    private Pedido pe;

    @Before
    public void setUp() throws Exception {
        pe = new Pedido(13, "TC");
        leonisa = new Leonisa("FF", 2000, "bra", "32c", "negro", "encaje");
        leo = new Leo("AF", 2000, "bra", "32c", "negro", "encaje");
        teen = new Teen("EF", 2000, "bra", "32c", "negro", "encaje");
    }

    @Test
    public void asignarProducto() {
        pe.asignarProducto(leonisa);
        Assert.assertNotNull("No se creo el objeto", pe.buscarProducto(leonisa.getCiu()));
    }

    @Test
    public void testAsignarProducto() {
        pe.asignarProducto(leo);
        Assert.assertNotNull("No se creo el objeto", pe.buscarProducto(leo.getCiu()));
    }

    @Test
    public void testAsignarProducto1() {
        pe.asignarProducto(teen);
        Assert.assertNotNull("No se creo el objeto", pe.buscarProducto(teen.getCiu()));
    }


    @Test
    public void totalCategoria() {
        pe.asignarProducto(leo);
        pe.asignarProducto(leonisa);
        pe.asignarProducto(teen);
        pe.totalCategoria();
        Assert.assertEquals("No es el mismo resultado", 2000, pe.getTotalLeonisa(),0);
    }
    @Test
    public void totalCategoria1() {
        pe.asignarProducto(leo);
        pe.asignarProducto(leonisa);
        pe.asignarProducto(teen);
        pe.totalCategoria();
        Assert.assertEquals("No es el mismo resultado", 2000, pe.getTotalLeo(),0);
    }
    @Test
    public void totalCategoria2() {
        pe.asignarProducto(leo);
        pe.asignarProducto(leonisa);
        pe.asignarProducto(teen);
        pe.totalCategoria();
        Assert.assertEquals("No es el mismo resultado", 2000, pe.getTotalTeen(), 0);
    }

    @Test
    public void getCantidadLeonisa() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getCantidadLeonisa());
    }

    @Test
    public void getCantidadLeo() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getCantidadLeo());
    }

    @Test
    public void getCantidadTeen() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getCantidadTeen());
    }

    @Test
    public void getTotalLeonisa() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getTotalLeonisa(),0);
    }

    @Test
    public void getTotalLeo() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getTotalLeo(),0);
    }

    @Test
    public void getTotalTeen() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getTotalTeen(),0);
    }

    @Test
    public void asignarDescuentos() {
        pe.asignarDescuentos();
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescLeo());
    }
    @Test
    public void asignarDescuentos2() {
        pe.asignarDescuentos();
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescLeonisa());
    }    @Test
    public void asignarDescuentos3() {
        pe.asignarDescuentos();
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescTeen());
    }

    @Test
    public void getDescLeonisa() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescLeonisa());
    }

    @Test
    public void getDescLeo() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescLeo());
    }

    @Test
    public void getDescTeen() {
        Assert.assertEquals("No es el mismo resultado", 0, pe.getDescTeen());
    }
}