package wawestudio.com.DialogFragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import wawestudio.com.DialogFragment.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {
  FragmentManager fragmentManager;
  FragmentTransaction transaction;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);


    fragmentManager = getFragmentManager();
    transaction = fragmentManager.beginTransaction();
    //TODO panggil fragment

    Fragment a = new LoginFragment();
    transaction.add(R.id.vContentFrame, a);
    transaction.commit();
  }

}
