package project.pb.hints;

import android.content.Context;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import project.pb.notifications.NotificationCreation;

public class HintExecutor {

    private static boolean isRunning = false;
    private static Random random = new Random();
    private static HintsData[] hintsData = HintsData.values();

    public static void start(final Context context) {
        setRunning(true);
        TimerTask timerTask = new TimerTask() {
            int tick = 0;
            @Override
            public void run() {
                if (!isRunning()) {
                    cancel();
                }
                switch (tick++) {
                    case 5:
                        tick = 0;
                        new NotificationCreation(context, "Did you know?",
                                getRandomHint().getHint()).display();
                        break;
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1000, 1000);
    }

    public static void setRunning(boolean isRunning) {
        HintExecutor.isRunning = isRunning;
    }

    public static boolean isRunning() {
        return isRunning;
    }

    private static HintsData getRandomHint() {
        return hintsData[random.nextInt(hintsData.length)];
    }
}
