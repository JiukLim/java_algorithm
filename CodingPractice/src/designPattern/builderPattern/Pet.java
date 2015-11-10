package designPattern.builderPattern;

public class Pet {
	public static class Builder{
		private String petName;
		private String ownerName;
		private String address;
		private String telephone;
		
		public Builder withPetName(final String petName){
			this.petName = petName;
			return this;
		}
		public Builder withOwnerName(final String ownerName){
			this.ownerName = ownerName;
			return this;
		}
		public Builder withAddress(final String address){
			this.address = address;
			return this;
		}
		public Builder withTelephone(final String telephone){
			this.telephone = telephone;
			return this;
		}
		public Pet build(){
			if(petName == null || ownerName == null || address == null || telephone == null){
				throw new IllegalStateException("Cannot create Pet");
			}
			return new Pet(petName, ownerName, address, telephone);
		}
	}
	
	private final String petName;
	private final String ownerName;
	private final String address;
	private final String telephone;
	
	private Pet(final String petName, final String ownerName, 
				final String address, final String telephone){
		this.petName = petName;
		this.ownerName = ownerName;
		this.address = address;
		this.telephone = telephone;
	}
	
	public static void main(String[] args) {
		Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder.withPetName("bongbong")
						.withOwnerName("jiuk")
						.withAddress("seoul, korea")
						.withTelephone("01011112222")
						.build();
	}
}
