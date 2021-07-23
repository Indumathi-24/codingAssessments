package com.revature;


class InvalidCodeException extends Exception{
	InvalidCodeException(String msg){
		super(msg);
	}
}


class Repository{
	static String getCountryName(String countryCode) throws InvalidCodeException{ 
	String country=null;
    int code=Integer.parseInt(countryCode);
    if(code>=70 && code<=99)
    {
       country="India";	
    }
    else if(code==908)
    {
    	country="US";
    }
    else if(countryCode.equals("011"))
    {
    	throw new InvalidCodeException("Dial somewhere outside of USA");
    }
    else
    {
    	throw new InvalidCodeException("No country with given code found");
    }
	return country;
}
}

public  class RepositoryTask {
	
	public static void main(String[] args)throws InvalidCodeException {
		Repository r=new Repository();
		System.out.println(Repository.getCountryName("011"));
	
	}
}

