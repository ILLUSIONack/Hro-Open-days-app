package project.pb.opendag;

public enum OpenDagData implements OpenDagListener {

    INFORMATICA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Tijdens de informatica voltijd open dag zal je kennis maken",
                    "met niet alleen de sfeer van de hogeschool rotterdam maar ook",
                    "met een van de belangerijkste opleidingen in de ICT industrie",
                    "namelijk informatica.",
                    "De open dag informatica voltijd, zal eerst beginnen met een rondleiding",
                    "rond het gebouw, hierdoor kom je precies te weten waar alles ligt.",
                    "na de rondleiding wordt er een kleine cursus gegeven door een aantal studenten",
                    "hierbij word een snelle uitleg gegeven over wat je kan verwachten.",
                    "Nadat de curses voorbij is, krijg je nog kans om eventuelle vragen te stellem",
                    "Hieronder kan je nog de planning van de dag bekijken",
                    "",
                    "De planning (4 April 16:00 t/m 20:00):",
                    "- Rondleiding rond het gebouw",
                    "- Cursus over informatica",
                    "- Vragen over de cursus",
                    "- Eventuelle inschrijvingen voor geintresseerde"
            };
        }
    },
    TECHNISCHE_INFORMATICA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Tijdens de technische informatica voltijd open dag zal je kennis maken",
                    "met niet alleen de sfeer van de hogeschool rotterdam maar ook",
                    "met een van de belangerijkste opleidingen in de ICT industrie",
                    "namelijk technische informatica.",
                    "De open dag technische informatica voltijd, zal eerst beginnen met een rondleiding",
                    "rond het gebouw, hierdoor kom je precies te weten waar alles ligt.",
                    "na de rondleiding wordt er een kleine cursus gegeven door een aantal studenten",
                    "hierbij word een snelle uitleg gegeven over wat je kan verwachten.",
                    "Nadat de curses voorbij is, krijg je nog kans om eventuelle vragen te stellem",
                    "Hieronder kan je nog de planning van de dag bekijken",
                    "De dag zal eindige met een eindspel, het eindspel zal verschillende",
                    "moeilijke puzzels bevatten die zo snel mogelijk moeten worden opgelost,",
                    "het groepje dat het eindspel wint zal natuurlijk worden beloond met een prijs!",
                    "",
                    "De planning (4 April 16:00 t/m 20:00):",
                    "- Rondleiding rond het gebouw",
                    "- Cursus over technische informatica",
                    "- Eindspel"
            };
        }
    },
    COMMUNICATIE_EN_MEDIA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "The open day for Communication and Multimedia design full time will start with giving you",
                    "a taste of the atmosphere of the school and the study.",
                    "You will be getting a comfortable experience of what the study will be offering you.",
                    "At first the employees and students will show you the interior of the school",
                    "Than a small course wil take place given by students which will create an",
                    "opportunity to ask the students how their experience is of the study.",
                    "The day will end with a game which consists of difficult puzzles.",
                    "And of course the winning team will earn a price.\n",
                    "The planning(5 April 16:00 t/m 20:00):\n",
                    "- Tour of the building",
                    "- Course about Communication and Multimedia design",
                    "- Endgame"
            };
        }
    },
    COMMUNICATIE_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "The open day for Communication full time will start with giving you",
                    "a taste of the atmosphere of the school and the study.",
                    "You will be getting a comfortable experience of what the study will be offering you.",
                    "At first the employees and students will show you the interior of the school",
                    "Than a small course wil take place given by students which will create an",
                    "opportunity to ask the students how their experience is of the study.",
                    "The day will end with a game which consists of difficult puzzles.",
                    "And of course the winning team will earn a price.\n",
                    "The planning(5 April 16:00 t/m 20:00):\n",
                    "- Tour of the building",
                    "- Course about Communication",
                    "- Endgame"
            };
        }
    },
    INFORMATICA_DT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Informatica Deeltijd",
            };
        }
    },
    COMMUNICATIE_DT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Communicatie Deeltijd",
            };
        }
    }
}
