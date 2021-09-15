package dados;

import dados.Estabelecimento;
import dados.ICartaoBeneficio;
import dados.TiposCartaoBeneficio;

import java.util.ArrayList;
import java.util.Objects;


/** CLASSE BENEFICIÁRIO */

public class Beneficiario {

    /** ------------------------------------------------------------- */
    /**
     * ATRIBUTOS
     */

    public String nome;
    private int[] senha = new int[6];
    private ArrayList<ICartaoBeneficio> listaCartoes;

    // quando o beneficiário for criado (no construtor), devem ser criados
    // juntamente com ele os seus cartões


    /** ------------------------------------------------------------- */
    /**
     * CONSTRUTOR
     */

    public Beneficiario(String nome, int[] senha) {
        this.nome = nome;
        this.senha = senha;
        this.listaCartoes = listaCartoes;
    }


    /** ------------------------------------------------------------- */
    /** MÉTODOS */

    /**
     * Método que checa os dados deste beneficiário
     */
    public boolean checarDadosLogin(String nomeChecar, int[] senhaChecar) {
        boolean nomeCorreto = this.nome.equals(nomeChecar);
        boolean senhaCorreta = this.senha.equals(senhaChecar);

        if (nomeCorreto == false || senhaCorreta == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método que retorna os dados deste beneficiário como String
     */
    @Override
    public String toString() {
        return "Beneficiario:\n" +
                "nome:" + nome + "\n" +
                "Lista de Cartões:" + listaCartoes;
    }


    /**
     * Método que tenta usar o cartão, e retorna true caso dê certo, ou false caso não
     */
    public boolean tentarPassarCartao(TiposCartaoBeneficio tipoCartao, Double valor, Estabelecimento estabelecimento) {

        // listaCartoes.add(TiposCartaoBeneficio.VALE_ALIMENTACAO.VALE_REFEICAO.VALE_COMBUSTIVEL.fabricar());

        // var tipo = tipoCartao.equals(TiposCartaoBeneficio.VALE_COMBUSTIVEL.VALE_ALIMENTACAO.VALE_REFEICAO);

        return true; /* retorno fictício */

    }

    /**
     * Método que recebe um tipo de cartão, e retorna os dados do mesmo
     */
    public String extratoCartao(TiposCartaoBeneficio tipo) {

        // recebe o tipo do cartão, busca o cartão do tipo passado em listaCartoes,
        // e retorna o seu método extrato();

        return CartaoBeneficio.extrato();

        /** Método que retorna o nome do beneficiário */
     //   public String getNome() {
     //       return ""; /* retorno fictício */
        }

        /** Método que retorna o saldo de um dado cartão */
        public String getSaldoCartao (TiposCartaoBeneficio tipoCartao){
            return "R$00,00"; /* retorno fictício */
        }


        /** Método que retorna se uma dada senha corresponde ao um dado cartão */
        public boolean checarSenhaCartao ( int[] senha, TiposCartaoBeneficio tipoCartao){

            // recebe o tipo do cartão, busca o cartão do tipo passado em listaCartoes,
            // e testa se a senha passada é a deste cartão

            return true; /* retorno fictício */
        }


        /** Método que retorna os dados de cada cartão */
        public String dadosCartoes () {

            return ""; /* retorno fictício */
        }
    }

