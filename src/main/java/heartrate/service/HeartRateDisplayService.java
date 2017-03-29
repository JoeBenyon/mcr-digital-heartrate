package heartrate.service;

import heartrate.vo.HeartRateVO;

import java.util.ArrayList;

public interface HeartRateDisplayService {

    void displayHeartRates(ArrayList<HeartRateVO> heartRates);
}
