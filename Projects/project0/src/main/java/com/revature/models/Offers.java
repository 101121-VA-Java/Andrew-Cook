package com.revature.models;

public class Offers {

		private int CustomerId;
		private int offerId;
		private int carId;
		private boolean userPaid;
		private boolean acceptOffer;
		private boolean rejectOffer;
		/**
		 * @return the customerId
		 */
		public int getCustomerId() {
			return CustomerId;
		}
		public Offers(int customerId, int offerId, int CarId, boolean userPaid, boolean acceptOffer, boolean, rejectOffer) {
			super();
			CustomerId = customerId;
			this.carId = carId;
			this.accepted = accepted;
			this.payedFor = payedFor;
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
}
