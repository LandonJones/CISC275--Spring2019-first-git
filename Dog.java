public class Dog extends Animal{
	String name; 
	public Dog(String name, int numLegs){
		super(numLegs); 
		this.name = name; 
	}
	@Override
	public String toString(){
	 	return this.name + " " + this.getLegs(); 	
	} 
}
