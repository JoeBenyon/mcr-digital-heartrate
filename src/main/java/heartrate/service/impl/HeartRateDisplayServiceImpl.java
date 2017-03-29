package heartrate.service.impl;

import heartrate.service.HeartRateDisplayService;
import heartrate.vo.HeartRateVO;

import java.util.ArrayList;
import java.util.StringJoiner;

public class HeartRateDisplayServiceImpl implements HeartRateDisplayService {

    @Override
    public void displayHeartRates(ArrayList<HeartRateVO> heartRates) {

        System.out.printf("Intensity\t|\tHeart rate\n");
        System.out.println("------------+------------");

        for(HeartRateVO heartRate : heartRates){
            StringJoiner text = new StringJoiner("");
            text.add("\t").add(String.valueOf(heartRate.getIntensity())).add("%\t\t|\t").add(String.valueOf(heartRate.getHeartRate()));
            System.out.println(text.toString());
        }
    }
}
