package org.alie.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.alie.designmode.builder.Room;
import org.alie.designmode.builder.RoomBuilder;
import org.alie.designmode.factory.methodfactory.ConnectDBFactoryBase;
import org.alie.designmode.factory.methodfactory.impl.ODBCConnectorFactory;
import org.alie.designmode.factory.samplefactory.PlayerSkillsBase;
import org.alie.designmode.factory.samplefactory.SampleFactory;
import org.alie.designmode.factory.samplefactory.impl.McGrady;

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


    private void initView() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                doTestSampleFactory();
                break;
            case R.id.btn2:
                doTestMethodFactory();
                break;
            case R.id.btn3:
                doTestBuilderMode();
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
    private void doTestMethodFactory() {
        ConnectDBFactoryBase connectDBFactoryBase = null;
//        connectDBFactoryBase = new JDBCConnectorFactory();
        connectDBFactoryBase = new ODBCConnectorFactory();
//        connectDBFactoryBase = new OLEDBConnectorFactory();
        connectDBFactoryBase.doConnect();
        connectDBFactoryBase.doOperate();
        connectDBFactoryBase.doDisconnect();
    }

    /**
     * 建造者模式，这里我们就举一个造房子的例子
     */
    private void doTestBuilderMode() {
        Room room = new RoomBuilder()
                .addRoof("天启吊顶")
                .addWall("立邦墙面")
                .addFloor("圣象地板")
                .build();
        Log.i(TAG," 建造者模式：创建结果："+room);
    }
}
