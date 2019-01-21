package app.sparrow;

public class Third {
    private String name;
    private int imageResourceId;

    public static final Third[] thirds = {
            new Third("人脸采集", R.drawable.face),
            new Third("人脸管理", R.drawable.manage),
    };

    private Third(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
