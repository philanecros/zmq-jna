package org.zeromq.jna.constant;

public final class SocketTransportEvent {
	/*
	 * Socket transport events (tcp and ipc only)
	 */
	public static final int ZMQ_EVENT_CONNECTED = 1;
	public static final int ZMQ_EVENT_CONNECT_DELAYED = 2;
	public static final int ZMQ_EVENT_CONNECT_RETRIED = 4;

	public static final int ZMQ_EVENT_LISTENING = 8;
	public static final int ZMQ_EVENT_BIND_FAILED = 16;

	public static final int ZMQ_EVENT_ACCEPTED = 32;
	public static final int ZMQ_EVENT_ACCEPT_FAILED = 64;

	public static final int ZMQ_EVENT_CLOSED = 128;
	public static final int ZMQ_EVENT_CLOSE_FAILED = 256;
	public static final int ZMQ_EVENT_DISCONNECTED = 512;

	public static final int ZMQ_EVENT_ALL = ZMQ_EVENT_CONNECTED
			| ZMQ_EVENT_CONNECT_DELAYED | ZMQ_EVENT_CONNECT_RETRIED
			| ZMQ_EVENT_LISTENING | ZMQ_EVENT_BIND_FAILED | ZMQ_EVENT_ACCEPTED
			| ZMQ_EVENT_ACCEPT_FAILED | ZMQ_EVENT_CLOSED
			| ZMQ_EVENT_CLOSE_FAILED | ZMQ_EVENT_DISCONNECTED;

}
