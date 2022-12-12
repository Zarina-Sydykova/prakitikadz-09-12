package whatsapp.services;

import java.util.List;

public interface WhatsAppService {


    String registration();
    String sendMessage();
    Integer addContact();
    String changeStatus();
    String getAllWhatsAppStatus();
    String getAllCountry();
    String getAllGender();
    String getAllWhatsApp();
    String getPersonByFirstName();
    String getMessage();
}
