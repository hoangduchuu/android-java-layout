package net.hoangduchuu.layoutwithjavacode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayoutRoot;
    RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        initLinearayout();
        initRelateLayout();

        setContentView(relativeLayoutRoot);

    }

    private void initRelateLayout() {
        relativeLayoutRoot = new RelativeLayout(this);
        // mặc định ón là full nên không cần set

        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParamsSecond
                = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLayoutSecond.setId(R.id.rl);
        relativeLayoutSecond.setLayoutParams(layoutParamsSecond);


    ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setImageResource(R.mipmap.ic_launcher);

        relativeLayoutSecond.addView(imageView);
        relativeLayoutRoot.addView(relativeLayoutSecond);



    }

    private void initLinearayout() {
        // linearLayout root
        linearLayoutRoot = new LinearLayout(this);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        // End linearLayout root

        // LinearLayout Second
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        // End LinearLayout Second

        // ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(R.mipmap.ic_launcher);

        // TextVivew
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(R.string.text_khi_ban_ranh);
        textView.setAllCaps(true);


        linearLayoutSecond.addView(imageView);
        linearLayoutSecond.addView(textView);

        linearLayoutRoot.addView(linearLayoutSecond);

    }

}
