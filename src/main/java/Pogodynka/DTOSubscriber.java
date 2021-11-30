package Pogodynka;

public class DTOSubscriber {

    private String userData;

    public String getUserData() {
        return userData;
    }

    public String getUserContact() {
        return userContact;
    }

    private String userContact;

    public DTOSubscriber(String userData, String userContact) {
        this.userData = userData;
        this.userContact = userContact;
    }

}
