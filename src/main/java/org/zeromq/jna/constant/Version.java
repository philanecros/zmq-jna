package org.zeromq.jna.constant;

public final class Version {
	/*
	 * Version
	 */
	public static final int ZMQ_VERSION_MAJOR = 3;
	public static final int ZMQ_VERSION_MINOR = 2;
	public static final int ZMQ_VERSION_PATCH = 2;

	public static final int ZMQ_VERSION = makeVersion(ZMQ_VERSION_MAJOR,
			ZMQ_VERSION_MINOR, ZMQ_VERSION_PATCH);

	private static int makeVersion(final int major, final int minor,
			final int patch) {
		return (major * 10000) + (minor * 100) + patch;
	}
}
