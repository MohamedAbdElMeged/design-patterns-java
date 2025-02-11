package interfact_segregation.violation;

public class Subscriber implements UserManagement{
    @Override
    public void updateUserProfile(User user) {
     // no need to this function here
    }

    @Override
    public void changePassword(User user) {
        // no need to this function here
    }

    @Override
    public void subscribeToNewlyAddedProduct() {

    }

    @Override
    public void unsubscribeToProduct() {

    }
}
