package wawestudio.com.loginmpvpattern.Presenter;

import wawestudio.com.loginmpvpattern.View.LoginView;

/**
 * Created by Dony.A.Nuransyah on 28/12/16.
 * Email : dony.nuransyah@gmail.com
 */

/*
Implementasi dari Logic
 */

public class LoginPresenterImplem implements LoginPresenter {
    LoginView view;


    public LoginPresenterImplem(LoginView view){
        this.view=view;
    }

    @Override
    public void login(String username, String password) {
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin")){
            view.valid();
        }
        else{
            view.error();
        }
    }
}
