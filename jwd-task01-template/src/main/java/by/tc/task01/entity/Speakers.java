package by.tc.task01.entity;

public class Speakers extends Appliance{
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;

        Speakers speakers = (Speakers) o;

        if (Double.compare(speakers.powerConsumption, powerConsumption) != 0) return false;
        if (Double.compare(speakers.numberOfSpeakers, numberOfSpeakers) != 0) return false;
        if (Double.compare(speakers.cordLength, cordLength) != 0) return false;
        return frequencyRange != null ? frequencyRange.equals(speakers.frequencyRange) : speakers.frequencyRange == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numberOfSpeakers);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (frequencyRange != null ? frequencyRange.hashCode() : 0);
        temp = Double.doubleToLongBits(cordLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
