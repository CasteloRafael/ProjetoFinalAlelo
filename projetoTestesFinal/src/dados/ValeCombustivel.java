package dados;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ValeCombustivel extends CartaoBeneficio {


    @Override
    public boolean seVencido(String df, String dataValidadeCartao, String dataVencimentoCartao) {
        return super.seVencido(df, dataValidadeCartao, dataVencimentoCartao);
    }
    @Override
    public boolean tentarPagamento(TipoEstabelecimento estabelecimento, Double valorCompra) {


/**=========== Não deve realizar a compra se, o estabelecimento NÃO é do tipo POSTO_COMBUSTIVEL ==================**/

        if(estabelecimento.equals(TipoEstabelecimento.RESTAURANTE.getDescricao())||estabelecimento.equals(TipoEstabelecimento.MERCADO.getDescricao())){
            System.out.println("Poder realizar a compora");
        }

/**================================ Verifica se o cartão está vencido ==============================================**/
        //Aqui você manipula a primeira data a ser comparada


/**================================ Verifica se O teste anti-fraude falhar ==============================================**/
        /**Como metódo precisa estar em todoas as class catões coloquei no CartaoBeneficio **/



        //   > o último uso tiver sido menos de 2 minutos atrás
        //   > não houver saldo suficiente

        // caso passe todos os testes, fazer:
        //   > adicionar a compra às transações do cartão
        //   > mudar o saldo (levando em conta o a taxa de R$1,00)

        // this.saldo = saldoDefault- valorCompra;

        return false;

    }


}
