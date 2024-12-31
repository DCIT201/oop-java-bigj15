public interface Rentable {
    void rent(Customer customer, int days);
	void returnVehicle();
    String calculateRentalCost(int days);
}