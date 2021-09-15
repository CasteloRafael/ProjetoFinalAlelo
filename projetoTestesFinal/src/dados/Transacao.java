package dados;

import java.util.Arrays;
import java.time.LocalDateTime;

public class Transacao {

    private double valor;
    private String data;
    private char[] estabelecimento;
    private LocalDateTime dataHoraTransacao;


    public Transacao(double valorInicial, String dataInicial, char[] estabelecimento,  LocalDateTime dataHoraTransacao) {
        this.valor = valorInicial;
        this.data = dataInicial;
        this.estabelecimento = estabelecimento;
        this.dataHoraTransacao = dataHoraTransacao;
    }

    public Transacao(double valor) {

        this.valor = valor;
    }

    public Transacao(char[] estabelecimento) {

        this.estabelecimento = estabelecimento;
    }

    public Transacao(String data) {

        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public char[] getEstabelecimento() {
        return estabelecimento;
    }

    public LocalDateTime getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEstabelecimento(char[] estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void setDataHoraTransacao(LocalDateTime dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "valor=" + valor +
                ", data='" + data + '\'' +
                ", char[]='" + Arrays.toString(estabelecimento) + '\'' +
                '}';
    }
}