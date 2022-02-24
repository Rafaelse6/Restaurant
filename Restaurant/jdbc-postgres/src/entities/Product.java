package entities;

public class Product {
	
	private Long id;
	private String name;
	private Double price;
	private String descrption;
	private String imageUri;
	
	public Product() {
		
	}

	public Product(Long id, String name, Double price, String descrption, String imageUri) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.descrption = descrption;
		this.imageUri = imageUri;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDescrption() {
		return descrption;
	}
	
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", descrption=" + descrption
				+ ", imageUri=" + imageUri + "]";
	}
	
	
	
	
}
