package org.alie.designmode.factory.samplefactory;

import org.alie.designmode.factory.samplefactory.impl.IversonImpl;
import org.alie.designmode.factory.samplefactory.impl.KoBeImpl;
import org.alie.designmode.factory.samplefactory.impl.McGrady;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class SampleFactory {


    public static PlayerSkillsBase create(String tag) {
        PlayerSkillsBase playerSkillsBase = null;
        switch (tag) {
            case IversonImpl.TAG:
                playerSkillsBase = new IversonImpl();
                break;
            case KoBeImpl.TAG:
                playerSkillsBase = new KoBeImpl();
                break;
            case McGrady.TAG:
                playerSkillsBase = new McGrady();
                break;

        }
        return playerSkillsBase;
    }
}
