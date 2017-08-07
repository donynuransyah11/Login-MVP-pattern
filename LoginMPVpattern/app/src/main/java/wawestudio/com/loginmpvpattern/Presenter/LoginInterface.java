package wawestudio.com.loginmpvpattern.Presenter;

/**
 * Created by Dony.A.Nuransyah on 28/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public interface LoginInterface {
    /*
    Logicnya Backend
     */
    interface loginPresenter{
        public void login(String username,String password);
    }

    interface loginView{
        public void valid();
        public void error();
    }
}
