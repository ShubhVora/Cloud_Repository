package com.techlabs.refactor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaxCalculator {

	ILogType logType;

	public TaxCalculator(ILogType logType) {
		this.logType = logType;
	}

	public int Calculate(int amount, int rate) {
		try {
			int r = amount / rate;
			return r;
		} catch (Exception errorMessage) {
			LocalDateTime now = LocalDateTime.now();
			logType.display(now, errorMessage);
			return 0;
		}
	}
}
