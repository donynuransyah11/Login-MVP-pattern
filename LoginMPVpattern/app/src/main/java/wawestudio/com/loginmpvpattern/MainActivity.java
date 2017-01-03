package wawestudio.com.loginmpvpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import wawestudio.com.loginmpvpattern.Presenter.LoginPresenter;
import wawestudio.com.loginmpvpattern.Presenter.LoginPresenterImplem;
import wawestudio.com.loginmpvpattern.View.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView{
    private TextView login;
    private EditText username,password;
    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginPresenterImplem(this);
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        login = (TextView)findViewById(R.id.buttonLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    presenter.login(username.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    public void valid() {
        Toast.makeText(MainActivity.this,"Sukses Bro",Toast.LENGTH_LONG).show();
    }

    @Override
    public void error() {
        Toast.makeText(MainActivity.this,"Gagal Bro",Toast.LENGTH_LONG).show();
    }
}
