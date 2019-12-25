package time;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ConnectHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client " + ctx.channel().remoteAddress() + " connected");
        System.out.println("chanel is active " + ctx.pipeline().channel().isActive());
        System.out.println("chanel is open " + ctx.pipeline().channel().isOpen());
        System.out.println("chanel is isWritable " + ctx.pipeline().channel().isWritable());
        System.out.println("chanel is isRegistered " + ctx.pipeline().channel().isRegistered());
        ctx.fireChannelActive();
    }
}