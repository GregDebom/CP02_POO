public class Van extends Veiculo {

    public static final double CAPACIDADE_MAXIMA_KG = 950.0;

    private int numeroDePrateleiras;

    public Van(String placa, int numeroDePrateleiras) {
        super(placa, CAPACIDADE_MAXIMA_KG);
        if (numeroDePrateleiras <= 0)
            throw new IllegalArgumentException("Número de prateleiras deve ser positivo.");
        this.numeroDePrateleiras = numeroDePrateleiras;
    }

    public int getNumeroDePrateleiras() { return numeroDePrateleiras; }

    public String getTipoVeiculo() { return "Van"; }
}