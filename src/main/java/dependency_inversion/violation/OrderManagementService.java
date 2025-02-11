package dependency_inversion.violation;

// High level module
public class OrderManagementService {
    private OrderDataAccess orderDataAccess;

    public OrderManagementService() {
        this.orderDataAccess = new OrderDataAccess();
    }
    private void doBusinessLogic(){
        orderDataAccess.fetchOrders();
    }
}
