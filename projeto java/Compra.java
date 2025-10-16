public class Compra{
    private Cliente cliente;
    private Batom batom;
    private Funcionario funcionario;

    public Compra(Cliente cliente, Batom batom, Funcionario funcionario){
        this.cliente = cliente;
        this.batom = batom;
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Batom getBatom() {
        return this.batom;
    }

    public void setBatom(Batom batom) {
        this.batom = batom;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void imprimeInfo(){
        System.out.println("\n----Informações da Compra: ----\n");
        cliente.imprimeInfo();
        batom.imprimeInfo();
        funcionario.imprimeInfo();
        System.out.println("\n---Fim da Compra---\n");
    }
}
