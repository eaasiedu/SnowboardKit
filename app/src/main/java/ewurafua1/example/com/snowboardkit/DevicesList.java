package ewurafua1.example.com.snowboardkit;

import java.util.ArrayList;

/**
 * Created by ewurafua1 on 3/25/18.
 */

public class DevicesList {


    public ArrayList<Devices> theListofDevices;

    public DevicesList() {
        // Do this if there are no real users
        if (theListofDevices == null) {
            buildTestDevicesList();
        }
    }

        public void buildTestDevicesList(){
            theListofDevices = new ArrayList();
            for(int i = 0; i < 12; i++){
                int deviceID = i;
                Devices newDevices = new Devices(deviceID);
                theListofDevices.add(newDevices);
            }
        }


}




