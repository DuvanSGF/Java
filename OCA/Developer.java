import java.util.List;

public class Developer {

	private String name;
	private String surname;
	private int age;
	private List<String> language;

	public static class Builder{
		
		private String name = "Unknown";
		private String surname = "Unknown";
		private int age = -1;
		private List<String> language;

		public Builder name(String _name) {
			name = _name;
			return this;

		}

		public Builder surname(String _surname) {
			surname = _surname;
			return this;

		}
		public Builder age(int _age) {
			age = _age;
			return this;

		}
		public Builder language(List <String> _language) {
			language = _language;
			return this;

		}
		public Developer build() {
			return new Developer(this);
		}

	}

	private Developer(Builder builder) {
		name = builder.name;
		surname = builder.surname;
		age = builder.age;
		language = builder.language;
	}

	public String check(int n) {
		return n < 0 ? "unknown" : ""+ n;
	}

	@override
	public String toString() {
		return "Developer{" +
				"\n name = "+ name
				+"\n surname = "+ surname
				+"\n age = "+ check(age)
				+"\n language = "+ language
				+"\n}";

	}

}
