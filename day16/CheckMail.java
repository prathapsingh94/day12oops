package com.onesoft.day16;

public class CheckMail {
	public static void main(String[] args) throws MailnotFound, Exception {
		String a = "prathap@gmail.com";
		try {
			if(a.endsWith("gmail.com") ||a.endsWith("yahoo.com")) {
				System.out.println("it is a mail");
			}
			else {
				throw new MailnotFound("Not a mail");
			}
		}catch(Exception x) {
			//System.out.println(x);
			x.printStackTrace();
		}
		
	}

}
