package withROP;

class Employee extends PersonRole {

    Employer employer;

        @Override public String getAddress() {
        return employer.getAddress();
        }

}