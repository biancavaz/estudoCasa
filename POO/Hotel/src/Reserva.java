import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private LocalDate  dataEntrada;
    private LocalDate dataSaida;
    private Hospedes hospedes;
    private Quarto quarto;
    private int numeroDeNoites;
    private int numeroReserva;

    public Reserva(LocalDate dataEntrada, LocalDate dataSaida, Hospedes hospedes, Quarto quarto, int numeroReserva) {
        this.dataEntrada = dataEntrada;
        this.dataSaida =  dataSaida;
        this.hospedes = hospedes;
        this.quarto = quarto;
        this.numeroReserva = numeroReserva;
    }

    public Reserva (Hospedes hospedes, Quarto quarto) {
        this.hospedes = hospedes;
        this.quarto = quarto;
    }

    public Reserva(){};

    public Long calcularDias() {
        return ChronoUnit.DAYS.between(dataEntrada, dataSaida); // calcula a quantidade de dias entre as datas
    }

    public double calcularPrecoPorReserva(){
        return calcularDias() * quarto.getPrecoDiaria();
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

    public int getNumeroDeNoites() {
        return numeroDeNoites;
    }

    public void setNumeroDeNoites(int numeroDeNoites) {
        this.numeroDeNoites = numeroDeNoites;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    @Override
    public String toString() {
        System.out.println("RESERVAS");
        return "\nNumero Reserva: " + numeroReserva +
                "\nData Entrada: " + dataEntrada +
                "\nData Saida: " + dataSaida +
                "\nHospedes: " + hospedes +
                "\nQuarto:" + quarto;
    }
}
