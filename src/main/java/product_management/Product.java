package product_management;

public class Product {
	    private int productId;
	    private String name;
	    private String quantity;
	    private String price;

	    public Product(int productId, String name, String quantity, String price) {
	        this.productId = productId;
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getQuantity() {
	        return quantity;
	    }

	    public String getPrice() {
	        return price;
	    }
	}

