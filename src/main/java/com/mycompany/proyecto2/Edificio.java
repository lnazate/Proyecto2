public class Edificio implements ImpactoEcologico {
    private double estrategiasReduccionEmisiones;
    private double impactoTransporteLogistica;
    private double adaptabilidad;
    private double usoEnergiasRenovables;
    private double sistemasGestionEnergia;

    public Edificio(double estrategiasReduccionEmisiones, double impactoTransporteLogistica, double adaptabilidad, double usoEnergiasRenovables, double sistemasGestionEnergia) {
        this.estrategiasReduccionEmisiones = estrategiasReduccionEmisiones;
        this.impactoTransporteLogistica = impactoTransporteLogistica;
        this.adaptabilidad = adaptabilidad;
        this.usoEnergiasRenovables = usoEnergiasRenovables;
        this.sistemasGestionEnergia = sistemasGestionEnergia;
    }

    @Override
    public double calcularImpactoEcologico() {
        return estrategiasReduccionEmisiones + impactoTransporteLogistica + adaptabilidad - usoEnergiasRenovables - sistemasGestionEnergia;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio";
    }
}

