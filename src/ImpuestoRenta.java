
public class ImpuestoRenta {
    private static final double UIT = 3950;

    public double calcularImpuesto(double ingresoAnualEnUITs) {
        double baseImponible = 0;
        double ingresoAnual = ingresoAnualEnUITs * UIT;
        
        if(ingresoAnualEnUITs == 0) {
            return 0;
        } else if (ingresoAnualEnUITs < 7) {
            return 0;
        } else if (ingresoAnualEnUITs < 12) { //ingresoAnual >= 7 && 
            baseImponible = ingresoAnual - (7 * UIT); //0.8 * (ia - 7 UIT)
            return 0.08 * baseImponible;
        } else if (ingresoAnualEnUITs < 27) { // ingresoAnual >= 12
            baseImponible = 0.08 * (12 * UIT) +  0.14 * (ingresoAnual - (19 * UIT)); // impuesto = 0.8 * (ia - 7 UIT) + 0.14 * (ia - 12 UIT)
            return baseImponible;
        }
        return 1;
    }
    
    // CP3
    // ingresoAnual = 10 UIts = 39500
    // 1ra escala = 7 UITs => impuesto = 0
    // 2da escala = 3 UITs => impuesto = 0.08 * 3 UITs = 948
    
    
    // CP4
    // ingresoAnual = 20 UITs = 79000
    // 1ra escala = 7 UITs => impuesto = 0
    // 2da escala = 12 UITs => impuesto = 0.08 * 12 UITs = 3792
    // 3ra escala = 1 UIT => impuesto = 0.14 * 1 UIT = 553
    // impuestoanual = 4345
}
