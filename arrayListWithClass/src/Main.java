import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer kamil= new Customer(1,"Onur","Nasır");
        customers.add(kamil);

        //customers.add(new Customer(1,"Onur","Nasır"));
        customers.add(new Customer(2,"Eda","Nasır"));
        customers.add(new Customer(3,"Uğur","Nasır"));

        //customers.remove(new Customer(1,"Onur","Nasır"));//new dediğimizde bu parametreler içi bellekte yeni bir referans numarası olupturup içeriğine tekrar yazacağından dolayı başta aynı indexler yani parametreler farklı bir referans numarası üzerinde olduğundan yazdırdığımızda yukardaki koddaki referans numarası içeriğindeki aynı indexleri yazdırmış olur.
        customers.remove(kamil);

        for (Customer customer:customers){ // Customer türündeki her bir customer için nerdeki customers'daki içeriği döndür demek.
            System.out.println(customer.firstName);
        }
    }
}
