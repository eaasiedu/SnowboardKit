package ewurafua1.example.com.snowboardkit;

import android.bluetooth.BluetoothClass;

import java.util.ArrayList;

/**
 * Created by ewurafua1 on 3/25/18.
 */

/**Simulates data output and collection from snowboard **/

public class testBoard {

    ArrayList<Devices> DeviceList = null;
    DevicesList phoneList;
    boolean isConnected = true;
    boolean isDisConnected =true;
    Double[] accelerometer = new Double[12];
    Double[] gyroscope = new Double[12];
    double temp = 50.5;
    Packet data = null;

// Scans for devices and returns a list
    public DevicesList scan(boolean enabled)
    {
        if(enabled == true)
        {
            phoneList = new DevicesList();
        }

        return phoneList;


    }
// Connects to a device
    public boolean connect(Devices deviceToConnect){

        isConnected = true;
        System.out.println("Device connected");
        return isConnected;
    }
//Disconnects from a device
    public boolean disconnect(Devices deviceToConnect){

        isDisConnected = true;
        System.out.println("Device disconnected");
        return isConnected;
    }
// Gets accelerometer data
    public Double[] getAccelerometer()
    {
        for(int i =0; i <11; i++)
        {
            accelerometer[i] = Math.random()*10;
            System.out.println(i);
        }
        return accelerometer;
    }
// Gets Gyroscope data
    public Double[] getGyroscope()
    {
        for(int i =0; i <11; i++)
        {
            gyroscope[i] = Math.random();
            System.out.println(i);
        }

        return gyroscope;
    }
// Gets temperature sensor data
    public double getTemp()
    {
        temp = Math.random()*10;
        System.out.println(temp);
        return temp;
    }
// Gets packet
    public Packet getPacket()
    {
       return data;
    }
}


