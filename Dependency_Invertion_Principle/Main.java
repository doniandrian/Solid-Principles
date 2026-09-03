package Dependency_Invertion_Principle;

//*Low level modules should not depend on high level modules. Both should depend on abstractions. */
//*Abstractions should not depend on details. Details should depend on abstractions. */

// Abstraksi
interface OrderRepository {
    void save(String orderId);
}

// Low-level detail mengimplementasi abstraksi
class MySqlRepository implements OrderRepository {
    @Override
    public void save(String orderId) {
        System.out.println("Menyimpan order ke MySQL: " + orderId);
    }
}

class PostgresRepository implements OrderRepository {
    @Override
    public void save(String orderId) {
        System.out.println("Menyimpan order ke PostgreSQL: " + orderId);
    }
}

// High-level logic bergantung pada abstraksi
class OrderService {
    private final OrderRepository repository;

    // Dependency Injection lewat constructor
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(String orderId) {
        repository.save(orderId);
    }
}

public class Main {
    public static void main(String[] args) {
        OrderRepository repo = new PostgresRepository(); 
        OrderService orderService = new OrderService(repo);

        orderService.createOrder("ORD-001");
        
    }
    
}
