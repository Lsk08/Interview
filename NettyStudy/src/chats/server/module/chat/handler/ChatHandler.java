package chats.server.module.chat.handler;

import chats.server.common.core.annotion.SocketCommand;
import chats.server.common.core.annotion.SocketModule;
import chats.server.common.core.model.Result;
import chats.server.common.module.ModuleId;
import chats.server.common.module.chat.ChatCmd;

/**
 * 聊天
 * @author -琴兽-
 *
 */
@SocketModule(module = ModuleId.CHAT)
public interface ChatHandler {
	
	
	/**
	 * 广播消息
	 * @param playerId
	 * @param data
	 * @return
	 */
	@SocketCommand(cmd = ChatCmd.PUBLIC_CHAT)
	public Result<?> publicChat(long playerId, byte[] data);
	
	
	
	/**
	 * 私人消息
	 * @param playerId
	 * @param data
	 * @return
	 */
	@SocketCommand(cmd = ChatCmd.PRIVATE_CHAT)
	public Result<?> privateChat(long playerId, byte[] data);
}
