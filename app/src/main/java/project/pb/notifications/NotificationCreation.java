package project.pb.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import project.pb.R;

public class NotificationCreation {

    private Context context;
    private String title, content;

    public NotificationCreation(Context context, String title, String content) {
        this.context = context;
        this.title = title;
        this.content = content;
    }

    public void display() {
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
        Notification notification = new NotificationCompat.Builder(context, "main_channel")
                .setSmallIcon(R.drawable.icon_nav)
                .setContentTitle(title)
                .setContentText(content)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE).build();
        notificationManagerCompat.notify(1, notification);
    }
}
