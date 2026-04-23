public class Principal {

        public static void main(String[] args) {

                // Pacotes com pesos em faixas distintas para demonstrar o seletor
                Pacote pacoteLeve  = new Pacote("BR001",  45.0,   "Pendente");
                Pacote pacoteMedio = new Pacote("BR002",  400.0,  "Pendente");
                Pacote pacotePesado= new Pacote("BR003",  12000.0,"Pendente");

                despacharPacote(pacoteLeve);
                despacharPacote(pacoteMedio);
                despacharPacote(pacotePesado);
        }

        private static void despacharPacote(Pacote pacote) {
                Veiculo veiculo = SeletorDeVeiculo.selecionarPorPeso(pacote.getPesoKg());

                if (veiculo instanceof Caminhao caminhao) {
                        System.out.printf("  --> Caminhao com %d eixos configurado.%n",
                                caminhao.getNumeroDeEixos());
                }

                new Rota(pacote, veiculo).iniciarEntrega();
                System.out.println();
        }
}