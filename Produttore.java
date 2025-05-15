public class Produttore {
    
    protected String nome;
    protected Distributore distributore;

    public Produttore(String nome) {
        this.nome = nome;
    }

    public Produttore(String nome, String nomeDistributore) {
        this.nome = nome;
        this.distributore = new Distributore(nomeDistributore);
    }    

    public String get_Nome(){
        return this.nome;
    }

    public Distributore get_distributore(){
        return distributore;
    }

    @Override
    public String toString() {
        return "Produttore: " + this.nome;
    }

    


    
}
