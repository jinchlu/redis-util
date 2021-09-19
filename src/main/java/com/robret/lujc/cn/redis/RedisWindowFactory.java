package com.robret.lujc.cn.redis;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.robret.lujc.cn.redis.ui.RedisFrame;
import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;

/**
 * redis工具窗口
 */
public class RedisWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        System.out.println("=====================我的插件====================================");
        RedisFrame redisFrame = new RedisFrame(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(redisFrame.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
