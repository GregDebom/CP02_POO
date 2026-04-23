public class Caminhao extends Veiculo {

    public static final double CAPACIDADE_MAXIMA_KG   = 63_000.0;
    private static final double PESO_VAZIO_KG          = 7_000.0;
    private static final double LIMITE_POR_EIXO_KG     = 10_000.0;
    private static final int    EIXOS_MINIMOS           = 2;
    private static final int    EIXOS_MAXIMOS           = 7;

    private int numeroDeEixos;

    public Caminhao(String placa, double cargaKg) {
        super(placa, CAPACIDADE_MAXIMA_KG);
        if (cargaKg > CAPACIDADE_MAXIMA_KG)
            throw new IllegalArgumentException(
                    "Carga excede a capacidade máxima do caminhão (" + CAPACIDADE_MAXIMA_KG + " kg).");
        this.numeroDeEixos = calcularEixos(cargaKg);
    }

    private int calcularEixos(double cargaKg) {
        double pesoTotal = cargaKg + PESO_VAZIO_KG;
        int eixos = (int) Math.ceil(pesoTotal / LIMITE_POR_EIXO_KG);
        return Math.max(EIXOS_MINIMOS, Math.min(eixos, EIXOS_MAXIMOS));
    }

    public int getNumeroDeEixos() { return numeroDeEixos; }

    public String getTipoVeiculo() { return "Caminhão"; }
}