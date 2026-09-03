// Low-level detail
package Dependency_Invertion_Principle;

public class WrongExample {
    public static void main(String[] args) {
        
    }
}

class MySqlDatabase {
    public void save(String orderId) {
        System.out.println("Menyimpan order ke MySQL: " + orderId);
    }
}

// High-level business logic
class OrderService {
    private MySqlDatabase database;

    public OrderService() {
        // Pelanggaran: High-level bergantung langsung pada detail
        this.database = new MySqlDatabase();
    }

    public void createOrder(String orderId) {
        database.save(orderId);
    }
}

//Jika database diganti ke PostgreSQL atau Kita ingin membuat Unit Test dengan Mock Database, Kita harus membongkar kode di dalam OrderService