package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
    private Producto pd;
    @Before
    public void setUp() throws Exception {
        pd = new Producto("FF", 2000,  "Bra", "32B", "negro pasion", "Encaje");
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("El resultado no es el mismo", "FF",  pd.getCiu());
    }

    @Test
    public void setPrecio() {
        pd.setPrecio(10000);
        Assert.assertEquals("El resultado no es el mismo", 10000,pd.getPrecio());
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("El resultado no es el mismo", 2000,pd.getPrecio());
    }
}