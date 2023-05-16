public class BillPughSingleton {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    private BillPughSingleton(){}
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
