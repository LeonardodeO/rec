package com.Leonardo.demo.model;

public class Produto {

        private int codigo;
        private String nome;
        private String descricao;
        private float precoCusto;
        private float precoVenda;
        private int quantidade;
        private int quantidadeMinima;


        public Produto(int codigo, String nome, String descricao, float precoCusto, float precoVenda,
                       int quantidade, int quantidadeMinima) throws Exception {
            validaCodigo(codigo);
            this.codigo = codigo;
            validarNome(nome);
            this.nome = nome;
            validarDescricacao(descricao);
            this.descricao = descricao;
            validarPrecoCusto(precoCusto);
            this.precoCusto = precoCusto;
            validarPrecoVenda(precoCusto, precoVenda);
            this.precoVenda = precoVenda;
            validarQuantidade(quantidade);
            this.quantidade = quantidade;
            validarQuantidadeMinima(quantidadeMinima);
            this.quantidadeMinima = quantidadeMinima;
        }

        private void validarQuantidadeMinima(int quantidadeMinima) throws Exception {
            if (quantidadeMinima < 0){
                throw new Exception("Quantidade Minima nao pode ser menor 0!");
            }
        }

        private void validarQuantidade(int quantidade) throws Exception {
            if (quantidade <= 0){
                throw new Exception("Quantidade de produtos nao pode ser igual ou menor que 0!");
            }
        }

        private void validarPrecoVenda(float precoCusto, float precoVenda)
                throws Exception {
            if (precoVenda <= 0){
                throw new Exception("Preco de Venda de produtos nao pode ser igual ou menor que 0!");
            }
            if (precoVenda < precoCusto){
                throw new Exception("Preco de Venda nao pode ser menor que o Preco de Custo!");
            }
        }

        private void validarPrecoCusto(float precoCusto) throws Exception {
            if (precoCusto <= 0){
                throw new Exception("Preco de Custo de produtos nao pode ser igual ou menor que 0!");
            }
        }

        private void validarDescricacao(String descricao) throws Exception {
            if (descricao == null || descricao.isEmpty()){
                throw new Exception("Descricao do produto deve ser informada!");
            }
        }

        private void validarNome(String nome) throws Exception {
            if (nome==null || nome.isEmpty()){
                throw new Exception("Nome do produto nao pode ser vazio!");
            }
        }

        private void validaCodigo(int codigo) throws Exception {
            if (codigo <= 0){
                throw new Exception("Codigos devem ser Maiores que 0!");
            }
        }


        public Produto() {
            // TODO Auto-generated constructor stub
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public float getPrecoCusto() {
            return precoCusto;
        }

        public void setPrecoCusto(float precoCusto) {
            this.precoCusto = precoCusto;
        }

        public float getPrecoVenda() {
            return precoVenda;
        }

        public void setPrecoVenda(float precoVenda) {
            this.precoVenda = precoVenda;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public int getQuantidadeMinima() {
            return quantidadeMinima;
        }

        public void setQuantidadeMinima(int quantidadeMinima) {
            this.quantidadeMinima = quantidadeMinima;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + codigo;
            result = prime * result
                    + ((descricao == null) ? 0 : descricao.hashCode());
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + Float.floatToIntBits(precoCusto);
            result = prime * result + Float.floatToIntBits(precoVenda);
            result = prime * result + quantidade;
            result = prime * result + quantidadeMinima;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Produto other = (Produto) obj;
            if (codigo != other.codigo)
                return false;
            if (descricao == null) {
                if (other.descricao != null)
                    return false;
            } else if (!descricao.equals(other.descricao))
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (Float.floatToIntBits(precoCusto) != Float
                    .floatToIntBits(other.precoCusto))
                return false;
            if (Float.floatToIntBits(precoVenda) != Float
                    .floatToIntBits(other.precoVenda))
                return false;
            if (quantidade != other.quantidade)
                return false;
            if (quantidadeMinima != other.quantidadeMinima)
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Produto [codigo=" + codigo
                    + ", nome=" + nome
                    + ", descricao=" + descricao
                    + ", precoCusto="
                    + precoCusto
                    + ", precoVenda="
                    + precoVenda + ", quantidade="
                    + quantidade
                    + ", quantidadeMinima="
                    + quantidadeMinima + "]";
        }



    }