public class Main {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.setName("Cooker");
        billPughSingleton.setSalary(1350);
        System.out.println("Job: "+billPughSingleton.getName());
        System.out.println("Salary: "+ billPughSingleton.getSalary());
        BillPughSingleton billPughSingleton1 =BillPughSingleton.getInstance();
        billPughSingleton1.setName("Chief");
        System.out.println("Job: "+billPughSingleton.getName());
        System.out.println("Job1: "+billPughSingleton1.getName());
        System.out.println("Salary: "+ billPughSingleton.getSalary());

    }
}