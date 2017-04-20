package intuit.com.databindingdemo;

import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

/**
 * Created by ychang3 on 4/19/17.
 */

public class User {
    public final String firstName;
    public final String lastName;
    public ObservableField<String> address = new ObservableField<>();

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        address.set("original address");
    }
    public void onClickFirstName(View v)
    {
        Log.d("yc","on click first name");
    }

    public void onClickLastName(View view,User user)
    {
        Log.d("yc","on click last name "+user.lastName);
    }

    public void onClickAddress(View view,User user)
    {
        address.set("change the address");
        Log.d("yc","on click address "+user.address);
    }
}
