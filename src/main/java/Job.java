public class Job {
  private String mTitle;
  private String mCompany;
  private String mLocation;
  private String mDescription;
  private String mStartDate;
  private String mEndDate;
  private Boolean mEmployed;

  public Job(String title, String company, String location, String description, String startDate, String endDate, Boolean employed) {
    mTitle = title;
    mCompany = company;
    mLocation = location;
    mDescription = description;
    mStartDate = startDate;
    mEndDate = endDate;
    mEmployed = employed;
  }

  public String getProperty(String property) {
    String returnProperty = "";
    if (property == "title") {
      returnProperty = mTitle;
    } else if (property == "company") {
      returnProperty = mCompany;
    } else if (property == "location") {
      returnProperty = mLocation;
    } else if (property == "description") {
      returnProperty = mDescription;
    } else if (property == "startDate"){
      returnProperty = mStartDate;
    } else if (property == "endDate"){
      returnProperty = mEndDate;
    } else if (property == "employed") {
      returnProperty = String.valueOf(mEmployed);
    }
    return returnProperty;
  }
}
