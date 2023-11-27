public class Vehiculo implements ImpactoEcologico {
    private double estrategiasReduccionEmisiones;
    private double impactoTransporteLogistica;
    private double adaptabilidad;
    private double modalidadesConduccionEficiente;

    public Vehiculo(double estrategiasReduccionEmisiones, double impactoTransporteLogistica, double adaptabilidad, double modalidadesConduccionEficiente) {
        this.estrategiasReduccionEmisiones = estrategiasReduccionEmisiones;
        this.impactoTransporteLogistica = impactoTransporteLogistica;
        this.adaptabilidad = adaptabilidad;
        this.modalidadesConduccionEficiente = modalidadesConduccionEficiente;
    }

    @Override
    public double calcularImpactoEcologico() {
        return estrategiasReduccionEmisiones + impactoTransporteLogistica + adaptabilidad - modalidadesConduccionEficiente;
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo";
    }
}
