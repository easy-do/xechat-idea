package cn.xeblog.plugin.action.handler.command;

import cn.xeblog.plugin.action.ConsoleAction;
import cn.xeblog.plugin.mode.ModeContext;
import cn.xeblog.plugin.mode.ModeEnum;

/**
 * @author anlingyi
 * @date 2020/9/1
 */
public class ModeCommandHandler extends AbstractCommandHandler {

    @Override
    public void handle(String[] args) {
        if (args.length < 2) {
            return;
        }

        ModeEnum mode = ModeEnum.getMode(Integer.parseInt(args[1]));
        if (mode == null) {
            return;
        }

        ModeContext.setMode(mode);
        ConsoleAction.showSimpleMsg("【" + mode.getName() + "】模式设置成功！");
    }

}