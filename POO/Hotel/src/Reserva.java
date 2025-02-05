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

    public double calcularValorTotal(){
        System.out.println(quarto);
        double diasHospedagem = ChronoUnit.DAYS.between(dataEntrada, dataSaida); // calcula a quantidade de dias entre as datas
        double total = diasHospedagem * quarto.getPrecoDiaria();
        return total;
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

    public Hospedes getHospedes() {
        return hospedes;
    }

    public void setHospedes(Hospedes hospedes) {
        this.hospedes = hospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        System.out.println("RESERVAS");
        return "\nData Entrada: " + dataEntrada +
                "\nData Saida: " + dataSaida +
                "\nHospedes: " + hospedes +
                "\nQuarto:" + quarto;
    }
}
