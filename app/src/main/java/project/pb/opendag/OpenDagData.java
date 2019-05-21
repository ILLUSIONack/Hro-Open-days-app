package project.pb.opendag;

import project.pb.R;

public enum OpenDagData implements OpenDagListener {

    INFORMATICA_VT() {
        @Override
        public int getPic() {
            int pic = R.drawable.coder;
            return pic;
        }

        @Override
        public String getName() {
            return "Informatica Fulltime";
        }

        @Override
        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm):\n -Tour around the building  \n -Computer science course \n -Questions about the course \n -Any registrations for the interested";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    5,
                    4
            };
        }


        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Full-Time Informatica open day you will learn about Hogeschool Rotterdam. You will also learn what Informatica means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what Informatica means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Informatica",
                    "- Questions about the course",
                    "- Any registrations for the interested"
            };
        }
    },
    TECHNISCHE_INFORMATICA_VT() {
        @Override
        public int getPic() {
            int pic = R.drawable.coder;
            return pic;
        }

        @Override
        public String getName() {
            return "Technical Informatica";
        }

        @Override
        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm): \n - Tour around the building \n - Course on technical informatics \n Endgame";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    06,
                    04
            };
        }

        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Full-Time Technical Informatica open day you will learn about Hogeschool Rotterdam. You will also learn what Technical Informatica means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what Technical Informatica means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Technical Informatica",
                    "- Endgame"
            };
        }
    },
    COMMUNICATIE_EN_MEDIA_VT() {
        @Override
        public int getPic() {
            int pic = R.drawable.communicationpic;
            return pic;
        }

        @Override
        public String getName() {
            return "Communication & Media";
        }

        @Override
        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm):\n - Tour around the building \n - Course on technical informatics \n     - Endgame";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    06,
                    04
            };
        }

        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Full-Time CM open day you will learn about Hogeschool Rotterdam. You will also learn what CM means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what CM means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Communication And Media",
                    "- Endgame"
            };
        }
    },
    COMMUNICATIE_VT() {
        @Override
        public int getPic() {
            int pic = R.drawable.communicationpic;
            return pic;
        }

        @Override
        public String getName() {
            return "Communication Fulltime";
        }

        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm): \n - Tour around the building \n - Course on technical informatics \n - Endgame";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    06,
                    04
            };
        }

        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Full-Time Communication open day you will learn about Hogeschool Rotterdam. You will also learn what Communication means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what Communication means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Communication",
                    "- Endgame"
            };
        }
    },
    INFORMATICA_DT() {
        @Override
        public int getPic() {
            int pic = R.drawable.coder;
            return pic;
        }

        @Override
        public String getName() {
            return "Informatica Parttime";
        }

        @Override
        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm): \n - Tour around the building \n - Course on technical informatics \n- Endgame";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    06,
                    04
            };
        }

        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Part-Time Informatica open day you will learn about Hogeschool Rotterdam. You will also learn what Informatica means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what Informatica means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Informatica",
                    "- Endgame"
            };
        }
    },
    COMMUNICATIE_DT() {
        @Override
        public int getPic() {
            int pic = R.drawable.communicationpic;
            return pic;
        }

        @Override
        public String getName() {
            return "Communication Parttime";
        }

        @Override
        public String getLink() {
            return "https://www.hogeschoolrotterdam.nl/";
        }

        @Override
        public String getDescription() {
            return "The schedule (April 4 from 4:00 pm to 8:00 pm): \n - Tour around the building \n - Course on technical informatics \n - Endgame";
        }

        @Override
        public String getLocation() {
            return "Wijnhaven 107";
        }

        @Override
        public int[] getDate() {
            return new int[]{
                    2019,
                    5,
                    4
            };
        }

        @Override
        public String[] getInformation() {
            return new String[]{
                    "Program:",
                    "",
                    "During the Part-Time Communication open day you will learn about Hogeschool Rotterdam. You will also learn what Communication means and how important it is within the ICT industry. The open day will first start with a tour around the building. This way you will see the whole school and get a good idea of where everything is. After the tour, a small beginners course is given by a number of 2nd year students and teachers. They will explain what Communication means and what you will do during the study. After the explanation you are free to ask questions. We encourage you to ask until you are satisfied with your knowledge. You can see schedule for the open day below.",
                    "",
                    "The schedule (April 4 from 4:00 pm to 8:00 pm):",
                    "",
                    "- Tour around the building",
                    "- Course on Communication",
                    "- Endgame"
            };
        }
    }
}
