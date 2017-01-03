import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {

  @Test
  public void Job_instantiatesCorrectly_true() {
    Job myJob = new Job("Support Engineer", "Muppet Industries", "Portland, OR", "Supporting clients in using the system and product", "2012-01-15", "2015-03-06", false);
    assertEquals(true, myJob instanceof Job);
  }

  @Test
  public void Job_instantiatesWithTitle_String() {
    Job myJob = new Job("Support Engineer", "Muppet Industries", "Portland, OR", "Supporting clients in using the system and product", "2012-01-15", "2015-03-06", false);
    assertEquals("Support Engineer", myJob.getProperty("title"));
  }

  @Test
  public void Job_returnsWithEmployed_String() {
    Job myJob = new Job("Support Engineer", "Muppet Industries", "Portland, OR", "Supporting clients in using the system and product", "2012-01-15", "2015-03-06", false);
    assertEquals("false", myJob.getProperty("employed"));
  }
}
