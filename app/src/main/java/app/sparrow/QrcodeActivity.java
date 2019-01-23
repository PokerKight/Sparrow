package app.sparrow;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class QrcodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        ImageView mImageView = (ImageView) findViewById(R.id.iv);
        Bitmap mBitmap = QRCodeUtil.createQRCodeBitmap("https://www.baidu.com", 600, 600);
        mImageView.setImageBitmap(mBitmap);
    }
}
