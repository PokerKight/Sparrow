package app.sparrow;

public class Top {
    private String name;
    private int imageResourceId;

    public static final Top[] tops = {
            new Top("上海汽车集团股份有限公司", R.drawable.com),
            new Top("上海芯钛信息科技有限公司", R.drawable.thinktech)
    };

    private Top(String name, int imageResourceId){
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

