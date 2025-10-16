public class Batom{
    private String marca;
    private String cor;
    private String acabamento;
    private String local_fabricacao;
    private String massa;
    private String ingredientes;
    private float preco;

    public Batom(String marca, String cor, String acabamento, String local_fabricacao, String massa, String ingredientes, float preco){
        this.marca = marca;
        this.cor = cor;
        this.acabamento = acabamento;
        this.local_fabricacao = local_fabricacao;
        this.massa = massa;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAcabamento() {
        return this.acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public String getLocal_fabricacao() {
        return this.local_fabricacao;
    }

    public void setLocal_fabricacao(String local_fabricacao) {
        this.local_fabricacao = local_fabricacao;
    }

    public String getMassa() {
        return this.massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void imprimeInfo(){
        System.out.println(getMarca());
        System.out.println(getCor());
        System.out.println(getAcabamento());
        System.out.println(getLocal_fabricacao());
        System.out.println(getMassa());
        System.out.println(getIngredientes());
        System.out.println(getPreco());
    }
}
