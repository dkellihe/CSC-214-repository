package mobappdev.lecture19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mobappdev.lecture19.drawin.DrawinActivity;
import mobappdev.lecture19.themes.TheminActivity;
import mobappdev.lecture19.styles.StylinActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startStylin(View view) {
        startActivity(StylinActivity.newIntent(this));
    }

    public void startThemin(View view) {
        startActivity(TheminActivity.newIntent(this));
    }

    public void startDrawin(View view) {
        startActivity(DrawinActivity.newIntent(this));
    }
}
