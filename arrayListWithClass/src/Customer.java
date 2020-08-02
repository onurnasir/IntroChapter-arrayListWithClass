public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){

    }
    public Customer(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName; //Eşittirin sağındaki main class'da parametreden gelen değişkendir.
        this.lastName=lastName;

    }
}
