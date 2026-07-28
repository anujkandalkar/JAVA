class User{
    void login(){
        System.out.println("User Logged In");
    }
}
class Admin extends User{
    void manage(){
        System.out.println("Manage users");
    }
}
class Customer extends User{
    void buy(){
        System.out.println("Customer Purchased Item");
    }
}


public class HierarchicalIn{
    public static void main(String[] args){

        Admin Admin = new Admin();
        Admin.login();
        Customer Customer = new Customer();
        Customer.buy();




    }
}