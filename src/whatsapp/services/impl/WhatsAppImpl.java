package whatsapp.services.impl;


import whatsapp.classes.Profile;
import whatsapp.classes.WhatsApp;
import whatsapp.enums.Status;
import whatsapp.services.WhatsAppService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppImpl implements WhatsAppService {
    List<WhatsApp>profiles = new ArrayList<>();
    private List<String> message = new ArrayList<>();

    @Override
    public String registration() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your ID: ");
            long Id = scanner.nextLong();
            System.out.println("Enter user name: ");
            String UserName = scanner.nextLine();
            System.out.println("Enter your Phone number: ");
            Integer phoneNumber = scanner.nextInt();

            List<Profile> contacts = new ArrayList<>();
            List<String>message= new ArrayList<>();

            for (WhatsApp profile : profiles){
                String userName = null;
                if (profile.getNickName().equals(userName));
                throw new Exception("User name not found!");
            }
            Profile profile = new Profile(Id, UserName, password, phoneNumber, contacts, message, Status.НА_УЧЕБЕ);
            profiles.add(profile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public String sendMessage(String passport, String name, String message, List<Profile> profiles, List<Profile>profiles1) {
        for (Profile profile : profiles) {
            for (Profile profile1: profiles1){
                String password = null;
                if (profile.getPassword().equals(password)){
                    if (profile1.getUserName().equals(name)){
                        this.message.add(profile.getUserName() +" : "+ message);
                        profile1.setMessage((ArrayList<String>) this.message);
                        return "Message succfessfully sended!";
                    }
                }
            }
        }

        return passport;
    }

    @Override
    public Integer addContact() {
        return null;
    }

    @Override
    public String sendMessage() {
        return null;
    }

    @Override
    public String changeStatus() {
        return null;
    }

    @Override
    public List<WhatsApp> getAllWhatsAppStatus() {
        return this.profiles;
    }

    @Override
    public String getAllCountry() {
        return null;
    }

    @Override
    public String getAllGender() {
        return null;
    }

    @Override
    public String getAllWhatsApp() {
        return null;
    }

    @Override
    public String getPersonByFirstName() {
        return null;
    }

}
