package kondratkov.ermineapps.newain;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
//<LinearLayout
//        android:id="@+id/linearLayout"
//                android:layout_width="0dp"
//                android:layout_height="0dp"
//                android:orientation="vertical"
//                android:adjustViewBounds="true"
//                android:divider="@drawable/separator"
//                android:dividerPadding="3dp"
//                android:showDividers="middle"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toTopOf="parent">
//
//<TextView
//            android:id="@+id/textView_setting_push"
//                    android:layout_width="match_parent"
//                    android:layout_height="60dp"
//                    android:gravity="center_vertical"
//                    android:paddingLeft="15dp"
//                    android:text="@string/settings_push"
//                    android:textSize="18sp" />
//
//<TextView
//            android:id="@+id/textView_setting_size_text"
//                    android:layout_width="match_parent"
//                    android:layout_height="60dp"
//                    android:gravity="center_vertical"
//                    android:paddingLeft="15dp"
//                    android:text="@string/settings_size_text"
//                    android:textSize="18sp" />
//
//<TextView
//            android:layout_width="match_parent"
//                    android:layout_height="wrap_content" />
//</LinearLayout>