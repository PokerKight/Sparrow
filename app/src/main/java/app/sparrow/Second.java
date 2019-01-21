package app.sparrow;

public class Second {
    private String name;
    private int imageResourceId;

    public static final Second[] seconds = {
            new Second("音乐", R.drawable.music),
            new Second("主题", R.drawable.system),
            new Second("APP", R.drawable.user),
            new Second("收藏", R.drawable.favst)
    };

    private Second(String name, int imageResourceId){
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
