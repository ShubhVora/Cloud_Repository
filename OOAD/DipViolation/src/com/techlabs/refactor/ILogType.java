package com.techlabs.refactor;

import java.time.LocalDateTime;

public interface ILogType {
	
	public void display(LocalDateTime now,Exception errorMessage);
}
