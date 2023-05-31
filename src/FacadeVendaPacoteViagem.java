public class FacadeVendaPacoteViagem {
    private SistemaPagamento pagamento;        
    private SistemaReservaPassagem reservaPassagem;
    private SistemaReservaHotel reservaHotel;
    private SistemaReservaCarro reservaCarro;

    public FacadeVendaPacoteViagem() {
        pagamento = new SistemaPagamento();
        reservaPassagem = new SistemaReservaPassagem();
        reservaHotel = new SistemaReservaHotel();
        reservaCarro = new SistemaReservaCarro();
    }

    public void venderPacote(String origem, String destino, String dataIda, String dataVolta, double valor) {
        pagamento.processarPagamento(valor);
        reservaPassagem.reservarPassagem(origem, destino, dataIda);
        reservaHotel.reservarHotel(destino, dataIda, dataVolta);
        reservaCarro.reservarCarro(destino, dataIda, dataVolta);
    }
}