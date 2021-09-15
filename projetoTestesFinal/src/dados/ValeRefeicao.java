package dados;

import java.util.ArrayList;

public class ValeRefeicao extends CartaoBeneficio{

    private double SaldoRefeicao;
    private Object ValeRefeicao;

    @Override
    public boolean tentarPagamento(TipoEstabelecimento estabelecimento, Double valorCompra) {

        // não deve realizar a compra se:
        //   > o cartão está vencido
        //   > o teste anti-fraude falhar
        //   > não houver saldo suficiente

        // caso passe todos os testes, fazer:
        //   > adicionar a compra às transações do cartão
        //   > mudar o saldo (levando em conta o cashback de 3%)

        if (estabelecimento == TipoEstabelecimento.POSTO_COMBUSTIVEL) {
            System.out.println("Voce nao pode utilizar este cartao neste estabelecimento");
        } else if (estabelecimento == TipoEstabelecimento.MERCADO) {
            System.out.println("Voce nao pode utilizar este cartao neste estabelecimento");
        }

        ///else if (dataValidade > new Date()) // verificar atributo para calculo dos meses.
        //  System.out.println(" Seu cartão está vencido!  ");

        else if (senha != senha) {
            System.out.println("Senha incorreta, digite novamente ");

            if (saldoDefault < valorCompra)
                System.out.println("Seu saldo é insuficiente para esta compra");

            else {

                System.out.println(ValeRefeicao = SaldoRefeicao - valorCompra);

                saldo = SaldoRefeicao + SaldoRefeicao * 0.03;

                // listaTransacoes.add() = new ArrayList<Transacao>();

            }
        }
        return false;
    }
}
