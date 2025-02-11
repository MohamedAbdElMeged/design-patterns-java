package interfact_segregation.good;

import interfact_segregation.good.UserManagement;

public class User implements UserManagement, SubscriptionManagement {
    protected String email;

    @Override
    public void changePassword() {

    }

    @Override
    public void updateProfile() {

    }

    @Override
    public void subscribeToNewlyAddedProduct() {

    }

    @Override
    public void unsubscribeToProduct() {

    }
}
