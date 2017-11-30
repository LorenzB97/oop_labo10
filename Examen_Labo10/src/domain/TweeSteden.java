package domain;

public class TweeSteden {

	private String van, naar;

	public boolean equals(Object o){
		if(o instanceof TweeSteden){
			TweeSteden tweesteden = (TweeSteden) o;
			return (this.getVan().toLowerCase().equals(tweesteden.getVan().toLowerCase()) && this.getNaar().toLowerCase().equals(tweesteden.getNaar().toLowerCase())) 
					|| (this.getVan().toLowerCase().equals(tweesteden.getNaar().toLowerCase()) && this.getNaar().toLowerCase().equals(tweesteden.getVan().toLowerCase()));
		}
		return false;
	}

	public String toString(){
		return "Van " + this.getVan() + " naar " + this.getNaar() ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naar == null) ? 0 : naar.hashCode());
		result = prime * result + ((van == null) ? 0 : van.hashCode());
		return result;
	}

	public TweeSteden(String van, String naar){
		this.setVan(van);
		this.setNaar(naar);
	}
	public String getVan() {
		return van;
	}
	private void setVan(String van) throws IllegalArgumentException{
		if (van == null){
			throw new IllegalArgumentException();
		}
		
		this.van = van;
	}
	public String getNaar() {
		return naar;
	}
	private void setNaar(String naar) throws IllegalArgumentException{
		if (naar == null){
			throw new IllegalArgumentException();
		}
		
		this.naar = naar;
	}
	
}
