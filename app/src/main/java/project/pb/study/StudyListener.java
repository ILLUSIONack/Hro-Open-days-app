package project.pb.study;

import java.util.Date;

public interface StudyListener {

    String getName();

    String[] getGeneralInformation();

    String[] getOpenDayInformation();

    Date[] getOpenDaysDates();


}
