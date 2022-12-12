package whatsapp.services;

import whatsapp.classes.WhatsApp;

import java.util.List;

public interface WhatsAppService {


    String registration();
    Integer addContact();
    String sendMessage();
    List<WhatsApp> getAllWhatsAppStatus();
    String changeStatus();
    String getAllCountry();
    String getAllGender();
    String getAllWhatsApp();
    String getPersonByFirstName();
}
