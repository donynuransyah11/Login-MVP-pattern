package wawestudio.com.loginmpvpattern.Presenter;

import wawestudio.com.loginmpvpattern.Model.Login;

/**
 * Created by Dony.A.Nuransyah on 28/12/16.
 * Email : dony.nuransyah@gmail.com
 */

/*
Implementasi dari Logic
 */

public class LoginPresenterImplem implements LoginInterface.loginPresenter {
    LoginInterface.loginView view;
    Login login;

    public LoginPresenterImplem(LoginInterface.loginView view){
        this.view = view;
        this.login = new Login();
    }

    @Override
    public void login(String username, String password) {
        //example we get data login from
        if(login.getUsername().equals(username)&&login.getPassword().equals(password)){
            view.valid();
        }else{
            view.error();
        }
    }
}
