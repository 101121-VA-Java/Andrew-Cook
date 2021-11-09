package com.revature.models;

import java.util.Objects;

public class CarOffers {

	private int offer;
	private boolean userpaid;
	private boolean acceptOffer;
	private int offerId;
	private int carId;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(acceptOffer, carId, offer, offerId, userpaid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarOffers other = (CarOffers) obj;
		return acceptOffer == other.acceptOffer && carId == other.carId && offer == other.offer
				&& offerId == other.offerId && userpaid == other.userpaid;
	}
	public CarOffers(int offer, boolean userpaid, boolean acceptOffer, int offerId, int carId) {
		super();
		this.offer = offer;
		this.userpaid = userpaid;
		this.acceptOffer = acceptOffer;
		this.offerId = offerId;
		this.carId = carId;
	}
	/**
	 * @return the offer
	 */
	public int getOffer() {
		return offer;
	}
	/**
	 * @param offer the offer to set
	 */
	public void setOffer(int offer) {
		this.offer = offer;
	}
	/**
	 * @return the userpaid
	 */
	public boolean isUserpaid() {
		return userpaid;
	}
	/**
	 * @param userpaid the userpaid to set
	 */
	public void setUserpaid(boolean userpaid) {
		this.userpaid = userpaid;
	}
	/**
	 * @return the acceptOffer
	 */
	public boolean isAcceptOffer() {
		return acceptOffer;
	}
	/**
	 * @param acceptOffer the acceptOffer to set
	 */
	public void setAcceptOffer(boolean acceptOffer) {
		this.acceptOffer = acceptOffer;
	}
	/**
	 * @return the offerId
	 */
	public int getOfferId() {
		return offerId;
	}
	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	/**
	 * @return the carId
	 */
	public int getCarId() {
		return carId;
	}
	/**
	 * @param carId the carId to set
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	
}
