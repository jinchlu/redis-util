package com.robret.lujc.cn.redis.ui;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class RedisFrame {

    /**
     * 窗口相关功能
     */
    private ToolWindow toolWindow;

    /**
     * 主窗口
     */
    private JPanel mainWindow;

    private JButton addRedisButton;


    public RedisFrame(ToolWindow toolWindow) {
        this.toolWindow = toolWindow;
        mainWindow = new JPanel();
        createMainWindow();
    }

    private void createMainWindow() {
        addRedisButton = new JButton("增加");
        mainWindow.add(addRedisButton);
    }

    public JComponent getContent() {
        return mainWindow;
    }
}