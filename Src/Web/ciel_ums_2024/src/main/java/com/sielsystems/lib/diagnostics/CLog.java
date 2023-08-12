package com.sielsystems.lib.diagnostics;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CLog {
	public static final boolean DEBUG = true;
	
	private Logger logger;
	
	private CLog(Logger logger) {
		this.logger = logger;
	}
	
	public void i(String msg) {
		logger.info(msg);
	}
	public void i(String format, Object arg1) {
		logger.info(String.format(format, arg1));
	}
	public void i(String format, Object arg1, Object arg2) {
		logger.info(String.format(format, arg1, arg2));
	}
	public void i(String format, Object... args) {
		logger.info(String.format(format, args));
	}
	
	public void w(String msg) {
		logger.warn(msg);
	}
	public void w(String format, Object arg1) {
		logger.warn(String.format(format, arg1));
	}
	public void w(String format, Object arg1, Object arg2) {
		logger.warn(String.format(format, arg1, arg2));
	}
	public void w(String format, Object... args) {
		logger.warn(String.format(format, args));
	}
	public void w(Throwable t, String msg) {
		logger.warn(msg, t);
	}
	public void w(Throwable t, String format, Object arg1) {
		logger.warn(String.format(format, arg1), t);
	}
	public void w(Throwable t, String format, Object arg1, Object arg2) {
		logger.warn(String.format(format, arg1, arg2), t);
	}
	public void w(Throwable t, String format, Object... args) {
		logger.warn(String.format(format, args), t);
	}
	
	public void d(String msg) {
		logger.debug(msg);
	}
	public void d(String format, Object arg1) {
		logger.debug(String.format(format, arg1));
	}
	public void d(String format, Object arg1, Object arg2) {
		logger.debug(String.format(format, arg1, arg2));
	}
	public void d(String format, Object... args) {
		logger.debug(String.format(format, args));
	}
	public void d(Throwable t, String msg) {
		logger.debug(msg, t);
	}
	public void d(Throwable t, String format, Object arg1) {
		logger.debug(String.format(format, arg1), t);
	}
	public void d(Throwable t, String format, Object arg1, Object arg2) {
		logger.debug(String.format(format, arg1, arg2), t);
	}
	public void d(Throwable t, String format, Object... args) {
		logger.debug(String.format(format, args), t);
	}
	
	public void t(String msg) {
		logger.trace(msg);
	}
	public void t(String format, Object arg1) {
		logger.trace(String.format(format, arg1));
	}
	public void t(String format, Object arg1, Object arg2) {
		logger.trace(String.format(format, arg1, arg2));
	}
	public void t(String format, Object... args) {
		logger.trace(String.format(format, args));
	}
	public void t(Throwable t, String msg) {
		logger.trace(msg, t);
	}
	public void t(Throwable t, String format, Object arg1) {
		logger.trace(String.format(format, arg1), t);
	}
	public void t(Throwable t, String format, Object arg1, Object arg2) {
		logger.trace(String.format(format, arg1, arg2), t);
	}
	public void t(Throwable t, String format, Object... args) {
		logger.trace(String.format(format, args), t);
	}
	
	public void e(String msg) {
		logger.error(msg);
	}
	public void e(String format, Object arg1) {
		logger.error(String.format(format, arg1));
	}
	public void e(String format, Object arg1, Object arg2) {
		logger.error(String.format(format, arg1, arg2));
	}
	public void e(String format, Object... args) {
		logger.error(String.format(format, args));
	}
	public void e(Throwable t, String msg) {
		logger.error(msg, t);
	}
	public void e(Throwable t, String format, Object arg1) {
		logger.error(String.format(format, arg1), t);
	}
	public void e(Throwable t, String format, Object arg1, Object arg2) {
		logger.error(String.format(format, arg1, arg2), t);
	}
	public void e(Throwable t, String format, Object... args) {
		logger.error(String.format(format, args), t);
	}

	public static CLog getLog(Class<?> clazz) {
		Logger logger = LoggerFactory.getLogger(clazz);
		CLog log = new CLog(logger);
		return log;
	}
	
	public static CLog getLog(String name) {
		Logger logger = LoggerFactory.getLogger(name);
		CLog log = new CLog(logger);
		return log;
	}
	
	public static <T> String list(Collection<T> list) {
		StringBuilder builder = new StringBuilder();
		for (T item : list) {
			if (builder.length() > 0) builder.append(", ");
			builder.append("[");
			builder.append(item.toString());
			builder.append("]");
		}
		return builder.toString();
	}
	
	public static <T> String array(T[] list) {
		StringBuilder builder = new StringBuilder();
		for (T item : list) {
			if (builder.length() > 0) builder.append(", ");
			builder.append("[");
			builder.append(item.toString());
			builder.append("]");
		}
		return builder.toString();
	}
	
	public static <T> String listLn(Collection<T> list) {
		StringBuilder builder = new StringBuilder();
		for (T item : list) {
			if (builder.length() > 0) {
				builder.append(", ");
				builder.append("\r\n");
			}
			builder.append("[");
			builder.append(item.toString());
			builder.append("]");
		}
		return builder.toString();
	}
}
