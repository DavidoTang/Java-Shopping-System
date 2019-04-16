/**
 *
 * @author Dave
 */
public class Supplier {
    
    private String companyName;
    private String companyCEO;
    private SupplierContactInfo supplierContact;

    
    
    public Supplier() {
        this.companyName = "";
        this.companyCEO = "";
        this.supplierContact = null;
    }
    
    public Supplier(String companyName, String companyCEO, SupplierContactInfo supplierContact) {
        this.companyName = companyName;
        this.companyCEO = companyCEO;
        this.supplierContact = supplierContact;
    }
      
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCEO() {
        return companyCEO;
    }

    public void setCompanyCEO(String companyCEO) {
        this.companyCEO = companyCEO;
    }

    public SupplierContactInfo getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(SupplierContactInfo supplierContact) {
        this.supplierContact = supplierContact;
    }
    
    
    
    
    
    
    
    
    
    
    
}
