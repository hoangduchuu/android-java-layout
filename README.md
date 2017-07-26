# Dựng layout cho android bằng java code
Thay vì setcontent  cho một màn hình của android bằng cách `setContentView(R.layout.main_activity_layout)`
thì có thể sử dụng hoàn toàn bằng java code, hơi dài và chỉ rành cho người rãnh
## How to như thế nào
* nhìn vào hình bên dưới, ta sẽ có cấu trúc như hình,
các đoạn java code để tdựng code nằm ở hàm initLinearlayout  , hàm này add view vào cái `linearlayoutroot  ` ở trên cùng rồi setContentView ở  cuối là xong
     ![N|Solid](http://i.imgur.com/UgCu46r.png)

## Hàm initLinearayout

### Khởi tạo linearLayout --> setLayoutParams --> setOrientation(if linear)
      linearLayoutRoot = new LinearLayout(this);
      linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
      linearLayoutRoot.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

### Đưa các View con vào , ở đây có 2 (imageview và textview) cái được đătj trong cái linear(sencondLinear) khác
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

### Đưa imageview và textview vào trong SendcondLinear
     linearLayoutSecond.addView(imageView);
     linearLayoutSecond.addView(textView);

### setContentView
     linearLayoutRoot.addView(linearLayoutSecond);

> Done man!
