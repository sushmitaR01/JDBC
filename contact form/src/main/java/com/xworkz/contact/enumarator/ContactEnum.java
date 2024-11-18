package com.xworkz.contact.enumarator;

public enum ContactEnum {
	URL("jdbc:mysql://localhost:3306/contact_info"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");
		
		private final String  result;

		private ContactEnum(String result) {
			this.result = result;
		}

		public String getResult() {
			return result;
		}

	
		
}
