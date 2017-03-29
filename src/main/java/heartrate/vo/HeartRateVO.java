package heartrate.vo;

public class HeartRateVO {

    int intensity;
    int heartRate;

    public HeartRateVO(int intensity, int heartRate) {
        this.intensity = intensity;
        this.heartRate = heartRate;
    }

    public int getIntensity() {
        return intensity;
    }

    private void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getHeartRate() {
        return heartRate;
    }

    private void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
