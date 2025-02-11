package interfact_segregation.violation;

public class User implements UserManagement{
    protected String name;
    protected String email;


    @Override
    public void updateUserProfile(User user) {

    }

    @Override
    public void changePassword(User user) {

    }

    @Override
    public void subscribeToNewlyAddedProduct() {
        // no need to this function here
    }

    @Override
    public void unsubscribeToProduct() {
        // no need to this function here
    }
}
