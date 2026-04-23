public class Pacote {

    private String codigoRastreio;
    private double pesoKg;
    private String status;


    public Pacote(String codigoRastreio, double pesoKg, String status) {
        if (codigoRastreio == null || codigoRastreio.isBlank())
            throw new IllegalArgumentException("Código de rastreio não pode ser vazio.");
        if (pesoKg <= 0)
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        this.codigoRastreio = codigoRastreio;
        this.pesoKg = pesoKg;
        this.status = status;
    }

    public String getCodigoRastreio() { return codigoRastreio; }
    public double getPesoKg()         { return pesoKg; }
    public String getStatus()         { return status; }


    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}