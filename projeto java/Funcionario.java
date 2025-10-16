public class Funcionario extends Pessoa{
    private String codigo;
    private String data_nascimento;
    private String data_inicio;

    public Funcionario(String nome, String cpf, String codigo, String data_nascimento, String data_inicio){
        super(nome, cpf);
        this.codigo = codigo;
        this.data_nascimento = data_nascimento;
        this.data_inicio = data_inicio;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if(!codigo.isBlank()){^
            this.codigo = codigo;
        }
    }

    public String getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        if(!data_nascimento.isBlank()){^
            this.data_nascimento = data_nascimento;
        }
        
    }

    public String getData_inicio() {
        return this.data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        if(!data_inicio.isBlank()){^
            this.data_inicio = data_inicio;
        }
    }

    @Override
    public void imprimeInfo(){
    	System.out.println(getNome());
    	System.out.println(getCpf());
    	System.out.println(getCodigo());
        System.out.println(getData_nascimento());
        System.out.println(getData_inicio());
	}
}

