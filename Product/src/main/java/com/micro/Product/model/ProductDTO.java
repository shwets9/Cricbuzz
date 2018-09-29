package com.micro.Product.model;

public class ProductDTO {
	    
	
	    private int productId;
	    private String productName;
	    private String productImage;
	    private String productDescription;
	    private int productCost;
		
	    
	    
	    public ProductDTO() {
			super();
			
		}



		public ProductDTO(int productId, String productName,
				String productImage, String productDescription, int productCost) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.productImage = productImage;
			this.productDescription = productDescription;
			this.productCost = productCost;
		}
		
	    
	    
	    public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductImage() {
			return productImage;
		}
		public void setProductImage(String productImage) {
			this.productImage = productImage;
		}
		public String getProductDescription() {
			return productDescription;
		}
		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}
		public int getProductCost() {
			return productCost;
		}
		public void setProductCost(int productCost) {
			this.productCost = productCost;
		}
	    

}
