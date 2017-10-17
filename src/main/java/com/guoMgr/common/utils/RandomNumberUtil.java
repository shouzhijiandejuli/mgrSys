package com.guoMgr.common.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Yu Qun on 2017/6/9.
 */
@Component
public final class RandomNumberUtil {
    public RandomNumberUtil(){}
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    public long nextLong(){
        return RANDOM.nextLong();
    }

    public int nextInt(){
        return this.nextInt(10);
    }

    public int nextInt(int bound ){
        return RANDOM.nextInt(bound);
    }
}
