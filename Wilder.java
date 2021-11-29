/**
 * @author mezia
 *
 */
public class Wilder {
	
	// Attributes
	public String firstName;
	public boolean aware = true;
	
	// Constructors
	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}
	
    // instance method
	public String whoAmI() {
        if (this.aware) {
            return "My name is " + this.firstName + " and I am aware";
        } else
            return "My name is " + this.firstName + " and now I'm not aware";
    }
	
	// Getter 
	public boolean getAware() {
		return this.aware;
	}

	public String getFirstName() {
		return this.firstName;
	}

    // Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
}