public class App {
    public static void main(String[] args) throws Exception {
        
        ProdottoAlimentare p1 = new ProdottoAlimentare("Emmental", 11, 06, 2025, "AIA", "Gioacchino");
        Data dataOdierna = new Data(14, 05, 2025);

        System.out.println("prodotto: " + p1.get_NomeProdotto() + ", fornito da: " + p1.get_Produttore().get_Nome() + 
        ", è distribuito da: " + p1.get_Produttore().get_distributore().get_Denominazione());
        

    }
}
