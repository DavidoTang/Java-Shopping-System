/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class SupplierContactInfo extends ContactInfo {
    
    
    private String fax;
    private String ceoEmail;
    private String ceoPhone;
    private String primaryContactEmail;
    private String primaryContactPhone;
    private String businessWebsite;
    
    public SupplierContactInfo(String emailAddress, String phoneNumber, String fax, String ceoEmail,
            String ceoPhone, String primaryContactEmail, String primaryContactPhone, String businessWebsite) {
        super(emailAddress, phoneNumber);
        this.fax = fax;
        this.ceoEmail = ceoEmail;
        this.ceoPhone = ceoPhone;
        this.primaryContactEmail = primaryContactEmail;
        this.primaryContactPhone = primaryContactPhone;
        this.businessWebsite = businessWebsite;
        
    }
    
    public SupplierContactInfo() {
        super();
        
        this.fax = "";
        this.ceoEmail = "";
        this.ceoPhone = "";
        this.primaryContactEmail = "";
        this.primaryContactPhone = "";
        this.businessWebsite = "";
    }
    

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCeoEmail() {
        return ceoEmail;
    }

    public void setCeoEmail(String ceoEmail) {
        this.ceoEmail = ceoEmail;
    }

    public String getCeoPhone() {
        return ceoPhone;
    }

    public void setCeoPhone(String ceoPhone) {
        this.ceoPhone = ceoPhone;
    }

    public String getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    public void setPrimaryContactEmail(String primaryContactEmail) {
        this.primaryContactEmail = primaryContactEmail;
    }

    public String getPrimaryContactPhone() {
        return primaryContactPhone;
    }

    public void setPrimaryContactPhone(String primaryContactPhone) {
        this.primaryContactPhone = primaryContactPhone;
    }

    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
