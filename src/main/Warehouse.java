package main;

import enums.ProductType;

public class Warehouse {
	private long wheatAmountStored;
	
	public long getWheatAmountStored() {
		return wheatAmountStored;
	}

	public void setWheatAmountStored(long wheatAmountStored) {
		this.wheatAmountStored = wheatAmountStored;
	}

	public void storeGoods(ProductType productType, long amountHarvested) {
		if (productType == ProductType.WHEAT) {
			this.setWheatAmountStored(this.getWheatAmountStored() + amountHarvested);
		}
	}
}
