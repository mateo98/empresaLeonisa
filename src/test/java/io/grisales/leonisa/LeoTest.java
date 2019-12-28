package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeoTest {
    private Leo panti;
    @Before
    public void setUp() throws Exception {
        panti = new Leo("FF",1000, "panti", "28", "blanco", "algodon");
    }

    @Test
    public void descProntoPago() {
        Assert.assertEquals("No es el mismo resultado", 0, panti.descProntoPago(15));
    }
    @Test
    public void descProntoPago2() {
        Assert.assertEquals("No es el mismo resultado", 10, panti.descProntoPago(30));
    }
    @Test
    public void descProntoPago3() {
        Assert.assertEquals("No es el mismo resultado", 20, panti.descProntoPago(5));
    }
    @Test
    public void descProntoPago4() {
        Assert.assertEquals("No es el mismo resultado", 30, panti.descProntoPago(1));
    }

    @Test
    public void descPagoEfectivo() {
        Assert.assertEquals("no es el mismo resultado", 50,
                panti.descPagoEfectivo(11, "Efectivo"));
    }
    @Test
    public void descPagoEfectivo2() {
        Assert.assertEquals("no es el mismo resultado", 40,
                panti.descPagoEfectivo(9, "Efectivo"));
    }
    @Test
    public void descPagoEfectivo3() {
        Assert.assertEquals("no es el mismo resultado", 0,
                panti.descPagoEfectivo(9, "TC"));
    }
}