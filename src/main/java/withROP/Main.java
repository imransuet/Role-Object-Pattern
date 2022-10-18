package withROP;



public class Main {

   public static void main(String... args) {
         Person james = new PersonCore("Bond", "secret");
         Employer gvnmt = new Employer("London");
         Employee bond = james.addRole(Employee.class, gvnmt);
         assert bond.getContactInfo().equals("Bond, London") :"Assertion 1";

        Agent doubleO7 = james.addRole(Agent.class);
         Organization mi6 = new Organization();
         doubleO7.join(mi6);
         //assert mi6.hasMember(doubleO7) : "Assertion 2";
        // assert mi6.hasMember(bond) : "Assertion 3";



    }

}
