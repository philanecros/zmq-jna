package org.zeromq.jna.constant;

public final class SendRecvOption {
	/*
	 * Send/receive options.
	 */
	public static final int ZMQ_DONTWAIT = 1;
	public static final int ZMQ_SNDMORE = 2;

	@Deprecated
	public static final int ZMQ_NOBLOCK = ZMQ_DONTWAIT;
}
