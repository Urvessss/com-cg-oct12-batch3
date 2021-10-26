package com.cg.oct12.batch3.Day5.ex;

public class CanNotVoteException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super();
	}

	CanNotVoteException(String message) {
		super(message);
	}

}
