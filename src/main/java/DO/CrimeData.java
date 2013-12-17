package DO;

public class CrimeData {

	private String crimeID;
	private String month;
	private String reportedBy;
	private String fallsWithin;
	private String latitude;
	private String longitude;
	private String location;
	private String lsoaCode;
	public String getCrimeID() {
		return crimeID;
	}
	public void setCrimeID(String crimeID) {
		this.crimeID = crimeID;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getFallsWithin() {
		return fallsWithin;
	}
	public void setFallsWithin(String fallsWithin) {
		this.fallsWithin = fallsWithin;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLsoaCode() {
		return lsoaCode;
	}
	public void setLsoaCode(String lsoaCode) {
		this.lsoaCode = lsoaCode;
	}
	public String getLsoaName() {
		return lsoaName;
	}
	public void setLsoaName(String lsoaName) {
		this.lsoaName = lsoaName;
	}
	public String getCrimeType() {
		return crimeType;
	}
	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}
	public String getLastOutcome() {
		return lastOutcome;
	}
	public void setLastOutcome(String lastOutcome) {
		this.lastOutcome = lastOutcome;
	}
	private String lsoaName;
	private String crimeType;
	private String lastOutcome;
	
	
	
	
}


