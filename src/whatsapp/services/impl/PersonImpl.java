package whatsapp.services.impl;


import whatsapp.classes.Passport;
import whatsapp.enums.Gender;
import whatsapp.enums.Region;
import whatsapp.services.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonImpl implements PersonService{
    List<Passport> passports = new ArrayList<Passport>();
    Scanner in = new Scanner(System.in);


        public void runActions() {
            while (true) {
                int actionType = choiceActions();
                switch (actionType) {
                    case 1 -> createPassport();
                    case 2 -> showWhoHasPassport();
                    default -> System.out.println("Wrong action type");
                }
            }
        }

    private int choiceActions() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\tchoice your action: \n1:create Passport\n2:view all passports");
            return scanner.nextInt();
        }

    @Override
    public String createPassport(List<Passport>passports) {

            System.out.println("\n\tAdd user info please");
            System.out.print("Enter the passport surName: ");
            String newPassportName = this.in.nextLine();
            System.out.print("\nEnter your Id: ");
            long newPassportId = this.in.nextInt();
            System.out.println("\nEnter your firstname: ");
            String newFirstName = this.in.nextLine();
        System.out.println("\nEnter your date of birth: ");
        LocalDate newDateOfBirth = LocalDate.ofEpochDay(this.in.nextInt());
        System.out.println("\nEnter your gender: ");
        Gender newGender = Gender.valueOf(this.in.nextLine());
        System.out.println("\nEnter region: ");
        int newRegion = this.in.nextInt();
            Passport newPassport = new Passport(newPassportId, newPassportName, newFirstName, newDateOfBirth, newGender,newRegion );
            this.passports.add(newPassport);
            onActionSuccess();
        return passports.toString();
    }

    @Override
    public String showWhoHasPassport() {

            System.out.println("\n\tHere is user list informations");
            if (this.passports.isEmpty()) {
                System.out.println("\nUser list is empty, please add some users");
            } else {
                for (int i = 0; i < this.passports.size(); i++) {
                    Passport.printUserInfo(this.passports.get(i));
                }
            }
            onActionSuccess();
        return showWhoHasPassport();
    }
    private void onActionSuccess() {
        System.out.println("\naction done successfully\n");
    }

    @Override
    public ArrayList<Passport> getAllPassport() {
        return null;
    }

    @Override
    public ArrayList<Passport> getPassportByFirstName() {
        return null;
    }

    @Override
    public List<Region> getAllRegion() {
        return null;
    }






}
