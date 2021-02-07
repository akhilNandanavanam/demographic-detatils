/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Akhil Nandanavanam
 */
public class DriverLicenseInformation {
    private String number;
    private String dateOfIssuance; 
    private String dateOfExpiration;
    private String bloodType; 

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDateOfIssuance() {
        return dateOfIssuance;
    }

    public void setDateOfIssuance(String dateOfIssuance) {
        this.dateOfIssuance = dateOfIssuance;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
}
