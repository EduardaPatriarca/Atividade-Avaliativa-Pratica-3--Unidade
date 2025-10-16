public class Principal{
    public static void main(String[] args) {
   	    Funcionario elena = new Funcionario("Elena da Costa", "123.456.789-10", "001", "2001-01-26", "2024-06-02");
        Funcionario evandro = new Funcionario("Evandro dos Santos", "234.567.891-01","002", "1997-08-17", "2018-01-20");

        Cliente rita = new Cliente("Rita de Cássia", "345.678.910-11", false);
        Cliente heitor = new Cliente("Heitor da Silva", "456.789.101-11", true);

        Batom lollipop = new Batom("lollipop", "#970700", "matte", "China", "3g", "Lista hipotética de ingredientes /1", 10.99);
        Batom cherry = new Batom("Cherry Blossom", "#FF0038", "matte", "Brasil", 
        "3g", "Lista hipotética de ingredientes /2", 11.99);

        Compra compra1 = new Compra(rita, lollipop, evandro);
        Compra compra2 = new Compra(heitor, cherry, elena);

        compra1.imprimeInfo();
        compra2.imprimeInfo();
    }
}