package project.pb.maps;

import project.pb.R;

public enum MapsData {

    WIJNHAVEN_99(
            new Floor("Floor -2", R.mipmap.wijnhaven_99_min2),
            new Floor("Floor -1", R.mipmap.wijnhaven_99_min1),
            new Floor("Floor 1", R.mipmap.wijnhaven_99_1),
            new Floor("Floor 2", R.mipmap.wijnhaven_99_2),
            new Floor("Floor 3", R.mipmap.wijnhaven_99_3),
            new Floor("Floor 4", R.mipmap.wijnhaven_99_4),
            new Floor("Floor 5", R.mipmap.wijnhaven_99_5),
            new Floor("Floor BG", R.mipmap.wijnhaven_99_bg),
            new Floor("Floor Dak", R.mipmap.wijnhaven_99_dak)),

    WIJNHAVEN_103(
            new Floor("Floor -1", R.mipmap.wijnhaven_103_min1),
            new Floor("Floor 1", R.mipmap.wijnhaven_103_1),
            new Floor("Floor 2", R.mipmap.wijnhaven_103_2),
            new Floor("Floor 3", R.mipmap.wijnhaven_103_3),
            new Floor("Floor 4", R.mipmap.wijnhaven_103_4),
            new Floor("Floor 5", R.mipmap.wijnhaven_103_5),
            new Floor("Floor 6", R.mipmap.wijnhaven_103_6),
            new Floor("Floor BG", R.mipmap.wijnhaven_103_bg),
            new Floor("Floor Dak", R.mipmap.wijnhaven_103_dak)),

    WIJNHAVEN_107(
            new Floor("Floor -1", R.mipmap.wijnhaven_107_min1),
            new Floor("Floor 1", R.mipmap.wijnhaven_107_1),
            new Floor("Floor 2", R.mipmap.wijnhaven_107_2),
            new Floor("Floor 3", R.mipmap.wijnhaven_107_3),
            new Floor("Floor 4", R.mipmap.wijnhaven_107_4),
            new Floor("Floor 5", R.mipmap.wijnhaven_107_5),
            new Floor("Floor 6", R.mipmap.wijnhaven_107_6),
            new Floor("Floor BG", R.mipmap.wijnhaven_107_bg),
            new Floor("Floor Dak", R.mipmap.wijnhaven_107_dak));


    private Floor[] floors;

    MapsData(Floor... floors) {
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }
}
