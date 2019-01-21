package app.sparrow;

public class First {
    private String name;
    private int imageResourceId;

    public static final First[] firsts = {
            new First("座椅", R.drawable.seat),
            new First("后视镜", R.drawable.mirror)
    };

    private First(String name, int imageResourceId){
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
