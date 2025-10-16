public class Cliente extends Pessoa{
    private boolean cartao_loja;

    public Cliente(String nome, String cpf, boolean cartao_loja){
        super(nome, cpf);
        this.cartao_loja = cartao_loja;
    }

    public boolean isCartao_loja() {
        return this.cartao_loja;
    }

    public void setCartao_loja(boolean cartao_loja) {
        this.cartao_loja = cartao_loja;
    }

    @Override
    public void imprimeInfo(){
    	System.out.print("Informações do Cliente: ");
        System.out.print(getNome() + ", ");
    	System.out.print(getCpf() + ", ");
    	System.out.println(isCartao_loja());
	}

}

