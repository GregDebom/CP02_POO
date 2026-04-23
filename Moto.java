public class Moto extends Veiculo {

    public static final double CAPACIDADE_MAXIMA_KG = 90.0;

    private boolean possuiBau;


    public Moto(String placa, boolean possuiBau) {
        super(placa, CAPACIDADE_MAXIMA_KG);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() { return possuiBau; }


    public String getTipoVeiculo() { return "Moto"; }
}