package project.pb.maps;

import project.pb.R;

public enum MapsData {

    WIJNHAVEN_99(new String[] {"-2", "-1", "1", "2", "3", "4", "5", "BG", "Dak"},
            new int[] {R.mipmap.wijnhaven_99_min1, R.mipmap.wijnhaven_99_min2, R.mipmap.wijnhaven_99_1, R.mipmap.wijnhaven_99_2,
                    R.mipmap.wijnhaven_99_3, R.mipmap.wijnhaven_99_4, R.mipmap.wijnhaven_99_5,
                    R.mipmap.wijnhaven_99_bg, R.mipmap.wijnhaven_99_dak}),
    WIJNHAVEN_103(new String[] {"-1", "1", "2", "3", "4", "5","6", "BG", "Dak"},
            new int[] {R.mipmap.wijnhaven_103_min1, R.mipmap.wijnhaven_103_1, R.mipmap.wijnhaven_103_2, R.mipmap.wijnhaven_103_3,
                    R.mipmap.wijnhaven_103_4, R.mipmap.wijnhaven_103_5, R.mipmap.wijnhaven_103_6,
                    R.mipmap.wijnhaven_103_bg, R.mipmap.wijnhaven_103_dak}),
    WIJNHAVEN_107(new String[] { "-1", "1", "2", "3", "4", "5","6", "BG", "Dak"},
            new int[] {R.mipmap.wijnhaven_107_min1, R.mipmap.wijnhaven_107_1, R.mipmap.wijnhaven_107_2, R.mipmap.wijnhaven_107_3,
                    R.mipmap.wijnhaven_107_4, R.mipmap.wijnhaven_107_5, R.mipmap.wijnhaven_107_6,
                    R.mipmap.wijnhaven_107_bg, R.mipmap.wijnhaven_107_dak});

    private String[] titles;
    private int[] drawables;

    MapsData(String[] titles, int[] drawables) {
        this.titles = titles;
        this.drawables = drawables;
    }

    public String[] getTitles() {
        return titles;
    }

    public int[] getDrawables() {
        return drawables;
    }
}
