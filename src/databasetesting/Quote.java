package databasetesting;

public class Quote {
	
	public double BID;
	public double ASK;
	
	@Override
	public String toString() {
		return "Quote [bid=" + BID + ", ask=" + ASK + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ASK);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(BID);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quote other = (Quote) obj;
		if (Double.doubleToLongBits(ASK) != Double.doubleToLongBits(other.ASK))
			return false;
		if (Double.doubleToLongBits(BID) != Double.doubleToLongBits(other.BID))
			return false;
		return true;
	}

}
