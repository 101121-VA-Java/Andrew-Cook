package com.revature.models;

public class Offers {

		private int CustomerId;
		private int offerId;
		private int carId;
		private boolean userPaid;
		private boolean acceptOffer;
		private boolean rejectOffer;
		private double offer;
		/**
		 * @return the customerId
		 */
		public int getCustomerId() {
			return CustomerId;
		}
		public Offers(int customerId, int offerId, int CarId, boolean userPaid, boolean acceptOffer, boolean rejectOffer, double offer) {
			super();
			CustomerId = customerId;
			this.offerId = offerId;
			this.carId = carId;
			this.acceptOffer = acceptOffer;
			this.userPaid = userPaid;
			this.offer = offer;
			
		}
		/**
		 * @param customerId the customerId to set
		 */
		public void setCustomerId(int customerId) {
			CustomerId = customerId;
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
		/**
		 * @return the userpaid
		 */
		public boolean isUserpaid() {
			return userPaid;
		}
		/**
		 * @param userpaid the userpaid to set
		 */
		public void setUserpaid(boolean userpaid) {
			this.userPaid = userpaid;
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
		 * @return the rejectOffer
		 */
		public boolean isRejectOffer() {
			return rejectOffer;
		}
		/**
		 * @param rejectOffer the rejectOffer to set
		 */
		public void setRejectOffer(boolean rejectOffer) {
			this.rejectOffer = rejectOffer;
		}
		/**
		 * @return the offer
		 */
		public double getOffer() {
			return offer;
		}
		/**
		 * @param offer the offer to set
		 */
		public void setOffer(double offer) {
			this.offer = offer;
		}
}
