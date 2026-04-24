class SeletorDeVeiculo {

    public static Veiculo selecionarPorPeso(double pesoKg) {
        if (pesoKg <= 0)
            throw new IllegalArgumentException("Peso deve ser maior que zero.");

        if (pesoKg <= Moto.CAPACIDADE_MAXIMA_KG)
            return new Moto("MOTO-001", true);

        if (pesoKg <= Van.CAPACIDADE_MAXIMA_KG)
            return new Van("VAN-001", 3);

        return new Caminhao("CAM-001", pesoKg);
    }
}