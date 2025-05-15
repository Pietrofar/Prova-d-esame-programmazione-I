public class CartaDiIdentita {
    
    protected String nome;
    protected String cognome;
    protected Data dataDiNascita;
    protected Data dataDiScadenza;

    public CartaDiIdentita(String nome, String cognome, int giornoDiNascita, int meseDiNascita, int annoDiNascita, int anno,int giorno, int mese) {
        
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = new Data(giornoDiNascita, meseDiNascita, annoDiNascita);
        this.dataDiScadenza = new Data(giorno, mese, anno);

    }

    public Data get_DataDiNascita(){
        return this.dataDiNascita;
    }

    public Data get_DataDiScadenza(){
        return this.dataDiScadenza;
    }

    public Data set_DataDiScadenza(Data s){
        return this.dataDiScadenza = s;
    }

    public boolean verificaScadenza(Data dataOdierna){

        if(dataOdierna.get_Data().equals(dataDiScadenza.get_Data())){
            System.out.println("ATTENZIONE!! SCADENZA IN GIORNATA.");

            return true;
        }

        if((dataOdierna.anno > dataDiScadenza.anno) || (dataOdierna.anno <= dataDiScadenza.anno && dataOdierna.mese > dataDiScadenza.mese) 
        || (dataOdierna.anno <= dataDiScadenza.anno && dataOdierna.mese <= dataDiScadenza.mese && dataOdierna.giorno > dataDiScadenza.giorno)){

            return false;
        }
    
        else{
        
            return true;
        }
    }

    @Override
    public String toString(){
        return this.nome + " " + this.cognome + ". Data di nascita: " + this.dataDiNascita + ". Scadenza della carta: " + this.dataDiScadenza;
    }

}
