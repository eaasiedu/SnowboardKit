package ewurafua1.example.com.snowboardkit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ewurafua1 on 3/25/18.
 */



public class testBoardDetail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowboard_kit);

        // Connects sensor data to format and display
        TextView accelerometer = (TextView) findViewById(R.id.accelerometerTxt);
        TextView gyroscope = (TextView) findViewById(R.id.gyroscopeTxt);
        TextView temp = (TextView) findViewById(R.id.tempTxt);


    }
}
