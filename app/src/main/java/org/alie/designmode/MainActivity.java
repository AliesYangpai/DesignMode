package org.alie.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.alie.designmode.methodfactory.ConnectDBFactoryBase;
import org.alie.designmode.methodfactory.impl.JDBCConnectorFactory;
import org.alie.designmode.methodfactory.impl.ODBCConnectorFactory;
import org.alie.designmode.methodfactory.impl.OLEDBConnectorFactory;
import org.alie.designmode.samplefactory.PlayerSkillsBase;
import org.alie.designmode.samplefactory.SampleFactory;
import org.alie.designmode.samplefactory.impl.IversonImpl;
import org.alie.designmode.samplefactory.impl.KoBeImpl;
import org.alie.designmode.samplefactory.impl.McGrady;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    public static final String TAG = "MainActivity";

    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }


    private void initView(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
    }

    private void initListener(){
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                doTestSampleFactory();
                break;
            case R.id.btn2:
                doTestMethdoFactory();
                break;
            case R.id.btn3:
                break;
        }
    }

    /**
     * 简单工厂模式的例子，咱们就举一个 NBA球星 跳投，后仰，三分，扣篮的例子
     */
    private void doTestSampleFactory() {
        String tag = null;
//        tag = IversonImpl.TAG;
//        tag = KoBeImpl.TAG;
        tag = McGrady.TAG;
        PlayerSkillsBase playerSkillsBase = SampleFactory.create(tag);
        playerSkillsBase.threePointer();
        playerSkillsBase.fadeAway();
        playerSkillsBase.jumpShort();
        playerSkillsBase.slamDunk();
    }

    /**
     * 方法工厂模式的例子，咱们就举一个 客户端连接远程数据库的方式的案例
     */
    private void doTestMethdoFactory() {
        ConnectDBFactoryBase connectDBFactoryBase = null;
//        connectDBFactoryBase = new JDBCConnectorFactory();
        connectDBFactoryBase = new ODBCConnectorFactory();
//        connectDBFactoryBase = new OLEDBConnectorFactory();
        connectDBFactoryBase.doConnect();
        connectDBFactoryBase.doOperate();
        connectDBFactoryBase.doDisconnect();
    }
}
