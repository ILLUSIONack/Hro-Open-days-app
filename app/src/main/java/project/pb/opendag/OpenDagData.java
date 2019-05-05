package project.pb.opendag;

public enum OpenDagData implements OpenDagListener {

    INFORMATICA_VT() {
        @Override
        public String[] getInformation() {
            return new String[] {
                    "This line",
                    "Second line",
                    "Third line",
            };
        }
    }
}
