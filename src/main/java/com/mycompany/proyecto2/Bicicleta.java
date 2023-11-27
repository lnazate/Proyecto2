public class Bicicleta implements ImpactoEcologico {
    private double estrategiasReduccionEmisiones;
    private double impactoTransporteLogistica;
    private double adaptabilidad;
    private double disenoAerodinamicoPeso;

    public Bicicleta(double estrategiasReduccionEmisiones, double impactoTransporteLogistica, 
            double adaptabilidad, double disenoAerodinamicoPeso) {
        this.estrategiasReduccionEmisiones = estrategiasReduccionEmisiones;
        this.impactoTransporteLogistica = impactoTransporteLogistica;
        this.adaptabilidad = adaptabilidad;
        this.disenoAerodinamicoPeso = disenoAerodinamicoPeso;
    }

    @Override
    public double calcularImpactoEcologico() {
        return estrategiasReduccionEmisiones + impactoTransporteLogistica 
                + adaptabilidad - disenoAerodinamicoPeso;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta";
    }
}
