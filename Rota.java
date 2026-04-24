public class Rota {

    private Pacote  pacote;
    private Veiculo veiculo;


    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote  == null) throw new IllegalArgumentException("Pacote não pode ser nulo.");
        if (veiculo == null) throw new IllegalArgumentException("Veículo não pode ser nulo.");
        this.pacote  = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        System.out.printf(
                "Entrega iniciada | Pacote: %-8s | Peso: %6.1f kg | Veículo: %-8s | Placa: %s%n",
                pacote.getCodigoRastreio(),
                pacote.getPesoKg(),
                veiculo.getTipoVeiculo(),
                veiculo.getPlaca()
        );
    }
}

