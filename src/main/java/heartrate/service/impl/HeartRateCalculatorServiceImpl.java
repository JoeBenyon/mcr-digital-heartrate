package heartrate.service.impl;

import heartrate.service.HeartRateCalculatorService;
import heartrate.vo.HeartRateVO;

import java.util.ArrayList;

public class HeartRateCalculatorServiceImpl implements HeartRateCalculatorService {

    @Override
    public ArrayList<HeartRateVO> calculateTargetHeartRates(int restingHeartRate, int age) {
        ArrayList<HeartRateVO> heartRates = new ArrayList<>();

        for(int i=55; i<=95; i+=5){
            HeartRateVO heartRate = new HeartRateVO(i, getTargetHeartRate(restingHeartRate, age, i));
            heartRates.add(heartRate);
        }

        return heartRates;
    }

    private int getTargetHeartRate(int restingHeartRate, int age, int intensity) {
        return (((220 - age) -  restingHeartRate) * intensity/100) + restingHeartRate;
    }
}
