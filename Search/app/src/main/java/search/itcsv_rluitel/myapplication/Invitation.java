package search.itcsv_rluitel.myapplication;

/**
 * Created by itcsv_rluitel on 10/13/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//import com.google.android.gms.appinvite.AppInviteInvitation;

public class Invitation extends AppCompatActivity {

    private static final
    String INVITATION_TITLE = "Invite your friends",
            INVITATION_MESSAGE = "Hey! team 7 crete awesome apps. I think you might like it,check it out ",
            INVITATION_CALL_TO_ACTION = "Share";
    private static final int REQUEST_INVITE = 0;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);        // TODO


        button = (Button) findViewById(R.id.invite);           // TODO
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new AppInviteInvitation.IntentBuilder(INVITATION_TITLE)       //TODO
                        .setMessage(INVITATION_MESSAGE)
                        .setCallToActionText(INVITATION_CALL_TO_ACTION)
                        .build();
                startActivityForResult(intent, REQUEST_INVITE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_INVITE) {
            if (resultCode == RESULT_OK) {

                button.setVisibility(View.GONE);

                String[] ids = AppInviteInvitation.getInvitationIds(resultCode, data);       //TODO
                StringBuilder sb = new StringBuilder();
                sb.append(" Sent ").append(Integer.toString(ids.length)).append(" invitations: ");
                for (String id : ids) sb.append("[").append(id).append("]");
                Log.d(getString(R.string.app_name), sb.toString());

            }
        }
    }


}
