package heartrate.service;

import heartrate.service.impl.HeartRateCalculatorServiceImpl;
import heartrate.vo.HeartRateVO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HeartRateCalculatorServiceTest {

    HeartRateCalculatorService heartRateCalculatorService;

    @Before
    public void setUp() throws Exception {

        heartRateCalculatorService = new HeartRateCalculatorServiceImpl();

    }

    @Test
    public void correctHeartRatesTest(){

        int age = 20;
        int restingHeartRate = 65;

        ArrayList<HeartRateVO> heartRates = heartRateCalculatorService.calculateTargetHeartRates(restingHeartRate, age);

        assertTrue(
                heartRates.get(0).getHeartRate() == 139 &&
                        heartRates.get(1).getHeartRate() == 146 &&
                        heartRates.get(2).getHeartRate() == 152 &&
                        heartRates.get(3).getHeartRate() == 159 &&
                        heartRates.get(4).getHeartRate() == 166 &&
                        heartRates.get(5).getHeartRate() == 173 &&
                        heartRates.get(6).getHeartRate() == 179 &&
                        heartRates.get(7).getHeartRate() == 186 &&
                        heartRates.get(8).getHeartRate() == 193
        );

    }

}