package sg.edu.np.edu.mad.madweek2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User newUser = new User();
        Button FollowButton = findViewById(R.id.fnfbutton);
        if (newUser.followed == true){
            FollowButton.setText("unfollow");
            newUser.followed = false;
        }
        else if (newUser.followed == false){
            FollowButton.setText("follow");
            newUser.followed = true;
        }



    }
}