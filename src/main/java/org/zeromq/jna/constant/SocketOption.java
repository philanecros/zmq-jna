package org.zeromq.jna.constant;

public final class SocketOption {
	/*
	 * Socket options.
	 */
	public static final int ZMQ_AFFINITY = 4;
	public static final int ZMQ_IDENTITY = 5;
	public static final int ZMQ_SUBSCRIBE = 6;
	public static final int ZMQ_UNSUBSCRIBE = 7;
	public static final int ZMQ_RATE = 8;
	public static final int ZMQ_RECOVERY_IVL = 9;
	public static final int ZMQ_SNDBUF = 11;
	public static final int ZMQ_RCVBUF = 12;
	public static final int ZMQ_RCVMORE = 13;
	public static final int ZMQ_FD = 14;
	public static final int ZMQ_EVENTS = 15;
	public static final int ZMQ_TYPE = 16;
	public static final int ZMQ_LINGER = 17;
	public static final int ZMQ_RECONNECT_IVL = 18;
	public static final int ZMQ_BACKLOG = 19;
	public static final int ZMQ_RECONNECT_IVL_MAX = 21;
	public static final int ZMQ_MAXMSGSIZE = 22;
	public static final int ZMQ_SNDHWM = 23;
	public static final int ZMQ_RCVHWM = 24;
	public static final int ZMQ_MULTICAST_HOPS = 25;
	public static final int ZMQ_RCVTIMEO = 27;
	public static final int ZMQ_SNDTIMEO = 28;
	public static final int ZMQ_IPV4ONLY = 31;
	public static final int ZMQ_LAST_ENDPOINT = 32;
	public static final int ZMQ_ROUTER_MANDATORY = 33;
	public static final int ZMQ_TCP_KEEPALIVE = 34;
	public static final int ZMQ_TCP_KEEPALIVE_CNT = 35;
	public static final int ZMQ_TCP_KEEPALIVE_IDLE = 36;
	public static final int ZMQ_TCP_KEEPALIVE_INTVL = 37;
	public static final int ZMQ_TCP_ACCEPT_FILTER = 38;
	public static final int ZMQ_DELAY_ATTACH_ON_CONNECT = 39;
	public static final int ZMQ_XPUB_VERBOSE = 40;

	@Deprecated
	public static final int ZMQ_FAIL_UNROUTABLE = ZMQ_ROUTER_MANDATORY;
	@Deprecated
	public static final int ZMQ_ROUTER_BEHAVIOR = ZMQ_ROUTER_MANDATORY;
}
