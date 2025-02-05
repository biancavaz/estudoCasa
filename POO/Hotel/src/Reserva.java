import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private LocalDate  dataEntrada;
    private LocalDate dataSaida;
    private Hospedes hospedes;
    private Quarto quarto;

    public Reserva(int dataEntrada, int dataSaida, Hospedes hospedes, Quarto quarto) {
        this.dataEntrada = LocalDate.ofEpochDay(dataEntrada);
        this.dataSaida = LocalDate.ofEpochDay(dataSaida);
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

    @Override
    public String toString() {
        return "RESERVA" +
                "data Entrada: " + dataEntrada +
                "data Saida: " + dataSaida +
                "hospedes: " + hospedes +
                "quarto:" + quarto;
    }
}
