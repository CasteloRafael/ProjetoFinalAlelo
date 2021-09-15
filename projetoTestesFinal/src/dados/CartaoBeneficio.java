package dados;

import java.util.ArrayList;
import java.util.Date;

public abstract class CartaoBeneficio implements ICartaoBeneficio {

    /** ------------------------------------------------------------- */
    /** ATRIBUTOS */

    protected final int[] codigo = new int[16];
    //código do tipo 0000-0000-0000-0000

    protected int[] senha = new int[4];

    // a senha deve ser, obrigatoriamente, 4 dígitos numéricos

    protected Double saldo;

    // lembrando que não pode ser negativo

    protected Date dataValidade;
    // lembrando que não pode efetuar a compra com um cartão vencido

    protected ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
    // guarda o histórico de todas as transações deste cartão
    // começa vazio

    protected static int validadeDefaultEmMeses;
    // meses para o cálculo da validade de um cartão quando ele for criado
    // somente no modo administrador é possível configurar esse valor

    protected static Double saldoDefault;

    // valor automático pro saldo de um novo cartão quando for criado
    // somente no modo administrador é possível configurar esse valor


    /** ------------------------------------------------------------- */
    /** MÉTODOS */

    /** Método que retorna o extrato deste cartão em forma de texto */
    public static String extrato(){


        // retorna os dados de:
        //   > listaTransacoes
        //   > saldo
        // de forma amigável para leitura

        return ""; /* retorno fictício */

    }
    public static Double getSaldoDefault() {
        if(saldoDefault < 0){
            System.out.println("Digite um valor válido maior que zero:");
        }
        return saldoDefault;
    }
    /** Método Sistema anti-fraude */
    public boolean sistemaAntiFraude(){

        // recebe uma senha, e retorna true caso seja igual à senha deste cartão,
        // mas false caso não seja


        /**Tempo está recebendo valor 30 na variável representa o segundo**/
        int tempo, segundos ,minutos;

        tempo=30;
        /**Realizar o cálculo do minutos e segundos  **/
        int tempEmSegundos = segundos = (tempo % 3600) % 60;
        int tempEmMinutos =  minutos =  (tempo % 3600) / 60;

        /**Verifica se valor da variável estar de acordo com validação**/
        if(tempEmSegundos==30) {
            System.out.println("Não devemos passar duas compras do mesmo valor no mesmo "
                    + "estabelecimento em um período de:" + tempEmSegundos+ " segundos");
            /** Se estiver mais de 1 minuto pode seguir com a comopra r**/
        }if(tempEmMinutos >1){
            System.out.println("Pode realizar a compra");
        }


        return true; /* retorno fictício */

    }
    /** Método que checa se o cartão está vencido */
    public boolean seVencido(String dataFormatoBrasil , String dataValidadeCartao, String dataVencimentoCartao){
        // checa a data de hoje com a data de validade,
        // e retorna true caso o cartão esteja vencido,
        // ou false caso não
        /**If que veirifica a validade do cartã, e faz a compração da String**/
        if (dataValidadeCartao.compareTo(dataVencimentoCartao) < 0) {
            System.out.println("Comrpra negada cartão está vencido");
            System.out.println("Data da compra: "+ dataFormatoBrasil.format(dataVencimentoCartao));
            System.out.println("Seu cartão venceu na seguiunte data:"+ dataFormatoBrasil.format(dataValidadeCartao));

        }

        return true; /* retorno fictício */

    }

    /** Método que tenta realizar um pagamento neste cartão */
    public abstract boolean tentarPagamento(TipoEstabelecimento estabelecimento, Double valorCompra);
    // recebe o estabelecimento e o valor, checa se a compra pode ser realizada, e realiza caso possa;
    // se realizou, retorna true; se o pagamento foi rejeitado, mostra a msgErro correspondente ao motivo
    // da rejeição, e então retorna false


}
