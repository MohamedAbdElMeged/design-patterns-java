package dependency_inversion.good;

public class OrderManagementService {

    private DataProvider dataProvider;

    public OrderManagementService(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
    public void doBusinessLogic(){
        dataProvider.fetchData();
    }
}
