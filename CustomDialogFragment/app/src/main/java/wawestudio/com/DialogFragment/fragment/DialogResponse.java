package wawestudio.com.DialogFragment.fragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import wawestudio.com.DialogFragment.R;

/**
 * Created by Dony.A.Nuransyah on 09/01/17. Email : dony.nuransyah@gmail.com
 */


public class DialogResponse extends DialogFragment {

  View DialogView;
  TextView response,tombol;
  String message;

  public void setData(String message){
    this.message=message;
  }

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    DialogView  = getActivity().getLayoutInflater().inflate(R.layout.response_fragment, null, false);


    response = (TextView)DialogView.findViewById(R.id.response);
    tombol = (TextView)DialogView.findViewById(R.id.tombol);

    response.setText(message);

    Dialog builder = new Dialog(getActivity());
    builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
    builder.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));

    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    int width = displayMetrics.widthPixels;
    int height = displayMetrics.heightPixels;

    WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
    lp.copyFrom(builder.getWindow().getAttributes());
    lp.height = height - (height/5);
    lp.width = width - 80;

    builder.getWindow().setGravity(Gravity.CENTER);
    builder.getWindow().setBackgroundDrawableResource(android.R.color.holo_blue_light);
    builder.setContentView(DialogView);
    builder.getWindow().setAttributes(lp);
    return builder;
  }
}
