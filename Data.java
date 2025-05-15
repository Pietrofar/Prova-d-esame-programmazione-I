public class Data {

    protected int giorno;
    protected int mese;
    protected int anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public String get_Data(){
        String data = this.giorno + "/" + this.mese + "/" + this.anno;

        return data;
    }

    @Override
    public String toString(){
        return this.giorno + "/" + this.mese + "/" + this.anno;
    }
    
}
