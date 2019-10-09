package com.dxc.training.model;

public class Training {
	private int sapId;
	private String employeeName;
	private String stream;
	private int percentage;

	public Training() {
		// TODO Auto-generated constructor stub
	}

	public Training(int sapId, String employeeName, String stream, int percentage) {
		super();
		this.sapId = sapId;
		this.employeeName = employeeName;
		this.stream = stream;
		this.percentage = percentage;
	}

	public int getSapId() {
		return sapId;
	}

	public void setSapId(int sapId) {
		this.sapId = sapId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + percentage;
		result = prime * result + sapId;
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Training other = (Training) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (percentage != other.percentage)
			return false;
		if (sapId != other.sapId)
			return false;
		if (stream == null) {
			if (other.stream != null)
				return false;
		} else if (!stream.equals(other.stream))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Training [\nsapId=" + sapId + ", employeeName=" + employeeName + ", stream=" + stream + ", percentage="
				+ percentage + "]";
	}

}
