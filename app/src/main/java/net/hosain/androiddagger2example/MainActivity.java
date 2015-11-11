package net.hosain.androiddagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import net.hosain.androiddagger2example.di.InjectHelper;
import net.hosain.androiddagger2example.model.User;
import net.hosain.androiddagger2example.model.UserData;
import net.hosain.androiddagger2example.service.ApiService;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.name)
    TextView nameTextView;

    @Bind(R.id.link_karma)
    TextView linkKarmaTextView;

    @Bind(R.id.comment_karma)
    TextView commentKarmaTextView;

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InjectHelper.getRootComponent().inject(this);
        ButterKnife.bind(this);

        apiService.getUser("reddit")
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Response<User> response, Retrofit retrofit) {
                        displayUserDetails(response.body().getData());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
    }

    private void displayUserDetails(UserData userData) {
        nameTextView.setText("User name: " + userData.getName());
        linkKarmaTextView.setText("Link karma: " + String.valueOf(userData.getLinkKarma()));
        commentKarmaTextView.setText("Comment karma: " + String.valueOf(userData.getCommentKarma()));
    }
}
