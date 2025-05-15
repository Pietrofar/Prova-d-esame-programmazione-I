public class ProdottoAlimentare {
    
    protected String nomeProdotto;
    protected Data scadenza;
    protected Produttore produttore;
    protected Distributore distributore;

    public ProdottoAlimentare(String nomeProdotto, int giorno, int mese, int anno, String nomeProduttore) {
        
        this.nomeProdotto = nomeProdotto;
        this.scadenza = new Data(giorno, mese, anno);
        this.produttore = new Produttore(nomeProduttore);
    }

     public ProdottoAlimentare(String nomeProdotto, int giorno, int mese, int anno, String nomeProduttore, String nomeDistributore) {
        
        this.nomeProdotto = nomeProdotto;
        this.scadenza = new Data(giorno, mese, anno);
        this.produttore = new Produttore(nomeProduttore, nomeDistributore);
    }
    
    public String get_NomeProdotto(){
        return this.nomeProdotto;
    }

    public String set_NomeProdotto(String n){
        return this.nomeProdotto = n;
    }

    public Data get_scadenza(){
        return this.scadenza;
    }

    public Data set_scadenza(Data s){
        return this.scadenza = s;
    } 

    public Produttore get_Produttore(){
        return produttore;
    }

    public boolean verificaScadenza(Data dataOdierna){

         if(dataOdierna.get_Data().equals(scadenza.get_Data())){
            System.out.println("ATTENZIONE!! SCADENZA IN GIORNATA.");

            return true;
        }

        if((dataOdierna.anno > scadenza.anno) || (dataOdierna.anno <= scadenza.anno && dataOdierna.mese > scadenza.mese) || (dataOdierna.anno
        <= scadenza.anno && dataOdierna.mese <= scadenza.mese && dataOdierna.giorno > scadenza.giorno)){

            return false;
        }
    
        else{
        
            return true;
        }
    }

    @Override
    public String toString() {
        return this.nomeProdotto + " " + this.scadenza;
    }

    
}
