public class Distributore {
    
    protected String nomeDistributore;

    public Distributore(String nomeDistributore) {
        this.nomeDistributore = nomeDistributore;
    }

    public String get_Denominazione(){
        return nomeDistributore;
    }

    public void set_denominazione(String s){
        nomeDistributore = s;
    }

    @Override
    public String toString() {
        return "Nome distributore: " + nomeDistributore;
    }

    
}
