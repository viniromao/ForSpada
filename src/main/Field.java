package main;

import enums.ProductType;
import exceptions.FieldFullException;
import exceptions.InsuficientHarvestException;

public class Field {
	private ProductType productType;
	private long totalSize;
	private long sownSize;
	
	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	
	public long getSownSize() {
		return sownSize;
	}

	public void setSownSize(long sownSize) {
		this.sownSize = sownSize;
	}
	
	public long getAvailabeSize() {
		return totalSize - sownSize;
	}
	
	public void sowField(long amountSown){
		if (amountSown > getAvailabeSize()) {
			throw new FieldFullException("cannot sow more than field total size: availabeSize = " + getAvailabeSize());
		}
		sownSize += amountSown;
	}
	
	public void harvestField(long amountHarvested, Warehouse warehouse, ProductType productType){
		if (amountHarvested > this.getSownSize()) {
			throw new InsuficientHarvestException("cannot harvest more than what you have been sown: sown land = " + this.getSownSize());
		}
		sownSize -= amountHarvested;
		warehouse.storeGoods(productType, amountHarvested);
	}
	
	
}
