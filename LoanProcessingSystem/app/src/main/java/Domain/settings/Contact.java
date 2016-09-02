package Domain.settings;

import java.io.Serializable;

/**
 * Created by Riaan on 8/24/2016.
 */
public class Contact implements Serializable{
    private String cellNo;
    private String tellNo;
    private String faxNo;
    private String email;
    private String workNo;

    private Contact(){}

    public Contact(Builder builder){
        cellNo = builder.cellNo;
        tellNo = builder.tellNo;
        faxNo = builder.faxNo;
        email = builder.email;
        workNo = builder.workNo;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getTellNo() {
        return tellNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public String getEmail() {
        return email;
    }

    public String getWorkNo() {
        return workNo;
    }

    public static class Builder{
        private String cellNo;
        private String tellNo;
        private String faxNo;
        private String email;
        private String workNo;

        public Builder(){
            cellNo = "";
            tellNo = "";
            faxNo = "";
            email = "";
            workNo = "";
        }
        public Builder cellNo(String value){
            cellNo = value;
            return this;
        }
        public Builder tellNo(String value){
            tellNo = value;
            return this;
        }
        public Builder faxNo(String value){
            faxNo = value;
            return this;
        }
        public Builder email(String value){
            email = value;
            return this;
        }
        public Builder workNo(String value){
            workNo = value;
            return this;
        }
        public Builder copy(Contact value){
            cellNo = value.cellNo;
            tellNo = value.tellNo;
            faxNo = value.faxNo;
            email = value.email;
            workNo = value.workNo;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}
