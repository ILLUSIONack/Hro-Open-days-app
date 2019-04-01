package project.pb.study;

import java.util.Date;

public enum StudyData implements StudyListener {

    VOLTIJD_INFORMATICA() {
        @Override
        public String getName() {
            return "Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Nice study, abid made this",
                    "Hadi cant code and uses a mac",
                    "asjgfagfygsyf"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12")
            };
        }
    },
    VOLTIJD_TECHNISE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "dsagfadsgas",
                    "fdsfsdfsdfsd",
                    "fdsafads"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12"),
                    new Date("2019-04-12")
            };
        }
    }, VOLTIJD_COMMUNICATIE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "dsagfadsgas",
                    "fdsfsdfsdfsd",
                    "fdsafads"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12"),
                    new Date("2019-04-12")
            };
        }
    }, VOLTIJD_COMMUNICATIE_MEDIA() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "dsagfadsgas",
                    "fdsfsdfsdfsd",
                    "fdsafads"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12"),
                    new Date("2019-04-12")
            };
        }
    }, DEELTIJD_INFORMATICA() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "dsagfadsgas",
                    "fdsfsdfsdfsd",
                    "fdsafads"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12"),
                    new Date("2019-04-12")
            };
        }
    }, DEELTIJD_COMMUNICATIE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "dsagfadsgas",
                    "fdsfsdfsdfsd",
                    "fdsafads"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {

            };
        }

        @Override
        public Date[] getOpenDaysDates() {
            return new Date[] {
                    new Date("2019-04-12"),
                    new Date("2019-04-12")
            };
        }
    };
}
