package interfact_segregation.violation;

public interface UserManagement {
    void updateUserProfile(User user);
    void changePassword(User user);
    void subscribeToNewlyAddedProduct();
    void unsubscribeToProduct();

}
