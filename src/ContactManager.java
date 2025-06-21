import java.util.Scanner;
class Contact {
    String name;
    String phoneNumber;

}
public class ContactManager {
    public static void main(String[] args){

        Scanner lecture = new Scanner(System.in);
        Contact[] myFriends = new Contact[500];
        int friendsCount = 0;
        System.out.println("Gestionnaire de contacts");
        System.out.println("Combien de contact voulez vous enregistrer ? \n nombres maximun d'enregistrement (500)");
        int numberofContacts = lecture.nextInt();
        lecture.nextLine();
        for ( int i = 0 ; i < numberofContacts && i < 500; i++){
            Contact contact1 = new Contact();
            System.out.println("Non du contact "+ (i+1)+" : ");
            contact1.name= lecture.nextLine();

            System.out.println("Numero de téléphone  : ");
            contact1.phoneNumber = lecture.nextLine();
            myFriends[friendsCount] = contact1;
            friendsCount++;

        }
        System.out.println("Entrez un nom pour chercher un contact");
        String nomRecherche = lecture.nextLine();
        boolean trouver = false;
        for (int i = 0 ; i < friendsCount ; i++){
            if (myFriends[i].name.equalsIgnoreCase(nomRecherche)){
                System.out.println(" Contact trouvé : "+ myFriends[i].name+" "+myFriends[i].phoneNumber);
                trouver = true;
                break;
            }
        }
        if (! trouver){
            System.out.println("Contact non trouvé.");
        }
        lecture.close();

    }
}
