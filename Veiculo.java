public abstract class Veiculo {

    private String placa;
    private double capacidadeMaximaKg;

    public Veiculo(String placa, double capacidadeMaximaKg) {
        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia.");
        if (capacidadeMaximaKg <= 0)
            throw new IllegalArgumentException("Capacidade deve ser maior que zero.");
        this.placa = placa;
        this.capacidadeMaximaKg = capacidadeMaximaKg;
    }

    public String getPlaca() { return placa; }
    public double getCapacidadeMaximaKg() { return capacidadeMaximaKg; }

    public abstract String getTipoVeiculo();

    public boolean suportaCarga(double pesoKg) {
        return pesoKg > 0 && pesoKg <= capacidadeMaximaKg;
    }
}