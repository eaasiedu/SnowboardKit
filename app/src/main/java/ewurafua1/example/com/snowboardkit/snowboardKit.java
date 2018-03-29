package ewurafua1.example.com.snowboardkit;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class snowboardKit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowboard_kit);


        testBoard newOne = new testBoard();
        Devices device = new Devices(1);
    // Displays accelerometer data
        //Button button = findViewById(xmlbutton);
        TextView accelView = (TextView) findViewById(R.id.accelerometerTxt);
        Double[] array = newOne.getAccelerometer();
        accelView.setText("x: " + array[0] + " y: " + array[1] + " z: " + array[2]);
        //button.setOnClickListener(new );

    // Displays gyroscope data
        TextView gyroView = (TextView) findViewById(R.id.gyroscopeTxt);
        Double[] array1 = newOne.getGyroscope();
        gyroView.setText("x: " + array[0] + " y: " + array[1] + " z: " + array[2]);

        // Displays temperature sensor data
        TextView tempView = (TextView) findViewById(R.id.tempTxt);
        double d = newOne.getTemp();
        String tempAsString = String.valueOf(d);
        tempView.setText("Temp is: " + tempAsString + "  F");


        //Button tests and outputs board connection
        Button button = (Button) findViewById(R.id.AButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                testBoard next = new testBoard();
                Devices newDevice = new Devices(1);

                if(next.connect(newDevice)) {
                    TextView connect = (TextView) findViewById(R.id.connection);
                    connect.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    }







