package sqa.main;

public class TVPlan {
	
	static final double OFFLINE_SERVICEFEE = 100;
	static final double LIVE_SERVICEFEE = 100;
	static final double DISCOUNT = 50;
	
	private final boolean offline_watching, live_service, discount;
	
	public TVPlan(boolean offline_watching, boolean live_service, boolean discount) {
		this.offline_watching = offline_watching;
		this.live_service = live_service;
		this.discount = discount;
	}
	
	public enum TVPackage {
		STANDARD, PREMIUM, FAMILY;
		
		public double getPrice() {
			switch(this) {	
			case STANDARD:
				return 150;
			case PREMIUM:
				return 350;
			case FAMILY:
				return 450;
			default:
				return 0;
			}
		}
	}
	
	public double pricePerMonth(TVPackage selectedPackage) { 
		
		// ----- โค้ดที่แก้ไข Bug แล้ว (แนะนำให้ใช้ตัวนี้) -----
		double basePrice = selectedPackage.getPrice();
		double extracost = 0;
		
		if (offline_watching && selectedPackage != TVPackage.FAMILY) {
			extracost += OFFLINE_SERVICEFEE;
		}
		
		if (live_service) {
			extracost += LIVE_SERVICEFEE;
		}
		
		double reducecost = discount ? DISCOUNT : 0;
		
		double totalPrice = basePrice + extracost - reducecost;
		
		return totalPrice;
	}
}
