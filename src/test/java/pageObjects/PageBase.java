package pageObjects;

import runner.Navigation;

public class PageBase {

    Navigation navigator = new Navigation();

    public Navigation getNavigator() {
        return navigator;
    }
}
