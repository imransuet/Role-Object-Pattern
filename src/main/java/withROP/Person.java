package withROP;

interface Person {

    String getAddress();


    String getContactInfo();

    void join(Organization org);
    <R extends PersonRole> R addRole
               (Class<R> spec, Object...arguments);


}