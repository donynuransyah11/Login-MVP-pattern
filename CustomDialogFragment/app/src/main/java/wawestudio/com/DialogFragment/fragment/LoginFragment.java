package wawestudio.com.DialogFragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import wawestudio.com.DialogFragment.R;

/**
 * Created by Dony.A.Nuransyah on 09/01/17. Email : dony.nuransyah@gmail.com
 */


public class LoginFragment extends Fragment implements OnClickListener{
  View FragView;
  EditText user,pass;
  TextView login;
  DialogResponse dialogFragment;


  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    FragView = inflater.inflate(R.layout.login_fragment,container,false);
    init(FragView);
    return FragView;
  }

  public void init(View v){
    user = (EditText)v.findViewById(R.id.input_user);
    pass = (EditText)v.findViewById(R.id.input_password);
    login = (TextView)v.findViewById(R.id.buttonLogin);
    login.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {

      //set pada local data Dialog
      dialogFragment = new DialogResponse();
      dialogFragment.setData("Login Sukses");
      //Show DialogZakat.class
      dialogFragment.show(getActivity().getFragmentManager(), "simple dialog");
  }
}
