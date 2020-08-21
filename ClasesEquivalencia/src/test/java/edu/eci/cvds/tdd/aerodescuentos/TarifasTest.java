package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    @Test
    public void CalculoTarifaTest() {
        double delta = 0.01d;
        Assert.assertEquals(1, CalculadorDescuentos.calculoTarifa(1, 10, 20), delta);
        Assert.assertEquals(1000, CalculadorDescuentos.calculoTarifa(1000, 0, 20), delta);
        Assert.assertEquals(1000, CalculadorDescuentos.calculoTarifa(1000, 20, 20), delta);
        Assert.assertEquals(850, CalculadorDescuentos.calculoTarifa(1000, 21, 20), delta);
        Assert.assertEquals(950, CalculadorDescuentos.calculoTarifa(1000, 10, 1), delta);
        Assert.assertEquals(950, CalculadorDescuentos.calculoTarifa(1000, 10, 17), delta);
        Assert.assertEquals(1000, CalculadorDescuentos.calculoTarifa(1000, 10, 18), delta);
        Assert.assertEquals(1000, CalculadorDescuentos.calculoTarifa(1000, 10, 65), delta);
        Assert.assertEquals(920, CalculadorDescuentos.calculoTarifa(1000, 10, 66), delta);
    }
}
