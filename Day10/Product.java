
public class Product {
			private int productId;
			private String productName;
			private int quantityOnhand;
			private int price;
			public Product() {
				productName="Product Name not available";
			}
			public Product(int productId, String productName, int quantityOnhand, int price) {
				super();
				this.productId = productId;
				this.productName = productName;
				this.quantityOnhand = quantityOnhand;
				this.price = price;
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
			public int getQuantityOnhand() {
				return quantityOnhand;
			}
			public void setQuantityOnhand(int quantityOnhand) {
				this.quantityOnhand = quantityOnhand;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			@Override
			public String toString() {
				return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnhand="
						+ quantityOnhand + ", price=" + price + "]";
			}
			
}
