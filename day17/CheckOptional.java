package com.onesoft.day17;

import java.util.Optional;

public class CheckOptional {
	public static void main(String[] args) {
		String a = null;
		Optional op = Optional.ofNullable(a);
		if(op.isPresent()) {
			System.out.println(a.toUpperCase());
		}
		else {
			System.out.println("DB is null");
		}
		System.out.println(op.orElse("Out of stock"));
	}

}
