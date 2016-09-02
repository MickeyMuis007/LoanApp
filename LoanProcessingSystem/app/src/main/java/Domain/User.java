package Domain;


import Domain.settings.Address;
/**
 * Created by Riaan on 4/15/2016.
 */
public class User {
    private long userNo;
    private String type;
    private String name;
    private String lastName;
    private Address address;
    private Branch branch;

    private User(){}
    public User(Builder builder) {
        this.userNo = builder.userNo;
        this.type = builder.type;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.branch = builder.branch;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Branch getBranch() {
        return branch;
    }

    public long getUserNo() {
        return userNo;
    }

    public String getType() {
        return type;
    }


    public Address getAddress() {
        return address;
    }

    public static class Builder{
        private long userNo;
        private String type;
        private String name;
        private String lastName;
        private Address address;
        private Branch branch;

        public Builder(){
            userNo = 0;
            type = "";
            name = "";
            lastName = "";
            address = null;
            branch = null;
        }
        public Builder userNo(long value){
            this.userNo = value;
            return this;
        }
        public Builder type(String value){
            this.type = value;
            return this;
        }
        public Builder name(String value){
            name = value;
            return this;
        }
        public Builder lastName(String value){
            lastName = value;
            return this;
        }
        public Builder address(Address value){
            this.address = value;
            return this;
        }
        public Builder branch(Branch value){
            this.branch = value;
            return this;
        }
        public Builder copy(User value){
            this.userNo = value.userNo;
            this.type = value.type;
            this.name = value.name;
            this.lastName = value.lastName;
            this.address = value.address;
            this.branch =value.branch;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userNo == user.userNo;

    }

    @Override
    public int hashCode() {
        return (int) (userNo ^ (userNo >>> 32));
    }
}
