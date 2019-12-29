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
        pe = new Pedido();
        leonisa = new Leonisa("FF", 2000, "bra", "32c", "negro", "encaje");
        leo = new Leo("AF", 2000, "bra", "32c", "negro", "encaje");
        teen = new Teen("EF", 2000, "bra", "32c", "negro", "encaje");
    }

    @Test
    public void asignarProducto() {
        Assert.assertNull("No se creo el objeto", pe.buscarProducto(leonisa.getCiu()));
    }

    @Test
    public void testAsignarProducto() {
        Assert.assertNull("No se creo el objeto", pe.buscarProducto(leo.getCiu()));
    }

    @Test
    public void testAsignarProducto1() {
        Assert.assertNull("No se creo el objeto", pe.buscarProducto(teen.getCiu()));
    }


}