package whatsapp.services;

import whatsapp.classes.Passport;
import whatsapp.enums.Region;

import java.util.ArrayList;
import java.util.List;

public interface PersonService {

    String createPassport(List<Passport> passports);
    String showWhoHasPassport();
    ArrayList<Passport> getAllPassport();
    ArrayList<Passport> getPassportByFirstName();
    List<Region> getAllRegion();



}
