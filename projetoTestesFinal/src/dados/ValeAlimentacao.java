package dados;

/** ------------------------------------------------------------- */

import java.util.Date;

/** CLASSE VALE_ALIMENTAÇÃO (do tipo CARTÃO_BENEFÍCIO) */

public class ValeAlimentacao extends CartaoBeneficio {

    /** ------------------------------------------------------------- */
    /**
     * ATRIBUTOS
     */

    private static int validadeDefaultEmMeses = 12;
    // no início do programa, é 12 meses

    private static Double saldoDefault = 600.0;
    private Object ValeAlimentacao;
    private Double SaldoAlimentacao;


    @Override
    public boolean tentarPagamento(TipoEstabelecimento tipoEstabelecimento, Double valorCompra) {
        tipoEstabelecimento.RESTAURANTE.getDescricao();
        return false;

        // no início do programa, é R$600.00


        /** ------------------------------------------------------------- */
        /** MÉTODOS */

        /** Sobrescrita do método tentarPagamento da classe-pai */


        // não deve realizar a compra se:
        //   > o estabelecimento é do tipo POSTO_COMBUSTIVEL
        //   > o cartão está vencido
        //   > o teste anti-fraude falhar
        //   > não houver saldo suficiente

        // caso passe todos os testes, fazer:
        //   > adicionar a compra às transações do cartão
        //   > mudar o saldo (levando em conta o cashback de 1.5%)

        /*if (tipoEstabelecimento.equals("Posto de combustível")) {
            System.out.println("Não é possível usar este benefício neste estabelecimento!");
        } //else if () {
            //System.out.println("Cartão vencido! Não é possível realizar essa transação!");
        if (senha != senha) {
            System.out.println("Digite sua senha corretamente");
        } else if (valorCompra > this.saldo) {
            System.out.println("Você não tem saldo suficiente para realizar esta operação!");
            //comando para verificar tempo de transação
        } else {
            this.SaldoAlimentacao -= saldo;
            this.SaldoAlimentacao += SaldoAlimentacao * 0.015;
            return false;*/
    }
}