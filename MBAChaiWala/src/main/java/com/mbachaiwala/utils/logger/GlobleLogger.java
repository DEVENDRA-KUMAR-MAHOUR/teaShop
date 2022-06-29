package com.mbachaiwala.utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobleLogger {

	public static Logger getLogger(Class className) {
		return LoggerFactory.getLogger(className);
	}

}
