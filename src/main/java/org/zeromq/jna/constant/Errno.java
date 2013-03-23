package org.zeromq.jna.constant;

public final class Errno {
	/*
	 * 0MQ errors.
	 */

	/*
	 * A number random enough not to collide with different errno ranges on
	 * different OSes. The assumption is that error_t is at least 32-bit type.
	 */
	private static final int ZMQ_HAUSNUMERO = 156384712;

	/*
	 * On Windows platform some of the standard POSIX errnos are not defined.
	 */
	public static final int ENOTSUP = ZMQ_HAUSNUMERO + 1;
	public static final int EPROTONPSUPPORT = ZMQ_HAUSNUMERO + 2;
	public static final int ENOBUFS = ZMQ_HAUSNUMERO + 3;
	public static final int ENETDOWN = ZMQ_HAUSNUMERO + 4;
	public static final int EADDRINUSE = ZMQ_HAUSNUMERO + 5;
	public static final int EADDRNOTAVAIL = ZMQ_HAUSNUMERO + 6;
	public static final int ECONNREFUSED = ZMQ_HAUSNUMERO + 7;
	public static final int EINPROGRESS = ZMQ_HAUSNUMERO + 8;
	public static final int ENOTSOCK = ZMQ_HAUSNUMERO + 9;
	public static final int EMSGSIZE = ZMQ_HAUSNUMERO + 10;
	public static final int EAFNOSUPPORT = ZMQ_HAUSNUMERO + 11;
	public static final int ENETUNREACH = ZMQ_HAUSNUMERO + 12;
	public static final int ECONNABORTED = ZMQ_HAUSNUMERO + 13;
	public static final int ECONNRESET = ZMQ_HAUSNUMERO + 14;
	public static final int ENOTCONN = ZMQ_HAUSNUMERO + 15;
	public static final int ETIMEDOUT = ZMQ_HAUSNUMERO + 16;
	public static final int EHOSTUNREACH = ZMQ_HAUSNUMERO + 17;
	public static final int ENETRESET = ZMQ_HAUSNUMERO + 18;

	/*
	 * Native 0MQ error codes.
	 */
	public static final int EFSM = ZMQ_HAUSNUMERO + 51;
	public static final int ENOCOMPATPROTO = ZMQ_HAUSNUMERO + 52;
	public static final int ETERM = ZMQ_HAUSNUMERO + 53;
	public static final int EMTHREAD = ZMQ_HAUSNUMERO + 54;
}
