package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{

	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private double cleaningWidth;

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, double cleaningWidth) {
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public VacuumCleaner() {
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public double getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		VacuumCleaner that = (VacuumCleaner) o;

		if (powerConsumption != that.powerConsumption) return false;
		if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
		if (Double.compare(that.cleaningWidth, cleaningWidth) != 0) return false;
		if (filterType != null ? !filterType.equals(that.filterType) : that.filterType != null) return false;
		if (bagType != null ? !bagType.equals(that.bagType) : that.bagType != null) return false;
		return wandType != null ? wandType.equals(that.wandType) : that.wandType == null;

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = powerConsumption;
		result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
		result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
		result = 31 * result + (wandType != null ? wandType.hashCode() : 0);
		result = 31 * result + motorSpeedRegulation;
		temp = Double.doubleToLongBits(cleaningWidth);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "VacuumCleaner{" +
			"powerConsumption=" + powerConsumption +
			", filterType='" + filterType + '\'' +
			", bagType='" + bagType + '\'' +
			", wandType='" + wandType + '\'' +
			", motorSpeedRegulation=" + motorSpeedRegulation +
			", cleaningWidth=" + cleaningWidth +
			'}';
	}
}
