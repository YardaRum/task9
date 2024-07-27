import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentWithClock implements Learner {
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        Date date = new Date();
        date.getTime();
        SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        learner.learn();
        System.out.printf("Текущее время: " + SDF.format(calendar.getTime()));
    }
}