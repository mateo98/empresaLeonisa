package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeonisaTest {
    private Leonisa bra;
    @Before
    public void setUp() throws Exception {
        bra = new Leonisa("FF", 2000, "bra", "32c", "negro", "encaje");
    }

    @Test
    public void descProntoPago() {
        Assert.assertEquals("No es el mismo resultado", 0, bra.descProntoPago(15));
    }
    @Test
    public void descProntoPago2() {
        Assert.assertEquals("No es el mismo resultado", 10, bra.descProntoPago(30));
    }
    @Test
    public void descProntoPago3() {
        Assert.assertEquals("No es el mismo resultado", 20, bra.descProntoPago(5));
    }
    @Test
    public void descProntoPago4() {
        Assert.assertEquals("No es el mismo resultado", 30, bra.descProntoPago(1));
    }
}