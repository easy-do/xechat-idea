package cn.xeblog.server.action.handler;

import cn.xeblog.server.action.AbstractAction;
import cn.xeblog.server.builder.ResponseBuilder;
import cn.xeblog.commons.entity.User;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author anlingyi
 * @date 2020/8/14
 */
public abstract class AbstractGameActionHandler<T> extends AbstractAction<T> {

    protected static boolean opponentOffline(User user, ChannelHandlerContext ctx) {
        if (user == null) {
            ctx.channel().writeAndFlush(ResponseBuilder.system("对方已经下线了！"));
            return true;
        }

        return false;
    }

}