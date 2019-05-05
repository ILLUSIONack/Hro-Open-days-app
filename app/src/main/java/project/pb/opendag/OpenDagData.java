package project.pb.opendag;

public enum OpenDagData implements OpenDagListener {

    INFORMATICA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Informatica Voltijd",
            };
        }
    },
    TECHNISCHE_INFORMATICA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Technische informatica voltijd",
            };
        }
    },
    COMMUNICATIE_EN_MEDIA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Communicatie en media voltijd",
            };
        }
    },
    COMMUNICATIE_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "Communicatie voltijd",
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
