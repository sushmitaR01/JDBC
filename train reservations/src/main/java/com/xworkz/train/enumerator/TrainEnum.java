package com.xworkz.train.enumerator;

public enum TrainEnum {
	URL("jdbc:mysql://localhost:3306/train_reservation"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");
		
		private final String  result;
		
		private TrainEnum(String  result) {
			this.result=result;
		}
			
		public String getvalue()
		{
			return result;
			
		}

}
