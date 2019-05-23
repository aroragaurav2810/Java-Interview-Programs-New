package databasetesting;

import org.apache.log4j.Logger;
import java.lang.Math;
import java.util.List;

/**
 * This class contains all the statistical methods requires in Automated loan Pricing
 * @author ashish.mohanty
 * @since 2016/05/06
 * @version 1.0
 */
public class StatUtilities 
{
	
	
	private static Logger log = Logger.getLogger(StatUtilities.class);
	
	/**
	 * This method returns calculated Standard deviation of the bid from mean
	 * @param mean
	 * @param bid
	 * @return Standard Deviation
	 */
	public double stddev(double mean, double bid, double populationsize)
	{
		log.info("Calculating standard deveation for:: "+bid+" with mean value:: "+mean);
		double stddev;
		stddev = Math.sqrt(Math.pow(bid-mean,2)/populationsize);
		log.info("Calculated standard deveation:: "+stddev);
		return stddev;	
	}
	
	/**
	 * This method calculate the mean of list of doubles and returns the mean
	 * @param bids
	 * @return mean
	 */
	public double Mean(List<Quote> bids, String instrument)
	{
		log.info("Calculating mean.. for instrument:: "+instrument);
		double sum=0;
		double mean=0;
		if(!bids.isEmpty())
		{
			for(Quote quote:bids)
				sum= sum+quote.BID;
			mean = sum/(bids.size());
		}
		else
		{
			mean=0;
		}
		log.info("Mean Calculated for instrument:: "+instrument+" Mean Value:: "+mean);
	return mean;
	}
	
	
		
}
