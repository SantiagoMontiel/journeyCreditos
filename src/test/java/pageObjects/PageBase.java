package pageObjects;

import runner.Navigation;

public class PageBase {

    private Navigation navigator = new Navigation();

    public Navigation getNavigator() {
        return navigator;
    }
}
