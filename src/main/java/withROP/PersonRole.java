package withROP;

abstract class PersonRole implements Person {
PersonCore core;
public  String getAddress()
        {
        return core.getAddress();
         }
    public String getContactInfo() {
         return core.getContactInfo();
         }


    public void join(Organization org)
    {
         core.join(org);
    }
   public <R extends PersonRole> R addRole (Class<R> spec, Object... arguments)
    {
        System.out.println(spec);
        return core.addRole(spec, arguments);
    }


}
