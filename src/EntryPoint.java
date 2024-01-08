import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class EntryPoint {

    public static void main(String[] args) {
        // configurez ici votre école :

        String DateChoisi ="";
        String VoitureChoisi ="";
        String ResponsableChoisi ="";
        String ClientChoisi ="";

        Voiture Voiture1 = new Voiture("Tesla modele S");
        Voiture Voiture2 = new Voiture("BMW série 1");
        Voiture Voiture3 = new Voiture("Lamborghini Aventador");
        Voiture1.setOccupation("[RESERVER]");

        List ListVoiture = new ArrayList<Voiture>();
        ListVoiture.add(Voiture1);
        ListVoiture.add(Voiture2);
        ListVoiture.add(Voiture3);


        // - Instantiation de vos voitures, clients, responsables...

        Responsable Responsable1 = new Responsable("Gérard Menvuça");
        Responsable Responsable2 = new Responsable("Guy Tar");
        Responsable Responsable3 = new Responsable("RUCHAUD");


        // - Le programme est déjà pré écrit, il ne reste qu'à compléter les TODO

        System.out.println("/_\\ Bienvenue sur LocaLux car manager!");

        // la Console permet de faciliter la récupération d'une saisie de l'utilisateur dans la console
        Console console = new Console();
        int functionToRun = -1;
        do {
            System.out.println("Qu'est-ce que tu veux faire?");
            System.out.println("1 - Lister les voitures disponibles");
            System.out.println("2 - Effectuer une réservation");
            System.out.println("3 - J'ai fini");

            functionToRun = console.captureInt(1, 4);
                // contrôle de la saisie
                switch(functionToRun) {
                    case 1:
                        // TODO FS1 : Lister les voitures disponibles
                        System.out.println("Voici la liste des voitures disponibles");

                        if (Voiture1.getOccupation()== "[Disponible]"){System.out.println(Voiture1.getOccupation()+" Voiture "+Voiture1.getNom());}
                        if (Voiture2.getOccupation()== "[Disponible]"){System.out.println(Voiture2.getOccupation()+" Voiture "+Voiture2.getNom());}
                        if (Voiture3.getOccupation()== "[Disponible]"){System.out.println(Voiture3.getOccupation()+" Voiture "+Voiture3.getNom());}


                        break;
                    case 2:
                        // TODO FP1 : réserver une voiture
                        System.out.println("A quelle date souhaitez vous réserver ?");




                        Console maConsole = new Console();
                        DateChoisi = maConsole.captureString();

                        System.out.println("Quelle voiture parmis les voiture disponibles ci-dessous souhaitez vous réserver?");
                        System.out.println("1 - "+Voiture1.getOccupation()+" Voiture "+Voiture1.getNom());
                        System.out.println("2 - "+Voiture2.getOccupation()+" Voiture "+Voiture2.getNom());
                        System.out.println("3 - "+Voiture3.getOccupation()+" Voiture "+Voiture3.getNom());

                        int functionToRun2 =-1;
                        functionToRun2 = console.captureInt(1, 3);

                        switch(functionToRun2) {
                            case 1:
                                if (Voiture1.getOccupation()=="[Disponible]"){Voiture1.setOccupation("[Reserver]");
                                    VoitureChoisi ="Tesla modele S";}
                                break;
                            case 2:
                                if (Voiture2.getOccupation()=="[Disponible]"){Voiture2.setOccupation("[Reserver]");
                                    VoitureChoisi ="BMW série 1";}
                                break;
                            case 3:
                                if (Voiture3.getOccupation()=="[Disponible]"){Voiture3.setOccupation("[Reserver]");
                                    VoitureChoisi ="Lamborghini Aventador";}
                                break;
                        }

                        if(VoitureChoisi ==""){
                            System.out.println(" ERREUR ------------- Voiture déja reserver -----------");
                            break;
                        }else {

                            System.out.println("Quel Responsable ?");
                            System.out.println("1 - " + Responsable1.getNom());
                            System.out.println("2 - " + Responsable2.getNom());
                            System.out.println("3 - " + Responsable3.getNom());


                            int functionToRun3 = -1;
                            functionToRun3 = console.captureInt(1, 3);

                            switch (functionToRun3) {
                                case 1:
                                    ResponsableChoisi = Responsable1.getNom();
                                    break;
                                case 2:
                                    ResponsableChoisi = Responsable2.getNom();
                                    break;
                                case 3:
                                    ResponsableChoisi = Responsable3.getNom();
                                    break;
                            }

                            System.out.println("Quelle Client ?");
                            System.out.println("1 - Adrien HAUTOT");
                            System.out.println("2 - Justine TITEGOUTTE");


                            int functionToRun4 = -1;
                            functionToRun4 = console.captureInt(1, 2);

                            switch (functionToRun4) {
                                case 1:
                                    ClientChoisi = "Adrien HAUTOT";
                                    break;
                                case 2:
                                    ClientChoisi = "Justine TITEGOUTTE";
                                    break;

                            }

                            if (VoitureChoisi == "Tesla modele S") {
                                Voiture1.setResponsable(ResponsableChoisi);
                                Voiture1.setDate(DateChoisi);
                                Voiture1.setClient(ClientChoisi);
                                System.out.println(Voiture1.getClient() + " à réservé " + Voiture1.getNom() + " pour le " + Voiture1.getDate() + " et " + Voiture1.getResponsable() + " est le responsable de la location.");
                            }
                            if (VoitureChoisi == "BMW série 1") {
                                Voiture2.setResponsable(ResponsableChoisi);
                                Voiture2.setDate(DateChoisi);
                                Voiture2.setClient(ClientChoisi);
                                System.out.println(Voiture2.getClient() + " à réservé " + Voiture2.getNom() + " pour le " + Voiture2.getDate() + " et " + Voiture2.getResponsable() + " est le responsable de la location.");

                            }
                            if (VoitureChoisi == "Lamborghini Aventador") {
                                Voiture3.setResponsable(ResponsableChoisi);
                                Voiture3.setDate(DateChoisi);
                                Voiture3.setClient(ClientChoisi);
                                System.out.println( Voiture3.getClient() + " à réservé " + Voiture3.getNom() + " pour le " + Voiture3.getDate() + " et " + Voiture3.getResponsable() + " est le responsable de la location.");
                            }

                            break;
                        }


                    case 3:
                        System.out.println("A la prochaine!");
                    default:
                        System.err.println("Saisie invalide... tu dois choisir entre 1 et 3");
                }
            System.out.println("###################################################");

        } while(functionToRun != 3);

    }
}
