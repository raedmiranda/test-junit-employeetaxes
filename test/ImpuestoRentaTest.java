import org.junit.Test;
import static org.junit.Assert.*;

public class ImpuestoRentaTest {
    
    public ImpuestoRentaTest() {
    }
 
    @Test
    public void CP1_IngresoAnualEsCeroEImpuestoRentaCero() {
        ImpuestoRenta impuestoRenta = new ImpuestoRenta();
        assertEquals(0, impuestoRenta.calcularImpuesto(0), 0.001);
    }
    
    @Test
    public void CP2_IngresoAnualMenorQue7UITEImpuestoRentaCero() {
        ImpuestoRenta impuestoRenta = new ImpuestoRenta();
        assertEquals(0, impuestoRenta.calcularImpuesto(5), 0.001);
    }
    
    @Test
    public void CP3_IngresoAnualMayorQue7UITYMenorQue12UIT() {
        ImpuestoRenta impuestoRenta = new ImpuestoRenta();
        assertEquals(948, impuestoRenta.calcularImpuesto(10), 0.001);
    }
    
    @Test
    public void CP4_IngresoAnualMayorQue12UITYMenorQue27UIT() {
        ImpuestoRenta impuestoRenta = new ImpuestoRenta();
        assertEquals(4345, impuestoRenta.calcularImpuesto(20), 0.001);
    }
}


/* ingreso anual = ia
// CP1: Si ia = 0       , impuesto = 0
// CP2: Si ia < 7       , impuesto = 0
// CP3: Si 7 <= ia <= 12 , impuesto = 0.8 * (ia - 7 UIT)
// CP4: Si 12 < ia <= 27, impuesto = 0.8 * (ia - 7 UIT) + 0.14 * (ia - 12 UIT)
// CP5: Si 27 < ia <= 42, impuesto = 0.8 * (ia - 7 UIT) + 0.14 * (ia - 12 UIT) + 0.17 * (ia - 27 UIT)
// CP6: Si 42 < ia <= 52, impuesto = 0.8 * (ia - 7 UIT) + 0.14 * (ia - 12 UIT) + 0.17 * (ia - 27 UIT) + 0.2 * (ia - 42 UIT)
// CP7: Si 52 < ia      , impuesto = 0.8 * (ia - 7 UIT) + 0.14 * (ia - 12 UIT) + 0.17 * (ia - 27 UIT) + 0.2 * (ia - 42 UIT) + 0.3 * (ia - 52 UIT)
*/