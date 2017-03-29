package heartrate.service;

import heartrate.vo.HeartRateVO;

import java.util.ArrayList;

public interface HeartRateCalculatorService {

    ArrayList<HeartRateVO> calculateTargetHeartRates(int restingHeartRate, int age);

}
