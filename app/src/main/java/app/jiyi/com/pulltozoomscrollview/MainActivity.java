package app.jiyi.com.pulltozoomscrollview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * 主函数里无须写任何代码
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //这个是返回按钮的点击事件
    public void backClick(View view){
        this.finish();
    }
}
