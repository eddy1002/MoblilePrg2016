package eddy1001.myvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a[] = {1, 3, 6, 10, 11};
    public void MyAvg(View v){
        MyValues Avg = new MyAverage();

        Toast.makeText(getApplicationContext(), "Result : " + Avg.getValue(a), Toast.LENGTH_SHORT).show();
    }

    public void MyMin(View v){
        MyValues Min = new MyMinimum();

        Toast.makeText(getApplicationContext(), "Result : " + Min.getValue(a), Toast.LENGTH_SHORT).show();
    }
}
