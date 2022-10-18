package withROP;

import java.util.Collection;
import java.util.HashSet;

class PersonCore implements Person {
    private String name, address;
    private Collection<PersonRole> roles = new HashSet<PersonRole>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    PersonCore(String n, String a) {
        name = n;
        address = a;
    }





    @Override
    public String getContactInfo() {
        return name + ","+ getAddress();
    }
/*
    public String getContactInfo(Person del) {
        return name + ", " + del.getAddress();

    }
    */
    public void join(Organization org) {
        org.addMember(this);
    }
 public <R extends PersonRole> R addRole(
    Class<R> spec, Object...arguments)
    {
        R role=null;
        try{
                role =spec.newInstance();
            System.out.println("HI"+role);
            roles.add(role);
            role.core = this;

        }catch (InstantiationException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
        return role;
    }

}