package pageObjects;

public class Login {

    private String url = "http://localhost:3000/api-poc/login";
    private String fieldUserName = "userName";
    private String fieldPass = "password";
    private String accept = "//*[@id=\"root\"]/div/div/div[2]/div[2]/form/div[5]/button[1]";


    public String getAccept() {
        return accept;
    }

    public String getUrl() {
        return url;
    }

    public String getFieldUserName() {
        return fieldUserName;
    }

    public String getFieldPass() {
        return fieldPass;
    }
}
