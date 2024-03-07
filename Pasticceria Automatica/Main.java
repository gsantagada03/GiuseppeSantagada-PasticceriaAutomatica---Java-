import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String scelta;

        //array con le varie opzioni per la scelta
        String[] basi = {"pan di spagna","biscotto" };
        String [] ripieni = {"crema pasticcera" , "marmellata"};
        String[] frutte = {"fragola" , "banana" , "kiwi" , "mela"};
        String[] decorazioni = {"glassa al cioccolato" , "zucchero a velo"};

        String [] [] processi = {{"pan di spagna","biscotto" }, {"crema pasticcera" , "marmellata"},{"fragola" , "banana" , "kiwi" , "mela"}, {"glassa al cioccolato" , "zucchero a velo"} };

        //si entra nel do while in modo tale che l'utente possa scegliere solamente si o no
        do{
            System.out.println("vuoi scegliere i gusti? Oppure No?");
            scelta = sc.nextLine();
            if( !(scelta.equals("si") || !(scelta.equals("No")))){
                System.out.println("Devi scrivere solamente si o no");
            }


        }while( !(scelta.equals("si")) && !(scelta.equals("no")));


        //in caso dica di si, si entra nell'if per chiedere quali basi vuole e nel for per ciclare fino al gusto scelto
        if(scelta.equals("si")){

            System.out.println("scegli la base tra : pan di spagna, biscotto ");
            String sceltaBase = sc.nextLine();
            for(int i = 0; i < basi.length;){
                if(sceltaBase.equals(basi[i])){
                    System.out.println("hai scelto " + basi[i]);
                    break;
                }else if(i == basi.length-1 && !(sceltaBase.equals(i))){
                    System.out.println("devi scegliere una tra la base a disposizione, riscegli!");
                    sceltaBase = sc.nextLine();
                    i = 0;
                }else{
                    i++;
                }
            }

            System.out.println("scegli i ripieni tra : crema pasticcera, marmellata");
            String sceltaRipieno = sc.nextLine();
            for(int i = 0; i< ripieni.length;){
                if(sceltaRipieno.equals(ripieni[i])){
                    System.out.println("hai scelto " + ripieni[i]);
                    break;
                }else if(i == ripieni.length-1 && !(sceltaRipieno.equals(i))){
                    System.out.println("devi scegliere uno tra i ripieni a disposizione, riscegli!");
                    sceltaRipieno = sc.nextLine();
                    i = 0;
                }else{
                    i++;
                }
            }
            
            System.out.println("scegli tra la frutta a disposizione tra : fragola, banana , kiwi e mela");
            String sceltaFrutta = sc.nextLine();
            for(int i = 0; i < frutte.length;){
                if(sceltaFrutta.equals(frutte[i])){
                    System.out.println("hai scelto " + frutte[i]);
                    break;
                }else if( i == frutte.length-1 && !(sceltaFrutta.equals(i))){
                    System.out.println("devi scegliere una tra la frutta a dispizione, riscegli!");
                    sceltaFrutta = sc.nextLine();
                    i = 0;
                }else{
                    i++;
                }
            }

            System.out.println("scegli tra le decorazioni a disposizione : glassa al cioccolato, zucchero a velo");
            String sceltaDecorazione = sc.nextLine();
            for(int i = 0; i< decorazioni.length;){
                if(sceltaDecorazione.equals(decorazioni[i])){
                    System.out.println("hai scelto " + decorazioni[i]);
                    break;
                }else if(i == decorazioni.length-1 && !(sceltaDecorazione.equals(i))){
                    System.out.println("devi scegliere una tra la frutta a disposizione, riscegli!");
                    sceltaDecorazione = sc.nextLine();
                    i = 0;
                }else{
                    i++;
                }
            }
            System.out.println("hai scelto : " + sceltaBase + " " + sceltaRipieno + " " + sceltaFrutta + " "+ sceltaDecorazione);
           
            }

            
            if(scelta.equals("no")){
                System.out.println("quanti processi di composizione del dolce vuoi scegliere scegliere da 0 a 3?");
                int sceltaNumeroIngredienti = sc.nextInt();

                //inizializzo il for solamente con i numeri che ha scelto
                for(int i = sceltaNumeroIngredienti; i < processi.length; i++){
                    if(sceltaNumeroIngredienti > 3){
                        System.out.println("devi scegliere un numero da 0 a 3, riscegli!");
                        
                    }
                }
                
                }
            }
        }
        
    

