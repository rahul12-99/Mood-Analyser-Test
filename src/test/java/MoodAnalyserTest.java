import org.junit.Assert;
import org.junit.Test;
import org.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {

    @Test
    public void whenMoodContainsSadShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("i am in sad mood");
        Assert.assertEquals("sad",mood);
    }
}
