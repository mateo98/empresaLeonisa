package io.grisales.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoriaTest {
     private Categoria ct;

    @Before
    public void SetUp(){
        ct = new Categoria("Bra", "32B", "negro pasion", "Encaje");
    }

    @Test
    public void getTipoPrenda() {
        Assert.assertEquals("no es el mismo Resultado", "Bra", ct.getTipoPrenda() );
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("El resultado no es el mismo", "32B", ct.getTalla() );
    }

    @Test
    public void getColor() {
        Assert.assertEquals("El resultado no es el mismo", "negro pasion", ct.getColor());
    }
    @Test
    public void getMaterial() {
        Assert.assertEquals("El resultado no es el mismo","Encaje", ct.getMaterial());
    }
}
