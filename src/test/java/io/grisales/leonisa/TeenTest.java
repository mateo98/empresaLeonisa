package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeenTest {

    private Teen bra;

    @Before
    public void setUp() throws Exception {
        bra = new Teen("FF", 2000, "bra", "32c", "negro", "encaje");
    }

    @Test
    public void descPagoEfectivo() {
        Assert.assertEquals("No es el mismo resultado", 40, bra.descPagoEfectivo(10,
                "Efectivo"));
    }
    @Test
    public void descPagoEfectivo2() {
        Assert.assertEquals("No es el mismo resultado", 0, bra.descPagoEfectivo(10,
                "TC"));
    }
}