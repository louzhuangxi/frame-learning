package com.he.service;

import org.springframework.stereotype.Service;

@Service
public class TestServieImpl implements ITestServie {
    @Override
    public String getName() {
        return "我是张三！";
    }
}
