import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private LocalDate  dataEntrada;
    private LocalDate dataSaida;
    private Hospedes hospedes;
    private Quarto quarto;

    public Reserva(LocalDate dataEntrada, LocalDate dataSaida, Hospedes hospedes, Quarto quarto) {
        this.dataEntrada = dataEntrada;
        this.dataSaida =  dataSaida;
        this.hospedes = hospedes;
        this.quarto = quarto;
    }

    public Reserva (Hospedes hospedes, Quarto quarto) {
        this.hospedes = hospedes;
        this.quarto = quarto;
    }

    public Reserva(){};

    public void calcularValorTotal(){
        double diasHospedagem = ChronoUnit.DAYS.between(dataEntrada, dataSaida); // calcula a quantidade de dias entre as datas
        double total = diasHospedagem * quarto.getPrecoDiaria();
    }

    public void exibirDetalhes(){
        System.out.println(this.toString());
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "RESERVA" +
                "data Entrada: " + dataEntrada +
                "data Saida: " + dataSaida +
                "hospedes: " + hospedes +
                "quarto:" + quarto;
    }
}
