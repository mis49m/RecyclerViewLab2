package tr.com.mis49m.recyclerviewlab2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tName, tPhone, tMail;
    View view;
    LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tName = (TextView) findViewById(R.id.name);
        tPhone = (TextView) findViewById(R.id.phone);
        tMail = (TextView) findViewById(R.id.email);
        view = (View) findViewById(R.id.circle);
        back = (LinearLayout) findViewById(R.id.back);

    }
}
