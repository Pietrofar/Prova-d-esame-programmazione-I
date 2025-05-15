Corso di Programmazione AA 2024/2025
ESERCITAZIONE - 8 Maggio 2025
Cosa accomuna un prodotto alimentare e una carta d’identità?
Progettare e realizzare un’applicazione in Java per la gestione di un insieme eterogeneo di elementi
accomunati dal fatto che possono scadere. L’applicazione dovrà permettere di verificare, per
ciascun elemento, se risulta attualmente scaduto.
A tal fine, sviluppare le seguenti classi:
• ProdottoAlimentare
• CartaID
• Data
Sia un prodotto alimentare che una carta d’identità devono avere un attributo proprio
rappresentante la data di scadenza, oltre ad altri attributi ritenuti opportuni.
Inoltre, ogni prodotto alimentare ha un produttore, il quale può opzionalmente stipulare un
accordo con un distributore per la diffusione del prodotto.
Per semplificare:
• Ogni prodotto ha esattamente a un produttore;
• Ogni produttore può avvalersi al massimo di un distributore.
Si richiede quindi di implementare anche le classi:
• Produttore
• Distributore
dotandole degli attributi che si ritiene opportuno includere.
L’esercizio prevede:
• l’implementazione dei costruttori e del metodo toString() per ciascuna classe;
• la modellazione del comportamento comune tra ProdottoAlimentare e CartaID in
particolare quello relativo alla verifica della scadenza.
• Se p1 è un riferimento a Prodotto nel metodo main deve essere possibile eseguire la
seguente stampa:
System.out.println("prodotto: " + p1.getDescrizione() + " fornito da:
" + p1.get_Produttore().get_name() + " e' distribuito da: " +
p1.get_Produttore().get_distributore().get_denominazione());
